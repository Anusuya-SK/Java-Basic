// Declaring a class with variables
class Box {
    int length; // Instance varaibles
    int breadth;
    int height;

    // Declaring the passing parameter by the same name as class name, called as "Constructor"
    Box(int l, int h, int b) {
        length = l;
        breadth = b;
        height = h;
    }

    void setDim(int l, int h, int b) {
        length = l;
        breadth = b;
        height = h;
    }

    // Based on the need sometime we pass the arguments for this kinda method declaration
    int volume(){
        return length*height*breadth;
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        Box blackBox; // Box-class, blackBox-object
        blackBox = new Box(10, 8, 20); // Memory will allocate only we give as "new Box()"
        // Can pass the parameters to class if we have the "method name as same as class"

        // Passing the variable values using method
        // blackBox.setDim(10, 8, 20);

        /* Allocated value to the variables
        blackBox.length = 10;
        blackbox.breadth = 8;
        blackbox.height = 20; */

        //blackBox = null; //1.dereference, it means deallocate the unwanted memory when garbage collector run in Java

        System.out.println("volume is " + blackbox.volume()); // We are calling a method by using object is called "Invoking"

        // Creating another object and allocating memory to it.
        Box woodBox = new Box();
        woodBox.height = 25;
        woodBox.length = 10;
        woodBox.breadth = 15;

        woodBox = blackBox; //2.dereference

        System.out.println("Volume is " + woodBox.volume()); // We are calling a method by using object is called "Invoking"

        System.out.println(blackBox.length);
        System.out.println(woodBox.height);
    }
}