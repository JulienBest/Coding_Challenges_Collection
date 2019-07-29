
public class Occurrs {

    int[] a = {6, 1, 3, 3, 3, 6, 6};
    int[] b = {13, 19, 13, 13};

    public static void main(String[] args) {
        new Occurrs();
    }

    public Occurrs() {
        System.out.println(nonDuplicate(a));
        System.out.println(nonDuplicate(b));
    }

    public int nonDuplicate(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (count(a, a[i]) == 1) {
                return a[i];
            }
        }
        return 0;
    }

    public int count(int[] a, int b) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                counter++;
            }
        }
        return counter;
    }
}
