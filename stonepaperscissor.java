import java.util.*;
class stonepaperscissor
{
    public static void main()
    {
        Scanner s=new Scanner(System.in);
        for (int j=1;j<=5;j++)
        {
            System.out.println("enter s for stone, p for paper and v for scissor");
            char player=s.next().charAt(0);
            char comp=' ';
            //System.out.println((int)(Math.random()*1000)%10%3/);/random statement for checking the functioning of the below statement
            int x=(int)(Math.random()*1000)%10%3;
            if (x==0)
            {
                comp='s';
                System.out.println("computer played stone");
            }
            if (x==1)
            {
                comp='p';
                System.out.println("computer played paper");
            }
            if (x==2)
            {
                comp='v';
                System.out.println("computer played scissor");
            }
            if (player==comp)
            System.out.println("YOU TIED");
            if ((player=='s' && comp=='p')||(player=='p' && comp=='v')||(player=='v' && comp=='s'))
            System.out.println("YOU LOST");
            if ((player=='p' && comp=='s')||(player=='v' && comp=='p')||(player=='s' && comp=='v'))
            System.out.println("YOU WON");
        }
    }
}