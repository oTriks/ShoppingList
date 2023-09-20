import java.util.Scanner;
import java.util.ArrayList;

public class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> matLista = new ArrayList<>();
        System.out.println("Skriv in max 10 produkter i matlista");
        while (sc.hasNextLine()) {
            String produkter = sc.nextLine();
            if (produkter.equals("done")) {
                break;
            } else if (matLista.size() < 10) {
                matLista.add(produkter);

            } else {
                System.out.println("Du får max ha 10 produkter, vill du byta vara ?");
                String answer = sc.nextLine();
                if (answer.equals("ja")) {
                    System.out.println("Vilken vara vill du byta?");
                    String changeProdukt = sc.nextLine();
                    System.out.println("Vilken ny produkt vill du lägga till?");
                    String newProduct = sc.nextLine();
                    if (matLista.contains(changeProdukt)) {
                        int index = matLista.indexOf(changeProdukt);
                        //  matLista.remove(index);
                        matLista.set(index, newProduct);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println("Din matlista är: " + matLista);
    }
}
