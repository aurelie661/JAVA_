package Demo;

public class Operateur {
    public static void main(String[] args) {
        // region opérateurs arithmétique
        int result = 1 +2;
        System.out.println("1 + 2 = "+ result);
        int originalResult = result;

        result = result - 1;
        System.out.println(originalResult+" - 1 = "+ result);
        originalResult = result;

        result = result *2;
        System.out.println(originalResult+" * 2 = "+ result);
        originalResult = result;

        result = result /2;
        System.out.println(originalResult+" / 2 = "+ result);
        originalResult = result;

        result = result %2;
        System.out.println(originalResult+" % 2 = "+ result);
    }
}
