import java.util.List;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new PriorityList<Integer>();
		for(int i = 0; i < 13 ; i++){
			list.add(i);
		}
		
		for(int tmp : list){
			System.out.println(tmp);
		}
	}

}
