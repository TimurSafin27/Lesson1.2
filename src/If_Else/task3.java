package If_Else;

import java.util.Scanner;

public class task3
    /*Необходимо написать программу, где бы пользователю предлагалось ввести число  202.
    Если пользователь ввёл число 202, программа должна вывести сообщение: "Вы ввели число 202".
    Если пользователь ввёл другое число, программа вообще ничего не должна делать*/
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
