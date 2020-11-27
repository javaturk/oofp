/* From "Thinking in Java" by Burce Eckels
 * Human.java
 */

package org.javaturk.oofp.ch06.ex;

public class Human {
	public static void main(String[] args) {
		
		try {
			throw new Sneeze();
		} 
//		catch (Exception e) {
//			System.err.println("Caught Exception");
//		}catch (Annoyance s) {
//			System.err.println("Caught Sneeze");
//		} catch (Sneeze a) {
//			System.err.println("Caught Annoyance");
//		}

		catch (Sneeze s) {
			System.err.println("Caught Sneeze");
		} catch (Annoyance a) {
			System.err.println("Caught Annoyance");
		} catch (Exception s) {
			System.err.println("Caught Sneeze");
		}
	}
}

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}
