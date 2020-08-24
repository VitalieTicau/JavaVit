
import java.util.Scanner;

public class Test {
    public static void main(String[] params) {
        Numere numere = new Numere();
        Diverse diverse = new Diverse();
        int key;
        int n = 10;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("1. Suma primilor n mumere");
            System.out.println("2. Numere pare");
            System.out.println("3. Numere impare");
            System.out.println("4. Salutare de n ori");
            System.out.println("5. Adaugare numere");
            System.out.println("6. Concateneaza siruri");
            System.out.println("7. Afiseaza sir");
            System.out.println("8. Conversie");
            System.out.println("0. Stop");
            System.out.println("Alege de la 0 la 8 --> ");
            key = in.nextInt();
            switch(key){
                case 1:
                    System.out.println("Suma numerlor de la 0 si < " + n + ": " + numere.suma(n)); break;
                case 2: numere.printNumerePare(n); break;
                case 3: numere.printNumereImPare(n); break;
                case 4: numere.printSalut(n); break;
                case 5:
                    System.out.println("Numar veci 6; numar nou " + diverse.numarAdaugat(6)); break;
                case 6: diverse.concateneazaSiruri("Salut", "Andrei!"); break;
                case 7:
                    System.out.println(" in sir: " + diverse.getSir()); break;
                case 8:
                    System.out.println("Caracter: A; Numar: " + diverse.convert('A')); break;
                default: break;
            }

        }
        while (key > 0);

    }
}
