public class AnimalAereo extends Animal{
  private int numAlas;

  public AnimalAereo(){}

  public AnimalAereo(String nombre, String lugarOrigen, String color, int numAlas){
    super(nombre, lugarOrigen, color);
    this.numAlas = numAlas;
  }

  public void volar(){
    System.out.println("Estoy volando");
  }

  @Override
  public void comer(){
    System.out.println(" gusanos");
  }

  public int getNumAlas(){
    return numAlas;
  }
  public void setNumAlas(int numAlas){
    this.numAlas = numAlas;
  }

  @Override
  public String toString(){
    return super.toString() + "AnimalAereo{numAlas = "+numAlas+"}";
  }
}