public class Meal
{
    //Instance attributes//
    private String name;
    private double cost;

    //Class constructor//
    public Meal(String food, double price)
    {
        name = food;
        cost = price;
    }

   public static void main(String[] args){
       Meal meal = new Meal("Burguer", 6.99);
       meal.makeItACombo();
       System.out.println(meal.getBill());
   }

    //Instance methods//
   public void makeItACombo (){
        name = name+" with fries and soda";
        cost += 3;
   }

   public String getBill (){
       return name+", $"+cost;
   }
}