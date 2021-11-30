package genericsProject;

public class Comparing<T> {
	
	public T min;
	public T max;

	public <T> Comparing(T[] array){
		
		min = minimum(array);
		max = maximum(array);
		
	}
	public Comparing(int[] array) {
		min = minimum(array);
		max = maximum(array);
	}
	public Comparing(double[] array) {
		min = minimum(array);
		max = maximum(array);
	}
	public <T extends Comparable<T>> T maximum(T[] array) {
		
		T m = array[0];
		for (T object : array) {
			
			if (object.compareTo(m) > 0) {
				m = object;
			}
		}
		
		return m;
		
	}
	
	public <T extends Comparable<T>> T minimum(T[] array) {
		
			T m = array[0];
			for (T object : array) {
				
				if (object.compareTo(m) < 0) {
					m = object;
				}
			}
			
			return m;
			}
}

