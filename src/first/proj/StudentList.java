/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first.proj;

/**
 *
 * @author izanr
 */
public class StudentList {
    public static void main (String [] args){
        Student [] sList = new Student[3];
        sList[0] = new Student ("s1", "John D");
        sList[1] = new Student ("s2", "Muhammad A");
        sList[2] = new Student ("s3", "Maryam M");
        
        for(int x = 0; x < sList.length; x++){
            System.out.print("\n" + sList[x].getStudentId() + " "
            + sList[x].getStudentName() + "\n");
        }
    }
}
