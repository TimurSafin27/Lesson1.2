package If_Else;

import java.util.Scanner;

public class task2
    /*Напишите программу, которая выводит на экран «5,4,3,2,1» используя цикл for*/
{
    public static void main (String[] args)
    {
        System.out.println ("Введите число 101:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i==101)
        {
            System.out.println("Вы ввели число 101");
        }
        else
        {
            System.out.println("Вы ввели число не равное 101");
        }
    }
}
