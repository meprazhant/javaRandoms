public class polymorphism {
   public void makeSound() {
      System.out.println("Animal is making a sound");
   }

   public class Dog extends polymorphism {
      public void makeSound() {
         System.out.println("Dog is barking");
      }
   }
}