public class Circulo{
  //atributos
  private float radio;
  //constructores
  public Circulo(){}
  
  //metodo
  public float perimetro(){
    return 2*(float)Math.PI*radio;
  }
  /**
  @param  ninguno
  @return regresa el valor del radio
  */
  public float area(){
    return (float)Math.PI*radio*radio;
  }
  //getter y setter
  public float getRadio(){
    return radio;
  }
  
  public void setRadio(float radio){
    if(radio<0){
      this.radio=Math.abs(radio);
    }else{
      this.radio = radio;
    }
  }
  @Override
  public String toString(){
    return "Circulo de radio "+radio;
  }
}