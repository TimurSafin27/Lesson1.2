package If_Else;

import java.util.Scanner;

public class task3
    /*���������� �������� ���������, ��� �� ������������ ������������ ������ �����  202.
    ���� ������������ ��� ����� 202, ��������� ������ ������� ���������: "�� ����� ����� 202".
    ���� ������������ ��� ������ �����, ��������� ������ ������ �� ������ ������*/
{
    public static void main (String[] args)
    {
        System.out.println ("������� ����� 202:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i==101)
        {
            System.out.println("�� ����� ����� 202");
        }
    }
}
