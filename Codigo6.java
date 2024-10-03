import java.util.Scanner;

public class codigo6 {
	  public static void main(String[] args) {
		
		  int[] n = new int[20];//se agrega palabra new
		  
		  for (int i = 0; i < 20; i++) {//se añade simbolo +
			  n[i] = (int)(Math.random() * 381) + 20;
			  System.out.print(n[i] + " ");//se añade out
		  }//for
		  
		  System.out.println("\n¿Qué números quiere resaltar? ");
		  System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		  
		  Scanner s = new Scanner(System.in);
		  int opcion = parseInt(s.nextInt());
		  
		  
		  int multiplo = (opcion == 1)?5:7;
		  
		  for (int e : n) {
			  if (e % multiplo == 0) {
				  System.out.print("[" + e + "] ");
			  }else {
					  System.out.println(e + " ");
				  }//else
			  }//if
		  s.close();
	}//main

	private static int parseInt(int nextInt) {
		// TODO Auto-generated method stub
		return 0;
	}
	  
	}//class codigo6