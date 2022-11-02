package superclasstry;

public class BSIT extends student {

	String teacherNM, teacherDept;
	
	public BSIT(String lname, String fname, int age, String addr, String telnum,
		String teacherNM, String teacherDept) {
		
		super(lname, fname, age, addr, telnum);
		this.teacherNM = teacherNM;
		this.teacherDept = teacherDept;
	}
	
	public BSIT(String scode, String ycode, String ccode) {
		super(scode,ycode,ccode);
	}
	
	public String DisplayStudentInfo() {
		return String.format("\n\nInstructor: %s\nTeacher Department: %s\n\nSTUDENT INFO: %s",
				teacherNM,teacherDept,StudentPersonalInfo());
	}
	
	public String DisplayCourseInfo() {
		return String.format("COURSE INFO: %s\n", CourseInfo());
	}
	
	public String getCcodes(){
		return getCcode();
	}
	
	public String getYcodes(){
		return getYcode();
	}
}
