public class Person
{
   //attributes of every Person object
   private int yearBorn;
   private int yearDeceased;
   private String name;

   //constructor//
   public Person(String named, int born, int died)
   {
      name = named;
      yearBorn = born;
      yearDeceased = died;
   }

   public static void main(String[] args)
   {
      Person grandma = new Person("Mary", 1932, 1999);
      grandma.epitaph(); //apply method to object (yes, in this case, grandma is considered an object)
   }

   //instance (object) method//
   public void epitaph()
   {
      int yearsOld = yearDeceased - yearBorn;
      System.out.println(name+" lived to an age of "+yearsOld);
   }
}