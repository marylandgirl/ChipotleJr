import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.text.NumberFormat;
/*
* This class is an implementation of the Week 2 challenge for Java Bootcamp
* The objective is to robotically assemble 25 burritos using Random class
*
* Kim Levin
* 4/29/2020
*/
public class ChipotleJr {

   public static void main(String[] args) {
      Random r = new Random();
      int numIngredients = 0;
      ArrayList[] allBurritos = new ArrayList[25];
      ArrayList<String> oneBurrito;
      int specificIngrIdx;
      String specIngred;
      NumberFormat nf = NumberFormat.getInstance();
      nf.setMaximumFractionDigits(2);
      nf.setMinimumFractionDigits(2);
      double burritoPrice = 0;

      String[][] allIngredients = new String[9][];

      //Rice category
      allIngredients[0] = new String[] {"white", "brown", "no rice","all rice"};

      //Meat category
      allIngredients[1] = new String[] {"chicken", "steak", "carnitas",
                                        "chorizo","sofritas","veggie meat",
                                        "no meat","all meats"};

      //Beans category
      allIngredients[2] = new String[] {"pinto","black","no beans","all beans"};

      //Salsa category
      allIngredients[3] = new String[] {"mild","medium","hot","no salsa","all salsa"};

      //Veggie category
      allIngredients[4] = new String[] {"lettuce","fajita veggies",
                                       "no veggies","all veggies"};

      //Cheese category
      allIngredients[5] = new String[] {"cheese","no cheese"};

      //Guac category
      allIngredients[6] = new String[] {"guac","no guac"};

      //Queso category
      allIngredients[7] = new String[] {"queso","no queso"};

      //Sour cream category
      allIngredients[8] = new String[] {"sour cream","no sour cream"};

      for ( int i = 0; i < 25; i++) {
         oneBurrito = new ArrayList<String>();
         burritoPrice = 3.00;
         specIngred = "";
         numIngredients = 5 + r.nextInt(5);
         oneBurrito.add("Burrito " + (i+1));
//       oneBurrito.add(Integer.toString(numIngredients));
         for ( int j = 0; j < numIngredients; j++) {
            specificIngrIdx = r.nextInt(allIngredients[j].length);
            specIngred = allIngredients[j][specificIngrIdx];
            if (!specIngred.startsWith("no ")) {
               burritoPrice += .50;
            } else {
               burritoPrice += .00;
            }   
            oneBurrito.add(specIngred);
         }
         oneBurrito.add(nf.format(burritoPrice));
         allBurritos[i] = oneBurrito;
      }
      ArrayList<String> burritoOrder = new ArrayList<String>();
      for (int i = 0; i < 25; i++) {
         burritoOrder = allBurritos[i];
         for (int j = 0; j < burritoOrder.size(); j++) {
            System.out.print(burritoOrder.get(j) + ", ");
         }
         System.out.println();
//       System.out.println(burritoOrder.toString());
      }
   }
}
