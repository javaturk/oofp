/* Ch 13
 * NeverCaught.java
 */

package org.javaturk.oofp.ch06.ex;

import java.io.IOException;

public class NeverCaught {
	
    static void f(){
        throw new RuntimeException("From f()");
    }
    
    static void g() {
        f();
    }
    
    public static void main(String[] args) {
        g();
    }
}
