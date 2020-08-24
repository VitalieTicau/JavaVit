public class Numere {
        int numar;

        int suma(int n)
        {
            int s = 0;
            for(int i=0; i<n; i++)
                s += i;
            return s;
        }
        void printNumerePare(int n)
        {
            System.out.println("Numere pare de la 0 si < " + n);
            for(int i=0; i<n; i++)
                if(i % 2 == 0)
                    System.out.print(i + "; ");
            System.out.println();
        }
    void printNumereImPare(int n)
    {
        System.out.println("Numere impare de la 0 si < " + n);
        for(int i=0; i<n; i++)
            if(i % 2 != 0)
                System.out.print(i + "; ");
        System.out.println();
    }
    void printSalut(int n)
    {
        System.out.println("Salutare de " + n + " ori ");
        for(int i=1; i<=n; i++)
                System.out.print("Salut! ");
        System.out.println();
    }
}
