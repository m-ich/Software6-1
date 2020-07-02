//G18913 市橋めぐ

package pro2kadai1;

public class Kougi {
	private String m_courseName; //kamoku mei
	private int m_credit; //tanni suu
	private int m_isCompulsory; //hisshuu or sentaku hisshuu or sentaku
	private String m_name; //tantou kyouin mei
	
	public Kougi(String n, int c, int b, String name) {
		this.m_courseName = n;
		this.m_credit = c;
		this.m_isCompulsory = b;
		this.m_name = name;
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
	
	/*public boolean equals(Object o){
		if(this == o) {
			return true;
		}
		if(o instanceof Kougi) {
			Kougi k = (Kougi) o;
			if(this.m_isCompulsory==k.m_isCompulsory) {
				if(this.m_credit==k.m_credit) {
					return true;
				}
			}
		}
		return false;
	}*/
	
	public String toString() {
		return this.m_courseName;
	}
}
