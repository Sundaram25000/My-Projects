import java.util.*;
class diceroll
{
    public static void main()
    {
        //System.out.println((int)(Math.random()*1000)%10%6);
        for(int i=1;i<=10000;i++)
        {
            int n=(int)(Math.random()*1000)%10%6;
            System.out.println(n+1);
        }
    }
}