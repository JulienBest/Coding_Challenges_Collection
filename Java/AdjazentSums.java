class AdjazentSums {

    public int[] list = {1, 4, 6, 8}; // {100, 2, 3, 100} :(
    public int listSize = list.length;

    public static void main(String[] args) {
        AdjazentSums sums = new AdjazentSums();
    }

    public AdjazentSums() {

        System.out.println(getSum());

    }

    public int getSum() {
        if (listSize == 0) {
            return 0;
        }
        if (listSize == 1) {
            return list[0];
        }
        if (listSize == 2) {
            return list[0] + list[1];
        }
        if (listSize % 2 == 0) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < listSize; i+=2) {
                sum1 += list[i];
            }
            for (int i = 1; i <= listSize; i+=2) {
                sum2 += list[i];
            }
            if (sum1 < sum2) {
                return sum2;
            } else {
                return sum1;
            }

        } else {
            return 0;
        }

    }
}
