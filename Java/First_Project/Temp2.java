public class Temp2 {

    public static String encrypt(String plainText, int key) {
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    char encryptedChar = (char) (((ch - 'A' + key) % 26) + 'A');
                    cipherText.append(encryptedChar);
                } else {
                    char encryptedChar = (char) (((ch - 'a' + key) % 26) + 'a');
                    cipherText.append(encryptedChar);
                }
            } else {
                cipherText.append(ch);
            }
        }
        return cipherText.toString();
    }

    public static String decrypt(String cipherText, int key) {
        StringBuilder plainText = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++) {
            char ch = cipherText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    char decryptedChar = (char) (((ch - 'A' - key + 26) % 26) + 'A');
                    plainText.append(decryptedChar);
                } else {
                    char decryptedChar = (char) (((ch - 'a' - key + 26) % 26) + 'a');
                    plainText.append(decryptedChar);
                }
            } else {
                plainText.append(ch);
            }
        }
        return plainText.toString();
    }

    public static void main(String[] args) {
        String text = "DYCVOOZZOBMRKXMODYNBOKW";
        int key = 7;

        System.out.println("Original Text: " + text);

        // String encryptedText = encrypt(text, key);
        // System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = decrypt(text, key);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
