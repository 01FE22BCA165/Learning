
// The line `public class fine extends math` is creating a new class called `fine` that extends the
// class `math`. This means that the `fine` class inherits all the properties and methods of the `math`
// class.
public class fine extends math {
     // The code is defining three methods: `square`, `cube`, and `modulus`.
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