package javaKampHomeWorkDay2.inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		
		KrediUI krediUI = new KrediUI();
		krediUI.krediHesapla(ogretmenKrediManager);

	}

}
