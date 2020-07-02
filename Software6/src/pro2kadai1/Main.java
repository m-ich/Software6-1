//G18913 市橋めぐ
//二人の学生が取得した単位数を、必修科目と選択科目を分けて表示するプログラム
//また、各学生が取得した科目のうち単位数が同じ科目名およびその単位数を表示するプログラム

package pro2kadai1;

public class Main {
	
	public static void main(String[] args) {
		
		/* 
		 * hisshuu: 1
		 * sentaku hisshuu: 2
		 * sentaku: 3
		 */
		
		Kougi software = new Kougi("Software", 2, 2, "Yoshida");
		Kougi proj = new Kougi("3project", 1, 1, "Kishi");
		Kougi database = new Kougi("Database", 1, 3, "Aoki");
		Kougi os = new Kougi("Operating system", 1, 3, "Sunahara");
		Kougi network = new Kougi("Network system", 2, 2, "Nitta");
		Kougi text = new Kougi("Text mining", 1, 3, "Komachi");
		Kougi interactive = new Kougi("Interactive System", 1, 3, "Kurihara");
		Kougi math = new Kougi("Mathematics", 2, 2, "Sadahiro");
		Kougi communication = new Kougi("Business communication", 1, 3, "Inaba");
		Kougi eng = new Kougi("English", 1, 3, "Masuda");
		
		Kougi[] megu = {software, proj, database, os, network, text, interactive, math};
		Kougi[] mai = {software, proj, database, os, network, text, interactive, math};
		Kougi[] riko = {software, proj, database, os, network, text, interactive, communication, eng};
		
		Student x = new Student("Megu", megu);
		Student y = new Student("Mai", mai);
		Student z = new Student("Riko", riko);
		
		x.calcCreditsPerCourse();
		y.calcCreditsPerCourse();
		
		x.showTotalCredits();
		y.showTotalCredits();
		
		System.out.println("Name: "+x.getName());
		for(int h=0;h<t.length-1;h++) {
			for(int i=h+1;i<t.length;i++) {
				if(t[h].equals(t[i])) {
					System.out.println("The following two have the same credits: "+t[i].getCredit());
					System.out.println(t[h].toString());
					System.out.println(t[i].toString());
				}
			}
		}
		
		System.out.println("Name: "+y.getName());
		for(int h=0;h<cs.length-1;h++) {
			for(int i=h+1;i<cs.length;i++) {
				if(cs[h].equals(cs[i])) {
					System.out.println("The following two have the same credits: "+cs[i].getCredit());
					System.out.println(cs[h].toString());
					System.out.println(cs[i].toString());
				}
			}
		}
	}

}
