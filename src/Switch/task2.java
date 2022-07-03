package Switch;

import java.util.Scanner;

public class task2
    /*Напишите программу, которая выводит на экран «5,4,3,2,1» используя цикл for*/
{
    public static void main (String[] args)
    {
        System.out.print ("Введите число 202: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i)
        {
            case (202):
                System.out.println("Вы ввели число 202");
                break;
            default:
                System.out.println("Вы ввели число не равное 202");
                break;
        }
    }
}
