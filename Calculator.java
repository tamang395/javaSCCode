import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
JFrame frame;
JTextField textfield;
JButton[] numberButtons = new JButton[10];
JButton[] functionButtons = new JButton[8];
JButton addButton, subButton, multButton, divButton;
JButton decButton, equButton, delButton, clrButton;
JPanel panel;

Font myFont = new Font("Ink Free", Font.BOLD,30);
double num1 = 0, num2 = 0, result = 0;
char operator;

Calculator() {
frame = new JFrame("Calculator");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(420,550);
frame.setLayout(null);
frame.setVisible(true);

textfield = new JTextField();
textfield.setBounds(50,25,300,50);
textfield.setFont(myFont);
textfield.setEditable(false); 
}
public static void main(String args[]) {
Calculator cal = new Calculator();
}
public void actionPerformed(ActionEvent e) {

}
}

