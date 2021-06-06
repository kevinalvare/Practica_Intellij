import java.util.Scanner;

public class Persona {
   Scanner scanner;
   private String name;
   private String cell;
   private int age;

   public Persona(){
      name="";
      cell ="";
      age=0;
   }

   public Persona(String name, String cell, int age) {
      this.name = name;
      this.cell = cell;
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getCell() {
      return cell;
   }

   public void setCell(String cell) {
      this.cell = cell;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }


  public void getPerson(){
     System.out.println("Bienvenido señor " + name + "," + "es un placer para nosotros contar con una persona de edad " + age + " años." + "\n Proximamente nos comunicaremos con usted al numero de celular " + cell + "\n Feliz dia.");
  }

}
