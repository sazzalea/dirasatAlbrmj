package org.zaza.experiment.learnOOP3;

public class MainHewan {

	public static void executeBersuara(Hewan hwn) {
		hwn.bersuara();
	}

	public static void executeBersuara(Hewan[] hwns) {
		for (int i = 0; i < hwns.length; i++) {
			System.out.println("the name is: " + hwns[i].getName());
			System.out.println("Hewan " + ( hwns[i].isBuas() ? "buas" : "jinak"));
			hwns[i].bersuara();
			
			if(hwns[i] instanceof Anjing) {
				((Anjing)hwns[i]).rahang();
			}
			
			else if(hwns[i] instanceof Kucing) {
				((Kucing)hwns[i]).cakar();
			}
			
			else if (hwns[i] instanceof Burung) {
				((Burung)hwns[i]).paruh();
			}
			
			else {
				System.out.println("Maaf, tipe data tidak dikenal");
			}
			
			System.out.println("------------------------------");
		}
	}
	
	public static void executeMandi(Peliharaan[] peliharaans) {
		for (Peliharaan pet: peliharaans) {
			pet.dimandikan();
		}
	}

	public static void executeMandi(Hewan[] peliharaans) {
		for (Hewan pet: peliharaans) {
			if (pet instanceof Peliharaan) {
				((Peliharaan) pet).dimandikan();
			}
			else {
				System.out.println("Hewan buas");
			}
		}
	}
	
	public static void main(String[] arg) {
		Hewan anjing1 = new Anjing("Blacky", false);
		Hewan burung1 = new Burung("Tweety", false);
		Hewan kucing1 = new Kucing("Putih", false);
		Hewan singa1 = new Singa("Leo", true);
		
//		anjing1.setName("Blacky");
//		burung1.setName("Tweety");
//		kucing1.setName("Putih");
//		singa1.setName("Leo");
		
		Hewan[] hewans = {anjing1, burung1, kucing1, singa1};

		Peliharaan kucing2 = new Kucing();
		Peliharaan anjing2 = new Anjing(); 
		Peliharaan[] pets = {anjing2, kucing2};

		executeBersuara(hewans);
		System.out.println("===============================");
		executeMandi(pets);
		System.out.println("===============================");
		executeMandi(hewans);
		System.out.println("===============================");
		
		Virus virus1 = new Virus("COVID", "Corona");
		System.out.println("nama virus: " + virus1.getName());
		System.out.println("tipe virus: " + virus1.getType());
		System.out.println(virus1);
		System.out.println("===============================");

		for (Hewan h: hewans) {
//			System.out.println(h);
			String tmp = h.toString();
			System.out.println(tmp);
		}
	}

}
