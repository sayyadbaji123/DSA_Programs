package DSACODES;
import java.util.Arrays;

public class MergeSortDemo {
	
	
	public static void mergeSort(int arr[],int nofEle)
	{
		if(nofEle<2)
		{
			return;
		}
		int mid=nofEle/2;
		int leftArr[]=new int[mid];
		int rightArr[]=new int[nofEle-mid];
		
		//fill the elements to array
		for(int i=0;i<mid;i++)
		{
			leftArr[i]=arr[i];
			
		}          
		for(int i=mid;i<nofEle;i++)
		{
			rightArr[i-mid]=arr[i];	
		}
		mergeSort(leftArr,mid);
		mergeSort(rightArr,nofEle-mid);
		
		
		merge(arr,leftArr,rightArr,mid,nofEle-mid);
	}
		public static void merge(int[] arr,int[] leftArr,int[] rightArr,int left,int right)
		{
			int i=0,j=0,k=0;
			while(i<left && j<right)
			{
				if(leftArr[i]<=rightArr[j])
				{
					arr[k++]=leftArr[i++];
					
				}
				else
				{
					arr[k++]=rightArr[j++];
					
				}
			}
			while(i<left)
			{
				arr[k++]=leftArr[i++];
				
			}
			while(j<right)
			{
				arr[k++]=rightArr[j++];
				
			}
			
			
		}
		
			public static void main(String[] args)
			{
				int arr[]= {7,3,5,9,2,1,4};
				mergeSort(arr,7);
				System.out.println(Arrays.toString(arr));
				}
		
		
	
}

