class SmallestNotInArray {

    int[] array = {-1, 1, 2, 3, 4, 5, 6};

    public static void main(String[] args) {
        SmallestNotInArray obj = new SmallestNotInArray();
    }

    public SmallestNotInArray() {
        System.out.println(getSmallestNotInArray());
    }

    public int getSmallestNotInArray() {
        int counter;
        for (int num = 1; num < Integer.MAX_VALUE; num++) {
            counter = 0;
            for (int i = 0; i < this.array.length; i++) {
                if (this.array[i] != num) {
                    counter++;
                }
                if (counter == this.array.length) {
                    return num;
                }
            }
        }
        return 0;
    }
}
