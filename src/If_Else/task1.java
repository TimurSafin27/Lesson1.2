package If_Else;

import java.util.Scanner;

public class task1
    /*�������� ���������, ������� ������� �� ����� �5,4,3,2,1� ��������� ���� for*/
{
    public static void main (String[] args)
    {
        System.out.println ("������� 5, 4 ��� 1: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i==5)
        {
            System.out.println("�� ����� 5");
        }
        else
        {
            if(i==4)
            {
                System.out.println("�� ����� 4");
            }
            else
            {
                if(i==1)
                {
                    System.out.println("�� ����� 1");
                }
                else
                {
                    System.out.println("�� ����� ������ �����");
                }
            }
        }
    }
}
