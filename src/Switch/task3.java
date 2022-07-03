package Switch;

import java.util.Scanner;

public class task3
    /*Напишите программу, которая выводит на экран «5,4,3,2,1» используя цикл for*/
{
    public static void main (String[] args)
    {
        System.out.print ("Введите число 303: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i)
        {
            case (303):
                System.out.println("Вы ввели число 303");
                break;
        }
    }
}
