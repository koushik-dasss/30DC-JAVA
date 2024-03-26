public class Lec3 {
    public static void main(String[] args) {
        // Operators
        // Arithmetic Operators

        int a = 11 , b = 5 , sum = a+b ; // value is reserved for every variable and sequential calculation us done
        System.out.println(sum);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); // For decimal division , float data type is required.
        System.out.println(a%b); // Remainder
        System.out.println((double) a / b ); // 2.2
        System.out.println((double)(a/b)); // not same as double of (a) / b
        System.out.println(a/(double)b); // same result as the first one


        // Relational Operators

        int num1 = 10 , num2  = 5 ;
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);

        // Assignment Operators

        int x = 10 ;
        x+=5; // x = x+5;
        System.out.println(x); // 15
        x-=5; // x = x-5 ;
        System.out.println(x); // 10
        x*=5; // x = x*5;
        System.out.println(x); // 50
        x/=5; // x = x/5;
        System.out.println(x); // 10
        x%=5; // x = x%5;
        System.out.println(x); // 0

        // Logical Operators

        // Logical AND (&&)
        /* If the first condition is false , then the result is false always. (Short circuit evaluation)
           If both the conditions are true , then only the result is true.
        Conditions :-

        T T T
        T F F
        F T F
        F F F
        */

        System.out.println(3>2 && 5>4); // true
        System.out.println(2>3 && 1>2); // false
        System.out.println(3>2 && 1>2); // false
        System.out.println(1<0 && 5>4); // false

        // Logical OR (||)
        /* If the first condition is true , then the result is true always. (Short circuit evaluation)
           If both the conditions are false , then only the result is false.

        Conditions :-

        T T T
        T F T
        F T T
        F F F
        */

        System.out.println(3>2 || 5>4); // true
        System.out.println(2>3 || 1>2); // false
        System.out.println(3>2 || 1>2); // true
        System.out.println(1<0 || 5>4); // true

        // Logical NOT(!) :-

        System.out.println(!true); // false
        System.out.println(!false); // true

        // Ternary Operator(Conditional Operator) :-

        int num = 69 ;
        String result = (num%2==0)? "true" : "false" ; // even checker
        System.out.println(result);
        boolean ans = (num%2!=0)? true : false ; // odd checker
        System.out.println(ans);


        // FINAL keyword :-

        final int  number = 4;
       //  number = 6; ERROR as final keyword won't allow the variable which is now a constant to change

        System.out.println(number);

        /* When applied to a variable, it means that the variable can only be assigned a value once.
        Once assigned, the value cannot be changed. This makes the variable a constant.

        Final variables must be initialized either at the time of declaration
        or within the constructor of the class.*/


        // Math class

        double round1  = Math.round(4.69); // 5.0
        double round2  = Math.round(4.33); // 4.0
        double ceil = Math.ceil(1.1); // 2.0
        double floor = Math.floor(6.7); // 6.0
        double log = Math.log(100);
        double base_log = Math.log10(100);
        double random1 = Math.random();  // [0,1)
        double random2 = 1+Math.random()*(10);
        double sqrt = Math.sqrt(69);
        double pow = Math.pow(2,5);
        double max = Math.max(2,5);
        double min = Math.min(2,5);
        System.out.println(round1);
        System.out.println(round2);
        System.out.println(ceil);
        System.out.println(floor);
        System.out.println(log);
        System.out.println(base_log);
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(sqrt);
        System.out.println(pow);
        System.out.println(max);
        System.out.println(min);



















    }
}
