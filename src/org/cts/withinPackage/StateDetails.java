package org.cts.withinPackage;

public class StateDetails {
	
	public void southIndia() {
		System.out.println("South India");
	}
	public void northIndia() {
		System.out.println("North India");
	}
	
	public static void main (String [] args) {
		StateDetails stat = new StateDetails();
		LanguageInfo lang = new LanguageInfo();
			stat.southIndia();
			stat.northIndia();
			lang.tamilLanguage();
			lang.englishLanguage();
			lang.malayalamLanguage();
	}
	
}
