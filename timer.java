import java.util.*;
class timer
{
    public static void main()
    {
        Scanner s=new Scanner(System.in);
        int time,dup,i;
        boolean flag=true;
        System.out.println("Enter hours");
        int hrs=s.nextInt();
        System.out.println("Enter minutes");
        int min=s.nextInt();
        System.out.println("Enter seconds");
        int sec=s.nextInt();
        time=hrs*3600+min*60+sec;
        dup=time;
        System.out.println("\f");
        int p1=dup%60;
        int p2=dup/60;
        int p3=p2%60;
        p2=p2/60;
        System.out.println(p2+":"+p3+":"+p1);
        for (i=1;i<=time;i++)
        {
            try 
            { 
                while (flag) 
                {
                    Thread.sleep(1000);
                    flag=false;
                    dup--;
                } 
            } 
            catch (InterruptedException ex)
            {
            }
            flag=true;
            System.out.println("\f");
            p1=dup%60;
            p2=dup/60;
            p3=p2%60;
            p2=p2/60;
            System.out.println(p2+":"+p3+":"+p1);
        }
    }
}