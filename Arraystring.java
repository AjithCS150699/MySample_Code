import java.util.ArrayList;
import java.util.Arrays;

public class Arraystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] Value= {"Ajith","Ajay","Tahseen","Balaji","Ismail","Ajay",};
		
		ArrayList<String> list=new ArrayList<String>();
		
		for(int i=0;i< Value.length;i++) {
			if(!list.contains(Value[i])) {
				list.add(Value[i]);
			}
			
		}
		String[] str=list.toArray(new String[0]);
		System.out.println(Arrays.toString(str));
	}

}
