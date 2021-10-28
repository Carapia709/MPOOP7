public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Gerente ger = new Gerente();
    System.out.println(ger);

    ger.setNombre("Romina Perez");
    ger.setNumEmpleado(654789);
    ger.setSueldo(35_000);
    System.out.println(ger);
    System.out.println(ger.getNombre());
    ger.setPresupuesto(90_000);
    System.out.println(ger);

    Gerente ger2 = new Gerente("Samuel Torres", 895632, 15_000, 25_000);
    System.out.println(ger2);

    Ballena ballena1 = new Ballena();
    ballena1.setNombre("Moby Dick");
    System.out.println(ballena1.getNombre());

    Ballena ballena2 = new Ballena("Juliana", "Oceano Pacifico", "Azul", 2, 40);
    System.out.println(ballena2);

    Pajaro pajaro1 = new Pajaro("Raul", "Amazonas", "Rojo", 2, "Recto");
    System.out.println(pajaro1);

    Perro perro1 = new Perro("Rambo", "México", "Miel", 4, "Cafe");
    System.out.println(perro1);
  }
}