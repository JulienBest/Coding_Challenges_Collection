

public class DataLog {

    int size = 1;
    int[] log;

    public static void main(String[] args) {
        DataLog dl = new DataLog();
        dl.record(111);
        dl.record(222);
        dl.record(333);

        System.out.println(dl.get_last(2));
    }

    public DataLog() {
        log = new int[1];
    }

    public void record(int order_id) {
        if (this.log.length == 1 && this.log[0] == 0) {
            this.log[0] = order_id;
        } else {
            this.size++;
            int[] copy = new int[this.log.length + 1];
            for (int i = 0; i < this.log.length; i++) {
                copy[i] = this.log[i];
            }
            copy[this.log.length] = order_id;
            this.log = copy;
        }
    }

    public int get_last(int i) {
        if (i > this.size) return 0;
        int index = this.log.length - i;

        return this.log[index];
    }
}
