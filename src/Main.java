import java.util.Scanner;

public class Main {

        public static void exchangeValue (int a)
        {
            if (a>0)
            {
                System.out.print(a%10 );
                System.out.print(a=a/10);
            }
            else System.out.print("invalid input");
        }
    public static void averageNumber (int a, int b)
    {
        if ((a>0)&&(b>0))
        {
            int Average= ((a+b)/2);
            System.out.println("Average =" + Average);
        }
        else System.out.print("invalid input");
    }

    public static void lineinoUravnenie (int a, int b)
    {
        if ((a==0)&&(b==0))
        {
            System.out.println("True from every x");
        }
        else if (a!=0)
        {
            int x= -(b/a);
            System.out.println("x ="+x);
        }
        else System.out.print("Invalid input");
    }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a:");
            int a = scan.nextInt();
            System.out.print("Enter b:");
            int b = scan.nextInt();
            System.out.print("Enter menu for 1 to 3:");
            int menu= scan.nextInt();
            switch (menu){
                case 1:exchangeValue(a);
                break;
                case 2:averageNumber (a,b);
                break;
                case 3:lineinoUravnenie (a,b);
                break;
                default:System.out.print("Invalid input");
            }

        }
    }
