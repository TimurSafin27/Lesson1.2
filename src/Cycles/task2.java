package Cycles;

public class task2
        /*�������� ������ � ����� ������ ������ � ������� �� ����� ��������� ������
        ���� ����������� ������� ������ �� ��������*/
{
    public static void main (String[] args)
    {
        String MyName="����� ����� �����������";
        String MyName1="����� ����� �����������";
        char[] Surname= new char[5];
        System.out.println("����� - " + MyName.length());
        System.out.println("������? - " + MyName.isEmpty());
        System.out.println("�������� - " + MyName.charAt(0) + MyName.charAt(6) + MyName.charAt(12));
        MyName.getChars(0, 5, Surname, 0);
        String Surname2=String.valueOf(Surname);
        System.out.println("������� - " + Surname2);
        System.out.println("�����? - " + MyName.equals(MyName1));
        System.out.println("����� ���������� �� ��������? - " + MyName.equalsIgnoreCase(MyName1));
        System.out.println("startsWith - " + MyName.startsWith(Surname2));
        System.out.println("startsWith - " + MyName.endsWith(Surname2));
        String Name1=" �����";
        System.out.println("�������+��� - " + Surname2.concat(Name1));
    }
}

