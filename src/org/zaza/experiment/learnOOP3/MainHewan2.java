package org.zaza.experiment.learnOOP3;

public class MainHewan2 {

	public static void main(String[] args) {
//		String s1 = "Siti Azzalea";
//		String s2 = s1;
//		String s3a = "Siti";
//		String s3b = " Azzalea";
//		String s3 = s3a + s3b;
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
		Kucing kucing1 = new Kucing("Kara", false);
		Kucing kucing2 = kucing1;
		Kucing kucing3 = new Kucing("Kara", true);
		Virus virus1 = new Virus("COVID", "Corona");
		System.out.println(kucing1 == kucing2);
		System.out.println(kucing1 == kucing3);
		System.out.println(kucing1.equals(kucing2));
		System.out.println(kucing1.equals(kucing3));
		System.out.println(kucing1.equals(virus1));
		kucing1.bersuara();//accessing member of object (method)
		Kucing.kucingItuKonsep();//accessing member of class (static method)
		Kucing.getNamaKelas();
	}

}
