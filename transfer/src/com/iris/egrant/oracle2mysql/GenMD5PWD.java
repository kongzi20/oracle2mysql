package com.iris.egrant.oracle2mysql;

public class GenMD5PWD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String[] arr = new String[] {"sbdw1",   "064981055",   "470451738",    "199107197"};
		 for (String s : arr) {
			System.out.println(s + "," + CipherUtil.encodeByMD5(s + "|111111" ));
		}

	}

}
