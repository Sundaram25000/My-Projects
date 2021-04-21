import java.util.*;
class randomhoicechooser
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your no. of choices");
        int no=s.nextInt();
        int b=no+1;
        String A[]=new String[b];
        System.out.println("Enter your choices");
        for (int a=0;a<=no;a++)
        {
            A[a]=s.nextLine();
        }
        int x=(int)((Math.random()*1000)%100%no);
        int y=x+1;
        System.out.println("Your choice is "+A[y]);
    }
}