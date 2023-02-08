/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.util.*; 
public class Student {
     private String name;
    private int ID;
    private String gender;
    private String DOB;

    public Student(){}

    public Student(String name, int ID, String gender, String DOB){
       this.name = name;
       this.ID = ID;
       this.gender = gender;
       this.DOB = DOB;
    }

    public void setName(String newName){
       name = newName;
    }
    public void setID(int newID){
       ID = newID;
    }
    public void setGender(String newGender){
       gender = newGender;
    }
    public void setDOB(String newDOB){
       DOB = newDOB;
    }

    public String getName(){
      return name;
    }
    public int getID(){
      return ID;
    }
    public String getGender(){
      return gender;
    }
    public String getDOB(){
      return DOB;
    }

     @Override
    public String toString() {
        return  " ID: " + ID +",Name: " + name + ", Gender: " + gender + ", DOB: " + DOB;
    }
}
