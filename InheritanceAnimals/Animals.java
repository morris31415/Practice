import java.util.ArrayList;
class Animals {

    public Animals(){

    }

    public String name;

    public String breed;

    public int numberOfLegs;

    public ArrayList<String> colors;

    public ArrayList<Animals> animals;

    public void makeSound(){

    }

    public void sleep(){

    }

    public static void main(String args[]){
        Animals myCat = new Cat();
        myCat.name = "whiskers";
        myCat.breed = "calico";
        myCat.makeSound();
        myCat.sleep();
        System.out.println(myCat.numberOfLegs);
        myCat.colors.add("brown");
        myCat.colors.add("white");

        Animals myDog = new Dog();

        myDog.breed = "Golden Retriever";
        myDog.name = "Rex";
        myDog.makeSound();
        myDog.sleep();
        myDog.colors.add("yellow");

        Animals myAnimals = new Animals();
        myAnimals.animals.add(myCat);
        myAnimals.animals.add(myDog);
    }
}