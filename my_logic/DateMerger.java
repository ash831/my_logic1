package LogicalProgramms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DateMerger {

	public List<DateRange> mergeDates(List<DateRange> dateRanges) {

		Iterator<DateRange> i = dateRanges.iterator();

		while (i.hasNext()) {
			DateRange date = i.next();
			DateRange date1=i.next();

			String[] s = date.endDate.split(" ");
			
			String[] s1 = date1.startDate.split(" ");
			
			if (s[0].compareTo(s1[0]) > 0) {
				System.out.println(date.startDate + "-" + date1.endDate);

			}

		}

		return dateRanges;
	}
}