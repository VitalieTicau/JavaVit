public class Diverse {
    int numar = 10;
    String sir;
    char ch;
    double dublu;
    public int numarAdaugat(int n) {
        n += numar;
        return  n;
    }
    public void concateneazaSiruri(String sir1, String sir2){
        System.out.println("Reuzltatul concatenarii: " + sir1 + " " + sir2);
        sir = sir1 + " " + sir2;
    }
    public String getSir(){
        return sir;
    }
    public int convert(char c){
        return (int) c;
    }

}
