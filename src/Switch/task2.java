package Switch;

import java.util.Scanner;

public class task2
    /*���������� �������� ���������, ��� �� ������������ ������������ ������ �����  202.
    ���� ������������ ��� ����� 202, ��������� ������ ������� ���������: "�� ����� ����� 202".
    ���� ������������ ��� ������ �����, ��������� ������ ������� ����� ���������:
    "�� ����� ����� �� ������ 202"*/
{
    public static void main (String[] args)
    {
        System.out.print ("������� ����� 202: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i)
        {
            case (202):
                System.out.println("�� ����� ����� 202");
                break;
            default:
                System.out.println("�� ����� ����� �� ������ 202");
                break;
        }
    }
}
