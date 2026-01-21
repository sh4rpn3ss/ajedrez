
StringBuilder sb = new StringBuilder();
    static void main(String[] args) {
        char [][] tablero = {
                {'♜','♞','♝','♛','♚','♝','♞','♜'},
                {'♟','♟','♟','♟','♟','♟','♟','♟',},
                {' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' '},
                {'♙','♙','♙','♙','♙','♙','♙','♙'},
                {'♖','♘','♗','♕','♔','♗','♘','♖'}
        };
        imprimirTablero(tablero);
    }
    public static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    public boolean hayFICHA(String xd) {
        return false;
    }

