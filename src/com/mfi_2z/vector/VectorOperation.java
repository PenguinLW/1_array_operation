package com.mfi_2z.vector;
import static com.mfi_2z.array_methods.VectorMethods.*;
import  java.util.*;

import javax.swing.JOptionPane;
public class VectorOperation {
private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
	try{
		System.out.print("error_text: ");
		int m = in.nextInt();
		int[] arr = new int[m];
//		arr = initValForm(arr);
		arr = randomValue(arr);
		System.out.println("error_text error_text:\n"+arrPrint(arr));
		sortOfMinToMax(arr);
		System.out.println("error_text error_text error_text:\n"+arrPrint(arr));
		sortOfMaxToMin(arr);
		System.out.println("error_text error_text error_text:\n"+arrPrint(arr));
			System.out.println("error_text error_text "
				+ "error_text error_text arr["+positionMinEl(arr)+"] = "+ arr[positionMinEl(arr)]
				+"\nn error_text arr["+positionMaxEl(arr) + "] = "+arr[positionMaxEl(arr)]);
				
			changeMinWithMax(arr);
		System.out.println("\n"+arrPrint(arr));
		System.out.println("error_text error_text "+amountEvenValOfArr(arr));
		System.out.println("error_text error_text: "+	arrPrint(	subarrOfEvenValArr(arr)	));
		System.out.print("error_text \"error_text\" _ \"error_text\" error_text "
				+ "error_text error_text error_text)"
				+ "\nk = ");
		int start = in.nextInt();
		System.out.print("n = ");
		int end = in.nextInt();
		System.out.println("error_text _ error_text error_text "
				+start+" error_text "+end+" error_text: "+arithMeanSubArr(arr, start, end));
		System.out.println("error_text error_text: "+arithMean(arr));
		System.out.println(minNumb(arr));
	}catch(ArrayIndexOutOfBoundsException exc){
		JOptionPane.showMessageDialog(null, "error_text error_text error_text:\n"+exc);
	}
	}
}
