class operation{
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
}
 class calculations extends operation {
     double square(float x){
        return Math.pow(x, 2);
    }
   double cube(double x){
        return Math.pow(x, 3);
    }
     float modulus(float x,float y){
        return x % y;
    }
 }
 public class calci{
public static void main(String[] args){
    calculations c = new calculations();
    float x =10;
    float y =20;


    float add = c.add(x, y);
    System.out.println(add);

    float sub = c.sub(x, y);
    System.out.println(sub);

    float mul = c.mul(x, y);
    System.out.println(mul);

    float div = c.div(x, y);
    System.out.println(div);

    double square = c.square(x);
    System.out.println(square);

    double cube = c.cube(x);
    System.out.println(cube);

   float modulus = c.modulus(x, y);
  System.out.println(modulus);
}

}
