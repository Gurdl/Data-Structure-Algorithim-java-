import java.util.Scanner;
public class Prime_In_Range
{
    // For all condition when n>1.Check if n is prime
    public static boolean isPrime(int n)
    {
        if(n==2){
            return true;
        }
        for(int i=2; i<=n/2; i++)
        {
            //get divided by any number:
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeRange(int n)
    {
        for(int i=2; i<=n; i++)
        {
            if(isPrime(i)){
                System.out.print(i +" ");
            }

        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Plaese Enter the number ,Upto which you need prime numbers");
        int number=sc.nextInt();
        primeRange(number);
       
        
    }
}