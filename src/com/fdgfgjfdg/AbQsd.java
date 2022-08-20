package com.fdgfgjfdg;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.print.DocFlavor.STRING;

public class AbQsd {

	public static void main(String[] args)
	{
		
		/*String zone[]=TimeZone.getAvailableIDs();
		SimpleDateFormat sdf=new SimpleDateFormat("mmm dd yyyy hh:mm:ss a zzz");
		
		System.out.println("date and time                        zone and country");
		for(String zonetype:zone)
		{
			sdf.setTimeZone(TimeZone.getTimeZone(zonetype));
			System.out.println(sdf.format(new Date())+"======"+zonetype);		
        } 

	}*/
		
		String[] zone=TimeZone.getAvailableIDs();
SimpleDateFormat sdf=new SimpleDateFormat("mmm dd yyy hh:mm:ss a zzz");
		
		System.out.println(sdf);
		for(String zonetype:zone)
		{
			sdf.setTimeZone(TimeZone.getTimeZone(zonetype));
			System.out.println(sdf.format(new Date()));
			
		}
		
		
}
}