import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExample {
    interface FuncInter1 {
        int operation(int a, int b);
    }

    interface FuncInter2 {
        void sayMassage(String message);
    }
    
    interface StringFunction {
        String run(String str);
    }

    private int operate(int a, int b, FuncInter1 fObj) {
        return fObj.operation(a, b);
    }

    public static String doFormatting(String str, StringFunction format) {
        return format.run(str);
    }

    public static void main(String []args) {
        FuncInter1 add = (int x, int y) -> (x + y);
        FuncInter1 multiply = (int x, int y) -> (x * y);

        System.out.println(add.operation(5, 6));
        System.out.println(multiply.operation(5, 6));

        LambdaExample example = new LambdaExample();
        System.out.println(example.operate(5, 6, add));
        System.out.println(example.operate(5, 6, multiply));

        FuncInter2 chat = message -> System.out.println(message);
        chat.sayMassage("Hi Sajjad!");

        StringFunction exclaim = (s) -> s + '!';
        StringFunction ask = (s) -> s + '?';

        System.out.println(doFormatting("Hello", exclaim));
        System.out.println(doFormatting("Hello", ask));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> System.out.println(2*n));

        Consumer<Integer> method = (n) -> { 
            System.out.print(n);
            System.out.print(" ");
        };
        numbers.forEach(method);
    }
}
