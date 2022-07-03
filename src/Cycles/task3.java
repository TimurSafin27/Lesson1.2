package Cycles;

public class task3
    /*Написать программу, которая увеличивает вам зарплату каждый месяц на $1000,
используя циклы while/ do ... while, for. (Все три реализации)*/
{
    public static void main (String[] args)
    {
        byte month=0;
        int zp=0;
        while (month<12)
        {
            zp=zp+1000;
            month++;
            System.out.println("Год 1.Зарплата в " + month + " месяце равна " + zp);
        }
        month=0;
        do
        {
            zp=zp+1000;
            month++;
            System.out.println("Год 2.Зарплата в " + month + " месяце равна " + zp);
        }while (month<12);
        for (month = 1; month <= 12; month++)
        {
            zp = zp + 1000;
            System.out.println("Год 3.Зарплата в " + month + " месяце равна " + zp);
        }
    }
}
