package exercices;

public class CentElements {
    public static void main(String[] args) {
        /*1. Déclarer un tableau de 100 éléments et l'initialiser
        * 2. Afficher les éléments par dizaine séparés d'une virgule*/

        int[] tab = new int[100];

        for (int i = 0; i < tab.length; i++) {
            System.out.print(i +",");
            if(i == 9 ||i == 19||i == 29||i == 39||i == 49||i == 59||i == 69||i == 79||i == 89||i == 99){
               System.out.println("");
            }
        }
    }
}
