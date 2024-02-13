import java.util.Scanner;
/**
 * The math class provides methods for performing basic arithmetic operations.
 */
class math{
  // The `add` method in the `math` class is performing addition of two float numbers. It takes two
  // float parameters `x` and `y`, adds them together using the `+` operator, and returns the result.
    float add(float x, float y){
        return x + y;
    }
    float sub(float x, float y){
        return x - y;
    }
    float mul(float x, float y){
        return x * y;
    }
    float div(float x, float y){
        return x / y;
    }

    /**
     * @param args
     */
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter first number (x): ");
        // float x = sc.nextFloat();

        // System.out.println("Enter second number (y): ");
        // float y = sc.nextFloat();
      float x= 10;
      float y=5;
        fine c = new fine();

        float add = c.add(x, y);
        System.out.println("Add= "+add);

        float sub = c.sub(x, y);
        System.out.println("Sub="+sub);

        float div = c.div(x, y);
        System.out.println("Div="+div);

        float mul = c.mul(x, y);
        System.out.println("Multiplication="+mul);

        double square = c.square(x);
        System.out.println("Square = "+square);

        double cube = c.cube(x);
        System.out.println("Cube= "+cube);

        float modulus = c.modulus(x, y);
        System.out.println("Modulo= "+modulus);
}
 }

