package src.models;

public class Int2 implements Cloneable{
    
    private int i;  //value type,Immutable,Primitive DT

    public Int2(int I){
        this.i=I;
    }

    public void increment(){
        this.i=i+1;
    }


    @Override
    public String toString(){
        return ""+i;
    }

    @Override
    public Object clone()
    {
        try 
        {
            return super.clone();
            
        } 
        catch (Exception e) 
        {
            return e;
        }
    }
}
