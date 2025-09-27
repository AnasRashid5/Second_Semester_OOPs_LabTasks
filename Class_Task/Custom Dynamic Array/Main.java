public class Main{
    public static void main(String[] args) {
         Array arr = new Array();
        arr.createArray();

        System.out.println("Before resizing:");
        arr.printArray();

        arr.increaseSize(3);
        

        System.out.println("After resizing:");
        arr.printArray();
    }
}