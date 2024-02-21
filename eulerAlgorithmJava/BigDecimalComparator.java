package org.zaza.eulerAlgorithmJava;

import java.math.BigDecimal;
import java.util.Comparator;

public class BigDecimalComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		BigDecimal num1 = new BigDecimal(o1);
		BigDecimal num2 = new BigDecimal(o2);
		return num2.compareTo(num1);
	}

}
