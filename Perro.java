public class Perro extends AnimalTerrestre{
  private String colorCollar;

  public Perro(){}
  
  public Perro(String nombre, String lugarOrigen, String color, int numPatas, String colorCollar){
    super(nombre, lugarOrigen, color, numPatas);
    this.colorCollar = colorCollar;
  }

  public void hacerTrucos(){
    System.out.println("Estoy dando la pata");
  }

  public String getColorCollar(){
    return colorCollar;
  }
  public void setColorCollar(String colorCollar){
    this.colorCollar = colorCollar;
  }

  @Override
  public String toString(){
    return super.toString() + "Perro{colorCollar = "+colorCollar+"}";
  }
}