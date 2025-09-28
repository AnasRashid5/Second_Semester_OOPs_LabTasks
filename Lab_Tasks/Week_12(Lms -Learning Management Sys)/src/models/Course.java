package models;

public class Course {

    private String name;
    private String code;

    public Course() {
        this.name = "";
        this.code = "";
    }

    // Parametrized Constructor
    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }

    // aany ke baad getters setters toString likhna hai aur phir list py jump krni
    // hai.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "" + code + " -- " + name;
    }

    @Override // this clone is making deep copy.
    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }
    }
}
