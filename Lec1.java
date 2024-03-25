public class Lec1 {
    public static void main(String[] args) {
        // class name - Lec1
        // public - access modifier
        // static - the main method can be called without creating an instance of the class i.e.
        // Static keyword is used in efficient memory management
        // If static is not used , main method would have explicitly called an instance i.e. made an object which was not required
        // main method - entry point of the program
        // void method - method returning no values
        // String[] args - command line argument can be taken as parameters
        System.out.println("Hello World");
        // System - class
        // out - members/fields
        // println - methods

        /* System: Class
           out: Static field of the System class
           println: Method of the PrintStream class (which out is an instance of) */
        System.out.print("Hello World "); // print vs // println
        // println - new line
        // print - same line
        System.out.print("Hello World");
        System.out.println(" Hello World");
        System.out.println("123");
        /*
        This is a multi line comment
         */
        // This is a single line comment









    }
}
