class Coche {
    //-----------------sección de atributos--------------------
    private String color;
    private String marca;
    private int numPuertas;
    private int anio;
    private int potencia;
    private boolean automatico;
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
    
    //------------------sección de constructores---------------
    public Coche() {}
    public Coche(String marca, int anio, String color, int numPuertas, boolean automatico, int potencia, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.numPuertas = numPuertas;
        this.automatico = automatico;
        this.potencia = potencia;
        //
        this.chofer=chofer;
        this.copiloto=copiloto;
        this.pasajero1=pasajero1;
        this.pasajero2=pasajero2;
    }
    //composición
    public Coche(String marca, int anio, String color, int numPuertas, boolean automatico, int potencia, String nombre, String apellido, Fecha fNacimiento) {
        this.marca = marca;
        this.anio = anio;
        this.color = color;
        this.numPuertas = numPuertas;
        this.automatico = automatico;
        this.potencia = potencia;
        //
        chofer=new Persona(nombre,apellido,fNacimiento);
        copiloto=new Persona(nombre,apellido,fNacimiento);
        pasajero1=new Persona(nombre,apellido,fNacimiento);
        pasajero2=new Persona(nombre,apellido,fNacimiento);    
    }
    //-------------------getters/setters-----------------------
    public String getColor(){
      return color;
    }
    public void setColor(String color){
      this.color=color;
    }
    public String getMarca(){
      return marca;
    }
    public void setMarca(String marca){
      this.marca=marca;
    }
    public int getNumPuertas(){
      return numPuertas;
    }
    public void setNumPuertas(int numPuertas){
      this.numPuertas=numPuertas;
    }    
    public int getAnio(){
      return anio;
    }
    public void setAnio(int anio){
      this.anio=anio;
    }
    public int getPotencia(){
      return potencia;
    }
    public void setPotencia(int potencia){
      this.potencia=potencia;
    }
    public boolean getAutomatico(){
      return automatico;
    }
    public void setAutomatico(boolean automatico){
      this.automatico=automatico;
    }
    public Persona getChofer(){
      return chofer;
    }
    public void setChofer(Persona chofer){
      this.chofer=chofer;
    }
    public Persona getCopiloto(){
      return copiloto;
    }
    public void setCopiloto(Persona copiloto){
      this.copiloto=copiloto;
    }
    public Persona getPasajero1(){
      return pasajero1;
    }
    public void setPasajero1(Persona pasajero1){
      this.pasajero1=pasajero1;
    }
    public Persona getPasajero2(){
      return pasajero2;
    }
    public void setPasajero2(Persona pasajero2){
      this.pasajero2=pasajero2;
    }
    //-------------------sección de métodos-----------------------
    /**
  @param  ninguno
  @return imprime que está encendiendo el auto
  */
    public void encender() {
        System.out.println("Soy el coche de la marca " + marca + " y estoy encendiendo");
    }
    /**
  @param true o false, el cual es el valor de avanza
  @return imprime que está avanzando
  */
    public void avanzar(boolean avanza) { 
        if (avanza) {
            System.out.println("Estoy avanzando a 10km/h");
        } else {
            System.out.println("Voy a 0km/h");
        }
    }
    /**
  @param ninguno
  @return imprime que está apagando el coche
  */
    public void apagar() {
        System.out.println("Soy el coche de la marca" + marca + " y me estoy apagando");
    }
    /**
  @param true/false que es el valor que puede tomar frena
  @return imprime si está frenando o no
  */
    public void frenar(boolean frena) {
        if (frena) {
            System.out.println("Estoy frenando");
        } else {
            System.out.println("No estoy frenando");
        }
    }
    /**
  @param recive numPuertasAAbrir
  @return imrprime el num de puertas que se estan abriendo siempre y cuando se pueda dado el numero de puertas que nos piden y las que el coche tiene
  */
    public void abrirPuertas(int numPuertasAAbrir) {
        if (numPuertasAAbrir > numPuertas) {
            System.out.println("El num de puertas a abrir es mayor al num de puertas del coche");
        } else {
            System.out.println("Abriendo " + numPuertasAAbrir + " puertas");
        }
    }
    @Override
    public String toString() {
        return "Auto de marca " + marca + ", año " + anio + ", color " + color + ", numPuertas " + numPuertas + ", automatico " + automatico + ", potencia de " + potencia + ". Chofer:  " + chofer + ", Copiloto: " + copiloto + ", Pasajero 1: " + pasajero1 + " y Pasajero 2: " + pasajero2+"}";
    }
}