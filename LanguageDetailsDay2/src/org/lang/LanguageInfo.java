package org.lang;

public class LanguageInfo extends StateDetails {
	
	private void tamilLanguage() {
		System.out.println("Tamil Language");
	}
	
	private void englishLanguage() {
		System.out.println("English Language");
	}

	private void hindiLanguage() {
		System.out.println("Hindi Language");
	}
	
	public static void main(String[] args) {
		
		LanguageInfo lang = new LanguageInfo();
		lang.tamilLanguage();
		lang.englishLanguage();
		lang.hindiLanguage();
		lang.southIndia();
		lang.northIndia();
	}
}
