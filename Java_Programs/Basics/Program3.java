import java.util.Scanner;

class Program2
{
    public static void main (String A[])
    {
        //Dyanamic Addition of two numbers 

        Scanner sobj = new Scanner(System.in);

        int Ans = 0;

        System.out.print("Enter the first number : ");

        int a = sobj.nextInt();

        System.out.print("Enter the second number : ");

        int b = sobj.nextInt();

        Ans = a + b;

        System.out.println("Addition of two dyanamic variables is = " + Ans);
    }
}