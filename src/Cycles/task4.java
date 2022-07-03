package Cycles;

public class task4
    /*Написать программу, которая увеличивает вам зарплату каждый месяц на $1000,
используя циклы while/ do ... while, for. (Все три реализации)*/
{
    public static void main (String[] args)
    {
        System.out.println("Цикл while");
        byte month=0;
        int zp=10000;
        while (zp>-1)
        {
            month++;
            System.out.println("Цикл while.Зарплата в " + month + " месяце равна " + zp);
            zp=zp-1000;
        }
        System.out.println("Цикл do...while");
        zp=10000;
        month=0;
        do
        {
            month++;
            System.out.println("Цикл do...while.Зарплата в " + month + " месяце равна " + zp);
            zp=zp-1000;
        }while (zp>=0);
        System.out.println("Цикл for");
        month=0;
        for (zp = 10000; zp >-1; zp=zp-1000)
        {
            month++;
            System.out.println("Цикл for.Зарплата в " + month + " месяце равна " + zp);
        }
    }
}
