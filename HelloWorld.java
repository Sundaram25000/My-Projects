import java.util.*;
class HELLOWORLD
{
    public static void main()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Taregeted String");
        String st=s.nextLine();
        for (double j=1.0;j<=500000.0;j=j+0.001);
        System.out.println("\f");
        st=st.toUpperCase();
        String nst="";
        int temp,i,l=st.length();
        double j;
        char ch;
        /*
        for (i=1;i<=100;i++)
        System.out.println((int)((Math.random()*1000)%100%26));
        */
        for (i=0;i<l;i++)
        {
            temp=(int)((Math.random()*1000)%100%27)+65;
            if (temp==91)
            ch=' ';
            else
            ch=(char)temp;
            if (st.charAt(i)==ch)
            {
                nst=nst+ch;
                System.out.println("Character Generated:\t\t\t\t\t\t\t\t\tTarget word:"+st);
                System.out.println(ch);
                for (j=1.0;j<=500000.0;j=j+0.001);
                System.out.println("Required Character Found.");
                for (j=1.0;j<=500000.0;j=j+0.0001);
                System.out.println("String Found Until Now:");
                for (j=1.0;j<=500000.0;j=j+0.001);
                System.out.println(nst);
                for (j=1.0;j<=500000.0;j=j+0.0001);
                System.out.println("\f");
            }
            else
            {
                System.out.println("Character Generated:\t\t\t\t\t\t\t\t\tTarget word:"+st);
                for (j=1.0;j<=500000.0;j=j+0.001);
                System.out.println(ch);
                for (j=1.0;j<=500000.0;j=j+0.001);
                System.out.println("\f");
                i--;
            }
        }
        System.out.println("String Achieved:"+nst);
    }
}