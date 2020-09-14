package view;
import java.util.Random;
import controller.ThreadVetor;

public class Principal {
	public static void main(String[] args) {
		
		int [] vet1 = new int[1000];
		Random aleat = new Random();
		
		for (int i = 0; i < 1000; i++)
		{
			vet1[i] = aleat.nextInt(100) + 1;
		}
				
		for (int i = 1; i < 3; i++) 
		{
			Thread threadvet = new ThreadVetor(i, vet1); 
			threadvet.start();
		}
	}
}