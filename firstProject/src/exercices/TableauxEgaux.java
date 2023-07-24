package exercices;

public class TableauxEgaux {
    public static void main(String[] args) {
        /*1. Ecrire un programme qui permet de vérifier si 2 tableaux sont égaux
        * 2. Vérifier la taille des tableaux et l'ordre des valeurs*/

        int[] tab1 = {5,8,2,3,6,9};
        int[] tab2 = {5,8,2,3,6,9};
        int val1 =0;
        int val2 =0;

        for (int i = 0; i < tab1.length; i++) {
            val1 = tab1[i];
            val2 = tab2[i];
                if(tab1.length != tab2.length){
                    System.out.println("Les tableaux ne sont pas égaux.");
                    break;
                }else{
                    if(val1 != val2){
                        System.out.println("Les tableaux ne sont pas égaux.");
                        break;
                    }else{
                        if(tab1.length == tab2.length && val1 == val2){
                            System.out.println("Les tableaux sont égaux.");
                            break;
                        }
                    }
                }
        }
    }
}
