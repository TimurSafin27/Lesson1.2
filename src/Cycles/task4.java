package Cycles;

public class task4
    /*�������� ���������, ������� ����������� ��� �������� ������ ����� �� $1000,
��������� ����� while/ do ... while, for. (��� ��� ����������)*/
{
    public static void main (String[] args)
    {
        System.out.println("���� while:");
        byte month=0;
        int zp=10000;
        while (zp>-1)
        {
            month++;
            System.out.println("���� while.�������� � " + month + " ������ ����� " + zp);
            zp=zp-1000;
        }
        System.out.println("���� do...while:");
        zp=10000;
        month=0;
        do
        {
            month++;
            System.out.println("���� do...while.�������� � " + month + " ������ ����� " + zp);
            zp=zp-1000;
        }while (zp>=0);
        System.out.println("���� for:");
        month=0;
        for (zp = 10000; zp >-1; zp=zp-1000)
        {
            month++;
            System.out.println("���� for.�������� � " + month + " ������ ����� " + zp);
        }
    }
}
