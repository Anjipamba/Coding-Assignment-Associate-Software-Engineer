import java.util.Arrays;
class arrayShuffle1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		sheffle();
	}
	public static void sheffle(){
		int[] array={1,2,3,4,5,6,7};
		int i=0;
		int j=array.length-1;
		while(i<j){
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(array));
	}				

}
