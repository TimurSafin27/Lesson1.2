package Switch;

import java.util.Scanner;

public class task3
    /*�������� ���������, ������� ������� �� ����� �5,4,3,2,1� ��������� ���� for*/
{
    public static void main (String[] args)
    {
        System.out.print ("������� ����� 303: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i)
        {
            case (303):
                System.out.println("�� ����� ����� 303");
                break;
        }
    }
}
