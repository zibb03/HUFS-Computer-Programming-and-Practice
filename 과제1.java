public class 과제1 {
    public static int calcLeap(int currentYear) {
		int leapYear = 0;
		
		if (currentYear % 4 == 0) { 
			if (currentYear % 100 == 0) {
				if (currentYear % 400 == 0)
					leapYear = 1;
			} 
			else
				leapYear = 1;
		}
		
		return leapYear;
	}
		
	public static void main(String[] args) {
		int startDate = 20221001;
		int finalDate = 20221010;

		int total = 0;
		int leapYear = 0;
		int dayofmonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int startYear = startDate / 10000;
		int startMonth = (startDate - startYear * 10000) / 100;
		int startDay = startDate - startYear * 10000 - startMonth * 100;
		
		int finalYear = finalDate / 10000;
		int finalMonth = (finalDate - finalYear * 10000) / 100;
		int finalDay = finalDate - finalYear * 10000 - finalMonth * 100;
		
		for (int currentYear = startYear + 1; currentYear < finalYear; currentYear++) { 	
			leapYear = calcLeap(currentYear);
			if (leapYear == 1)
				total += 1;
			total += 365;
			leapYear = 0;
		}
		
		if (startYear == finalYear) {
			if (startMonth == finalMonth)
				total += finalDay - startDay;
			else {
				if (startMonth <= 2) {
					leapYear = calcLeap(startYear);
					if (leapYear == 1)
						total += 1;
				}
				total += dayofmonth[startMonth] - startDay;
				for (int currentMonth = startMonth + 1; currentMonth < finalMonth; currentMonth++) {
					total += dayofmonth[currentMonth];
				}
				total += finalDay;
			}
		} else {
			if (startMonth <= 2) {
				leapYear = calcLeap(startYear);
				if (leapYear == 1)
					total += 1;
			}
			total += dayofmonth[startMonth] - startDay;
			for (int currentMonth = startMonth + 1; currentMonth <= 12; currentMonth++)
				total += dayofmonth[currentMonth];
			if (finalMonth >= 2) {
				leapYear = calcLeap(finalYear);
				if (leapYear == 1)
					total += 1;
			}
			for (int currentMonth = 1; currentMonth < finalMonth; currentMonth++)
				total += dayofmonth[currentMonth];
			total += finalDay;
		}
		
		//return total + 1;
		System.out.println(total + 1);
	}
}
