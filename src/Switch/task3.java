package Switch;

import java.util.Scanner;

public class task3
    /*Необходимо написать программу, где бы пользователю предлагалось ввести число  303.
    Если пользователь ввёл число 303, программа должна вывести сообщение: "Вы ввели число 303".
    Если пользователь ввёл другое число, программа вообще ничего не должна делать*/
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
