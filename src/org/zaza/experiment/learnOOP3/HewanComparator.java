package org.zaza.experiment.learnOOP3;

import java.util.Comparator;

public class HewanComparator implements Comparator<Hewan>{
	
	private boolean lengthOfNameAsc;

	public HewanComparator(boolean asc) {
		this.lengthOfNameAsc = asc;
	}
	
	@Override
	public int compare(Hewan o1, Hewan o2) {
		if (lengthOfNameAsc) {
			return o1.getName().length() - o2.getName().length();
		}
		else
			return o2.getName().length() - o1.getName().length();
	}

}
