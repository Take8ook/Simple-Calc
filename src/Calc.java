import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    private JPanel Calc;
    private JTextField textDisplay;
    private JButton buttonEqual;
    private JButton ACButton;
    private JButton buttonDivision;
    private JButton buttonMultiplication;
    private JButton buttonMinus;
    private JButton buttonBackspace;
    private JButton buttonPlus;
    private JButton button9;
    private JButton buttonSqrt;
    private JButton button6;
    private JButton button3;
    private JButton buttonDot;
    private JButton button0;
    private JButton button2;
    private JButton button5;
    private JButton button8;
    private JButton button7;
    private JButton button4;
    private JButton button1;
    private JButton buttonAnswer;

    double a, b, res = 0.;
    int counter = 0;
    String operation;

    public Calc() {

        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (textDisplay.getText().length() > 0)
                        Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(textDisplay.getText() + "1");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (textDisplay.getText().length() > 0)
                        Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(textDisplay.getText() + "2");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (textDisplay.getText().length() > 0)
                        Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(textDisplay.getText() + "3");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (textDisplay.getText().length() > 0)
                        Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(textDisplay.getText() + "4");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (textDisplay.getText().length() > 0)
                        Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(textDisplay.getText() + "5");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (textDisplay.getText().length() > 0)
                        Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(textDisplay.getText() + "6");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (textDisplay.getText().length() > 0)
                        Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(textDisplay.getText() + "7");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (textDisplay.getText().length() > 0)
                        Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(textDisplay.getText() + "8");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (textDisplay.getText().length() > 0)
                        Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(textDisplay.getText() + "9");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (textDisplay.getText().length() > 0)
                        Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(textDisplay.getText() + "0");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textDisplay.getText().contains("."))
                    textDisplay.setText(textDisplay.getText() + ".");
            }
        });
        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    a = Double.parseDouble(textDisplay.getText());
                    operation = "+";
                    textDisplay.setText("");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    a = Double.parseDouble(textDisplay.getText());
                    operation = "-";
                    textDisplay.setText("");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        buttonMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    a = Double.parseDouble(textDisplay.getText());
                    operation = "×";
                    textDisplay.setText("");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    a = Double.parseDouble(textDisplay.getText());
                    operation = "÷";
                    textDisplay.setText("");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        buttonSqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tStr = textDisplay.getText();
                    if (textDisplay.getText().length() > 0) {
                        a = Double.parseDouble(tStr);
                        if (a >= 0) {
                            res = Math.sqrt(a);
                            textDisplay.setText(String.valueOf(res));
                        } else textDisplay.setText("Error! You cannot extract the root from a negative number");
                    }
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        buttonBackspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String backspace = null;
                    String tStr = textDisplay.getText();
                    int len = tStr.length();

                    if (len > 0) {
                        StringBuilder strB = new StringBuilder(tStr);
                        strB.deleteCharAt(len - 1);
                        backspace = String.valueOf(strB);
                        textDisplay.setText(backspace);
                    }
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        buttonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    b = Double.parseDouble(textDisplay.getText());
                    Boolean isNullDiv = b == 0 && operation == "÷";
                    Boolean isDefault = operation == null;
                    if (!isDefault)
                        switch (operation) {
                            case "+":
                                res = a + b;
                                break;
                            case "-":
                                res = a - b;
                                break;
                            case "×":
                                res = a * b;
                                break;
                            case "÷":
                                if (!isNullDiv)
                                    res = a / b;
                                break;
                            default:
                                isDefault = Boolean.TRUE;
                                break;
                        }
                    if (!isDefault)
                        if (!isNullDiv)
                            textDisplay.setText(String.valueOf(res));
                        else textDisplay.setText("Error! You cannot divide by null!");
                    else textDisplay.setText("Error! You have entered nothing.");
                } catch (NumberFormatException ex){
                    textDisplay.setText("For restarting of calculating press AC.");
                }
            }
        });
        buttonAnswer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().length() == 0)
                    textDisplay.setText(String.valueOf(res));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calc");
        frame.setContentPane(new Calc().Calc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
