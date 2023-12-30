package OOPS;

public class GettersandSetters {
    public static void main(String[] args){
        Pen p1 = new Pen(); // created a pen object p1
        p1.setColor("Blue");

        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        Pen p2 = new Pen();
        p2.setColor ( "Red");
        System.out.println(p2.color        );
        System.out.println(p2);
    }
}
class pen{

    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
