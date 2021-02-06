import java.util.*;

class Startup{
    public static void main(String args[]){
        Functions math = new Functions();
        Scanner input = new Scanner(System.in);

        int result;

        System.out.println("What is the value of x?");
        int x = input.nextInt();

        System.out.println("What is the value of y?");
        int y = input.nextInt();

        result = math.add(x, y);
        printResult(x, y, result, "add");

        result = math.subtract(x, y);
        printResult(x, y, result, "subtract");

        result = math.multiply(x, y);
        printResult(x, y, result, "multiply");

        result = math.divide(x, y);
        printResult(x, y, result, "divide");
        
    }

    public static void printResult(int x, int y, int result, String mathType){
        if(mathType == "add")
        System.out.println("The result of " + x + " + " + y + " is " + result);
        if(mathType == "subtract")
        System.out.println("The result of " + x + " - " + y + " is " + result);
        if(mathType == "multiply")
        System.out.println("The result of " + x + " x " + y + " is " + result);
        if(mathType == "divide")
        System.out.println("The result of " + x + " / " + y + " is " + result);
    }

}    
