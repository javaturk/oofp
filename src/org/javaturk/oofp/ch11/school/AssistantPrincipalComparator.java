package org.javaturk.oofp.ch11.school;

import java.util.Comparator;

public class AssistantPrincipalComparator implements Comparator<AssistantPrincipal> {

	@Override
	public int compare(AssistantPrincipal t1, AssistantPrincipal t2) {
		int result = t1.getName().compareTo(t2.getName());
		return result;
	}
}
