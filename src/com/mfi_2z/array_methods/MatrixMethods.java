/**
 * error_text:
 * 1. error_text().
 * 2. error_text.
 * 3. error_text.
 * 4. error_text.
 * 5. error_text.
 * 6. error_text.
 * 7. error_text.
 * 8. error_text.
 * 9. error_text.
 */
package com.mfi_2z.array_methods;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MatrixMethods{
/**
 * 1. error_text().
 * */
	public static String arrPrint(int[][] arr){
		String arrstr = "";
		for(int i = 0; i <= arr.length-1; i++){
			int count = 0;
			for(int j = 0; j <= arr[i].length-1; j++){
				arrstr += arr[i][j] + ", ";
				count++;
				if(count == arr[i].length){
					arrstr += "\n ";
					count = 0;
				}
			}
		}			
		arrstr = "["+arrstr.substring(0, arrstr.length()-4) + 
				arrstr.substring(arrstr.length()-4).replace(",", "]");
		return arrstr;
	}
	public static String arrPrint(String[][] arr){
		String arrstr = "";
		for(int i = 0; i <= arr.length-1; i++){
			int count = 0;
			for(int j = 0; j <= arr[i].length-1; j++){
				arrstr += arr[i][j] + ", ";
				count++;
				if(count == arr[i].length){
					arrstr += "\n ";
					count = 0;
				}
			}
			}
		arrstr = "["+arrstr.substring(0, arrstr.length()-4) + 
				arrstr.substring(arrstr.length()-4).replace(",", "]");
		return arrstr;
	}
/**
 * 2. error_text.
 * */
	public static int[][] arrCopy(int[][] arr){
		int[][] arrC = new int[arr.length][arr[0].length];
		for(int i = 0; i <= arr.length-1; i++){
			for(int j = 0; j <= arr[i].length-1; j++){
				arrC[i][j] = arr[i][j];
				}
			}
		return arrC;
	}
	public static String[][] arrCopy(String[][] arr){
		String[][] arrC = new String[arr.length][arr[0].length];
		for(int i = 0; i <= arr.length-1; i++)
			for(int j = 0; j <= arr[i].length-1; j++)
			arrC[i][j] = arr[i][j];
		return arrC;
	}
/**
 * 3. error_text.
 * */
	public static int[][] randomValue(int[][] mass){
		for(int i = 0; i <= mass.length-1; i++){
			for(int j = 0; j <= mass[i].length-1; j++){
				if(j%3 == 0)
					mass[i][j] = (int) Math.pow(-21*Math.random(), i);
				else
					mass[i][j] = (int) Math.pow(-21*Math.random(), j);
			}
		}
		return mass;
	}
/**
 * 4. error_text.
 */
	public static int[] amountNegSignValue(int[][] A){
		int row = A.length;
		int col = A[0].length;
		int[] B = new int[col];
				for(int j = 0; j < col; j++){
					int k = 0;
					for(int i = 0; i < row; i++){
						if(A[i][j] < 0){
							k++;
						}
						B[j] = k;
					}
				}
		return B;
	}
/**
 * 5. error_text.
 * */
	public static int[][] initValue(int[][] mass){
		for(int i = 0; i <= mass.length-1; i++){
			for(int j = 0; j <= mass[i].length-1; j++){
//				System.out.print("error_text A["+i+"]["+j+"] error_text: "); 
//				A[i][j] = in.nextInt();
//				System.out.println();
				mass[i][j] = Integer.parseInt(JOptionPane.showInputDialog("error_text A["+i+"]["+j+"] error_text:"));
			}
		}
		return mass;
	}
/**
 * 6. error_text.
 * */
	public static int[][] initValForm(int[][] arr){
		try{
			new InitMatrixForm(arr).setVisible(true);
		}catch(NumberFormatException exc){
			JOptionPane.showMessageDialog(null, "\n"+exc);
		}
		return arr;
	}
/**
 * 7. error_text.
 * */
	public static void sortMatrOfMaxToMin(int[][] arr, int[] vect){
		//error_text
		for(int k = 1; k <= arr.length-1; k++){
			for(int i = 0; i <= arr.length-1-k; i++){
				if(vect[i] < vect[i+1]){
					int x = vect[i];
					vect[i] = vect[i+1];
					vect[i+1] = x;
					for(int j = 0; j <= arr.length-1; j++){
						x = arr[i][j];
						arr[i][j] = arr[i+1][j];
						arr[i+1][j] = x;
					}
				}
			}
		}
	}
	public static int[][] sortMatrOfMaxToMin(int[][] arr){
		int[] vect = summOfRows(arr);
		//error_text
		for(int k = 1; k <= arr.length-1; k++){
			for(int i = 0; i <= arr.length-1-k; i++){
				if(vect[i] < vect[i+1]){
					int x = vect[i];
					vect[i] = vect[i+1];
					vect[i+1] = x;
					for(int j = 0; j <= arr.length-1; j++){
						x = arr[i][j];
						arr[i][j] = arr[i+1][j];
						arr[i+1][j] = x;
					}
				}
			}
		}
		return arr;
	}
/**
 * 8. error_text.
 * */
	public static void sortMatrOfMinToMax(int[][] arr, int[] vect){
		//error_text
		for(int k = 1; k <= arr.length-1; k++){
			for(int i = 0; i <= arr.length-1-k; i++){
				if(vect[i] > vect[i+1]){
					int x = vect[i];
					vect[i] = vect[i+1];
					vect[i+1] = x;
					for(int j = 0; j <= arr.length-1; j++){
						x = arr[i][j];
						arr[i][j] = arr[i+1][j];
						arr[i+1][j] = x;
					}
				}
			}
		}
	}
	public static int[][] sortMatrOfMinToMax(int[][] arr){
		int[] vect = summOfRows(arr);
		//error_text
		for(int k = 1; k <= arr.length-1; k++){
			for(int i = 0; i <= arr.length-1-k; i++){
				if(vect[i] > vect[i+1]){
					int x = vect[i];
					vect[i] = vect[i+1];
					vect[i+1] = x;
					for(int j = 0; j <= arr.length-1; j++){
						x = arr[i][j];
						arr[i][j] = arr[i+1][j];
						arr[i+1][j] = x;
					}
				}
			}
		}
		return arr;
	}
/**
 * 9. error_text.
 * */
	public static String summOfRows(int[][] arr, int[] vect){
			for(int i = 0; i <= arr.length-1; i++){
				int summ = 0;
				for(int j = 0; j <= arr.length-1; j++){
					summ += arr[i][j];
				}
				vect[i] = summ;
			}
			return Arrays.toString(vect);
	}
	public static int[] summOfRows(int[][] arr){
		int[] vect = new int[arr.length];
			for(int i = 0; i <= arr.length-1; i++){
				int summ = 0;
				for(int j = 0; j <= arr.length-1; j++){
					summ += arr[i][j];
				}
				vect[i] = summ;
			}
			return vect;
	}
}
