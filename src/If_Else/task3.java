package If_Else;

import java.util.Scanner;

public class task3
    /*Напишите программу, которая выводит на экран «5,4,3,2,1» используя цикл for*/
{
    public static void main (String[] args)
    {
        System.out.println ("Введите число 202:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i==101)
        {
            System.out.println("Вы ввели число 202");
        }
    }
}
