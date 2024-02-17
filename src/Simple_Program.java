import java.util.*;

public class Simple_Program {
    public static void main(String[] args) {
        Random random = new Random(10);

        int x1 = random.nextInt();
        System.out.println(x1);
        int a1= random.nextInt();
        System.out.println(a1);
        int b1 = random.nextInt();
        System.out.println(b1);

        int x2 = random.nextInt();
        System.out.println(x2);
        int a2= random.nextInt();
        System.out.println(a2);
        int b2 = random.nextInt();
        System.out.println(b2);

        int x3 = random.nextInt();
        System.out.println(x3);
        int a3= random.nextInt();
        System.out.println(a3);
        int b3 = random.nextInt();
        System.out.println(b3);
        System.out.println(b3);

        Expression eq1 = new Expression(x1, a1, b1);
        eq1.calculate(x1);

        Expression eq2 = new Expression(x2, a2, b2);
        eq2.calculate(a2, b2);

        Expression eq3 = new Expression(x3, a3, b3);
        eq3.calculate(x3, a3, b3);
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

        public void calculate(int x){                    // 1) y = 3x + 5
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
