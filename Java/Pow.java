
class Pow {

    public static void main(String[] args) {
        System.out.println(pow(2,10));
    }

    public static int pow(int a, int exp) {
        int val = 1;

        for (int i = 0; i< exp; i++) {
            val *= a;
        }

        return val;
    }
}
