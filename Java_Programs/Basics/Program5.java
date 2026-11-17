//Write a program where a person is eligible for voting
import java.util.Scanner;

class Program5
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the age of the candidate : ");
        int Age = sobj.nextInt();
        
        sobj.nextLine(); //Consume the leftover newline
        
        System.out.println("Enter the name of the candidate : ");
        String Name = sobj.nextLine(); //reads the entire line including spaces
        //next() - reads one word (stops at whitespace)
        
        if(Age >= 18)
        {
            System.out.println(Name+" is eligible for voting!");
        }
        else
        {
            System.out.println(Name+" is not eligible for voting!");
        }
    }
}