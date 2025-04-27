public class ternaryoperator {
    public static void main(String[] args){
          int age = 18;
          String isVoter = (age>=18)?"Voter":"not Voter";
          System.out.println(isVoter);



          int num1 = 10; 
          int num2 = 20; 
          int num3 = 25;
          int max = (num1 > num2) 
                     ? (num1 > num3 ? num1 : num3) 
                     : (num2 > num3 ? num2 : num3);
 
         System.out.println("The maximum of the three numbers is: " + max);
 

    }
}
