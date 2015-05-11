package MyClass;

import java.util.Random;

import MyClass.MyIO.MyIOconsole;

/**
 * contiene metodi di varia utilità
 * 
 * @author Tiziano Fapanni & Andrea Simaz
 *
 */
public class MyVarie {

	/**
	 * Metodo che consente di ottenere un numero intero compreso fra due valori
	 * @param max rappresenta l'estremo superiore dell'insieme da cui si estraggono i numeri
	 * @param min rappresenta invece l'estremo inferiore.
	 * @return il numero casuale estratto se min<max, altrimenti ritorna 0.
	 */
	public static int interoCasuale(int max, int min){
		Random cas=new Random();
		int num=0;
		
		if(max<min) return num;
		else num=cas.nextInt(max-min+1)+min;
		
		return num;
	}
}
