package superclasstry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		GradeClass grd = new GradeClass(); 
		BSIT studInfo;
		BSIT courseinfo;
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		String lname = null,fname = null,addr = null,telnum = null,tcNM = null,tcDept = null;
		String scode = null,ycode = null,ccode = null;
		int age = 0;
		
		System.out.println("Enter LastName: ");
		lname = sc.nextLine();
		
		System.out.println("Enter FirstName: ");
		fname = sc.nextLine();
		
		do {
			try {
				System.out.println("Enter Age: ");
				age = Integer.parseInt(rd.readLine());
			}
			catch (NumberFormatException a) {
				System.out.println("Warning: "+ a);
			}
		}while(age <= 0);
		
		System.out.println("Enter Address: ");
		addr = sc.nextLine();
		
		System.out.println("Enter Telnum: ");
		telnum = sc.nextLine();
		
		System.out.println("Enter Instructor Name: ");
		tcNM = sc.nextLine();
		
		System.out.println("Enter Teacher Department: ");
		tcDept = sc.nextLine();
		
		System.out.println("Enter Subject Code: ");
		scode = sc.nextLine();
		
		//*do {
			System.out.println("Enter Year Code: ");
			ycode = sc.nextLine();
		//*} while (ycode == "1" || ycode == "2" || ycode == "3");
		
		System.out.println("Enter Course Code: ");
		ccode = sc.nextLine();
		
		grd.remarks();

		courseinfo = new BSIT(scode,ycode,ccode);
		
		if (courseinfo.getCcodes() == "BSIT" || courseinfo.getCcodes() == "BSEE" ||
			courseinfo.getCcodes() == "BSME" || courseinfo.getCcodes() == "BSCE") {
		
		studInfo = new BSIT(lname,fname,age,addr,telnum,tcNM,tcDept);
		
		System.out.println(studInfo.DisplayStudentInfo());
		System.out.println(courseinfo.DisplayCourseInfo());
		System.out.println("GRADE REPORT:");
		System.out.println(String.format("Your grade is: %.2f", grd.Total));
		System.out.println(String.format("Your remark is: %s", grd.remark));
		}
	}
}


