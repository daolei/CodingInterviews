package test;

public class FindFromArray {
	//二维数组中查找
	public boolean find(int[][] a, int n){
		int width = a[0].length-1,high = a.length-1,high1 =0;
		while(high1<=high&& width >=0){
			if(a[width][high1]<n)
				high1++;
			else if(a[width][high1]>n)
				width--;
			else 
				return true;
		}
		return false;
	}
	public static void main(String[] args){
		FindFromArray f = new FindFromArray();
		int [] [] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		System.out.println(f.find(a,1123));
	}
}
