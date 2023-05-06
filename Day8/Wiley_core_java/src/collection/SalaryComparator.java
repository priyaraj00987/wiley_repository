package CollectionsPackage;

import java.util.Comparator;

public class SalaryComparator implements Comparator<GeniusStudent> {

	@Override
	public int compare(GeniusStudent o1, GeniusStudent o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()==o2.getSalary()) {
			return 0;
		} else if(o1.getSalary()>o2.getSalary()) {
			return 1;
		} else return -1;
	}
	
}
