import java.util.ArrayList;

public class TeratorArrayList implements ITerator {
	
	ArrayList<Object> arrList ;
	int position = 0;
	

	@Override
	public boolean HasNext() {
		if(position >= arrList.size())
			return false;
		else
			return true;
	}

	@Override
	public Object Next() {
		Object temp = arrList.get(position);
		position++;
		return temp;
	}

	@Override
	public Object Remove() {
		// TODO Auto-generated method stub
		return null;
	}

}
