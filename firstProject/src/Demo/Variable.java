package Demo;

public class Variable {
    public static void main(String[] args) {
        // Déclaration d'une variable

        // <type> <nom>

        //int : entier sur 32 bits
        int age;

        //long : entier sur 64 bits
        long indice;

        float distance;

        double monnaie;

        boolean estVrai;

        char lettre;

        // chaine de caractère
        // String n'est pas considéré comme un type primitif
        String prenom;

        // <type> <nom> = <valeur>
        int jour = 5;

        // Affectation
        age = 25;
        indice = 100_254_568;
        distance = 12.74f;
        monnaie = 15.5;
        estVrai = false;
        lettre = 'a';
        prenom = "Aurelie";

        double resultat = age + monnaie;

        // println() permet d'afficher des enregistrements dans la console
        System.out.println(resultat);
        System.out.println(prenom + " a " + age + " ans.");
        System.out.println(indice);
        System.out.println(age);
        System.out.println(lettre);
        System.out.println(prenom);
        System.out.println(distance);
        System.out.println(estVrai);
        System.out.println(jour);

        // Les types énumérés (enum)
        enum JourSemaine{
            LUNDI,MARDI,MERCREDI
        }
        JourSemaine yesterday = JourSemaine.LUNDI;
        JourSemaine today = JourSemaine.MARDI;
        JourSemaine tomorow = JourSemaine.MERCREDI;

        System.out.println(yesterday);
        System.out.println(today);
        System.out.println(tomorow);
    }
}
