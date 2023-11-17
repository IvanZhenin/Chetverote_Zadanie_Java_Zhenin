import java.util.Scanner;
public class New 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		// Ввод первого и второго числа
       		 System.out.print("Введите начало диапазона: ");
        	int start = scanner.nextInt(); 
        	System.out.print("Введите конец диапазона: ");
        	int end = scanner.nextInt();

        	// Объявление переменной суммы и вычисление при помощи цикла
        	int sum = 0;
        	for (int i = start; i <= end; i++) 
        	{
           		if (i % 2 != 0) 
            		{
                	  sum += i;
            		}
       	 	}
        
        	// Вывод
        	System.out.println("Сумма нечетных чисел в диапазоне от " + start + " до " + end + " равна " + sum); 
	}
}