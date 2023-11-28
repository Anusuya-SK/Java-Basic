public class methodsDemo {
    /*
     * Methods - Carries out a specific task
     * Method Input - Parameters/Arguments
    */

    // static-default, int-this method return a integer, boxVolume-method
    static int boxVolume(int length, int breadth, int height) {
        int vol;
        vol = height*breadth*length;
        return vol;
    }

    // static-default, void-this method doesn't return anything, printLine-method
    static void printLine() {
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        
        printLine();
        System.out.println("Hello") // Method call, "println" is also a method
        int volume = boxVolume(10,4,6) // Passing the arguments
        System.out.println(volume);
        // System.out.println(boxVolume(10,4,6));
        printLine();
    }
}