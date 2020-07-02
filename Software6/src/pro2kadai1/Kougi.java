//G18913 蟶よｩ九ａ縺�

package pro2kadai1;

public class Kougi {
	private String m_courseName; //kamoku mei
	private int m_credit; //tanni suu
	private int m_isCompulsory; //hisshuu or sentaku hisshuu or sentaku
	private String m_name; //tantou kyouin mei
	private String m_time; //zikannwari
	
	public Kougi(String n, int c, int b, String name, String time) {
		this.m_courseName = n;
		this.m_credit = c;
		this.m_isCompulsory = b;
		this.m_name = name;
		this.m_time = time;
	}

	public int getCredit() {
		return this.m_credit;
	}

	public int isCompulsoryCourse() {
		return this.m_isCompulsory;
	}

	public String name() {
		return this.m_name;
	}

	public String toString() {
		return this.m_courseName;
	}
	
	public String timeTable() {
		String s = toString() + ",  " + name() + " sensei, " + this.m_time;
		return s;
	}
}
