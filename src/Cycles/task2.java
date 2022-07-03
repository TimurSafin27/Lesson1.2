package Cycles;

public class task2
        /*Объявить строку с вашим полным именем и вывести на экран результат работы
        всех стандартных методов работы со строками*/
{
    public static void main (String[] args)
    {
        String MyName="Сафин Тимур Зиганурович";
        String MyName1="САФИН ТИМУР ЗИГАНУРОВИЧ";
        char[] Surname= new char[5];
        System.out.println("длина - " + MyName.length());
        System.out.println("пустая? - " + MyName.isEmpty());
        System.out.println("Инициалы - " + MyName.charAt(0) + MyName.charAt(6) + MyName.charAt(12));
        MyName.getChars(0, 5, Surname, 0);
        String Surname2=String.valueOf(Surname);
        System.out.println("Фамилия - " + Surname2);
        System.out.println("Равны? - " + MyName.equals(MyName1));
        System.out.println("Равны независимо от регистра? - " + MyName.equalsIgnoreCase(MyName1));
        System.out.println("startsWith - " + MyName.startsWith(Surname2));
        System.out.println("startsWith - " + MyName.endsWith(Surname2));
        String Name1=" Тимур";
        System.out.println("concat - " + Surname2.concat(Name1));
        System.out.println("replace - " + MyName1.replace(" ", "_"));
        System.out.println("contains - " + MyName.contains(Name1));
    }
}

