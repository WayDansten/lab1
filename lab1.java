import java.lang.Math;

public class lab1 {
	
	public static void main(String[] args) {
		
		int[] c = new int[10]; // Массив для первого задания
		
		c[0] = 5;
		
		for (int i = 1; i < 10; i++) {	// Заполняем, предварительно добавив первый (нулевой) элемент
		
			c[i] = c[i - 1] + 2;
			
		}
		
		double[] x = new double[10]; // Массив для второго задания
		
		for (int i = 0; i < 10; i++) {
			
			x[i] = Math.random() * 17 - 14.0; // Заполняем случайными числами в диапазоне [-3;14]
			
			System.out.println(x[i]);
			
		}
		
		double[][] matrix = new double[10][10]; // Матрица для третьего задания
		
		for (int i = 0; i < 10; i++) { // Вложенные циклы для заполнения матрицы
			
			for (int j = 0; j < 10; j++) {
				
				matrix[i][j] = switch (c[i]) { // Switch-кейс для заполнения матрицы
				
					case 7 -> Math.pow(2 * Math.tan(x[j]) / 2, 3); // Условие №1
					
					case 11, 17, 19, 21, 23 -> (Math.pow(Math.pow(Math.E, x[j]), (Math.pow(x[j], 2 * x[j]) + 1) / Math.pow(Math.E, x[j])) - 1) / 0.5; // Условие №2
					
					default -> Math.cbrt(Math.atan(1 / Math.pow(Math.E, Math.pow(Math.E, Math.sin(x[j]) / 2)))); // Условие №3
					
				};
				
				System.out.printf("%.3f", matrix[i][j]); // Вывод матрицы для 4-ого задания (строки 41-47)
				
				System.out.print(" ");
				
			}
			
			System.out.println();
			
		}	
		
	}
	
}
