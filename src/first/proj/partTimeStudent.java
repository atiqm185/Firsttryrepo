/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first.proj;

/**
 *
 * @author izanr
 */
public class partTimeStudent extends Student{
    private int numCourses;
    
    public partTimeStudent (String studentId, String studentName, int numCourse){
        super(studentId, studentName);
        numCourses = numCourse;
    }
    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
}
