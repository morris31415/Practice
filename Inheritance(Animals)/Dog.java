import java.utils.ArrayList;
class Dog extends Animal{

    public Dog(){

    }

    public string name;

    public string breed;

    public int numberOfLegs = 4;

    public ArrayList() possibleColors = new ArrayList("black", "white", "brown", "yellow");

    public void makeSound(){
        System.out.println("Woof");
    }

    public void sleep(){
        System.out.println(name + " went to sleep on his dog bed.");
    }

    public static void main(String args[]){
        Animal myDog = new Dog();

        myDog.breed = "Golden Retriever";
        myDog.name = "Rex";
        myDog.makeSound();
        myDog.sleep();
    }
}