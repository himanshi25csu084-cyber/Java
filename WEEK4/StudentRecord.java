public class StudentRecord {
    private int marks;
    private String name;
    private String studentID;
    public StudentRecord(String name,String studentId,int marks){
        if(name==null||studentID==null){
            System.out.println("Name or StudentID can never be null");
            return;
        }
        if(marks<0||marks>100){
            System.out.println("Invalid Marks");
            return;
        }
        this.name = name;
        this.studentID = studentId;
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
    public String getStudentId(){
        return studentID;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("Jai Dagar", "25csu093", 99);
        s1.setMarks(50);
        System.out.println(s1.getMarks());
        
    }
}
