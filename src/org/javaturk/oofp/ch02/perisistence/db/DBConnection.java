
package org.javaturk.oofp.ch02.perisistence.db;

import org.javaturk.oofp.ch02.perisistence.dao.*;
import org.javaturk.oofp.ch02.perisistence.domain.*;

public class DBConnection {
	
	public void save(Object o){
		System.out.println("Saving object: " + o);
	}

	public void update(Object o){
		System.out.println("Updating object: " + o);
	}
	
	public Entity load(Class c, int id ){
		System.out.println("Retrieving object by id: " + id);

		Entity e = null;
		if(c.getName().equalsIgnoreCase("org.javaturk.oofp.ch03.perisstence.domain.Product"))
			e = new Product(id, "11111111", "A pen.", 2.19, 0.01);
		else
			e = new Employee(id, "Ali", 4, "Production", "xxx");
		return e;
	}
}
