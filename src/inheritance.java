class Base{
    int x;
     Base (int a){
        System.out.println("I am contructor of base "+ a);
    }
    public int getX(){
        return x;
    }
    public void add(int a, int b){
        int sum =  a+ b;
        System.out.println("this is the sum of two number " +sum);
    }
    public void setX(int a){
        this.x = a;
    }

    public void printMe(){
        System.out.println("I am base");
    }
}
class derive{
    int y;
    public derive(){
        System.out.println("I am contructor of derive");
    }
    public int getY(){
        return y;
    }
    public void setY(int a){
        this.y = a;
    }
    public void printMe(){
        System.out.println("I am derive");
    }
}
class derive1 extends Base{
    derive1(){
        super(12);
        System.out.println("I am from derive1 constructor ");
    }


}

//class Chilled extends Base{
//    Chilled(int x,int y,int z){
//       super( x,y,z);
//        System.out.println("this is overloaded Chilled's constructor "+z);
//    }
//}
public class inheritance {
    public static void main(String[] args) {
//      Base ba = new Base();
//      ba.x = 12;
//      ba.add(12, 37);
//
//      derive de = new derive();
//        de.y = 13;
      //Chilled ch = new Chilled(12, 13, 12);
      derive1 de1 = new derive1();

    }
}
