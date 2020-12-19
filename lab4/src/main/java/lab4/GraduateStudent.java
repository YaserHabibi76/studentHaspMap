package lab4;

import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class GraduateStudent extends studentt {
    private String supervisor;
    private boolean isPhD;
    private String undergraduateSchool;
    private boolean gradStudent;


    public GraduateStudent (String program, int year, double grade, String lastName){
        this.program = program;
        this.year = year;
        this.grade = grade;
        this.lastName = lastName;
    }


    public GraduateStudent(String program, int year, double grade, boolean isPhD, String lastName){
        this.program = program;
        this.year = year;
        this.grade = grade;
        this.isPhD = isPhD;
        this.lastName = lastName;
    }
//(program, year, grade, gradStdt.getSupervisor(), gradStdt.getIsPhD(), lastName);

    public GraduateStudent (String program, int year, double grade, String supervisor, boolean isPhD, String lastName){
        this.program = program;
        this.year = year;
        this.grade = grade;
        this.supervisor = supervisor;
        this.isPhD = isPhD;
        this.lastName = lastName;

    }

    public GraduateStudent (String program, int year, double grade, String supervisor, boolean isPhD, String undergraduateSchool, String lastName){
        this.program = program;
        this.year = year;
        this.grade = grade;
        this.supervisor = supervisor;
        this.isPhD = isPhD;
        this.undergraduateSchool = undergraduateSchool;
        this.lastName = lastName;
    }


    public GraduateStudent (){
        this.program = program;
        this.year = year;
        this.grade = grade;
        this.isPhD = isPhD;
        this.supervisor = supervisor;
        this.lastName = lastName;

    }


    // accessors and mutators
    public void setSupervisor (String supervisor){
        this.supervisor = supervisor;
    }
    public String getSupervisor (){
        return supervisor;
    }


    public void setUndergraduateSchool (String undergraduateSchool){
        this.undergraduateSchool = undergraduateSchool;
    }
    public String getUndergraduateSchool (){
        return undergraduateSchool;
    }


    public void setIsPhD (boolean isPhD){
        this.isPhD = isPhD;
    }

    public boolean getIsPhD (){
        return isPhD;
    }


    // used to print gradstudents in arraylist
    public String toString () {
        String output;
        output = (super.toString() +
                " " +supervisor+
                " " +isPhD+
                " " +undergraduateSchool+
                " " +lastName);
        return output;
    }

    public void gradOption(){

    }
}
