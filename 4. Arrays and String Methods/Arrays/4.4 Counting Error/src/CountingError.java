public class CountingError
{
   public static int count(String[][] things)
   {
      int count = 0;
      for (int r = 0; r < things.length; r++)
      {
         for (int c = 0; c < things[0].length; c++)
         {
            if (things[r][c].contains("a"))
            {
               count++;
            }
         }
      }
      return count;
   }

   public static void main(String[] args) {
      String[][] twoDimensionalArray = {
              {"scarf", "gloves", "hat", "ha"},
              {"shoes", "shirt", "pants", "la"}
      };
      System.out.println(count(twoDimensionalArray));
   }
}
