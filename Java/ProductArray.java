import java.util.*;

class ProductArray {

    Scanner input = new Scanner(System.in);
    int[] liste;
    int listSize;

    public static void main(String[] args) {
        ProductArray challenge = new ProductArray();
    }

    public ProductArray() {
        getInputs();
        int[] productArray = getProductArray();
        for (int i = 0; i < this.listSize; i++) {
            System.out.println(productArray[i]);
        }
    }

    public void getInputs() {
        System.out.println("How many list items?");
        this.listSize = input.nextInt();
        this.liste = new int[this.listSize];
        for (int i = 0; i < this.listSize; i++) {
            System.out.println("Input list item "+(i+1)+": ");
            this.liste[i] = input.nextInt();
        }
    }

    public int[] getProductArray() {
        int[] outputArray = new int[this.listSize];
        int product;

        for (int i = 0; i < this.listSize; i++) {
            product = 1;
            for (int j = 0; j < this.listSize; j++) {
                if (i != j) {
                    product *= this.liste[j];
                }
            }
            outputArray[i] = product;
        }
        return outputArray;
    }
}
