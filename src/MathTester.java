public class MathTester {

public static void main(String[] args) {
    int firstNumber = 10;
    int secondNumber = 20;
    String firstWord;
    String secondWord;
    int total;

    if(firstNumber>secondNumber) {
        System.out.println(firstNumber +" is less");
    }
    else if(firstNumber<secondNumber) {
        System.out.println(secondNumber +" is greater");
    }
    else{
        System.out.println("I'm not sure.");
    }






    System.out.println("**********************************************************");





    firstWord = "dog";
    secondWord = "house";
    firstNumber = 5;
    secondNumber = 10;
    total = firstNumber+secondNumber;
    System.out.println(total);



    System.out.println("firstNumber + secondNumber is "+ (firstNumber+secondNumber));
    System.out.println("firstNumber - secondNumber is "+ (firstNumber-secondNumber));
    System.out.println("secondNumber / firstNumber is "+ (secondNumber/firstNumber));
    System.out.println("firstNumber * secondNumber is "+ (firstNumber*secondNumber));
    System.out.println("The modulus of the secondNumber by the firstNumber"+
            " is "+ (secondNumber%firstNumber));





}
}
