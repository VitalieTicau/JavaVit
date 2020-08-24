public class Angajat {
    String nume = "?";
    int virsta = 20;

    Angajat()
    {
        this.nume = "*";
        virsta = 999;
    }
    Angajat(String nume, int v)
    {
        this.nume = nume;
        virsta = v;
    }
    int getVirsta()
    {
        return virsta;
    }
    void printNume()
    {
        System.out.println(nume);
    }
    void printVirsta()
    {
        System.out.println(virsta);
    }
    void printO()
    {
        System.out.println("Angajatul " + nume + " are " + virsta + " ani.");
    }
    void setVirsta(int value)
    {
        virsta = value;
    }
}

