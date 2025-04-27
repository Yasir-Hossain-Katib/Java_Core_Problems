import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
         int age =18;
         if(age>18){
            System.out.println("You are an adult");
         }
         else if(age==18){
            System.out.println("You are an Adult");
         }
         else{
            System.out.println("You are not an adult");
         }
    



  
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the age:");
       int aged = input.nextInt();

       if(aged>18){
        System.out.println("You are an adult");
       }
       else if(aged==18){
        System.out.println("You are an Adult");
       }
       else{
        System.out.println("You are not an adult");
      }


        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = input.nextInt();
        System.out.println("Enter second number:");
        int number2 = input.nextInt();
        
        if(number1>number2){
            System.out.println(number1+" is greater than "+number2);

        }

        else if(number1==number2){
            System.out.println("Numbers are equal");
        }

        else{
            System.out.println(number2+" is greater than "+number1);
        }



    


}}
