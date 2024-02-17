import java.util.*;

public class Simple_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите x: ");
        int x = input.nextInt();
        System.out.print("Введите a: ");
        int a = input.nextInt();
        System.out.print("Введите b: ");
        int b = input.nextInt();

        Expression eq1 = new Expression(x, a, b);
        eq1.calculate(x);

        Expression eq2 = new Expression(x, a, b);
        eq2.calculate(a, b);

        Expression eq3 = new Expression(x, a, b);
        eq3.calculate(x, a, b);
        eq3.calculate(x);
    }

    static class Expression{
        public int x;
        public int a;
        public int b;

        Expression(int x, int a, int b){
            this.x = x;
            this.a = a;
            this.b = b;
        }

        public void calculate(int x){                     // 1) y = 3x + 5
            int result = 3 * x + 5;
            System.out.printf("y = %d", result);
        }

        public void calculate(int a, int b){             // 2) y = (a + b) / (a - b)
            if(a - b == 0){
                System.out.printf("\nДеление на ноль (%d - %d = 0)", a, b);
                return;
            }

            int result = (a + b) / (a - b);
            System.out.printf("\ny = %d", result);
        }

        public void calculate(int x, int a, int b){      // 3) y = (ax / b)!
            if (b == 0){
                System.out.printf("\nДеление на ноль (%d * %d / %d)", a, x, b);
                return;
            }

            int number = a * x / b;
            int result = 1;
            for(int i = 1; i <= number; i++){
                result *= i;
            }
            System.out.printf("y = %d", result);
        }
    }
}
