package challenge_3;

import java.util.Scanner;
import java.util.Random;
public class GuessNumberGame
{
    public static void main(String args[])
    {
        int a=0,b=0,c=99,i=1;
        Random ran = new Random();
        Scanner scanner = new Scanner(System.in);
        int r = ran.nextInt(99)+0;
        System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
        do
        {
         System.out.println(b+"-"+c);
         System.out.print(i+">>");
            //System.out.format("%d-%d\n", b, c);
            a = scanner.nextInt();
            if(a>r)
            {
                c = a;
                System.out.println("�� ����");
                i++;
            }
            else if (a<r)
            {
                b = a;
                System.out.println("�� ����");
                i++;
            }
            else if (a == r)
            {
                System.out.println("�¾ҽ��ϴ�.");
                System.out.print("����Ͻðڽ��ϱ�(y/n)>>");
                String yn = scanner.next();
                if(yn.equals("y"))
                {
                    r = ran.nextInt(99)+0;
                    c=99;
                    b=0;
                    i=1;
                    System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
                }
                else if(yn.equals("n"))
                {
                    System.exit(0);
                }
            }
        }
        while(r!=a);
        scanner.close();
    }
}