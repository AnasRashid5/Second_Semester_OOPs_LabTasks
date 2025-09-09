package array;
public class Array {

    private Object[] arr = new Object[5];  

    public Array() {
        arr[0] = "anas";
        arr[1]=24;
        arr[2]=299.03;
        arr[3]=true;
        
    }

    public Object getDataAt(int index) {
        return arr[index];
    }
}
