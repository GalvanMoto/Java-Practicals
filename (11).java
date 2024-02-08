public class MemoryInfo {
    public static void main(String[] args) {
        // Get the runtime instance
        Runtime runtime = Runtime.getRuntime();

        // Get the total memory
        long totalMemory = runtime.totalMemory();
        System.out.println("Total Memory: " + totalMemory + " bytes");

        // Get the free memory
        long freeMemory = runtime.freeMemory();
        System.out.println("Free Memory: " + freeMemory + " bytes");

        // Request garbage collection
        runtime.gc();

        // Get the free memory after garbage collection
        long freeMemoryAfterGC = runtime.freeMemory();
        System.out.println("Free Memory after GC: " + freeMemoryAfterGC + " bytes");
    }
}
