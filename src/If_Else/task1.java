package If_Else;

import java.util.Scanner;

public class task1
    /*Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
     5, 4 или 1, а программа должна сказать, какое число ввёл пользователь: 5, 4, или 1.*/
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
        else if(i==4)
            {
                System.out.println("Вы ввели 4");
            }
            else if(i==1)
                {
                    System.out.println("Вы ввели 1");
                }
                else
                {
                    System.out.println("Вы ввели другую цифру");
                }
            
        
    }
}
