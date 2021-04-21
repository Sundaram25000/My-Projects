import java.util.*;
class letters_horizontal
{
    public static void main()
    {
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        char ch;
        System.out.println("Enter the string");
        String st=s.nextLine();
        System.out.println("Enter your desired character");
        char c=s1.next().charAt(0); 
        st=st.toUpperCase();
        int j,l=st.length();
        System.out.println("\f");
        for (int k=1;k<=5;k++)
        {
            for (int i=0;i<l;i++)
            {
                ch=st.charAt(i);
                if (ch==' ')
                System.out.print("    ");
                if (ch=='A')
                {
                    if (k==1 || k==3)
                    {
                        for (j=1;j<=4;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                    if (k==2 || k==4 || k==5)
                    System.out.print(c+"  "+c+"  ");
                }
                if (ch=='B')
                {
                    if (k==1 || k==5)
                    System.out.print(""+c+c+c+"   ");
                    if (k==2 || k==4)
                    System.out.print(c+"  "+c+"  ");
                    if (k==3)
                    {
                        for (j=1;j<=4;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                }
                if (ch=='C')
                {
                    if (k==1 || k==5)
                    {
                        for (j=1;j<=4;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                    if (k==2 || k==3 || k==4)
                    System.out.print(c+"     ");
                }
                if (ch=='D')
                {
                    if (k==1 || k==5)
                    {
                        for (j=1;j<=3;j++)
                        System.out.print(c);
                        System.out.print("   ");
                    }
                    if (k==2 || k==3 || k==4)
                    System.out.print(c+"  "+c+"  ");
                }
                if (ch=='E')
                {
                    if (k==1 || k==3 || k==5)
                    {
                        for (j=1;j<=4;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                    if (k==2 || k==4)
                    System.out.print(c+"     ");
                }
                if (ch=='F')
                {
                    if (k==1)
                    {
                        for (j=1;j<=4;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                    if (k==2 || k==4 || k==5)
                    System.out.print(c+"     ");
                    if (k==3)
                    {
                        for (j=1;j<=3;j++)
                        System.out.print(c);
                        System.out.print("   ");
                    }
                }
                if (ch=='G')
                {
                    if (k==1 || k==5)
                    {
                        for (j=1;j<=4;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                    if (k==2 || k==3)
                    System.out.print(c+"     ");
                    if (k==4)
                    System.out.print(c+" "+c+c+"  ");
                }
                if (ch=='H')
                {
                    if (k==1 || k==2 || k==4 || k==5)
                    System.out.print(c+"  "+c+"  ");
                    if (k==3)
                    {
                        for (j=1;j<=4;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                }
                if (ch=='I')
                {
                    if (k==1 || k==5)
                    {
                        for (j=1;j<=5;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                    if (k==2 || k==3 || k==4)
                    System.out.print("  "+c+"    ");
                }
                if (ch=='J')
                {
                    if (k==1)
                    {
                        for (j=1;j<=5;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                    if (k==2 || k==3)
                    System.out.print("  "+c+"    ");
                    if (k==4)
                    System.out.print(c+" "+c+"    ");
                    if (k==5)
                    System.out.print(""+c+c+c+"    ");
                }
                if (ch=='K')
                {
                    if (k==1 || k==5)
                    System.out.print(c+"  "+c+"  ");
                    if (k==2 || k==4)
                    System.out.print(c+" "+c+"   ");
                    if (k==3)
                    System.out.print(c+""+c+"    ");
                }
                if (ch=='L')
                {
                    if (k==1 || k==2 || k==3 || k==4)
                    System.out.print(c+"     ");
                    if (k==5)
                    {
                        for (j=1;j<=4;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                }
                if (ch=='M')
                {
                    if (k==1 || k==4 || k==5) 
                    System.out.print(c+"   "+c+"  ");
                    if (k==2)
                    System.out.print(""+c+c+" "+c+c+"  ");
                    if (k==3)
                    System.out.print(c+" "+c+" "+c+"  ");
                }
                if (ch=='N')
                {
                    if (k==1 || k==5)
                    System.out.print(c+"   "+c+"  ");
                    if (k==2)
                    System.out.print(""+c+c+"  "+c+"  ");
                    if (k==3)
                    System.out.print(c+" "+c+" "+c+"  ");
                    if (k==4)
                    System.out.print(c+"  "+c+c+"  ");
                }
                if (ch=='O')
                {
                    if (k==1 || k==5)
                    System.out.print(" "+c+c+"   ");
                    if (k==2 || k==3 || k==4)
                    System.out.print(c+"  "+c+"  ");
                }
                if (ch=='P')
                {
                    if (k==1 || k==3)
                    System.out.print(c+""+c+c+"   ");
                    if (k==2)
                    System.out.print(c+"  "+c+"  ");
                    if (k==4 || k==5)
                    System.out.print(c+"     ");
                }
                if (ch=='Q')
                {
                    if (k==1)
                    System.out.print("  "+c+"    ");
                    if (k==2 || k==3)
                    System.out.print(c+"   "+c+"  ");
                    if (k==4)
                    System.out.print("  "+c+c+"   ");
                    if (k==5)
                    System.out.print("    "+c+"  ");
                }
                if (ch=='R')
                {
                    if (k==1 || k==3)
                    {
                        for (j=1;j<=3;j++)
                        System.out.print(c);
                        System.out.print("   ");
                    }
                    if (k==2)
                    System.out.print(c+"  "+c+"  ");
                    if (k==4)
                    System.out.print(c+" "+c+"   ");
                    if (k==5)
                    System.out.print (c+"  "+c+"  ");
                }
                if (ch=='S')
                {
                    if (k==1 || k==3 || k==5)
                    {
                        for (j=1;j<=4;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                    if (k==2)
                    System.out.print(c+"     ");
                    if (k==4)
                    System.out.print("   "+c+"  ");
                }
                if (ch=='T')
                {
                    if (k==1)
                    {
                        for (j=1;j<=5;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                    if (k==2 || k==3 || k==4 || k==5)
                    System.out.print("  "+c+"    ");
                }
                if (ch=='U')
                {
                    if (k==1 || k==2 || k==3 || k==4)
                    System.out.print(c+"  "+c+"  ");
                    if (k==5)
                    {
                        for (j=1;j<=4;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                }
                if (ch=='V')
                {
                    if (k==1 || k==2)
                    System.out.print(c+"     "+c+"  ");
                    if (k==3)
                    System.out.print(" "+c+"   "+c+"   ");
                    if (k==4)
                    System.out.print("  "+c+" "+c+"    ");
                    if (k==5)
                    System.out.print("   "+c+"     ");
                }
                if (ch=='W')
                {
                    if (k==1 || k==2 || k==3 || k==4)
                    System.out.print(c+"   "+c+"   "+c+"  ");
                    if (k==5)
                    System.out.print("  "+c+"   "+c+"    ");
                }
                if (ch=='X')
                {
                    if (k==1 || k==5)
                    System.out.print(c+"   "+c+"  ");
                    if (k==2 || k==4)
                    System.out.print(" "+c+" "+c+"   ");
                    if (k==3)
                    System.out.print("  "+c+"    ");
                }
                if (ch=='Y')
                {
                    if (k==1)
                    System.out.print(c+"   "+c+"  ");
                    if (k==2)
                    System.out.print(" "+c+" "+c+"   ");
                    if (k==3 || k==4 || k==5)
                    System.out.print("  "+c+"    ");
                }
                if (ch=='Z')
                {
                    if (k==1 || k==5)
                    {
                        for (j=1;j<=5;j++)
                        System.out.print(c);
                        System.out.print("  ");
                    }
                    if (k==2)
                    System.out.print("   "+c+"   ");
                    if (k==3)
                    System.out.print("  "+c+"    ");
                    if (k==4)
                    System.out.print(" "+c+"     ");
                }
            }
            System.out.println();
        }
    }
}