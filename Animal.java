public class Animal{
  private String nombre;
  private String lugarOrigen;
  private String color;

  public Animal(){}

  public Animal(String nombre, String lugarOrigen, String color){
    this.nombre = nombre;
    this.lugarOrigen = lugarOrigen;
    this.color = color;
  }

  public void hacerSonido(String sonido){
    System.out.println("Estoy haciendo un sonido"+sonido);
  }

  public void comer(){
    System.out.println("Estoy comiendo");
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return nombre;
  }

  @Override
  public String toString(){
    return "Animal{nombre = "+nombre+" lugarOrigen = "+lugarOrigen+" color = "+color+"}";
  }
}