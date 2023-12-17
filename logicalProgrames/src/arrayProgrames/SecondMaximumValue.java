package arrayProgrames;

public class SecondMaximumValue {

	public static void main(String[] args) {
		int[] arr= {10,20,25,63,96,57};
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
				
		}
		System.out.println("the second maximum value is :"+arr[n-2]);
		
		
	}
		}
