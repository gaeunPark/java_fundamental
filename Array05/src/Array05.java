import java.util.*;

public class Array05 {
	public static void main(String[] args) {
		
		int[] arr1= {50, 60, 70, 80, 90};
		int[] arr2= new int[5];
		
		//1번 방법
//		for(int i=0; i<arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
		
		//2번 방법 - System.arraycopy(); 매서드 사용
		System.arraycopy(arr1, 1, arr2, 1, 2);
		
		//1번 배열의 출력 방법	
//		System.out.print("arr1 배열: ");
//		for(int i=0; i<arr1.length; i++) {
//			System.out.printf("%5d", arr1[i]);
//		}
//		System.out.println();
//		
//		System.out.print("arr2 배열: ");
//		for(int i=0; i<arr2.length; i++) {
//			System.out.printf("%5d", arr2[i]);
//		}
//		System.out.println();
//		}
	
		//2번 방법-출력방법
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	
		}
	}
