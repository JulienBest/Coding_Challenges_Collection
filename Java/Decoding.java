public class Decoding {

    int message = 11211;
    int messageSize = message.length();
    char[] alphabet = getAlphabet();

    public static void main(String[] args) {
        Decoding obj = new Decoding();
    }

    public Decoding() {
        System.out.println(alphabet[26]);
    }

    public char[] getAlphabet() {
        char[] alphabet = new char[27];
        int counter = 1;
        for(char a = 'a', z = 'z'; a <= z; a++) {
            alphabet[counter] = a;
            counter++;
        }
        return alphabet;
    }
}
