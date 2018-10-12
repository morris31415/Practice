import java.util.ArrayList;
class Animals {

    public Animals(){

    }

    public String name;

    public String breed;

    public ArrayList<String> colors = new ArrayList<String>();

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
        myCat.colors.add("brown");
        myCat.colors.add("white");

        Animals myDog = new Dog();

        myDog.breed = "Golden Retriever";
        myDog.name = "Rex";
        myDog.makeSound();
        myDog.sleep();
        myDog.colors.add("yellow");

        ArrayList<Animals> myAnimals = new ArrayList<Animals>();
        myAnimals.add(myCat);
        myAnimals.add(myDog);

        System.out.println();
        System.out.println();
        System.out.println();

        for(int i = 0; i < myAnimals.size(); i++){
            System.out.println(myAnimals.get(i).name);
        }
    }
}