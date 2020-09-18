package java08_abstract.quiz2;

public class Array implements ArrayAction {
	String[] arr = new String[10];
	private int count = 0;
	
	@Override
	public void add(String element) {
		if(count == arr.length) {
			System.out.println("[SYSTEM] �迭�� �� á���ϴ�.");
			return;
		}
		arr[count++] = element;			
	}
	
	@Override
	public void remove(String element) {
		
		for(int i = 0; i < count; i++) {
			if(arr[i].equals(element)) {
				count--;
				
				for(int j = i; j < count; j++) {
					arr[j] = arr[j+1];
				} arr[count] = null;
				
				i--; // �ش� �ڸ����� �ٽ� Ž�� //removeAll
//				return; // remove
			} 
		}
		
	}
	
	
	@Override
	public String get(int idx) {

		return arr[idx];
	}
	
	@Override
	public int find(String element) {
		for(int i = 0; i < count; i++) {
			if(arr[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}
	
	
	@Override
	public void print() {
		for(int i = 0; i <count; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();
	}
		
}
