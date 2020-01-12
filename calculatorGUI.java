package cp213;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculatorGUI extends JFrame{
	
	private JButton jbtNum0;
	private JButton jbtNum1;
	private JButton jbtNum2;
	private JButton jbtNum3;
	private JButton jbtNum4;
	private JButton jbtNum5;
	private JButton jbtNum6;
	private JButton jbtNum7;
	private JButton jbtNum8;
	private JButton jbtNum9;
	private JButton jbtDummy1;
	private JButton jbtDummy2;
	private JButton jbtDummy3;
	private JButton jbtDummy4;
	private JButton jbtEquals;
	private JButton jbtPlus;
	private JButton jbtMinus;
	private JButton jbtTimes;
	private JButton jbtDivide;
	private JButton jbtClear;
	private JTextField jtfCalc;
	private JTextField jtfResult;
	private String display = "";
	private String result = "";
	private double TEMP;
	private boolean addBool = false;
	private boolean subBool = false;
	private boolean mulBool = false;
	private boolean divBool = false;
	private boolean locate = false;
	private boolean many = false;
    private double SolveTEMP;
    
	
    /**
	* Adds buttons, text fields, panels and other components to the GUI and implements each of them.
	*
	* 
	* @author Keven Iskander 160634540
	* @version 1.0
	* @since 03/21/2018
	* 
	*/
	public calculatorGUI(){
		
		JFrame frame = new JFrame("");
		frame.setSize(200,12);
		
		JPanel p1 = new JPanel();
		
        p1.setLayout(new GridLayout(4, 5));
        p1.add(jbtNum7 = new JButton("7"));
        p1.add(jbtNum8 = new JButton("8"));
        p1.add(jbtNum9 = new JButton("9"));
        p1.add(jbtDivide = new JButton("/"));
        p1.add(jbtClear = new JButton("C"));
        p1.add(jbtNum4 = new JButton("4"));
        p1.add(jbtNum5 = new JButton("5"));
        p1.add(jbtNum6 = new JButton("6"));
        p1.add(jbtTimes = new JButton("*"));
        p1.add(jbtDummy1 = new JButton(""));
        p1.add(jbtNum1 = new JButton("1"));
        p1.add(jbtNum2 = new JButton("2"));
        p1.add(jbtNum3 = new JButton("3"));
        p1.add(jbtMinus = new JButton("-"));
        p1.add(jbtDummy2 = new JButton(""));
        p1.add(jbtDummy3 = new JButton(""));
        p1.add(jbtNum0 = new JButton("0"));
        p1.add(jbtDummy4 = new JButton(""));
        p1.add(jbtPlus = new JButton("+"));
        p1.add(jbtEquals = new JButton("="));
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2,1));
        
        p2.add(jtfCalc = new JTextField(15));
        p2.add(jtfResult = new JTextField(15));
        
        jtfCalc.setHorizontalAlignment(JTextField.CENTER);
        jtfResult.setHorizontalAlignment(JTextField.CENTER);
        jtfCalc.setEditable(false);
        jtfResult.setEditable(false);
        jtfCalc.setLocation(0, 10);
        
        
        JLayeredPane p = new JLayeredPane();
        p.setLayout(new GridLayout(2,2));
        p.add(p2);
        p.add(p1);
        

        add(p);
        jbtNum1.addActionListener(new ListenToOne());
        jbtNum2.addActionListener(new ListenToTwo());
        jbtNum3.addActionListener(new ListenToThree());
        jbtNum4.addActionListener(new ListenToFour());
        jbtNum5.addActionListener(new ListenToFive());
        jbtNum6.addActionListener(new ListenToSix());
        jbtNum7.addActionListener(new ListenToSeven());
        jbtNum8.addActionListener(new ListenToEight());
        jbtNum9.addActionListener(new ListenToNine());
        jbtNum0.addActionListener(new ListenToZero());
        jbtPlus.addActionListener(new ListenToPlus());
        jbtMinus.addActionListener(new ListenToMinus());
        jbtTimes.addActionListener(new ListenToTimes());
        jbtDivide.addActionListener(new ListenToDivide());
        jbtEquals.addActionListener(new ListenToEquals());
        jbtClear.addActionListener(new ListenToClear());
		
	}
	
	class ListenToOne implements ActionListener {
		
		/**
		* Displays the number 1 to the first java text field.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* 
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
            display = jtfCalc.getText();
            jtfCalc.setText(display + "1");
            locate = true;
            if (addBool == true || subBool == true || mulBool == true || divBool == true) {
            	result += "1";
            	
            }
        }
    }
    class ListenToTwo implements ActionListener {
    	/**
		* Displays the number 2 to the first java text field.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* 
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
            display = jtfCalc.getText();
            jtfCalc.setText(display + "2");
            locate = true;
            if (addBool == true || subBool == true || mulBool == true || divBool == true) {
            	result += "2";
            	
            }
        }
    }
    class ListenToThree implements ActionListener {
    	/**
		* Displays the number 3 to the first java text field.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* 
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
            display = jtfCalc.getText();
            jtfCalc.setText(display + "3");
            locate = true;
            if (addBool == true || subBool == true || mulBool == true || divBool == true) {
            	result += "3";
            	
            }
        }
    }
    class ListenToFour implements ActionListener {
    	/**
		* Displays the number 4 to the first java text field.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* 
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
            display = jtfCalc.getText();
            jtfCalc.setText(display + "4");
            locate = true;
            if (addBool == true || subBool == true || mulBool == true || divBool == true) {
            	result += "4";

            }
        }
    }
    class ListenToFive implements ActionListener {
    	/**
		* Displays the number 5 to the first java text field.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* 
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
            display = jtfCalc.getText();
            jtfCalc.setText(display + "5");
            locate = true;
            if (addBool == true || subBool == true || mulBool == true || divBool == true) {
            	result += "5";
            	
            }
        }
    }
    class ListenToSix implements ActionListener {
    	/**
		* Displays the number 6 to the first java text field.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* 
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
            display = jtfCalc.getText();
            jtfCalc.setText(display + "6");
            locate = true;
            if (addBool == true || subBool == true || mulBool == true || divBool == true) {
            	result += "6";
            	
            }
        }
    }
    class ListenToSeven implements ActionListener {
    	/**
		* Displays the number 7 to the first java text field.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* 
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
            display = jtfCalc.getText();
            jtfCalc.setText(display + "7");
            locate = true;
            if (addBool == true || subBool == true || mulBool == true || divBool == true) {
            	result += "7";
            	
            }
        }
    }
    class ListenToEight implements ActionListener {
    	/**
		* Displays the number 8 to the first java text field.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* 
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
            display = jtfCalc.getText();
            jtfCalc.setText(display + "8");
            locate = true;
            if (addBool == true || subBool == true || mulBool == true || divBool == true) {
            	result += "8";
            	
            }
        }
    }
    class ListenToNine implements ActionListener {
    	/**
		* Displays the number 9 to the first java text field.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* 
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
            display = jtfCalc.getText();
            jtfCalc.setText(display + "9");
            locate = true;
            if (addBool == true || subBool == true || mulBool == true || divBool == true) {
            	result += "9";
            	
            }
        }
    }
    class ListenToZero implements ActionListener {
    	/**
		* Displays the number 0 to the first java text field.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* 
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
            display = jtfCalc.getText();
            jtfCalc.setText(display + "0");
            locate = true;
            if (addBool == true || subBool == true || mulBool == true || divBool == true) {
            	result += "0";
        
            }
        }
    }
    class ListenToPlus implements ActionListener {
    	/**
		* Displays "+" next to the current display.
		* If the "+" operator is not preceded or followed by a number, the calculation cannot be completed.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* @throws NumberFormatException
		* Throws when an invalid number format is entered.
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
        	if (locate == true && (addBool == false && subBool == false && mulBool == false && divBool == false)) {
        		try{
        			TEMP += Double.parseDouble(jtfCalc.getText());
        			addBool = true;
        		}
        		catch(NumberFormatException e1) {
        			TEMP+=0;
        		}
        	}
        	else {
        		many = true;
        	}
            display = jtfCalc.getText();
            jtfCalc.setText(display + "+");
            

        }
    }
    class ListenToMinus implements ActionListener {
    	/**
		* Displays "-" next to the current display.
		* If the "-" operator is not preceded or followed by a number, the calculation cannot be completed.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* @throws NumberFormatException
		* Throws when an invalid number format is entered.
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
        	if (locate == true && (addBool == false && subBool == false && mulBool == false && divBool == false)) {
        		try{
        			TEMP += Double.parseDouble(jtfCalc.getText());
        			subBool = true;
        		}
        		catch(NumberFormatException e1) {
        			TEMP+=0;
        		}
        	}
        	else {
        		many = true;
        	}
        	display = jtfCalc.getText();
            jtfCalc.setText(display + "-");
            
        }
    }
    class ListenToTimes implements ActionListener {
    	/**
		* Displays "*" next to the current display.
		* If the "*" operator is not preceded or followed by a number, the calculation cannot be completed.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* @throws NumberFormatException
		* Throws when an invalid number format is entered.
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
        	if (locate == true && (addBool == false && subBool == false && mulBool == false && divBool == false)) {
        		try {
        			TEMP += Double.parseDouble(jtfCalc.getText());
        			mulBool = true;
        		}
        		catch(NumberFormatException e1) {
        			TEMP+=0;
        		}
        	}
        	else {
        		many = true;
        	}
        	display = jtfCalc.getText();
            jtfCalc.setText(display + "*");
            
        }
    }
    class ListenToDivide implements ActionListener {
    	/**
		* Displays "/" next to the current display.
		* If the "/" operator is not preceded or followed by a number, the calculation cannot be completed.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* @throws NumberFormatException
		* Throws when an invalid number format is entered.
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
        	if (locate == true && (addBool == false && subBool == false && mulBool == false && divBool == false)) {
        		try{
        			TEMP += Double.parseDouble(jtfCalc.getText());
        			divBool = true;
        		}
        		catch(NumberFormatException e1) {
        			TEMP+=0;
        		}
        	}
        	else {
        		many = true;
        	}
        	display = jtfCalc.getText();
            jtfCalc.setText(display + "/");
            
        }
    }
    class ListenToClear implements ActionListener {
    	/**
		* Clears both java text fields and resets the values or operators entered into the calculator.
		* 
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
        	jtfCalc.setText(" ");
        	jtfResult.setText(" ");
            display = "";
            locate = false;
            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;
            
            
        }
    }
    class ListenToEquals implements ActionListener {
    	/**
		* Performs the operation if all the requirements are met.
		* The operators have to be followed or preceded by a number.
		* Empty text field return 0.0.
		* text field which contains only numbers will return those numbers.
		* 
		* @throws NumberFormatException
		* Throws when an invalid number format is entered.
		* @param ActionEvent e
		* Java ActionEvent (implemented from ActionListener)
		* @author Keven Iskander 160634540
		* @version 1.0
		* @since 03/21/2018
		* 
		*/
        public void actionPerformed(ActionEvent e) {
        	try {
	        	if (locate == true && TEMP == 0&& result!="") {
	        		
	        		SolveTEMP = Double.parseDouble(jtfCalc.getText());
	        	}
	        	else if (many == true) {
	        		SolveTEMP = 0.0;
	        	}
	        	else if (addBool == true && locate == true && result!="") {
	            	SolveTEMP = TEMP + Double.parseDouble(result);
	            	
	            }
	            else if ( subBool == true && locate == true) {
	            	SolveTEMP = -Double.parseDouble(result) + TEMP;
	            	
	            }
	            else if ( mulBool == true && locate == true) {
	            	SolveTEMP = TEMP * Double.parseDouble(result);
	            }
	            else if ( divBool == true && locate == true) {
	            	SolveTEMP = TEMP / Double.parseDouble(result);
	            }
	            else if (jtfResult.getText()==""||locate == false || many == true) {
	            	SolveTEMP = 0;
	            	jtfResult.setText(Double.toString(0.0));
	            }
	            else if (locate == false && (addBool == true || subBool == true || mulBool == true || divBool == true)) {
	            	jtfResult.setText(Double.toString(0.0));
	            }
	            else if (addBool == false && subBool == false && mulBool == false && divBool == false) {
	            	jtfResult.setText(jtfCalc.getText());
	            }
	            
        	}
        	catch(NumberFormatException e1) {
        		SolveTEMP = 0.0;
        	}
        	jtfResult.setText(Double.toString(SolveTEMP));
            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;
            SolveTEMP = 0;
            result = "";
            locate = false;
            display = "";
            TEMP = 0;
            many = false;
            jtfCalc.setText("");
            
        }
    }
    /**
    *Sets the size of the window, the visibility of the window, the exit command and creates new calculatorGUI object. 
    * 
	* @param args
	* Arguments
	* 
	* @author Keven Iskander 160634540
	* @version 1.0
	* @since 03/21/2018
	*/
	public static void main(String[] args) {
		
        
        calculatorGUI calc = new calculatorGUI();
        calc.setSize(280,360);
        
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }


}