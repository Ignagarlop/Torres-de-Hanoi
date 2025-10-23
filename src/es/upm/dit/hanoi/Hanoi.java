package es.upm.dit.hanoi;

public class Hanoi {
	public static void hanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco de " + origen + " a " + destino);
        } else {
            hanoi(n - 1, origen, auxiliar, destino);
            System.out.println("Mover disco de " + origen + " a " + destino);
            hanoi(n - 1, auxiliar, destino, origen);
        }
    }
	public static void main(String[] args) {
        int n = 3; 
        hanoi(n, 'A', 'B', 'C');
        int movimientos = (int) Math.pow(2, n) - 1;
        System.out.println("Número total de movimientos: " + movimientos);
    }
}
