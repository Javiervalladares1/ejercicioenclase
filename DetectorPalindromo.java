
public class DetectorPalindromo {
    public static boolean isPalindrome(String word) {
        // Eliminamos espacios en blanco y convertimos a minúsculas para ser más flexible. Esto fue extra
        word = word.replaceAll(" ", "").toLowerCase();
        int izq = 0;
        int derecha = word.length() - 1;

        while (izq < derecha) {
            if (word.charAt(izq) != word.charAt(derecha)) {
                return false;
            }
            izq++;
            derecha--;
        }
        return true;
    }
}