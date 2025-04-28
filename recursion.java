public class recursion {
    public static void main(String[] args){
        System.out.println(factorial(99));
    }

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
