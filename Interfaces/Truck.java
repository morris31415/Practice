class Truck implements iVehicle {

    public Truck(){

    }

    public int numberOfWheels = 4;

    public int weight = 1500;

    public void horn(){
        System.out.println("This is a truck horn.");
    }

    public void startEngine(){
        System.out.println("Truck is started.");
    }

    public void stopEngine(){
        System.out.println("Truck is stopped.");
    }

    public static void main(String args[]){
        Truck myTruck = new Truck();
        myTruck.horn();
        myTruck.startEngine();
        myTruck.stopEngine();
    }
}