import java.util.Scanner ;

class Circle{
    int radius;
    Circle(int r){
        System.out.println("this is constructor from circle class ");
        this.radius = r  ;
    }
    public double area(){
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circle{
    protected int height;
    Cylinder1(int r , int h){
        super(r);
        this.height = h;
        System.out.println("I am constructor from cylinder1 ");
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}
public class circlesMethod {
    public static void main(String[] args) {
//        Circle  objc = new Circle(12);
//        System.out.println(objc.area());
        Cylinder1 obj = new  Cylinder1(12, 23);

    }
}
