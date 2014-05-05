import java.util.List;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new PriorityList<Integer>();
		list.add(7);
		list.add(99);
		list.add(1);
		list.add(43);
		list.add(8);
		list.add(8);
		list.add(8);
		list.add(8);
		list.add(8);
		list.add(8);
		list.add(9);
		list.add(43);
		list.add(42);
		
		for(int tmp : list){
			System.out.println(tmp);
		}
	}

}
