import java.util.Scanner;
class Fibonacci 
{
    ublic static void main(String[] args) 
    {
        int n, a = 0, b = 0, c = 1;
        
        n = 15;
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}