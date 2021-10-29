
/**
*@author Armas Vega Grofor Octavio
*/
class Main {
  public static void main(String[] args) {
    //circulo
    Circulo cir=new Circulo();
    System.out.println(cir);
    cir.setRadio(5.6f);
    System.out.println(cir);
    cir.setRadio((float)7.33);
    System.out.println(cir);
    float var = -8.66f;
    cir.setRadio(var);
    System.out.println(cir);
    //composicion persona
    Persona persona1=new Persona();
    System.out.println("persona1");
    persona1.setNombre("Carmen");
    persona1.setApellido("Vega");
    Fecha fecha = new Fecha(2,1,2021);
    persona1.setfNacimiento(fecha);

    //#########################Composición Coche############################;
    //------creacion de personas------
    //chofer
    Persona chofer = new Persona();
    Fecha fechachofer = new Fecha(26,11,1998);
    chofer.setNombre("Grofor");    
    chofer.setApellido("Armas");
    chofer.setfNacimiento(fechachofer);    
    //copiloto
    Fecha fechacopiloto = new Fecha(4,5,2001);
    Persona copiloto=new Persona("Octavio","Vega",fechacopiloto);
    //pasajero1
    Fecha fechapasajero1 = new Fecha(5,6,2002);
    Persona pasajero1=new Persona("Alondra","García",fechapasajero1);    
    //pasajero2
    Fecha fechapasajero2 = new Fecha(6,7,2003);
    Persona pasajero2=new Persona("Daniela","Hernandez",fechapasajero2);
    //creación de coche
    Coche coche1=new Coche("Toyota",2021,"Rojo",6,true,1500,chofer,copiloto,pasajero1,pasajero2);    
    System.out.println("###############Impresion coche1###############");
    System.out.println(coche1);
  }
}