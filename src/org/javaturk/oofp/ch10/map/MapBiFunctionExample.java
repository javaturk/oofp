
package org.javaturk.oofp.ch10.map;

import java.util.Map;
import java.util.function.BiFunction;

import org.javaturk.oofp.ch10.util.CollectionUtil;

/**
 * @author akin
 *
 */
public class MapBiFunctionExample {
	
 public static void main(String[] args) {
	 
		Map<String, Integer> map = CollectionUtil.getMap();

		BiFunction<String, Integer, Integer> aSingleDigitBiFunction = (t, u) -> {
			if (t.equals("one") | t.equals("five"))
				return u;
			else
				return -1;
		};
		
		int result = map.compute("eleven", aSingleDigitBiFunction);
		System.out.println(result);
		
		result = map.compute("five", aSingleDigitBiFunction);
		System.out.println(result);
	}

}
