package org.javaturk.oofp.ch11.school;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {

	@Override
	public int compare(Teacher t1, Teacher t2) {
		int result = 0;

		if (t1.no < t2.no)
			result = -1;
		else if (t1.no > t2.no)
			result = 1;

		return result;
	}
}
