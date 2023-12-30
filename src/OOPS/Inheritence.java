package OOPS;

public class Inheritence {
    public static void main(String[] args){
//      Fish shark = new Fish();
//      shark.eat();
        Dog Dobby = new Dog();
        Dobby.legs = 4;
    }

}
class Animal {
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println(("breathe"));
    }

}
class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals{
    String breed;
}
//class Fish extends Animal{
//    int fins;
//}