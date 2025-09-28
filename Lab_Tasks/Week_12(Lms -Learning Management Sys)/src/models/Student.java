package models;

public class Student implements Cloneable{
    
    private String name;
    private String seat_no;

    //Default Constructor::

    public Student(){
        // this.name="";
        // this.seat_no="";
    }

    //Parametrized Constructor::

    public Student(String Name,String Seat_No){
        this.name=Name;
        this.seat_no=Seat_No;
    }

    //Copy Constructor::
    public Student(Student other){
        this.name=other.name;
        this.seat_no=other.seat_no;

    }


    //GETTERS AND SETTERS::

    public void setName(String n){
        this.name=n;
    }

    public void setSeatNo(String Seat_No){
        this.seat_no=Seat_No;
    }

    public String getName(){
        return name;
    }

    public String getSeatNo(){
        return seat_no;
    }

    @Override  //this clone is making deep copy of students. 
    public Object clone(){
        try {
            return super.clone();
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }

    @Override
    public String toString(){
        return " "+name+" "+seat_no;
    }  
}
