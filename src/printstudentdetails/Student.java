/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printstudentdetails;

/** Feb 2,2024 Sheridan
 * model  - the student entity 
 * @author srinivsi srivi
 */
public class Student 
{
   private String name; // Encapsulation principle
   private int age;// getters /setters method
   private int semno;
   private int grade;
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the semno
     */
    public int getSemno() {
        return semno;
    }

    /**
     * @param semno the semno to set
     */
    public void setSemno(int semno) {
        this.semno = semno;
    }
}
