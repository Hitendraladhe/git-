class Empolyee{
    int id;
    String name;
    int salary;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
class Square{
    public Square(){
        System.out.println("Sq-Contructor");
    }
    int side;
    public int getAreaOfSquare(){
        return side*side;
    }
    public int getPerimeter(){
        return 4*side;
    }

}

class Samsung{
    public Samsung(){
        System.out.println("S-Constuctor");
    }
    public void  friendCalling(){
        System.out.println("Ringing Ajay Calling.......");
    }
    public void  playingMusic(){
        System.out.println("Amije tomar#$$%^^%%%$$$##$$%%$$## ");
    }
    public void  powerOf(){
        System.out.println("Switch of the mobile.......!");
    }
}

class Pubg{
    public void firing(){
        System.out.println("Bang... Bang... Bang... Bang....");
    }
    public void run(){
        System.out.println("Run run run... Run run run... Run run run... Run run run....");
    }
    public void hit(){
        System.out.println("Smack... Smack...  Smack...  Smack... ");
    }

}
//class Employee extends Pubg{
//    Empolyee()
//    {
//        System.out.println("Classs");
//    }
//
//}
public class prctice {
    public static void main(String[] args) {
       Empolyee hitu = new Empolyee();
       hitu.salary = 12000;
       hitu.id = 65;
       hitu.name = "Hitendra";
        System.out.println("Hitedra's "+hitu.getSalary());
        System.out.println("Hitedra's "+hitu.getId());
        System.out.println("Hitedra's "+hitu.getName());

        Samsung mob =new Samsung();
        mob.friendCalling();
        mob.playingMusic();
        mob.powerOf();

        Square sqr = new Square();
        sqr.side = 33;
        System.out.println(sqr.getAreaOfSquare());
        System.out.println(sqr.getPerimeter());

        Pubg pbg = new Pubg();
        pbg.hit();
        pbg.firing();
        pbg.run();
    }
}
