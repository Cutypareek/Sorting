package sort;

public class BubbleSort {
	
	 void bsort(int  num[])
	    {
	        int n = num.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (num[j] > num[j+1])
	                {
	                    int temp = num[j];
	                    num[j] = num[j+1];
	                    num[j+1] = temp;
	                }
	    }
	    
	    void display(int num[])
	    {
	        int n = num.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(num[i] + " ");
	        System.out.println();
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BubbleSort bs = new BubbleSort();
        int num[] = {64, 34, 25, 12, 22, 11, 90};
        bs.bsort(num);
        System.out.println("Sorted array");
        bs.display(num);

	}

}
