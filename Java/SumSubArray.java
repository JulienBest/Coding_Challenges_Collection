class SumSubArray {

    int[] a = {12, 1, 61, 5, 9, 2};
    int k = 24;
    boolean isFinished= false;

    public static void main(String[] args) {
        new SumSubArray();
    }

    public SumSubArray() {
        getSubArray(a,k);
    }

    public void getSubArray(int[] a, int k) {
        if (sum(a) == k && !isFinished) {
            print(a);
            isFinished = true;
        }
        int[] temp;
        for (int i = 0; i < a.length; i++) {
            temp = removeElement(a, i);
            getSubArray(temp, k);
        }
    }

    public void print(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    public int[] removeElement(int[] a, int index) {
        int[] returnArray = new int[a.length -1];
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            if (i != index) {
                returnArray[counter] = a[i];
                counter++;
            }
        }
        return returnArray;
    }

    public int sum(int[] a) {
        int sum = 0;
        for (int i:a) {
            sum+=i;
        }
        return sum;
    }
}
