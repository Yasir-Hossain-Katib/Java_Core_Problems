import java.util.Scanner;

public class primenumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = input.nextInt();
        boolean flag = true;

        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                flag = false;
                break;
            }
        }

        if (flag==true){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");

        }


    }
}
