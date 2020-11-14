/**
 * error_text:
 * 1. error_text ().
 * 2. error_text.
 * 3. error_text.
 * 4. error_text.
 * 5. error_text.
 * 6. error_text (error_text k error_text m).
 * 7. error_text.
 * 8. error_text.
 * 9. error_text.
 * 10. error_text.
 * 11. error_text.
 * 12. error_text.
 * 13. error_text.
 * 14.
 * 15.
 */
package com.mfi_2z.array_methods;

import javax.swing.JOptionPane;

public class VectorMethods{
/**
 * 1. error_text ().
 * */
	public static String arrPrint(int[] arr){
		String arrstr = "";
		for(int i = 0; i <= arr.length-1; i++){
			arrstr += arr[i] + ",";
//			if(i != arr.length-1)
//				arrstr += ",";
			}
		arrstr = "["+arrstr.substring(0, arrstr.length()-1) + 
				arrstr.substring(arrstr.length()-1).replace(",", "]");
		return arrstr;
	}
	public static String arrPrint(String[] arr){
		String arrstr = "";
		for(int i = 0; i <= arr.length-1; i++){
			arrstr += arr[i] + ",";
			}
		arrstr = "["+arrstr.substring(0, arrstr.length()-1) + 
				arrstr.substring(arrstr.length()-1).replace(",", "]");
		return arrstr;
	}
/**
 * 2. error_text.
 * */
	public static int[] arrCopy(int[] arr){
		int[] arrC = new int[arr.length];
		for(int i = 0; i <= arr.length-1; i++)
			arrC[i] = arr[i];
		return arrC;
	}
	public static String[] arrCopy(String[] arr){
		String[] arrC = new String[arr.length];
		for(int i = 0; i <= arr.length-1; i++)
			arrC[i] = arr[i];
		return arrC;
	}

/**
 * 3. error_text.
 * */
	public static String minNumb(int[] mass){
		int number = 0;
		int min = mass[0];
		for(int i = 0; i <= mass.length-1;i++){
			if(mass[i] < min){
				min = mass[i];
				number = i+1;
				}
			}
		return "Ìèíèìàëüíûé ýëåìåíò ðÿäà: íîìåð - " + 
			number + "; çíà÷åíèå - " + min;
	}
/**
 * 4. error_text.
 * */
	public static int[] randomValue(int[] mass){
		for(int i = 0; i <= mass.length-1; i++){
			mass[i] =(int) (77 *Math.random());
		}
		return mass;
	}
/**
 * 5. error_text.
 * */
	public static int arithMean(int[] mass){
		int srznach = 0;
			for(int i = 0; i <= mass.length-1; i++){
				srznach += mass[i];
			}
			return srznach/mass.length;
		}
/**
 * 6. error_text (error_text k error_text m).
 * */
	public static int arithMeanSubArr(int[] mass, int start, int end){
		int srznach = 0;
		int[] startendmass = new int[(end-start)+1];
		for(int i = start-1, j = 0; i <= end-1; i++, j++)
			startendmass[j] = mass[i];
//		JOptionPane.showMessageDialog(null, arrPrint(startendmass));
//	//		if(k >= 1 && l >= k && l <= mass.length){
			for(int i = 0; i <= startendmass.length-1; i++)
					srznach += startendmass[i];
			return srznach/startendmass.length;
		}
/**
 * 7. error_text.
 * */
	public static int[] subarrOfEvenValArr(int[] A){
			int j = 0;
			int[] B = new int[amountEvenValOfArr(A)];
			for(int i = 0; i <= A.length-1; i++){
				if(A[i]%2==0){
					B[j] = A[i]; j++;
					}
			}
			return B;
		}
/**
 * 8. error_text.
 * */
	public static int amountEvenValOfArr(int[] mass){
			int even = 0;
			for(int i = 0; i <= mass.length-1; i++){
				if(mass[i]%2==0)
					even++;
			}
			return even;
	}
/**
 * 9. error_text.
 * */
	public static void changeMinWithMax(int[] mass){
		int pmin = positionMinEl(mass);
		int pmax = positionMaxEl(mass);
		int min = mass[pmin], max = mass[pmax];
		mass[pmin] = max; mass[pmax] = min;
//		return mass;
		}
/**
 * 10. error_text.
 * */
	public static int positionMinEl(int[] mass){
			int min = mass[0];
			int posit = 0;
			for(int i = 0; i <= mass.length-1; i++){
				if(mass[i] < min){
					min = mass[i];
					posit = i;
					}
			}
			return posit;
	}
/**
 * 11. error_text.
 * */
	public static int positionMaxEl(int[] mass){
		int max = mass[0];
		int posit = 0;
		for(int i = 0; i <= mass.length-1; i++){
			if(mass[i] > max){
				max = mass[i];
				posit = i;
				}
		}
		return posit;
	}
/**
 * 12. error_text.
 * */
	public static void sortOfMinToMax(int[] arr){
		//error_text
		for(int k = 1; k <= arr.length-1; k++){
			for(int i = 0; i <= arr.length-1-k; i++){
				if(arr[i] > arr[i+1]){
					int a = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = a;
				}
			}
		}
	}
/**
 * 13. error_text.
 * */
	public static void sortOfMaxToMin(int[] arr){
		//error_text
		for(int k = 1; k <= arr.length-1; k++){
			for(int i = 0; i <= arr.length-1-k; i++){
				if(arr[i] < arr[i+1]){
					int a = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = a;
				}
			}
		}
	}

/**
 * 14. error_text.
 * */
	public static void initValue(int[] mass){
		for(int i = 0; i <= mass.length-1; i++){
				mass[i] = Integer.parseInt(JOptionPane.showInputDialog("Ââåäèòå A["+i+"] ýëåìåíò:"));
			}
//		return mass;
	}
/**
 * 15. error_text.
 * */
	public static int[] initValForm(int[] arr){
		try{
			new InitVectorForm(arr).setVisible(true);
		}catch(NumberFormatException exc){
			JOptionPane.showMessageDialog(null, "\n"+exc);
		}
		return arr;
	}
}
