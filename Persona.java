 public class Persona{
  //atributos
  private String nombre; 
  private String apellido;
  private Fecha fNacimiento;
  
  //constructores
  public Persona(){}
  
  public Persona(String nombre, String apellido, Fecha fNacimiento){
    this.nombre=nombre;
    this.apellido=apellido;
    this.fNacimiento=fNacimiento;
  }
  //composición
    public Persona(String nombre, String apellido, int dia, int mes, int anio){
    this.nombre=nombre;
    this.apellido=apellido;    
    fNacimiento=new Fecha(dia,mes,anio);
  }

  public String getNombre(){
    return nombre;
  }
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public String getApellido(){
    return apellido; 
  }
  public void setApellido(String apellido){
    this.apellido=apellido;
  }
  public Fecha getfNacimiento(){
    return fNacimiento;
  }
  public void setfNacimiento(Fecha fNacimiento){
    this.fNacimiento = fNacimiento;
  }
  @Override 
  public String toString(){
    return nombre+" "+apellido+" Nacido el "+fNacimiento;
  }

}