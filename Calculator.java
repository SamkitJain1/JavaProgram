package JavaSeries.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    Frame calc;
    Button n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, dot, plus, minus, divide, multi, bspace, equals, clear;
    TextField textField;

    float num1, num2, result;
    StringBuilder currentText;

    Calculator(){
        calc = new Frame("Calculator");
        calc.setVisible(true);
        calc.setSize(400, 500);

        n1 = new Button("1");
        n1.addActionListener(this);
        n2 = new Button("2");
        n2.addActionListener(this);
        n3 = new Button("3");
        n3.addActionListener(this);
        n4 = new Button("4");
        n4.addActionListener(this);
        n5 = new Button("5");
        n5.addActionListener(this);
        n6 = new Button("6");
        n6.addActionListener(this);
        n7 = new Button("7");
        n7.addActionListener(this);
        n8 = new Button("8");
        n8.addActionListener(this);
        n9 = new Button("9");
        n9.addActionListener(this);
        n0 = new Button("0");
        n0.addActionListener(this);
        dot = new Button(".");
        dot.addActionListener(this);
        plus = new Button("+");
        plus.addActionListener(this);
        minus = new Button("-");
        minus.addActionListener(this);
        divide = new Button("/");
        divide.addActionListener(this);
        multi  =  new Button("x");
        multi.addActionListener(this);
        bspace = new Button("<--");
        bspace.addActionListener(this);
        equals = new Button("=");
        equals.addActionListener(this);
        clear = new Button("C");
        clear.addActionListener(this);
        textField = new TextField(45);
        currentText = new StringBuilder();

        GridLayout gridLayout = new GridLayout(5, 4);
        gridLayout.setHgap(3);
        gridLayout.setVgap(3);

        Panel upperPanel = new Panel();
        Panel lowerPanel = new Panel(gridLayout);

        calc.add(upperPanel, BorderLayout.NORTH);
        calc.add(lowerPanel, BorderLayout.SOUTH);

        textField.setSize(30, 400);
        upperPanel.add(textField);

        lowerPanel.add(new Button());
        lowerPanel.add(clear);
        lowerPanel.add(bspace);
        lowerPanel.add(divide);

        lowerPanel.add(n7);
        lowerPanel.add(n8);
        lowerPanel.add(n9);
        lowerPanel.add(multi);

        lowerPanel.add(n4);
        lowerPanel.add(n5);
        lowerPanel.add(n6);
        lowerPanel.add(minus);

        lowerPanel.add(n1);
        lowerPanel.add(n2);
        lowerPanel.add(n3);
        lowerPanel.add(plus);

        lowerPanel.add(new Button());
        lowerPanel.add(n0);
        lowerPanel.add(dot);
        lowerPanel.add(equals);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Button b = (Button) e.getSource();

        if (b == n1){
            currentText.append(1);
            textField.setText(currentText.toString());
        }

        else if (b == n2){
            currentText.append(2);
            textField.setText(currentText.toString());
        }

        else if (b == n3){
            currentText.append(3);
            textField.setText(currentText.toString());
        }

        else if (b == n4){
            currentText.append(4);
            textField.setText(currentText.toString());
        }

        else if (b == n5){
            currentText.append(5);
            textField.setText(currentText.toString());
        }

        else if (b == n6){
            currentText.append(6);
            textField.setText(currentText.toString());
        }

        else if (b == n7){
            currentText.append(7);
            textField.setText(currentText.toString());
        }

        else if (b == n8){
            currentText.append(8);
            textField.setText(currentText.toString());
        }

        else if (b == n9){
            currentText.append(9);
            textField.setText(currentText.toString());
        }

        else if (b == n0){
            currentText.append(0);
            textField.setText(currentText.toString());
        }

        else if (b == divide){
            try {
                num1 = Integer.parseInt(currentText.toString());
            }
            catch (Exception e1){
                num1 = Float.parseFloat(currentText.toString());
            }
            currentText.append(" / ");
            textField.setText(currentText.toString());
        }

        else if (b == multi){
            try {
                num1 = Integer.parseInt(currentText.toString());
            }
            catch (Exception e1){
                num1 = Float.parseFloat(currentText.toString());
            }
            currentText.append(" x ");
            textField.setText(currentText.toString());
        }

        else if (b == plus){
            try {
                num1 = Integer.parseInt(currentText.toString());
            }
            catch (Exception e1){
                num1 = Float.parseFloat(currentText.toString());
            }
            currentText.append(" + ");
            textField.setText(currentText.toString());
        }

        else if (b == minus){
            try {
                num1 = Integer.parseInt(currentText.toString());
            }
            catch (Exception e1){
                num1 = Float.parseFloat(currentText.toString());
            }
            currentText.append(" - ");
            textField.setText(currentText.toString());
        }

        else if (b == equals){
            String[] srr = currentText.toString().split(" ");
            num2 = Integer.parseInt(srr[2]);

            String operator = srr[1];

            currentText.setLength(0);

            switch (operator) {
                case "+" -> {
                    result = num1 + num2;
                    currentText.append((int) result);
                }
                case "-" -> {
                    result = num1 - num2;
                    currentText.append((int) result);
                }
                case "/" -> {
                    result = num1 / num2;
                    currentText.append(result);
                }
                case "x" -> {
                    result = num1 * num2;
                    currentText.append(result);
                }
            }
            textField.setText(currentText.toString());
        }

        else if (b == clear){
            currentText.setLength(0);
            textField.setText("");
        }

        else if (b == dot){
            currentText.append(".");
            textField.setText(currentText.toString());
        }

        else if (b == bspace){
            currentText.delete(currentText.length()-1, currentText.length());
            textField.setText(currentText.toString());
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }

}