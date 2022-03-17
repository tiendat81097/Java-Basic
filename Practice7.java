package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice7 {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String... args) {
		/*
		 * Excercise 1:
		 * Viết hàm nhập, xuất mảng 1 chiều các số nguyên
		 */
//		System.out.print("Nhập số phần tử của mảng: ");
//		int n = scan.nextInt();
//		int[] arr = new int[n];
//		System.out.print("Nhập các phần tử của mảng: \n");
//		for(int i = 0; i<n;i++) {
//			System.out.printf("a[%d] = ", i);
//			arr[i] = scan.nextInt();
//		}
//		System.out.print("Các phần tử của mảng: ");
//		for(int i =0;i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		
		/*
		 * Excercise2:
		 * Viết hàm tìm giá trị lớn nhất trong mảng 1 chiều các số nguyên
		 */
//		int[] arr = {1,8,5,9,3};
//		int max = arr[0];
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.print("Giá trị lớn nhất trong mảng là: " + max);
		
		/*
		 * Excercise 3:
		 * Hãy tìm giá trị dương nhỏ nhất trong mảng 1 chiều các số nguyên. 
		 * Nếu mảng không có giá trị dương thì in ra ko có
		 */
//		int[] arr = { -1, 6, -9, 10, 1};
//		int min = arr[0];
//		int count = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if((min == arr[0] || min > arr[i]) && arr[i] > 0) {				
//				min = arr[i];
//			} else {				
//				if(count == (arr.length -1)) {
//					System.out.print("Mảng không có giá trị dương!!");
//				}
//				count++;
//			}			
//		}
//		System.out.print("Giá trị dương nhỏ nhất trong mảng là " + min);
		
		
		/*
		 * Excercise 4:
		 * Viết hàm tìm 1 vị trí mà giá trị tại vị trí đó 
		 * là giá trị nhỏ nhất trong mảng 1 chiều các số nguyên
		 */
//		int[] arr = {9,6,1,8,4,3,5};
//		int min = arr[0], pos = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] < min) {
//				min = arr[i];
//				pos = i;
//			}
//		}
//		System.out.print("Giá trị nhỏ nhất trong mảng là " + min +
//				" tại vị trí " + pos + " của mảng");
		
		
		/*
		 * Exercise 5:
		 * Tìm vị trí của giá trị chẵn đầu tiên trong mảng 1 chiều các số nguyên.
		 *  Nếu mảng không có giá trị chẵn thì in ra ko có
		 */
//		int[] arr = {1,5,7,9,2,8,6,4};
//		int count = 0;
//		int value = arr[0];
//		for(int i = 0; i< arr.length; i++) {
//			if(arr[i] % 2 == 0) {
//				value = arr[i];
//				break;
//			} else { 
//				++count;
//				if(count == arr.length) {
//					System.out.print("Trong mảng không có số chẵn!");
//				}				
//			}
//		}
//		if(value % 2 == 0) {
//			System.out.print("Giá trị chẵn đầu tiên trong mảng là: " +  value);
//		}

		
		
		/*
		 * Excercise 6:
		 * Tìm số chẵn cuối cùng trong mảng 1 chiều các số nguyên. 
		 * Nếu mảng không có giá trị chẵn thì in ra ko có
		 */
//		int[] arr = { 2, 9, 7, 8, 3, 5, 6, 4};
//		int count = 0;
//		int value = arr[0];
//		for(int i = 0; i< arr.length; i++) {
//			if(arr[i] % 2 == 0) {
//				value =  arr[i];
//			} else {
//				++count;
//				if(count ==  arr.length) {
//					System.out.print("Trong mảng không có số chẵn!");
//				}
//			}			
//		}
//		if(value % 2 == 0) {
//			System.out.print("Giá trị chẵn cuối cùng trong mảng là: " + value);
//		}		
		
		
		/*
		 * Excercise 7:
		 * Hãy tìm số nguyên tố lớn nhất trong mảng 1 chiều các số nguyên. 
		 * Nếu mảng không có số nguyên tố thì in ra ko có
		 */					
		int[] arr = {2, 3, 7, 23, 25, 31, 45, 56};
//		int[] arr = {4,6,8,10,12};
		int count = 0;
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(isPrimeNumber(arr[i])) {
				if(arr[i] > max) max = arr[i];
			} else {
				++count;
				if(count == arr.length) System.out.print("Trong mảng không có số nguyên tố!");
			}
		}
		if(count != arr.length) System.out.print("Số nguyên tố lớn nhất trong mảng là: " + max);
		
		
		/*
		 * Excercise 8:
		 * Cho mảng 1 chiều các số nguyên. 
		 * Hãy viết hàm tìm ước chung lớn nhất của tất cả các phần tử trong mảng
		 */

		
		
		/*
		 * Excercise 9:
		 * Cho mảng 1 chiều các số nguyên. 
		 * Hãy viết hàm tìm bội chung nhỏ nhất của tất cả các phần tử trong mảng
		 */
		
		
		
		/*
		 * Excercise 10:
		 * Hãy liệt kê các số trong mảng 1 chiều các số nguyên thuộc đoạn [x, y] cho trước
		 */
//		int[] arr = {1, 7, 24, 22, 17, 9, 5, 13, 16};
//		System.out.print("Nhập giá trị x: ");
//		int x = scan.nextInt();
//		System.out.print("Nhập giá trị y: ");
//		int y = scan.nextInt();
//		System.out.print("Các số trong mảng thuộc đoạn ["+x+","+y+"] là: ");
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i] >= x && arr[i] <=  y) {
//				System.out.print(arr[i] + " ");
//			}
//		}
	}
	
	public static boolean isPrimeNumber(int n) {
		if(n < 0) return false;
		for(int i = 2; i <= (int)Math.sqrt(n); i++) {
			if(n%i == 0) return false;
		}
		return true;
	}
}
