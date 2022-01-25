/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_win22_tue_pm;

/**
 *
 * @author Ronak
 */
public class PartTimeStudent extends Student{
    
    private int numCourses;
    
    public PartTimeStudent(String studentId,String studentName,int numCourse){
        super(studentId,studentName);
        this.numCourses=numCourse;
        
    }
    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    
}
