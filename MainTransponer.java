
public class MainTransponer {

	public static void main(String[] args) {
		Transponer matriz = new Transponer(2, 3);
        matriz.setValor(0, 0, 1);
        matriz.setValor(0, 1, 2);
        matriz.setValor(0, 2, 3);
        matriz.setValor(1, 0, 4);
        matriz.setValor(1, 1, 5);
        matriz.setValor(1, 2, 6);
	
	System.out.println("Matriz original:");
    for (int i = 0; i < matriz.getFilas(); i++) {
        for (int j = 0; j < matriz.getColumnas(); j++) {
            System.out.print(matriz.getValor(i, j) + " ");
        }
        System.out.println(" ");
    }

    Transponer matrizTranspuesta = matriz.transponer();
    
    System.out.println("Matriz transpuesta:");
    for (int i = 0; i < matrizTranspuesta.getFilas(); i++) {
        for (int j = 0; j < matrizTranspuesta.getColumnas(); j++) {
            System.out.print(matrizTranspuesta.getValor(i, j) + " ");
        }
        System.out.println();
    }
}
}
