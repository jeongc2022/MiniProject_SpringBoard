package static_panaltybin;

public class Student {
	static int penaltyBin;	// 벌금 통
	static int absentNum, laterNum, leaveNum;
	private int absent, later, leaveEarly;
	
	public void absent() {
		this.absent++;
		this.absentNum++;
		Student.penaltyBin += 3000;		// 인스턴스 메소드에서 static 변수를 쓸 수 있다.
		System.out.println("결원: " + Student.absentNum + ", " + "벌금 통: " + Student.penaltyBin);
	}
	public void later() {
		this.later++;
		this.laterNum++;
		Student.penaltyBin += 1000;
		System.out.println("지각: " + Student.laterNum + ", " + "벌금 통: " + Student.penaltyBin);
	}
	public void leaveEarly() {
		this.leaveEarly++;
		this.leaveNum++;
		Student.penaltyBin += 1000;
		System.out.println("조퇴: " + Student.leaveNum + ", " + "금 통: " + Student.penaltyBin);
	}
	
	
	
	public static void main(String[] args) {
	Student student = new Student();	
	student.absent();
	student.absent();
	student.absent();
	student.later();
	}
}
