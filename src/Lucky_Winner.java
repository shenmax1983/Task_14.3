import java.util.Scanner;
/*Вы можете выиграть деньги в лотерею. Если номер билета кратен 10 и 9 программа выводит "You won $200". Если он
* кратен 4 или 6, программа выводит "You won $50". Во всех других случаях приз не положен, а программа должна вывести
* "Try again".
* Пример входных данных
* 11457
*
* Пример выходных данных
* Try again
*
* Подсказка
* Число "а" кратно числу "b", если a%b==0.
* Используйте операторы && и || для множественных условий.*/

public class Lucky_Winner
{
    public static void main (String[] args)
    {
        System.out.print("Введите номер билета -> ");
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        double j=number%10;
        double i=number%9;
        double k=number%6;
        double n=number%4;
        if(j==0 && i==0)
            System.out.println("You won $200");
        else if (k==0 || n==0)
            System.out.println("You won $50");
        else
            System.out.println("Try again");
    }
}
