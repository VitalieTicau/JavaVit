/**
 * documentatie */
public class Test {
    public static void main(String[] params) {
        ///PrimaClasa primaClasa = new PrimaClasa();
        //PrimaClasa primaClasa1 = new PrimaClasa();
        /*byte b = 10;
        short s = 50;
        int i = 25;
        long l = 123_456_789_012_____345_6L;
        float f;//= 12.5f;
        f = l;
        char ch = 'A';
        // comentariu
        String sir = "Salut ";
        boolean bool = true;
        System.out.println(sir + " b= " + b + " s=" + s + " i=" + i + " l=" + l + " f=" + f + " bool = " + bool);
        System.out.println();
        
        int v1 = 1, v2 = 3, v3;
        v3 = ++v1 + v1;
        System.out.println(v1 + " " + v2 + " " + v3);/
        int pInt = (int) 3.14; // aici va fi tăiată partea zecimală
        double pi = 3.14;
        float weight = (float) pi;
        System.out.println(pi + " " + pInt + " " + weight);
        System.out.println(true + "Vit");
        System.out.println("Lena este cu minte.");
        switch(i)
        {
            case 10: case 20: case 30:
            System.out.println("Divizibil la 10");
            case 5: case 15: case 25:
            System.out.println("Divizibil la 5");
            break;
        }*/
        Angajat angajat = new Angajat();
        Angajat angajat1 = new Angajat("Ion", 25);
        System.out.println(angajat);
        angajat.setVirsta(22);
        angajat.printO();
        angajat1.printO();


    }

}

