import java.util.*;
public class test2 {
	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		int n=sc.nextInt();//size of array
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		List<Integer> res = new ArrayList<>();
		int k = sc.nextInt();
		
		int i=0;
		List<Integer> temp = new ArrayList<>();
		
		for(int j=0;j<n;j++) {
			temp.add(arr[j]);
			
			if(j-i+1==k) {
				List<Integer> x= new ArrayList<>(temp);
				Collections.sort(x);

				res.add(x.get(k/2));
				temp.remove(0);
				i++;
			}
		}
		System.out.println(res);
	}
	
}

//n = 8
//Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
//Output: [1,-1,-1,3,5,6]
