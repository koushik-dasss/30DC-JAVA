public class Lec2 {
    public static void main(String[] args) {
        // Variables
        // a = 2 (dynamically typed)
        int a = 2 ; // (statically typed)
        System.out.println(a); // int data type get printed
        a = 10 ;
        System.out.println(a); // value gets updated which was stored in the same variable
        //  int is primitive data type , stored in stack memory only , the value and variable both
        // are stored in stack memory
        int b = a ; // b is now having the value same as a
        // b is created in stack  , with its value same as 'a' i.e. 10 stored also in stack
        System.out.println(b);

        // Data types :-
        // byte - 1  , short - 2  , int - 4 , long - 8
        // float - 4  , double - 8
        // char - 2
        // boolean -1
        byte age = -128;
        System.out.println(age);
        age = 127;
        System.out.println(age);
        long AGE = 500000000;
        System.out.println(AGE); // no use of suffix L/l in modern compilers which was compulsory before.
        float f = 12222222222.56f;
        System.out.println(f); // F/f suffix  required
        double d = 587587.94444;
        System.out.println(d); // use of suffix D/d is not compulsory
        char ch1 = 'A';
        char ch2 = (int)'A'; // ASCII code conversion
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch1 == ch2); // boolean result (always true here )
        age = 14;
        boolean isEligible = false;
        int valid_age = 18;
        // Use of conditional statements
        if (age<valid_age){ // (always true here)
            System.out.println(isEligible);
        }else{
            isEligible = true;
            System.out.println(isEligible);
        }






    }
}
