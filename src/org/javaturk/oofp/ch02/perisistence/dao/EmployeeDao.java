
package org.javaturk.oofp.ch02.perisistence.dao;

import org.javaturk.oofp.ch02.perisistence.domain.Employee;
import org.javaturk.oofp.ch02.perisistence.domain.Entity;

public class EmployeeDao extends AbstractDao {

	@Override
	public void save(Entity e) {
		db.save(e);
	}
	
	@Override
	public void update(Entity e) {
		db.update(e);
	}

	@Override
	public Employee retrieve(Class clazz, int id) {
		Employee e = (Employee) db.load(clazz, id);
		return e;
	}
}