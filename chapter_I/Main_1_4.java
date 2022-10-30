package chapter_I;

public class Main_1_4
{
    public static void main(String[] args)
    {
        System.out.println("a\ta^2\ta^3");
        for(int i = 1; i<=4;i++)
        {
            System.out.printf("%d\t%d\t%d\n",i,kwadrat(i),szescian(i));
        }
    }
    public static int kwadrat(int a){
        return a*a;
    }
    public static int szescian(int a){
        return kwadrat(a)*a;
    }
}