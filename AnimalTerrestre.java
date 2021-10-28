public class AnimalTerrestre extends Animal{
  private int numPatas;

  public AnimalTerrestre(){}

  public AnimalTerrestre(String nombre, String lugarOrigen, String color, int numPatas){
    super(nombre, lugarOrigen, color);
    this.numPatas = numPatas;
  }

  public void correr(){
    System.out.println("Estoy corriendo");
  }

  @Override
  public void comer(){
    System.out.println(" del piso");
  }

  public int getNumPatas(){
    return numPatas;
  }
  public void setNumPatas(int numPatas){
    this.numPatas = numPatas;
  }

  @Override
  public String toString(){
    return super.toString() + "AnimalTerrestre{numPatas = "+numPatas+"}";
  }
}