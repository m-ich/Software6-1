//G18913 市橋めぐ

package pro2kadai1;

public class Student {
	private String m_name; //氏名
	private Kougi[] m_classes; //受講している講義
	private int[] m_creditsPerCourse; //必修科目,選択科目の取得単位数を格納する配列
	
	public Student(String n, Kougi[] c) {
		this.m_name = n;
		this.m_classes = c;
		this.m_creditsPerCourse = new int[2];
		for(int i=0;i<2;i++) {
			this.m_creditsPerCourse[i] = 0;
		}
	}
	
	public void calcCreditsPerCourse() {
		for(int i=0; i<this.m_classes.length; i++) {
			if(this.m_classes[i].isCompulsoryCourse()) {
				this.m_creditsPerCourse[0]=this.m_creditsPerCourse[0]+this.m_classes[i].getCredit();
			} else {
				this.m_creditsPerCourse[1]=this.m_creditsPerCourse[1]+this.m_classes[i].getCredit();
			}
		}
	}
	
	public String getName() {
		return this.m_name;
	}
	
	public Kougi[] getKougi() {
		return this.m_classes;
	}
	
	public void showTotalCredits() {
		System.out.println("Name: "+this.m_name);
		System.out.println("Credits (Compulsory): "+this.m_creditsPerCourse[0]);
		System.out.println("Credits (Elective): "+this.m_creditsPerCourse[1]);
	}
}