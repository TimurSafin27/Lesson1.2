package Cycles;

public class task3
    /*�������� ���������, ������� ����������� ��� �������� ������ ����� �� $1000,
��������� ����� while/ do ... while, for. (��� ��� ����������)*/
{
    public static void main (String[] args)
    {
        byte month=0;
        int zp=0;
        while (month<12)
        {
            zp=zp+1000;
            month++;
            System.out.println("��� 1.�������� � " + month + " ������ ����� " + zp);
        }
        month=0;
        do
        {
            zp=zp+1000;
            month++;
            System.out.println("��� 2.�������� � " + month + " ������ ����� " + zp);
        }while (month<12);
        for (month = 1; month <= 12; month++)
        {
            zp = zp + 1000;
            System.out.println("��� 3.�������� � " + month + " ������ ����� " + zp);
        }
    }
}
