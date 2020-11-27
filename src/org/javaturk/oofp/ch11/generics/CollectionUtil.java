package org.javaturk.oofp.ch11.generics;

import java.util.*;

public class CollectionUtil {
	
	public static <T> void swap(List<T> source, List<T> target) {
		List<T> tmp = target;
		target = source;
		source = tmp;
	}
	
	public static <T> boolean equals(List<T> source, List<T> target) {
		if(source.size() != target.size())
			return false;
		
		for(int i = 0; i < source.size(); i++)
			if(!source.get(i).equals(target.get(i)))
				return false;
		
		return true;
	}
	
	public static <K, V> Set<K> getKeys(Map<K, V> map) {
		return map.keySet();
	}
	
	public static <V, K> Collection<V> getValues(Map<K, V> map) {
		return map.values();
	}
}
