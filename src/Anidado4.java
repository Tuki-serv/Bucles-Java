public class Anidado4 {
    public static void main(String[] args) {
        String alfabetoInverso = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        for (int i = alfabetoInverso.length(); i >= 1; i--) {
            String subcadena = alfabetoInverso.substring(0, i);
            System.out.println(subcadena);
        }
    }
}
