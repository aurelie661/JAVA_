package exercices.Boucles;

public class TableMultication {
    public static void main(String[] args) {
        /*1. Créer un programme permettant d'afficher les tables de multiplication de 1 à 10*/

        for (int i = 1; i < 11; i++) {
            System.out.printf("Table de %d\n",i);
            for (int j = 1; j < 11; j++) {
                System.out.printf("\t%d X %d = %d\n",i,j,i*j);

            }
        }
    }
}
