

class SubArraySum {

    int[] sums = new int[1];
    int[] arr = {-5,2,10,23,-10,30};
    int globalCounter = 1;

    public static void main(String[] args) {
        new SubArraySum();
    }


    public SubArraySum() {
        getMaxSum(arr);
        System.out.println(max(sums));
    }

    public void getMaxSum(int[] a) {
        globalCounter++;
        if (a.length == 0) {
            return;
        }
        appendSum(getSum(a));

        if (globalCounter%2 == 0) {
            getMaxSum(remove(a, 0));
        } else {
            getMaxSum(remove(a, a.length));
        }
    }

    public void appendSum(int i) {
        if (sums.length == 1) {
            sums[0] = i;
        } else {
            int[] b = new int[sums.length+1];
            for (int j = 0 ; j< sums.length; j++) {
                b[j] = sums[j];
            }
            b[b.length-1] = i;
            sums = b;
        }
    }

    public int[] remove(int[] a, int index) {
        int counter = 0;
        int[] b = new int[a.length-1];
        
        for (int i = 0; i < a.length; i++) {
            if (i != index) {
                b[counter] = a[i];
                counter++;
            }
        }
        return b;
    }

    public int getSum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public int max(int[] a) {
        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

}
