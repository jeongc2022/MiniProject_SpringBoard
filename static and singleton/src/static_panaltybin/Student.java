package static_panaltybin;

public class Student {
	static int penaltyBin;	// ���� ��
	static int absentNum, laterNum, leaveNum;
	private int absent, later, leaveEarly;
	
	public void absent() {
		this.absent++;
		this.absentNum++;
		Student.penaltyBin += 3000;		// �ν��Ͻ� �޼ҵ忡�� static ������ �� �� �ִ�.
		System.out.println("���: " + Student.absentNum + ", " + "���� ��: " + Student.penaltyBin);
	}
	public void later() {
		this.later++;
		this.laterNum++;
		Student.penaltyBin += 1000;
		System.out.println("����: " + Student.laterNum + ", " + "���� ��: " + Student.penaltyBin);
	}
	public void leaveEarly() {
		this.leaveEarly++;
		this.leaveNum++;
		Student.penaltyBin += 1000;
		System.out.println("����: " + Student.leaveNum + ", " + "�� ��: " + Student.penaltyBin);
	}
	
	
	
	public static void main(String[] args) {
	Student student = new Student();	
	student.absent();
	student.absent();
	student.absent();
	student.later();
	}
}
