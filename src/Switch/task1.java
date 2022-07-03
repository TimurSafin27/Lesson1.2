package Switch;

import java.util.Scanner;

public class task1
    /*Напишите программу, которая выводит на экран «5,4,3,2,1» используя цикл for*/
{
    public static void main (String[] args)
    {
        System.out.print ("Введите 7, 3 или 2: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i)
        {
            case (7):
                System.out.println("Вы ввели 7");
                ;
                break;
            case (3):
                System.out.println("Вы ввели 3");
                ;
                break;
            case (2):
                System.out.println("Вы ввели 2");
                ;
                break;
            default:
                System.out.println("Вы ввели другую цифру");
                ;
                break;
        }
    }
}
