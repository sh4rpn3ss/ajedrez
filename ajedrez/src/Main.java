void main() {
    Tablero tablero = new Tablero();
    Juego juego = new Juego();
    String jugada=null;
    String error = null;
    do {
        tablero.pintarTablero();
        System.out.println("El turno es de: ");
        //método en juego que te diga
       // System.out.println(juego.mostrarTurno());
        System.out.println("Introduzca jugada");
        //inicializar la
        // jugada=
        error = juego.validarJugada(jugada,tablero);
        //mirar si hay error!=null imprimirlo y si no llamar al método validoMovimiento de la pieza en la posicionInicial del atributo mov de Juego

    }while (!jugada.equalsIgnoreCase("FIN"));
}