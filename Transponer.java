
public class Transponer {
	
    private int[][] matriz;
    private int filas;
    private int columnas;

	public Transponer(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.matriz = new int[filas][columnas];
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int getValor(int fila, int columna) {
        return matriz[fila][columna];
    }

    public void setValor(int fila, int columna, int valor) {
        matriz[fila][columna] = valor;
    }
    
    public Transponer transponer() {
        Transponer matrizTranspuesta = new Transponer(columnas, filas);
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                matrizTranspuesta.setValor(j, i, getValor(i, j));
            }
        }
        return matrizTranspuesta;
    }
}
