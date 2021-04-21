class endlessbackandforthloop
{
    public static void main()
    {
        int x=1,c=0,a=15;
        for (int i=1;;i++)     //1-14 & 14-1
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
            System.out.println(i);
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