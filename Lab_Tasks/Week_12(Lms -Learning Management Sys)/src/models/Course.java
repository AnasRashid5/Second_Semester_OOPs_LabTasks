package models;

public class Course {

    private String name;
    private String code;

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
        return "The courses are as below: \n"+code + " -- " + name;
    }

}
