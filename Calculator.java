
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField inputField;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton b0;
    JButton badd;
    JButton bsub;
    JButton bmul;
    JButton bdiv;
    JButton bdel;
    JButton beq;
    JButton bclr;

    JButton[] operatorButtons;
    JButton equalsButton, clearButton;
    String currentInput = "";
    String operator = "";
    double firstOperand = 0;
    boolean isResultDisplayed = false;
    JPanel calcPanel;

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        calcPanel = new JPanel();
        calcPanel.setLayout(null);   // Manual bounds inside panel
        calcPanel.setBounds(150, 100, 320, 400); // Initial position
        calcPanel.setBackground(Color.LIGHT_GRAY); // light blue

        add(calcPanel);

        inputField = new JTextField();
        inputField.setBounds(10, 10, 260, 40);
        calcPanel.add(inputField);
        /*numberButtons[i] = new JButton(String.valueOf(i));*/
        b1 = new JButton("1");
        b1.setBounds(10, 60, 50, 50);
        calcPanel.add(b1);
        b2 = new JButton("2");
        b2.setBounds(70, 60, 50, 50);
        calcPanel.add(b2);
        
        b3 = new JButton("3");
        b3.setBounds(130, 60, 50, 50);
        calcPanel.add(b3);
        b4 = new JButton("4");
        b4.setBounds(10, 120, 50, 50);
        calcPanel.add(b4);
        b5 = new JButton("5");
        b5.setBounds(70, 120, 50, 50);
        calcPanel.add(b5);
        b6 = new JButton("6");
        b6.setBounds(130, 120, 50, 50);
        calcPanel.add(b6);
        b7 = new JButton("7");
        b7.setBounds(10, 180, 50, 50);
        calcPanel.add(b7);
        b8 = new JButton("8");
        b8.setBounds(70, 180, 50, 50);
        calcPanel.add(b8);
        b9 = new JButton("9");
        b9.setBounds(130, 180, 50, 50);
        calcPanel.add(b9);
        b0 = new JButton("0");
        b0.setBounds(70, 240, 50, 50);
        calcPanel.add(b0);
        badd = new JButton("+");
        badd.setBounds(190, 60, 50, 50);
        calcPanel.add(badd);
        bsub = new JButton("-");
        bsub.setBounds(190, 120, 50, 50);
        calcPanel.add(bsub);
        bmul = new JButton("*");
        bmul.setBounds(190, 180, 50, 50);
        calcPanel.add(bmul);
        bdiv = new JButton("/");
        bdiv.setBounds(190, 240, 50, 50);
        calcPanel.add(bdiv);
        
        beq = new JButton("=");
        beq.setBounds(190, 300, 50, 50);
        beq.setBackground(Color.ORANGE); 
        calcPanel.add(beq);
        bclr = new JButton("CLR");
        bclr.setBounds(10, 300, 110, 50);
        calcPanel.add(bclr);
        bdel = new JButton("<=");
        bdel.setBounds(130, 240, 50, 50);
        calcPanel.add(bdel);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bdel.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);


        // Add more components as needed
        setLocationRelativeTo(null);

        setVisible(true);
    }

    public void actionPerformed (ActionEvent e){
     if(e.getSource() == b1){
    if (isResultDisplayed) {
        currentInput = "";
        isResultDisplayed = false;
    }
    currentInput += "1";
    inputField.setText(currentInput);
}
else if(e.getSource() == b2){
    if (isResultDisplayed) {
        currentInput = "";
        isResultDisplayed = false;
    }
    currentInput += "2";
    inputField.setText(currentInput);
}
else if(e.getSource() == b3){
    if (isResultDisplayed) {
        currentInput = "";
        isResultDisplayed = false;
    }
    currentInput += "3";
    inputField.setText(currentInput);
}
else if(e.getSource() == b4){
    if (isResultDisplayed) {
        currentInput = "";
        isResultDisplayed = false;
    }
    currentInput += "4";
    inputField.setText(currentInput);
}
else if(e.getSource() == b5){
    if (isResultDisplayed) {
        currentInput = "";
        isResultDisplayed = false;
    }
    currentInput += "5";
    inputField.setText(currentInput);
}
else if(e.getSource() == b6){
    if (isResultDisplayed) {
        currentInput = "";
        isResultDisplayed = false;
    }
    currentInput += "6";
    inputField.setText(currentInput);
}
else if(e.getSource() == b7){
    if (isResultDisplayed) {
        currentInput = "";
        isResultDisplayed = false;
    }
    currentInput += "7";
    inputField.setText(currentInput);
}
else if(e.getSource() == b8){
    if (isResultDisplayed) {
        currentInput = "";
        isResultDisplayed = false;
    }
    currentInput += "8";
    inputField.setText(currentInput);
}
else if(e.getSource() == b9){
    if (isResultDisplayed) {
        currentInput = "";
        isResultDisplayed = false;
    }
    currentInput += "9";
    inputField.setText(currentInput);
}
else if(e.getSource() == b0){
    if (isResultDisplayed) {
        currentInput = "";
        isResultDisplayed = false;
    }
    currentInput += "0";
    inputField.setText(currentInput);
}

        else if(e.getSource() == badd){
            firstOperand = Double.parseDouble(currentInput);
            operator = "+";
            currentInput = "";
            inputField.setText(currentInput);
        }
        else if(e.getSource() == bsub){
            firstOperand = Double.parseDouble(currentInput);
            operator = "-";
            currentInput = "";
            inputField.setText(currentInput);
        }
        else if(e.getSource() == bmul){
            firstOperand = Double.parseDouble(currentInput);
            operator = "*";
            currentInput = "";
            inputField.setText(currentInput);
        }
        else if(e.getSource() == bdiv){
            firstOperand = Double.parseDouble(currentInput);
            operator = "/";
            currentInput = "";
            inputField.setText(currentInput);
        }
            else if (e.getSource() == beq){
                double secondOperand = Double.parseDouble(currentInput);
                double result = 0;
                switch (operator){
                    case "+":
                        result = firstOperand + secondOperand;
                        break;
                    case "-":
                        result = firstOperand - secondOperand;
                        break;
                    case "*":
                        result = firstOperand * secondOperand;
                        break;
                    case "/":
                        if (secondOperand != 0){
                            result = firstOperand / secondOperand;
                        } else {
                            inputField.setText("Error: Div by 0");
                            return;
                        }
                        break;
                }
                inputField.setText(String.valueOf(result));
                currentInput = String.valueOf(result);
                operator = "";
                firstOperand = 0;
                isResultDisplayed = true;
            }
            else if (e.getSource() == bclr){
                currentInput = "";
                operator = "";
                firstOperand = 0;
                inputField.setText(currentInput);
            }
            else if (e.getSource() == bdel){
                String sampleinput="";
                if (currentInput.length() > 0){
                    for(int i=0; i<currentInput.length()-1; i++){
                       sampleinput += currentInput.charAt(i);
                    }  
                currentInput = sampleinput;     
            }
                inputField.setText(currentInput);
            }

    }

    public static void main(String[] args) {
        new Calculator();

    }
}
