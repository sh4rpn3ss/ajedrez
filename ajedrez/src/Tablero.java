public class Tablero {
    private Pieza [][] tab;

    public Tablero(){
        tab = new Pieza[8][8]; //espacio en Ram para que las piezas se puedan mover
        tab[0][0]= new Torre(0);
        tab[7][0]= new Torre (1);
        tab[0][1]= new Callabo(0);
        tab[7][1]= new Callabo (1);
        tab[0][2]= new Alfil(0);
        tab[7][2] = new Alfil(1);
        tab[0][3]=new Queen(0);
        tab[7][3]=new Queen(1);
        tab[0][4]=new Rey(0);
        tab[7][4]=new Rey(1);
        tab[0][7]= new Torre(0);
        tab[7][7]= new Torre (1);
        tab[0][6]= new Callabo(0);
        tab[7][6]= new Callabo (1);
        tab[0][5]= new Alfil(0);
        tab[7][5] = new Alfil(1);

        //for para peon

    }
    public void pintarTablero(){
        for (int fila = 0; fila < tab.length; fila++) {
            for (int columna=0; columna<tab[0].length;columna++){
                if (tab[fila][columna]!= null)
                    System.out.print(tab[fila][columna].pintarPieza());
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
