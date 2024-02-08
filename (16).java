import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseCoordinatesExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Coordinates Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel xLabel = new JLabel("X: ");
        JLabel yLabel = new JLabel("Y: ");

        frame.add(xLabel);
        frame.add(yLabel);

        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Do nothing
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                xLabel.setText("X: " + x);
                yLabel.setText("Y: " + y);
            }
        });

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
