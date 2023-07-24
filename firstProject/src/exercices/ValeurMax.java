package exercices;

public class ValeurMax {
    public static void main(String[] args) {
        /*1. Erire un programme qui permet de trouver la valeur maximale dans un tableau*/

        int[] tab = {5, 9, 10, 54, 0, 12, 4, 3, 7};
        int max = 0;
        int indice = 0;
        
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > max){
                max = tab[i];
                indice = i;
            }
        }
        System.out.printf("La valeur max est %d à l'indice %d", max, indice);
    }
}
