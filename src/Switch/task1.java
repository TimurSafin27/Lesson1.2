package Switch;

import java.util.Scanner;

public class task1
    /*���������� �������� ���������, ��� �� ������������ ������������ ������ ����� �� �����:
     7, 3 ��� 2, � ��������� ������ �������, ����� ����� ��� ������������: 7, 3, ��� 2.*/
{
    public static void main (String[] args)
    {
        System.out.print ("������� 7, 3 ��� 2: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i)
        {
            case (7):
                System.out.println("�� ����� 7");
                ;
                break;
            case (3):
                System.out.println("�� ����� 3");
                ;
                break;
            case (2):
                System.out.println("�� ����� 2");
                ;
                break;
            default:
                System.out.println("�� ����� ������ �����");
                ;
                break;
        }
    }
}
