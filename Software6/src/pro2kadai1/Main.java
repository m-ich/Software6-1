//G18913 蟶よｩ九ａ縺�

//莠御ｺｺ縺ｮ蟄ｦ逕溘′蜿門ｾ励＠縺溷腰菴肴焚繧偵�∝ｿ�菫ｮ遘醍岼縺ｨ驕ｸ謚樒ｧ醍岼繧貞�縺代※陦ｨ遉ｺ縺吶ｋ繝励Ο繧ｰ繝ｩ繝�
//縺ｾ縺溘�∝推蟄ｦ逕溘′蜿門ｾ励＠縺溽ｧ醍岼縺ｮ縺�縺｡蜊倅ｽ肴焚縺悟酔縺倡ｧ醍岼蜷阪♀繧医�ｳ縺昴�ｮ蜊倅ｽ肴焚繧定｡ｨ遉ｺ縺吶ｋ繝励Ο繧ｰ繝ｩ繝�


package pro2kadai1;

import java.util.*;
public class Main {

	public static void main(String[] args) {

		/*
		 * hisshuu: 1
		 * sentaku hisshuu: 2
		 * sentaku: 3
		 */

		Kougi software = new Kougi("Software", 2, 2, "Yoshida","Friday 4,5 period");
		Kougi proj = new Kougi("3project", 1, 1, "Kishi", "Wednesday 3 period");
		Kougi database = new Kougi("Database", 1, 3, "Aoki", "Tuesday 1 period");
		Kougi os = new Kougi("Operating system", 1, 3, "Sunahara", "Monday 4 period");
		Kougi network = new Kougi("Network system", 2, 2, "Nitta", "Monday 1,2 period");
		Kougi text = new Kougi("Text mining", 1, 3, "Komachi", "Monday 5 period");
		Kougi interactive = new Kougi("Interactive System", 1, 3, "Kurihara", "Tuesday 4 period");
		Kougi math = new Kougi("Mathematics", 2, 2, "Sadahiro", "Thursday 2,3 period");
		Kougi communication = new Kougi("Business communication", 1, 3, "Inaba", "Thursday 2 period");
		Kougi eng = new Kougi("English", 1, 3, "Masuda", "Friday 2 period");

		Kougi[] megu = {software, proj, database, os, network, text, interactive, math};
		Kougi[] mai = {software, proj, database, os, network, text, interactive, math};
		Kougi[] riko = {software, proj, database, os, network, text, interactive, communication, eng};

		Student x = new Student("Megu", megu);
		Student y = new Student("Mai", mai);
		Student z = new Student("Riko", riko);

		x.calcCreditsPerCourse();
		y.calcCreditsPerCourse();
		z.calcCreditsPerCourse();

		System.out.println("Whose number of credits and timetable do you want to know?");
		System.out.println("Megu or Mai or Riko");
		
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		if(st.equals("Megu")) {
			x.showTotalCredits();
			System.out.println();
			for (int i=0; i<megu.length; i++) {
				System.out.println(megu[i].timeTable());
			}
		} else if (st.equals("Mai")) {
			y.showTotalCredits();
			System.out.println();
			for (int i=0; i<mai.length; i++) {
				System.out.println(mai[i].timeTable());
			}
		} else if (st.equals("Riko")){
			z.showTotalCredits();
			System.out.println();
			for (int i=0; i<riko.length; i++) {
				System.out.println(riko[i].timeTable());
			}
		} else {
			System.out.println("no exist!");
		}

	}

}
