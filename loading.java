public class loading
{
    public static void main(String args[])
    {
        boolean flag=true;
        System.out.println("\b");
        while(true)
        {
            for (int i=1;i<=15;i++)
            {
                System.out.println("_________________");
                for (int j=1;j<i;j++)
                System.out.print(" ");
                System.out.print("...");
                System.out.println();
                System.out.println("-----------------");                
                try 
                { 
                    while (flag) 
                    {
                        Thread.sleep(100);
                        flag=false;
                    } 
                } 
                catch (InterruptedException ex)
                {
                }
                flag=true;
                System.out.println("\f");
            }
        }
    }
}