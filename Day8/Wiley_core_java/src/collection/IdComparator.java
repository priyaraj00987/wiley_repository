package Day8.Wiley_core_java.src.collection;

import java.util.Comparator;

public class IdComparator implements Comparator<GeniusStudent>{

	@Override
	public int compare(GeniusStudent o1, GeniusStudent o2) {
		return o1.getId()-o2.getId();
	}

}
