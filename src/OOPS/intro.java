package OOPS;

public class intro {
        public static void main(String[] args){
            Pen p1 = new Pen(); // created a pen object p1
            p1.setColor("Blue");

            System.out.println(p1.color);
            p1.setTip(5);
            System.out.println(p1.tip);
            Pen p2 = new Pen();
            p2.color = "Red";
            System.out.println(p2.color);
            System.out.println(p2);
        }
    }
class Pen {
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }

}
class Students{
    String name;
    int age;
    float percentage;
    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}
