import java.util.Scanner;

public class Array {

    int[] num;
    // int length = num.length;
    Scanner scanner=new Scanner(System.in);

    public void createArray() {
        num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
    }

    public void increaseSize(int increment) {

        int size=num.length;
        int increase=num.length + increment;

        int[] bigNum = new int[increase];

        for (int i = 0; i < num.length; i++) {
            bigNum[i] = num[i];
        }

        num = bigNum;

        System.out.println("Enter Elemets in new Array:");

        for (int i = size; i < num.length; i++) {
            int element=scanner.nextInt();
            num[i]=element;
            
        }

    }

    public void printArray() {
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
