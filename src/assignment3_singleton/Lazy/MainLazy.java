package assignment3_singleton.Lazy;

public class MainLazy {
    public static void main(String[] args) {
        // Skapar två objekt för att kunna visa vad singleton faktiskt gör
        RootUserLazy a = RootUserLazy.getInstance();
        RootUserLazy b = RootUserLazy.getInstance();

        System.out.println(a);              // skriver ut root-infot
        System.out.println(b);              // skriver ut samma info
        System.out.println(a == b);         // ska vara true
    }
}
