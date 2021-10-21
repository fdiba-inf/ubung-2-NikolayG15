package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

<<<<<<< HEAD
        //123

        int number1 = number % 10; // 3
        int number2 = (number / 10) % 10; // 2
        int number3 = ((number / 10) / 10); // 1
        
        int sumOfDigits = number1 + number2 + number3; 
        

    
        System.out.println("Sum of digits: " + sumOfDigits);
=======
        int number1 = number / 10;
        int number2 = number % 10;
        int number3 = (number );
        int SumOfDigits = number1 + number2 + number3;
        
        System.out.println(SumOfDigits);
>>>>>>> 7a03bfcb3630f0f15f5d23c5e40e29caab5dd351



     }
    
    }

