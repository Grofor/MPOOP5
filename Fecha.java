public class Fecha{
  private int dia;
  private int mes;
  private int anio;
  public Fecha(){}
  public Fecha(int dia, int mes, int anio){
    this.dia=dia;
    this.mes=mes;
    this.anio=anio;
  }
  public int getDia(){
    return dia;
  }
  public void setDia(int dia){
    if(dia<1||dia>31){
      System.out.println("Error!");
    }else{
      this.dia=dia;
    }
  }
  public int getMes(){
    return mes;
  }
  public void setMes(int mes){
    if(mes<1||mes>10){
    System.out.println("Error, mes incorrecto");
    }else{
      this.mes=mes;
    }
  }
  public int getAnio(){
    return anio;
  }
  public void setAnio(int anio){
    if(anio<1){
    System.out.println("Error, años no pueden ser negativos!");
    }else{
      this.anio=anio;
    }
  }
  @Override
  public String toString(){
    return " "+dia+"/"+mes+"/"+anio;
  }
}