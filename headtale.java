import java.util.*;
class headtale
{
    public static void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println((int)(Math.random()*100)%10);//random statement for checking the functioning of the below statement
        System.out.println(((int)(Math.random()*100)%10)%2==0?"heads":"tales");
    }
}