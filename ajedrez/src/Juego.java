public class Juego {
    private int turno; //0 negras 1 blancas
    private Movimiento mov; //movimiento actual de la jugada
    public Juego(){
        turno=1;
    }
    //constructores, getter, setter y el toString
    public String validarJugada(String jugada, Tablero tablero){
        String error= null;
        int filaInicial, columnaInicial, filaFinal, columnaFinal;
        //ir al fallo y si no falla el 1er error, buscar el siguiente error
        if (jugada.length()!=4)
            error = "La jugada debe tener cuatro caracteres, ejemplo A2A3";
 //       else if (){

 //       }else if(){


//        }else{
 //           mov = new Movimiento(new Posicion(filaInicial,columnaInicial), new Posicion(filaFinal,columnaFinal));
 //       }
  //  }
  //  public String mostrarTurno(){
        return null;
    }
}
