
package student_win22_tue_pm;

/* 
Date: Jan 25th 2022
AUthor: Ronak Sheth
Comment: This is just a comment
*/
//comments on 1st Feb
public class Student {
    private String studentId;
    private String studentName;
    private String address;
    
    public Student(String studentId,String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
      }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    
    
}
