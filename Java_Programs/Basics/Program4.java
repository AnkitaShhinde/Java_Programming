import java.util.Scanner;

class Program4
{
    public static void main (String A[])
    {
        //Dyanamic Addition,Substraction, Multiplication and division of two numbers 

        Scanner sobj = new Scanner(System.in);

        double Ans = 0.0;

        System.out.println("Please enter what you want to perform!");

        System.out.println("1. Addition / 2. Substraction / 3. Multiplication / 4. Division");

        double choice = sobj.nextInt();

        System.out.print("Enter the first number : ");

        double a = sobj.nextDouble();

        System.out.print("Enter the second number : ");

        double b = sobj.nextDouble();

        if(choice == 1)
        {
            Ans = a+b;
            System.out.println("Addition of two dyanamic variables is = " + Ans);
        }

        else if (choice == 2)
        {
            Ans = a-b;
            System.out.println("Substraction of two dyanamic variables is = " + Ans); 
        }

        else if(choice == 3)
        {
            Ans = a*b;
            System.out.println("Multiplication of two dyanamic variables is = " + Ans); 
        }

        else if(choice == 4)
        {
            if(b == 0.0)
            {
                System.out.println("Can not divide by zero!");
            }

            else
            {
                Ans = a/b;
                System.out.println("Division of two dyanamic variables is = " + Ans);
            
                System.out.println("Please enter the valid input!");
            }       
        }    
    }
}