import java.util.Scanner;
import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> matLista = new ArrayList<>();
        int MAX_SIZE = 3;
        System.out.println("Skriv in max 3 produkter i matlista");

        while (matLista.size() < MAX_SIZE) {
            String produkter = sc.nextLine();

            if (produkter.equals("done")) {
                break;
            } else {
                matLista.add(produkter);
            }
        }

        System.out.println("Din matlista:");
        for (String produkt : matLista) {
            System.out.println(produkt);
        }

        if (matLista.size() >= MAX_SIZE) {
            System.out.println("Du har nått maxgränsen på 3 produkter.");
            System.out.println("Vill du byta ut en vara? (ja/nej)");
            String answer = sc.nextLine();

            if (answer.equals("ja")) {
                System.out.println("Vilken vara vill du byta? Ange varans namn:");
                String changeProduct = sc.nextLine();

                if (matLista.contains(changeProduct)) {
                    System.out.println("Ange den nya produkten:");
                    String newProduct = sc.nextLine();
                    int index = matLista.indexOf(changeProduct);
                    matLista.set(index, newProduct);
                    System.out.println("Din nya matlista:");
                    for (String produkt : matLista) {
                        System.out.println(produkt);
                    }
                } else {
                    System.out.println("Varan du vill byta finns inte med i listan.!!"); //Skriver ut
                }
            }
        }
    }
}
