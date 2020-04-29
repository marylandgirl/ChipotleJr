### This class is an implementation of the Week 2 challenge for Java Bootcamp
#### The objective is to robotically assemble 25 burritos making use of the Random class 


#### Pseudocode for this assignment

Initialize Random generator
Initialize allIngredients array - make it a jagged array
Initialize numIngredients = 0
Initialize allBurritos array - array of arraylists
Declare oneBurrito arrayList
Declare specificIngredientIndex
Declare specificIngredient
Initialize burritoPrice = 0

FOR index1 = 0 to 24
   Allocate memory oneBurrito arrayList
   Initialize burritoPrice = 3.00
   Initialize specificIngredient = ""
   Randomly generate a number from 5 to 9
   Set numIngredients to the randomly generated number in the previous step
   Add the string "Burrito " & (index1 + 1) to the oneBurrito arrayList
   
   FOR index2 = 0 to (numIngredients - 1)
      Randomly generate a number between 0 and numIngredients
       Set the specificIngredientIndex value to the randomly generated number from the previous step
       Set specificIngredent to allIngredients[index2][specificIngredientIndex]
       IF the specificIngredient does NOT start with "no "
       THEN
          burritoPrice = burritoPrice + .50
       ELSE
          IF the specificIngredient starts with "no "
          THEN
             burritoPrice = burritoPrice + .00
          ENDIF
       ENDIF
       Add specificIngredient to the oneBurrito arrayList
   ENDFOR
   Add burritoPrice to oneBurrito
   Add oneBurrito arrayList to allBurritos array
ENDFOR

FOR index3 = 0 to 24
   Allocate memory to burritoOrder arrayList
   Add allBurritos[index3] to burritoOrder
   
   FOR index4 = 0 to (size of burritoOrder - 1)
      Display contents of burritOrder at index4
   ENDFOR
ENDFOR