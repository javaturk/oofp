
package org.javaturk.oofp.ch02.perisistence.db;

public class ConnectionFactory {

	public DBConnection getConnection() {
		return new DBConnection();
	}
}
