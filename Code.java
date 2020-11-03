import java.util.*;
public class pallindrome
{
    public static void main(int a)
    {
        int b=0,d=0,e=0;
        int c=a;
        System.out.println("hello"); 

     while (a<0)
     {
         b=a%10;
        e=e*10+b;
        a=a/10;
    }
    if(c==e)
    {
            System.out.println("It is pallindrome");
        
    }
        else
        {
            System.out.println("It is not pallindrome");
        }
    }
    }
