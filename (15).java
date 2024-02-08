import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class NumericTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Numeric Text Field Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        ((AbstractDocument) textField.getDocument()).setDocumentFilter(new NumericDocumentFilter(5)); // Specify the maximum length here

        frame.getContentPane().add(textField);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    static class NumericDocumentFilter extends DocumentFilter {
        private int maxLength;

        public NumericDocumentFilter(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr) throws BadLocationException {
            if (isNumeric(text) && fb.getDocument().getLength() + text.length() <= maxLength) {
                super.insertString(fb, offset, text, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (isNumeric(text) && fb.getDocument().getLength() - length + text.length() <= maxLength) {
                super.replace(fb, offset, length, text, attrs);
            }
        }

        private boolean isNumeric(String text) {
            return text.matches("\\d*"); // Only allows numeric digits (0-9)
        }
    }
}
