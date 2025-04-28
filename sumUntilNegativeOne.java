import java.util.Scanner;

public class sumUntilNegativeOne {
    public static void main(String[] args){
        int sum = 0;
        System.out.println("Input a Number:");
        Scanner number = new Scanner(System.in);
        while(true){
            int num = number.nextInt();
            sum+=num;
            System.out.println("Sum :"+sum);
            if(num==-1){
                break;
            }
        }


       
    




    }

}
