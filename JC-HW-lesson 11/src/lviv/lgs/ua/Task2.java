package lviv.lgs.ua;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
	
	static void menu() {
		System.out.println("Enter 1 to display an array of random cars");
		System.out.println("Enter 2 to fill the array with the same values for a random car");
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		material materialForWheel[] = material.values();
		
		while (true) {
			menu();
			switch (scanner.nextInt()) {
			case 1: {
				
				Car carArray [] [] = new Car [getRandomValueFromRange(1, 5)][getRandomValueFromRange(1, 5)];
				for (int i = 0; i < carArray.length; i++) {
					for (int j = 0; j < carArray[i].length; j++) {
						carArray[i][j] = new Car (getRandomValueFromRange(120, 250), 
								getRandomValueFromRange(1999, 2021), 
						new SteeringWheel (getRandomValueFromRange(30, 55), materialForWheel[getRandomValueFromRange(0, materialForWheel.length - 1)].toString()),
						new Engine(getRandomValueFromRange(2, 12)));
					
						
				}
System.out.println(Arrays.deepToString(carArray));
				
				break;
			}
			}
				case 2:{
					Car car = new Car (getRandomValueFromRange(120, 250), 
							getRandomValueFromRange(1999, 2021), 
					new SteeringWheel (getRandomValueFromRange(30, 55), materialForWheel[getRandomValueFromRange(0, materialForWheel.length - 1)].toString()),
					new Engine(getRandomValueFromRange(2, 12)));
					
					Car carArray [] = new Car [getRandomValueFromRange(1, 5)];
					Arrays.fill(carArray, car);

					System.out.println(Arrays.deepToString(carArray));
					
					break;
				}
				default: {
					System.out.println("The entered number must be 1 or 2");

					break;
				}
			}
		}
		}
		
		
		
	
	
public static int getRandomValueFromRange(int min, int max) {
		
		if(min>=max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
			
		}
		
		Random r = new Random ();
		return r.nextInt(max-min +1)+min;
		
		
		
		
	}

}
