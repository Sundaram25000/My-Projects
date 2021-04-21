class loading2
{
    public static void main()
    {
        boolean flag=true;
        System.out.println("\f");
        int x=1,c=0,a=15;
        for (int i=1;;i++)
        {
            if (i<15)
            {
                c++;
                a=15;
            }
            if (i==15)
            {
                i=15-x++;
                a--;
            }
            System.out.println("________________");
            for (int j=1;j<i;j++)
            System.out.print(" ");
            System.out.print("...");
            System.out.println();
            System.out.println("----------------");                
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
            if (c==14)
            i=14;
            if (a==0)
            {
                i=0;
                c=0;
                x=1;
            }
        }
    }
}