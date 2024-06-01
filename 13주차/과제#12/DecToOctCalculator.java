package subject_2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecToOctCalculator extends JFrame{
    private JPanel inputPanel;      //입력을 받을 패널
    private JLabel inputLabel;      //입력 안내메시지를 출력할 라벨
    private JTextField inputField;  //입력을 받을 텍스트필드
    private JPanel lowerPanel;      //계산 버튼과 결과를 저장할 패널
    private JButton calcButton;     //계산을 할 버튼
    private JLabel resultLabel;     //결과를 출력할 라벨
    
    public DecToOctCalculator() {
        setTitle("8 진수 변환");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));
        setSize(600, 170);
        
        inputLabel = new JLabel("양의 정수를 입력하세요");
        inputLabel.setHorizontalAlignment(JLabel.CENTER);
        inputLabel.setFont(new Font(getName(), Font.PLAIN , 20));

        inputField = new JTextField();
        inputField.setPreferredSize(new Dimension(300,30));

        calcButton = new JButton("8진수로 변환");

        resultLabel = new JLabel();
        
        inputPanel = new JPanel();
        inputPanel.add(inputLabel);
        inputPanel.add(inputField);

        lowerPanel = new JPanel();
        lowerPanel.add(calcButton);
        lowerPanel.add(resultLabel);

        add(inputPanel);
        add(lowerPanel);

        calcButton.addActionListener(new CalcButton());
        
        setVisible(true);
    }

    private class CalcButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int dec = Integer.parseInt(inputField.getText());
            String oct = Integer.toOctalString(dec);
            resultLabel.setText(oct);
        }
        
    }
}
