// Declaring a class with variables
class Box {
    int length;
    int breadth;
    int height;
}

public class ClassDemo {
    public static void main(String[] args) {
        Box blackBox; // Box-class, blackBox-object
        blackBox = new Box(); // Memory will allocate only we give as "new Box()"

        // Allocated value to the variables
        blackBox.length = 10;
        blackbox.breadth = 8;

        // Creating another object and allocating memory to it.
        Box woodBox = new Box();
        woodBox.height = 25;

        System.out.println(blackBox.length);
        System.out.println(woodBox.height);
    }
}