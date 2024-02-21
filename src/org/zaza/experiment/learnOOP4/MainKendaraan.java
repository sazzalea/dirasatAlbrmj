package org.zaza.experiment.learnOOP4;

public class MainKendaraan {
	
	public static void executeParkir(Kendaraan[] kendaraan) {
		for(int i = 0; i < kendaraan.length; i++) {
			kendaraan[i].parkir();
			System.out.println("the merk is: " + kendaraan[i].getMerk());
			System.out.println("tipe kendaraan: " + (kendaraan[i].isBermotor() ? "bermotor" : "tidak bermotor"));
			
			if (kendaraan[i] instanceof Mobil) {
				((Mobil)kendaraan[i]).penumpang();
			}
			else if (kendaraan[i] instanceof Motor) {
				((Motor)kendaraan[i]).knalpot();
			}
			else if (kendaraan[i] instanceof Kuda){
				((Kuda)kendaraan[i]).berak();
			}
			else {
				System.out.println("Maaf, tipe data tidak dikenal");
			}
			
			System.out.println("-----------------------------");
		}
	}
	
	public static void executeIsiBensin(Bermotor[] bermotor) {
		for (Bermotor motorized: bermotor) {
			motorized.isiBensin();
		}
	}
	
	public static void executeIsiBensin(Kendaraan[] kendaraan) {
		for (Kendaraan vehicle: kendaraan) {
			if (vehicle instanceof Bermotor) {
				((Bermotor)vehicle).isiBensin();
			}
			if (vehicle instanceof PelindungKepala) {
				((PelindungKepala)vehicle).wajibHelm();
			}
			else {
				System.out.println("Tidak ada implementasi");
			}
			System.out.println("-------------------------");
		}
	}

	public static void main(String[] args) {
//		try (Kuda kuda2 = new Kuda()) {
//			kuda2.berak();
//		} 
//		catch (Exception e) {
//		}
				
		Kendaraan mobil1 = new Mobil("Toyota", true);
		Kendaraan motor1 = new Motor("Yamaha", true);
		Kendaraan kuda1 = new Kuda("Andalusia", false);
		Kendaraan[] kendaraan1 = {mobil1, motor1, kuda1};
		Bermotor mobil = new Mobil();
		Bermotor motor = new Motor();
		Bermotor[] bermotor = {mobil, motor};
		executeParkir(kendaraan1);
		System.out.println("=======================");
		executeIsiBensin(bermotor);
		System.out.println("=======================");
		executeIsiBensin(kendaraan1);
	}

}
