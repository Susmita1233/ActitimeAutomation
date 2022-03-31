package com.crm.genericutiity;

import java.util.Date;
import java.util.Random;
/**
 * 
 * @author USER
 *
 */
public class JavaUtility {
	/**
	 * 
	 * @return
	 */

	public int getRandomNumber() {
		Random rn=new Random();
		int random=rn.nextInt();
		return random;
	}
	/**
	 * 
	 * @return
	 */
	public String getDateAndTime() {
		Date dt=new Date();
		String date=dt.toString();
	
		String yyyy=date.split(" ")[5];
		String dd=date.split(" ")[2];
		int mm=dt.getMonth()+1;
		String actualdate=dd+"/"+mm+"/"+yyyy;
		System.out.println(actualdate);
		return actualdate;
	}

} 
	

