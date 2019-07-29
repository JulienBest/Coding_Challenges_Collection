import java.util.*;

public class RemoveDuplicates {

    public int listSize;
    public int[] list;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        RemoveDuplicates problem = new RemoveDuplicates();
    }

    public RemoveDuplicates() {

        System.out.println("How many list items?");
        this.listSize = this.input.nextInt();

        this.list = new int[listSize];

        for (int i = 0; i < this.listSize; i++) {
            System.out.println("Input Number "+ (i+1)+ ":");
            this.list[i] = this.input.nextInt();
        }

        int[] ausgabe = removeDuplicates();
        for (int i = 0; i < list.length; i++) {
            System.out.println(this.list[i]);
        }
    }


    public int[] removeDuplicates() {
        int sizeAfter = this.listSize;

        for (int i = 0; i < this.listSize; i++) {
            for (int j = 1; j < this.listSize; j++) {
                if (this.list[i] == this.list[j]) {
                    this.list[j] = 0;
                    sizeAfter--;
                }
            }
        }

        int[] finalArray = new int[sizeAfter];

        int counter = 0;

        for (int i = 0; i < this.listSize; i++) {
            if (this.list[i] != 0) {
                finalArray[counter] = this.list[i];
                counter++;
            }
        }
        return finalArray;
    }
}
