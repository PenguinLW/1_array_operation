package com.mfi_2z.matrix;
import java.util.Arrays;
import javax.swing.*;
import static com.mfi_2z.array_methods.MatrixMethods.*;
import java.awt.*;
import java.awt.event.*;

public class MatrixOperation extends JFrame{
	private JLabel[] jlbl = new JLabel[3];
	private JTextField[] jtxt = new JTextField[2];
	private TextArea txtar;
	private JButton[] jbtn = new JButton[11];
	private JPanel[] jpnl = new JPanel[4];
	private int[][] A;
	private int[] B;
	public MatrixOperation(){
		initComponents();
	}
	private void initComponents() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("error_text.");
		this.setLayout(new GridBagLayout());
		GridBagConstraints pen = new GridBagConstraints();
		pen.fill = GridBagConstraints.BOTH;
		pen.insets = new Insets(2,2,2,2);
		
		jlbl[0] = new JLabel("error_text:");
		jlbl[1] = new JLabel("m error_text "); 
		jtxt[0] = new JTextField(3);
		jlbl[2] = new JLabel("n error_text "); 
		jtxt[1] = new JTextField(3);
		
		txtar = new TextArea();
		txtar.setEditable(false);
		
		jbtn[0] = new JButton("error_text");
		jbtn[0].setToolTipText("error_text error_text _ error_text m _ n.");
		jbtn[1] = new JButton("error_text");
		jbtn[1].setToolTipText("error_text error_text error_text error_text (error_text error_text error_text) error_text.");		
		jbtn[2] = new JButton("error_text");
		jbtn[2].setToolTipText("error_text error_text error_text error_text.");
		jbtn[3] = new JButton("error_text");
		jbtn[3].setToolTipText("error_text error_text error_text error_text error_text error_text error_text error_text.");
		jbtn[4] = new JButton("error_text");
		jbtn[4].setToolTipText("error_text error_text error_text error_text.");
		jbtn[5] = new JButton("error_text");
		jbtn[5].setToolTipText("error_text error_text error_text error_text (error_text error_text error_text).");
		jbtn[6] = new JButton("error_text");
		jbtn[6].setToolTipText("error_text error_text error_text (error_text).");
		jbtn[7] = new JButton("error_text error_text");
		jbtn[7].setToolTipText("error_text error_text error_text (error_text error_text).");
		jbtn[8] = new JButton("error_text error_text _ error_text error_text");
		jbtn[8].setToolTipText("error_text error_text error_text (error_text error_text error_text error_text error_text_ error_text).");
		jbtn[9] = new JButton("error_text");
		jbtn[10] = new JButton("error_text");
		
		jpnl[0] = new JPanel();
		for(int i = 0; i <= 2; i++){
			jpnl[0].add(jlbl[i]);
			if(i > 0){
				jpnl[0].add(jtxt[i-1]);
			}
		}
		jpnl[1] = new JPanel();
		jpnl[1].add(txtar);
		
		jpnl[2] = new JPanel();
		jpnl[2].setLayout(new GridLayout(5,1));
		for(int i = 0; i <= jbtn.length-1; i++){
			jpnl[2].add(jbtn[i]);
		}
		jpnl[3] = new JPanel();
		jpnl[3].add(jpnl[1]);
		jpnl[3].add(jpnl[2]);
		
		
		pen.gridx = 0;
		pen.gridy = 0;
		this.add(jpnl[0], pen);
		pen.gridx = 0;
		pen.gridy = 1;
		this.add(jpnl[3], pen);
		
		this.pack();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		jbtn[0].addActionListener(new HandList());
		jbtn[1].addActionListener(new HandList());
		jbtn[2].addActionListener(new HandList());
		jbtn[3].addActionListener(new HandList());
		jbtn[4].addActionListener(new HandList());
		jbtn[5].addActionListener(new HandList());
		jbtn[6].addActionListener(new HandList());
		jbtn[7].addActionListener(new HandList());
		jbtn[8].addActionListener(new HandList());
		jbtn[9].addActionListener(new HandList());
		jbtn[10].addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Runtime.getRuntime().exit(0);
			}
		});
	}
	private class HandList implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try{
				int n = Integer.parseInt(jtxt[0].getText());
				int m = Integer.parseInt(jtxt[1].getText());
					switch(e.getActionCommand()){
					case "error_text":
						A = new int[m][n];
						break;
					case "error_text":
						//error_text
						A = randomValue(A);
						break;
					case "error_text":
						//error_text
						A  = initValForm(A);
						break;
					case "error_text":
						A = initValue(A);
						break;						
					case "error_text":
						//error_text error_text error_text error_text
						B = amountNegSignValue(A);
						txtar.append("error_text error_text error_text error_text error_text:\n"+Arrays.toString(B) + "\n");
						break;
					case "error_text":
						txtar.append("error_text error_text:\n"+arrPrint(A)+"\n");
						break;
					case "error_text":
						A = sortMatrOfMaxToMin(A);
						break;
					case "error_text error_text":
						A = sortMatrOfMinToMax(A);
						break;
					case "error_text error_text _ error_text":
						txtar.append("error_text error_text error_text error_text error_text error_text:\n"+Arrays.toString(summOfRows(A))+"\n");
						break;
					case "error_text":
						for(int i = 0; i <= jtxt.length-1; i++){
							jtxt[i].setText("");
							if(i < 1)
								txtar.setText("");
						}
						break;
//					case "error_text":
//						Runtime.getRuntime().exit(0);
//						break;
					}
			}catch(NumberFormatException exc){
				JOptionPane.showMessageDialog(null,"error_text\n"+exc);
			}catch(NullPointerException exc){
				JOptionPane.showMessageDialog(null,"error_text\n"+exc);
			}			
		}
	}
	public static void main (String[] args){
		new MatrixOperation().setVisible(true);
	}
}
