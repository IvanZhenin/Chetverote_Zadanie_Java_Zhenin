public class New 
{

	public static void main(String args[])
	{
			// Объявление двойного цикла	
	        	for (int i = 1; i <= 10; i++) 
			{
	            		for (int j = 1; j <= i; j++) 
				{
	            		   // Вывод символов треугольника соответственно циклу
	               		   System.out.print("*"); 
	            		}
	            		// переход на новую строку
	            		System.out.println(); 
			}
		}
}