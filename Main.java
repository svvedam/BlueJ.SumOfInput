/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
    
    
    public static void main(String[] args){
       
        int number;
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = scanner.nextInt();
       
        for(int i = 1; i<=number;i++)
        {
           
            sum = sum + i;
        
        }
        
        System.out.println("The sum of number is : "+ sum);
        
    }
}
