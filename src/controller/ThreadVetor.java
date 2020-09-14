package controller;

public class ThreadVetor extends Thread {

	private int a;
	private int vet[];
	
	public ThreadVetor(int a, int [] vet)
	{
		this.a = a;
		this.vet = vet;
	}
	
	public void run() 
	{
		caso();
	}

	private void caso() 
	{
		if (a % 2 == 0) 
		{
			double tempoInicial = System.nanoTime();
			for (int i = 0; i < 1000; i++)
			{
				vet[i] = vet[i];
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, -9);
			tempoTotal = tempoTotal / Math.pow(10, -9);
			
			System.out.println("Tempo de percurso com entrada par: " + tempoTotal);
			
		}
		else
		{
			double tempoInicial = System.nanoTime();
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, -9);
			
			System.out.println("Tempo de percurso com entrada ímpar: " + tempoTotal);
		}
	}
}