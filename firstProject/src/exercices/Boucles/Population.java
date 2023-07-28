package exercices.Boucles;

public class Population {
    public static void main(String[] args) {
        /*1.L'accroissement de la population de tourcoing est de 0.89%
        * 2.En 2015 la ville comptait 96 809 habitants
        * 3. Combien d'années faut-il pour atteindre 120 000 habitants ?
        * 4. Combien d'habitants y aura-t-il cette année-la
        * 5. Ecrire un programme permettant de résoudre ce problême*/

        int annees = 2015;
        double habitants = 96_809;

        while (habitants < 120_000) {
            habitants *= 1.0089;
            annees++;
        }

        System.out.printf("La population de Tourcoing dépassera les 120 000 habitants en %s pour %s habitants", annees, (int) Math.ceil(habitants));
    }
}
