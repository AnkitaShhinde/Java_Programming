//Make a calculater using oop

import java.util.Scanner;

class Arithmetic
{
    double Ans = 0.0;

    public double Addition(double no1, double no2)
    {
        Ans = no1 + no2;
        return Ans;
    }

    public double Substraction(double no1, double no2)
    {
        Ans = no1 - no2;
        return Ans;
    }

    public double Multiplication(double no1, double no2)
    {
        Ans = no1 * no2;
        return Ans;
    }

    public double Division(double no1, double no2)
    {
        Ans = no1 / no2;
        return Ans;
    }
}

class Program6
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the operation that you want to perform");

        System.out.println("1. Addition / 2. Substraction / 3. Multiplication / 4. Divistion");
        int choice = sobj.nextInt();

        System.out.println("Enter the first number : ");
        double no1 = sobj.nextDouble();

        System.out.println("Enter the second number : ");
        double no2 = sobj.nextDouble();

        Arithmetic aobj = new Arithmetic();

        double Ans = 0.0;

        if(choice == 1)
        {
            Ans = aobj.Addition(no1,no2);
            System.out.println("Addition of two numbers is : "+Ans);
        }

        else if(choice == 2)
        {
            Ans = aobj.Substraction(no1,no2);
            System.out.println("Substraction of two numbers is : "+Ans);
        }

        else if(choice == 3)
        {
            Ans = aobj.Multiplication(no1,no2);
            System.out.println("Multiplication of two numbers is : "+Ans);
        }

        else if(choice == 4)
        {
            if(no2 == 0.0)
            {  
                System.out.println("Can not divide by zero!");
            }
            else
            {
                Ans = aobj.Division(no1,no2);
                System.out.println("Divistion of two numbers is : "+Ans);
            }    
        }
        else
        {
            System.out.println("Please enter the valid input");
        }

    }
}