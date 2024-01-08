import java.util.Scanner;
public class Module{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int a,b,m;
        a=obj.nextInt();
        b=obj.nextInt();
        m=a%b;
        System.out.print(m);
    }
}