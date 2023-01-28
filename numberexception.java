// question = Write a program to input an integer from keyboard and print it on the console. Fire an exception if the input is other than integer using try and catch blocks.
import java.util.Scanner;
import java.util.InputMismatchException;

public class numberexception {
    
    
    public static void main(String[] args){
         
        // it has to be declared inside of the main function because, if we do it outside of the main function then, at first main class will be called and at that time, the scan variable is not recognized yet
        // because the object is not created at that point of time.

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the number you want to print, make sure only number! = ");

        // we need to use try and catch block because if user typed in string then it will hit the exception!
        try{
            int num = scan.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Exception was hit!");
        }
    }
}
 