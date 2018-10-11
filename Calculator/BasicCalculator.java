class BasicCalculator {

    public BasicCalculator(){

    }

    int currentResult = 0;

    public int add(int a, int b){
        System.out.println(a + b);
        currentResult = a + b;
        return currentResult;
    }

    public int subtract(int a, int b){
        System.out.println(a - b);
        currentResult = a - b;
        return currentResult;
    }

    public int multiply(int a, int b){
        System.out.println(a * b);
        currentResult = a * b;
        return currentResult;
    }

    public int divide(int a, int b){
        if(b == 0){
            System.out.println("You cannot divide by zero.");
            currentResult = 0;
            return currentResult;
        }
        else{
            System.out.println(a / b);
            currentResult = a /b;
            return currentResult;
        }
    }

    public int modulo(int a, int b){
        if(b == 0){
            System.out.println("You cannot divide by zero.");
            currentResult = 0;
            return currentResult;
        }
        else{
            System.out.println(a % b);
            currentResult = a % b;
            return currentResult;
        }
    }

    public int add(int b){
        System.out.println(currentResult + b);
        currentResult = currentResult + b;
        return currentResult;
    }

    public int subtract(int b){
        System.out.println(currentResult - b);
        currentResult = currentResult - b;
        return currentResult;
    }

    public int multiply(int b){
        System.out.println(currentResult * b);
        currentResult = currentResult * b;
        return currentResult;
    }

    public int divide(int b){
        if(b == 0){
            System.out.println("You cannot divide by zero.");
            currentResult = 0;
            return currentResult;
        }
        else{
            System.out.println(currentResult / b);
            currentResult = currentResult / b;
            return currentResult;
        }
    }

    public int modulo(int b){
        if(b == 0){
            System.out.println("You cannot divide by zero.");
             currentResult = 0;
            return currentResult;
        }
        else{
            System.out.println(currentResult % b);
            currentResult = currentResult % b;
            return currentResult;
        }
    }

    public int clear(){
        currentResult = 0;
        return currentResult;
    }

    public static void main(String args[]){
        BasicCalculator myCalculator = new BasicCalculator();

        myCalculator.add(1,1);
        myCalculator.multiply(5);
        myCalculator.divide(2);
        myCalculator.subtract(3);
    }
}