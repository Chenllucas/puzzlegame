package StudentSystem;

public class Student {
    String studentId;
    String studentName;
    String studentAddress;
    int studentAge;


    public Student() {
    }

    public Student(String studentId, String studentName, String studentAddress, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
    }

    /**
     * 获取
     * @return studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * 设置
     * @param studentId
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * 获取
     * @return studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * 设置
     * @param studentName
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * 获取
     * @return studentAddress
     */
    public String getStudentAddress() {
        return studentAddress;
    }

    /**
     * 设置
     * @param studentAddress
     */
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    /**
     * 获取
     * @return studentAge
     */
    public int getStudentAge() {
        return studentAge;
    }

    /**
     * 设置
     * @param studentAge
     */
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String toString() {
        return "Student{studentId = " + studentId + ", studentName = " + studentName + ", studentAddress = " + studentAddress + ", studentAge = " + studentAge + "}";
    }
}
