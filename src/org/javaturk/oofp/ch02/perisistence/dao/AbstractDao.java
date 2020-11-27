
package org.javaturk.oofp.ch02.perisistence.dao;

import org.javaturk.oofp.ch02.perisistence.db.ConnectionFactory;
import org.javaturk.oofp.ch02.perisistence.db.DBConnection;
import org.javaturk.oofp.ch02.perisistence.domain.Entity;

public abstract class AbstractDao {
	protected DBConnection db;
	
	public AbstractDao(){
		ConnectionFactory factory = new ConnectionFactory();
		db = factory.getConnection();
	}
	
	public abstract void save(Entity e);
	
	public abstract void update(Entity e);
	
	public abstract Entity retrieve(Class clazz, int id);
}
