
public class TeratorArray implements ITerator {
	
	int[] arr ;
	int position = 0;
	
	public TeratorArray(int[] arr2) {
		this.arr = arr2;
	}
	

	@Override
	public boolean HasNext() {
		if(position >= arr.length)
			return false;
		else
			return true;
	}

	@Override
	public Object Next() {
		Object temp = arr[position];
		position++;
		return temp;
	}
	
	@Override
	public Object Remove() {
		Object temp = arr[arr.length-1];
		position--;
		return temp;
	}

}
