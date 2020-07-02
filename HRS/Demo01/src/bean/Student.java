package bean;

/**
 * @author ：Timber
 * @date ：Created in 2020/7/1 17:46
 * @modified By：
 */
public class Student {
    //学生信息
    private String studentName;
    private String studentID;
    private String studentNum;
    private String studentEmail;
    private String position;
    //学生状态
    private int state;


    @Override
    public String toString() {
        return "学生信息{" +
                "姓名='" + studentName + '\'' +
                ", 身份证号码='" + studentID + '\'' +
                ", 电话='" + studentNum + '\'' +
                ", 邮件='" + studentEmail + '\'' +
                ", 应聘岗位='" + position + '\'' +
                '}';
    }

    public Student() {
    }

    //使用构造方法为学生信息赋值
    public Student(String studentName, String studentID, String studentNum, String studentEmail, String position) {
        setStudentName(studentName);
        setStudentID(studentID);
        setStudentNum(studentNum);
        setStudentEmail(studentEmail);
        setPosition(position);
    }
    public Student(String studentName, String studentID, String studentNum, String studentEmail, String position, int state) {
        setStudentName(studentName);
        setStudentID(studentID);
        setStudentNum(studentNum);
        setStudentEmail(studentEmail);
        setPosition(position);
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
