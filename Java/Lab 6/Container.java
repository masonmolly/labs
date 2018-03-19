/* Container class for use in MyHashMap.java */

public class Container{
	Object key;
	Object value;
	
	public void insert(Object k, Object v){
		this.key = k;
		this.value = v;
	}
	
	public String toString() {
		return key + "=" + value;
	}
}