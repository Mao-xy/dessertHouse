package desserthouse.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Tools {
	
	public static String getMonday(String date){
		Calendar cal = Calendar.getInstance();
		String monday;
		try {
			cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		cal.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
		monday = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		return monday;
	}
	
	public static String getSunday(String date){
		Calendar cal = Calendar.getInstance();
		String sunday;
		try {
			cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		cal.add(Calendar.DATE, 7);
		cal.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
		sunday = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		return sunday;
	}
	
	public static ArrayList<String> getTwoWeek(){
		ArrayList<String> res = new ArrayList<String>();
		Calendar cal = Calendar.getInstance();
		try {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			cal.setTime(sdf.parse(sdf.format(new Date())));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Locale.setDefault(Locale.CHINESE);
		//星期的第几天
		int w = cal.get(Calendar.DAY_OF_WEEK)-1;
		for(int i=w;i<14;i++){
			cal.add(Calendar.DATE, 1);
			res.add(new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()));
		}
		return res;
	}
	
	public static String getCurrentTime(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = sdf.format(new Date());
		return time;
	}

}
