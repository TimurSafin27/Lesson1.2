package If_Else;

import java.util.Scanner;

public class task1
    /*Напишите программу, которая выводит на экран «5,4,3,2,1» используя цикл for*/
{
    public static void main (String[] args)
    {
        System.out.println ("Введите 5, 4 или 1: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i==5)
        {
            System.out.println("Вы ввели 5");
        }
        else
        {
            if(i==4)
            {
                System.out.println("Вы ввели 4");
            }
            else
            {
                if(i==1)
                {
                    System.out.println("Вы ввели 1");
                }
                else
                {
                    System.out.println("Вы ввели другую цифру");
                }
            }
        }
    }
}
