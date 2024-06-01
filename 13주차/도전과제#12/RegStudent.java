package subject_c;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class RegStudent extends JFrame{
    private JTextField nameField, idField, phoneNumberField, addressField; //성명, 학번, 전화번호, 주소를 입력할 텍스트 필드
    private CheckboxGroup genderGroup;  //성별 체크박스그룹
    private Checkbox male, felmale,exercise, music, movie, travel;     //남, 여 체크박스,   학과선택, 운동, 음악감상, 영화, 여행 체크박스
    private Choice departChoice;    //학과 선택
    private JTextArea selfIntroduceArea; //자기소개 구역
    private ArrayList<Student> studentList = new ArrayList<Student>();  //학생 객체를 저장할 리스트
    private ArrayList<String> hobbies;  //취미를 저장할 리스트
    private int size = 0;   //취미 리스트의 최대 사이즈

    public RegStudent() {
        /*
         * 구성 방법: 전체적인 프레임을 BorderLayout 로 설정 후, GridLayout을 상단에 배치해서 상단의 5줄을 처리
         * 그후 중간에 BorderLayout을 다시 배치해서 자기소개 라벨과 textarea 처리
         * 하단에는 저장, 종료 버튼이 담겨있는 패널을 추가해서 버튼 처리
         */
        setTitle("학생 등록");
        setSize(400,600);
        setLocation(400,100);
        getContentPane().setBackground(Color.yellow);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel upperPanel = new JPanel();
        upperPanel.setLayout(new BorderLayout());
        upperPanel.setBackground(Color.yellow);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 0, 30));
        panel.setBackground(Color.YELLOW);

        upperPanel.add(panel, BorderLayout.NORTH);

        JPanel firstPanel = new JPanel();
        firstPanel.setLayout(new BorderLayout());
        firstPanel.setBackground(Color.YELLOW);

        //성명
        JPanel namePanel = new JPanel(new BorderLayout());
        JLabel nameLabel = new JLabel("성명");
        nameLabel.setPreferredSize(new Dimension(40,20));
        namePanel.add(nameLabel,BorderLayout.WEST);
        nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(220,20));
        namePanel.add(nameField, BorderLayout.EAST);
        namePanel.setBackground(Color.yellow);
        firstPanel.add(namePanel,BorderLayout.WEST);

        //성별
        JPanel genderPanel = new JPanel(new GridLayout(1,2));
        genderPanel.add(new JLabel("성별"));
        genderGroup = new CheckboxGroup();
        male = new Checkbox("남", genderGroup, false);
        felmale = new Checkbox("여", genderGroup, false);
        genderPanel.add(male);
        genderPanel.add(felmale);
        genderPanel.setBackground(Color.yellow);
        firstPanel.add(genderPanel, BorderLayout.EAST);

        panel.add(firstPanel, BorderLayout.CENTER);
        
        JPanel secondPanel = new JPanel();
        secondPanel.setLayout(new BorderLayout());
        secondPanel.setBackground(Color.YELLOW);

        //학번
        JPanel idPanel = new JPanel(new BorderLayout());
        JLabel idLabel = new JLabel("학번");
        idLabel.setPreferredSize(new Dimension(40,30));
        idPanel.add(idLabel, BorderLayout.WEST);
        idField = new JTextField();
        idField.setPreferredSize(new Dimension(130,30));
        idPanel.add(idField, BorderLayout.EAST);
        idPanel.setBackground(Color.yellow);
        secondPanel.add(idPanel, BorderLayout.WEST);

        //전화번호
        JPanel numberPanel = new JPanel(new BorderLayout());
        JLabel nubmerLabel = new JLabel("전화번호");
        nubmerLabel.setPreferredSize(new Dimension(70,30));
        numberPanel.add(nubmerLabel, BorderLayout.WEST);
        phoneNumberField = new JTextField();
        phoneNumberField.setPreferredSize(new Dimension(120,30));
        numberPanel.add(phoneNumberField, BorderLayout.EAST);
        numberPanel.setBackground(Color.yellow);
        secondPanel.add(numberPanel, BorderLayout.EAST);

        panel.add(secondPanel);

        JPanel thirdPanel = new JPanel();
        thirdPanel.setLayout(new BorderLayout());
        thirdPanel.setBackground(Color.YELLOW);

        //주소
        JPanel addressPanel = new JPanel(new BorderLayout());
        JLabel addrLabel = new JLabel("주소");
        addrLabel.setPreferredSize(new Dimension(50,30));
        addressPanel.add(addrLabel, BorderLayout.WEST);
        addressField = new JTextField();
        addressField.setPreferredSize(new Dimension(345,30));
        addressPanel.add(addressField, BorderLayout.EAST);
        addressPanel.setBackground(Color.yellow);
        thirdPanel.add(addressPanel, BorderLayout.WEST);

        panel.add(thirdPanel);

        JPanel fourthPanel = new JPanel();
        fourthPanel.setLayout(new BorderLayout());
        fourthPanel.setBackground(Color.YELLOW);

        //학과
        JPanel departPanel = new JPanel(new BorderLayout());
        JLabel departLabel = new JLabel("학과명");
        departLabel.setPreferredSize(new Dimension(50,30));
        departPanel.add(departLabel, BorderLayout.WEST);
        departChoice = new Choice();
        departChoice.setPreferredSize(new Dimension(330,30));
        departChoice.add("학과 선택");
        departChoice.add("컴퓨터공학과");
        departChoice.add("전자공학과");
        departChoice.add("정보통신공학과");
        departPanel.add(departChoice, BorderLayout.EAST);
        departPanel.setBackground(Color.yellow);
        fourthPanel.add(departPanel, BorderLayout.WEST);

        panel.add(fourthPanel);

        JPanel fifthPanel = new JPanel();
        fifthPanel.setLayout(new BorderLayout());
        fifthPanel.setBackground(Color.YELLOW);

        //취미
        JPanel hobbyPanel = new JPanel(new BorderLayout());
        JLabel hobbyLabel = new JLabel("취미");
        hobbyLabel.setPreferredSize(new Dimension(50,30));
        hobbyPanel.add(hobbyLabel, BorderLayout.WEST);
        JPanel innerHobbiesPanel = new JPanel(new GridLayout(1,4));
        exercise = new Checkbox("운동");
        music = new Checkbox("음악감상");
        movie = new Checkbox("영화");
        travel = new Checkbox("여행");
        innerHobbiesPanel.add(exercise);
        innerHobbiesPanel.add(music);
        innerHobbiesPanel.add(movie);
        innerHobbiesPanel.add(travel);
        innerHobbiesPanel.setBackground(Color.yellow);
        hobbyPanel.add(innerHobbiesPanel, BorderLayout.EAST);
        hobbyPanel.setBackground(Color.yellow);
        fifthPanel.add(hobbyPanel, BorderLayout.WEST);

        panel.add(fifthPanel);

        JPanel lowerPanel = new JPanel();
        lowerPanel.setLayout(new BorderLayout());
        lowerPanel.setBackground(Color.yellow);
        
        //자기소개
        JPanel introPanel = new JPanel(new BorderLayout());
        introPanel.add(new JLabel("자기소개"),BorderLayout.NORTH);
        selfIntroduceArea = new JTextArea(10,10);
        JScrollPane scrollPane = new JScrollPane(selfIntroduceArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        introPanel.add(scrollPane);
        introPanel.setBackground(Color.yellow);
        lowerPanel.add(introPanel, BorderLayout.CENTER);

        add(upperPanel, BorderLayout.NORTH);
        add(lowerPanel, BorderLayout.CENTER);

        //버튼
        JPanel buttonPanel = new JPanel(new BorderLayout());
        JButton saveButton = new JButton("저장");
        JButton exitButton = new JButton("종료");
        buttonPanel.add(saveButton,BorderLayout.WEST);
        buttonPanel.add(exitButton,BorderLayout.EAST);
        buttonPanel.setBackground(Color.yellow);
        add(buttonPanel, BorderLayout.SOUTH);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveStudent();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printing();
                System.exit(0);
            }
        });

        setVisible(true);
    }

    private void saveStudent() {
        //이름
        String name = nameField.getText();
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(this, "이름을 입력하세요");
            return;
        }

        //성별
        Checkbox gender = genderGroup.getSelectedCheckbox();
        if(gender == null){
            JOptionPane.showMessageDialog(this, "성별을 선택해 주세요");
            return;
        }

        //학번
        String id = idField.getText();
        if(id.isEmpty() || id.length() != 8){
            JOptionPane.showMessageDialog(this, "학번이 틀렸습니다");
            return;
        }

        //전화번호
        String phoneNumber = phoneNumberField.getText();
        if(phoneNumber.isEmpty() || phoneNumber.length() != 13){
            JOptionPane.showMessageDialog(this, "전화번호가 틀렸습니다");
            return;
        }

        //주소
        String address = addressField.getText();
        if(address.isEmpty()){
            JOptionPane.showMessageDialog(this, "주소를 입력하세요");
            return;
        }

        //학과
        String depart = departChoice.getSelectedItem();
        if(depart.equals("학과 선택")){
            JOptionPane.showMessageDialog(this, "학과를 하나 선택하세요");
            return;
        }

        //취미
        hobbies = new ArrayList<String>();
        if(exercise.getState()) hobbies.add("운동");
        if(music.getState()) hobbies.add("음악감상");
        if(movie.getState()) hobbies.add("영화");
        if(travel.getState()) hobbies.add("여행");

        if(hobbies.size() < 2) {
            JOptionPane.showMessageDialog(this, "취미를 2개 이상 선택하세요");
            return;
        }

        //자기소개
        String intro = selfIntroduceArea.getText();

        //학생 객체 생성및 저장
        Student student = new Student(id, name, gender.getLabel(), phoneNumber, address, depart, hobbies, intro);
        studentList.add(student);
        size = Math.max(size,hobbies.size());

        clearInfo();
    }

    private void clearInfo(){
        nameField.setText("");
        genderGroup.setSelectedCheckbox(null);
        idField.setText("");
        phoneNumberField.setText("");
        addressField.setText("");
        departChoice.select("학과 선택");
        exercise.setState(false);
        music.setState(false);
        movie.setState(false);
        travel.setState(false);
        selfIntroduceArea.setText("");
    }

    private void printing() {
        System.out.print("학번\t\t이름\t성별\t전화번호\t주소\t\t\t\t학과\t\t\t");
        System.out.print("취미");
        for (int i = 0; i < size+2;i++) {
            System.out.print("\t");
        }
        System.out.println("자기소개");
        for(Student stu : studentList) {
            stu.printInfo();
        }
    }
    public static void main(String[] args) {
        RegStudent student = new RegStudent();
    }
}
