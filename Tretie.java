import java.util.Scanner;

public class New 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод переменной
        System.out.print("Введите число N: ");
        int n = scanner.nextInt(); 

        // Поиск двоек при помощи цикла While
        int powerOfTwo = 1;
        while (powerOfTwo <= n) 
        {
            // Вывод числа в цикле
            System.out.print(powerOfTwo + " "); 
            powerOfTwo *= 2;
        }
    }
}