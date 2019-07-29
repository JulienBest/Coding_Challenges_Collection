import java.util.*;

class Challenge1 {

  Scanner input;
  public int[] list;
  public int number;
  public int listSize;

  public int number1;
  public int number2;

  public static void main(String[] args) {
      Challenge1 problem = new Challenge1();
  }

  public Challenge1() {
    this.input = new Scanner(System.in);
    System.out.println("How many list items?");
    listSize = input.nextInt();
    this.list = new int[listSize];

    for (int i = 0; i < listSize; i++) {
        System.out.println("Input number " + i +":");
        this.list[i] = this.input.nextInt();
    }

    System.out.println("Which number k?");
    this.number = input.nextInt();

    System.out.println(checkAddingUp());

    if (checkAddingUp()) {
        System.out.println(this.number1);
        System.out.println(this.number2);
    }

  }

  public boolean checkAddingUp() {
    for (int i = 0; i < this.listSize; i++) {
      for (int j = 0; j < this.listSize; j++) {
          if (this.list[i] + this.list[j] == this.number) {
              this.number1 = this.list[i];
              this.number2 = this.list[j];
              return true;
          }
      }
    }
    return false;
  }
}
