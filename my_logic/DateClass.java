package LogicalProgramms;

import java.util.ArrayList;

class DateRange {
	 String startDate;
	 String endDate;

	public DateRange(String s, String e) {
		startDate = s;
		endDate = e;
	}
	public String toString() {
		return endDate+""+startDate;
		
	}
}

public class DateClass {

	public static void main(String args[]) {
		ArrayList<DateRange> list = new ArrayList();
		list.add(new DateRange("1 jan 2014", "30 jan 2014"));
		list.add(new DateRange("15 jan 2014", "15 feb 2014"));
		list.add(new DateRange("10 mar 2014", "15 apr 2014"));
		list.add(new DateRange("10 apr 2014", "15 may 2014"));
		 DateMerger d=new DateMerger();
		 d.mergeDates(list);
		
	}
}
