class Car implements iVehicle {

    public Car(){

    }

    public int numberOfWheels = 4;

    public int weight = 1000;

    public void horn(){
        System.out.println("This is a car horn.");
    }

    public void startEngine(){
        System.out.println("Car is started.");
    }

    public void stopEngine(){
        System.out.println("Car is stopped.");
    }

    public static void main(String args[]){

    }
}