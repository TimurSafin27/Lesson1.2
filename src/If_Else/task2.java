package If_Else;

import java.util.Scanner;

public class task2
    /*�������� ���������, ������� ������� �� ����� �5,4,3,2,1� ��������� ���� for*/
{
    public static void main (String[] args)
    {
        System.out.println ("������� ����� 101:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i==101)
        {
            System.out.println("�� ����� ����� 101");
        }
        else
        {
            System.out.println("�� ����� ����� �� ������ 101");
        }
    }
}
