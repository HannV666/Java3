public class Student extends Person {
    private int studentNumber;
    private int averageMark;

    public int getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getAverageMark() {
        return averageMark;
    }
    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    public boolean enrolEligible (){
      return true;
    }
    public void seminarsTaken (){

    }
}
