import java.util.Scanner;

public class Square{
     public static void main(String[] args) 
     {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int counter=2;
        while(counter<=(number/2))
        {
            if(number%counter==0)
            { System.out.println("Counter"+counter);
                System.out.println("Not a prime number");
                break;
            }
          counter++;
        }
        if(number%counter!=0){
            System.out.println("A Prime Number");
        }

        
    }
}