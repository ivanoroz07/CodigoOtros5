//El codigo clasifica si un número es afortunado si es 3, 7, 8 etc y lo imprime

import java.util.Scanner;//se importo el scanner

public class Codigo5 {
	public static void main(String[] args) {//Se agrego la clase main
	Scanner s = new Scanner(System.in);
	System.out.println("Introduzca un número: ");//se cambio ' por "
    int ni = s.nextInt();//Se cambio line por int
    int c = ni;
    
    int afo = 0;
    int noAfo = 0;
    
    while (ni > 0) {
	  int digito = (int)(ni % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;	  
    }
    
      ni /= 10;//Se saco del ciclo while junto con el siguiente if else
  }
    if (afo > noAfo) {
        System.out.println("El " + c + " es un número afortunado.");//se corrigio el printx|
      } else {
        System.out.println("El " + c + " no es un número afortunado.");
      }
   s.close();//se cerro el scanner
}
}