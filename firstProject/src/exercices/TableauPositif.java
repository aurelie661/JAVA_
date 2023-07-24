package exercices;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TableauPositif {
    public static void main(String[] args) {
        /*1. Déclarer deux tableaux de 10 éléments
        * 2. le premier tableau contiendra des nombres négatifs et positifs
        * 3. Ajouter tous les éléments positifs du premier tableau dans le second tableau*/

        int[] tabSource = {6,-54,98,-6,-2,5,4,3,-25,54};
        int[] tabDestination = new int[10];

        for (int i = 0; i < tabSource.length; i++) {
            if(tabSource[i] > 0){
                tabDestination[i] = tabSource[i];
            }
        }
        System.out.println(Arrays.toString(tabDestination));
    }
}
