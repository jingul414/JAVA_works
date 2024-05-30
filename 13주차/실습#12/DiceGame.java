package subject_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DiceGame extends JFrame {
    private JButton rollButton;
    private JLabel userDiceLabel;
    private JLabel comDiceLabel;
    private JLabel resultLabel;

    public DiceGame() {
        setTitle("주사위 던지기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,1));
        setSize(400,300);
        setVisible(true);

        rollButton = new JButton("주사위를 던지세요.");
        rollButton.setPreferredSize(new Dimension(200,50));
        userDiceLabel = new JLabel("사용자가 던진 주사위 번호: ");
        userDiceLabel.setHorizontalAlignment(JLabel.CENTER);
        comDiceLabel = new JLabel("프로그램이 던진 주사위 번호: ");
        comDiceLabel.setHorizontalAlignment(JLabel.CENTER);
        resultLabel = new JLabel("게임 결과: ");
        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(rollButton);

        add(buttonPanel);
        add(userDiceLabel);
        add(comDiceLabel);
        add(resultLabel);

        //pack();
        rollButton.addActionListener(new RollButton());
    }

    private class RollButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Random random = new Random();
            int userRoll = random.nextInt(6) + 1;
            int comRoll = random.nextInt(6) + 1;
            
            userDiceLabel.setText("사용자가 던진 주사위 번호: " + userRoll);
            comDiceLabel.setText("프로그램이 던진 주사위 번호: " + comRoll);
            
            if(userRoll > comRoll) {
                resultLabel.setText("게임결과: 이겼습니다");
            }else if(userRoll < comRoll){
                resultLabel.setText("게임결과: 졌습니다");
            }else{
                resultLabel.setText("게임결과: 비겼습니다");
            }
        }
    
    }
    

}
