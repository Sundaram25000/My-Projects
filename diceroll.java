import java.util.*;
class diceroll
{
    public static void main()
    {
        int n=(int)(Math.random()*1000)%10%6;
        System.out.println(n+1);
    }
}