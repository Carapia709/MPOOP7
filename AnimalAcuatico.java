public class AnimalAcuatico extends Animal{
  private int numAletas;

  public AnimalAcuatico(){}

  public AnimalAcuatico(String nombre, String lugarOrigen, String color, int numAletas){
    super(nombre, lugarOrigen, color);
    this.numAletas = numAletas;
  }

  public void nadar(){
    System.out.println("Estoy nadando");
  }

  @Override
  public void comer(){
    System.out.println(" peces");
  }

  public int getNumAletas(){
    return numAletas;
  }
  public void setNumAletas(int numAletas){
    this.numAletas = numAletas;
  } 

  @Override
  public String toString(){
    return super.toString() + "AnimalAcuatico{numAletas = "+numAletas+"}";
  }
}