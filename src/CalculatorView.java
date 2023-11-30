import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class CalculatorView extends JFrame{
    private JTextField firstNumber = new JTextField(5);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(5);
    private JButton calculateButton1 = new JButton("Add");
    private JButton calculateButton2 = new JButton("Sub");
    private JButton calculateButton3 = new JButton("Mul");
    private JButton calculateButton4 = new JButton("Div");
    private JTextField calcSolution = new JTextField(10);
    public CalculatorView(){
// Sets up the view and adds the components
        JPanel panel = new JPanel();
        this.setTitle("MVC Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        panel.setBackground(Color.GRAY);
        panel.add(firstNumber);

        panel.add(secondNumber);
        panel.add(calculateButton1);
        panel.add(calculateButton2);
        panel.add(calculateButton3);
        panel.add(calculateButton4);

        panel.add(calcSolution);
        this.add(panel);
    }
    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }
    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }
    public int getCalcSolution(){
        return Integer.parseInt(calcSolution.getText());
    }
    public void setCalcSolution(float solution){
        calcSolution.setText(Integer.toString((int) solution));
    }
    // If the calculateButton is clicked execute a method
// in the Controller named actionPerformed
    void addCalculateListener(ActionListener listenForCalcButton){
        calculateButton1.addActionListener(listenForCalcButton);
    }

    void subCalculateListener(ActionListener listenForCalcButton){
        calculateButton2.addActionListener(listenForCalcButton);
    }

    void mulCalculateListener(ActionListener listenForCalcButton){
        calculateButton3.addActionListener(listenForCalcButton);
    }

    void divCalculateListener(ActionListener listenForCalcButton){
        calculateButton4.addActionListener(listenForCalcButton);
    }
    // Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }


}