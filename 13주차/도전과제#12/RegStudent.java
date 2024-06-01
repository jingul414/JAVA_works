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
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private ArrayList<String> hobbies;
    private int size = 0;   //취미 리스트의 최대 사이즈

    public RegStudent() {
        setTitle("학생 등록");
        setSize(500,750);
        setLocation(400,100);
        getContentPane().setBackground(Color.yellow);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.YELLOW);

        //성명
        JPanel namePanel = new JPanel(new FlowLayout(2));
        JLabel nameLabel = new JLabel("성명");
        nameLabel.setPreferredSize(new Dimension(50,30));
        namePanel.add(nameLabel);
        nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(260,30));
        namePanel.add(nameField);
        namePanel.setBackground(Color.yellow);
        panel.add(namePanel);

        //성별
        JPanel genderPanel = new JPanel(new GridLayout(1,2));
        genderPanel.add(new JLabel("성별"));
        genderGroup = new CheckboxGroup();
        male = new Checkbox("남", genderGroup, false);
        felmale = new Checkbox("여", genderGroup, false);
        genderPanel.add(male);
        genderPanel.add(felmale);
        genderPanel.setBackground(Color.yellow);
        panel.add(genderPanel);

        //학번
        JPanel idPanel = new JPanel(new FlowLayout(2));
        JLabel idLabel = new JLabel("학번");
        idLabel.setPreferredSize(new Dimension(50,30));
        idPanel.add(idLabel);
        idField = new JTextField();
        idField.setPreferredSize(new Dimension(150,30));
        idPanel.add(idField);
        idPanel.setBackground(Color.yellow);
        panel.add(idPanel);

        //전화번호
        JPanel numberPanel = new JPanel(new FlowLayout(2));
        JLabel nubmerLabel = new JLabel("전화번호");
        nubmerLabel.setPreferredSize(new Dimension(70,30));
        numberPanel.add(nubmerLabel);
        phoneNumberField = new JTextField();
        phoneNumberField.setPreferredSize(new Dimension(120,30));
        numberPanel.add(phoneNumberField);
        numberPanel.setBackground(Color.yellow);
        panel.add(numberPanel);

        //주소
        JPanel addressPanel = new JPanel(new FlowLayout(2));
        JLabel addrLabel = new JLabel("주소");
        addrLabel.setPreferredSize(new Dimension(50,30));
        addressPanel.add(addrLabel);
        addressField = new JTextField();
        addressField.setPreferredSize(new Dimension(360,30));
        addressPanel.add(addressField);
        addressPanel.setBackground(Color.yellow);
        panel.add(addressPanel);

        //학과
        JPanel departPanel = new JPanel(new FlowLayout(2));
        JLabel departLabel = new JLabel("학과명");
        departLabel.setPreferredSize(new Dimension(50,30));
        departPanel.add(departLabel);
        departChoice = new Choice();
        departChoice.setPreferredSize(new Dimension(360,30));
        departChoice.add("학과 선택");
        departChoice.add("컴퓨터공학과");
        departChoice.add("전자공학과");
        departChoice.add("정보통신공학과");
        departPanel.add(departChoice);
        departPanel.setBackground(Color.yellow);
        panel.add(departPanel);

        //취미
        JPanel hobbyPanel = new JPanel(new FlowLayout(5));
        JLabel hobbyLabel = new JLabel("취미");
        hobbyLabel.setPreferredSize(new Dimension(140,30));
        hobbyPanel.add(hobbyLabel);
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
        hobbyPanel.add(innerHobbiesPanel);
        hobbyPanel.setBackground(Color.yellow);
        panel.add(hobbyPanel);
        
        //자기소개
        JPanel introPanel = new JPanel(new BorderLayout());
        introPanel.add(new JLabel("자기소개"),BorderLayout.NORTH);
        selfIntroduceArea = new JTextArea(23,42);
        JScrollPane scrollPane = new JScrollPane(selfIntroduceArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        introPanel.add(scrollPane);
        introPanel.setBackground(Color.yellow);
        panel.add(introPanel);

        add(panel, BorderLayout.CENTER);

        //버튼
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton saveButton = new JButton("저장");
        JButton exitButton = new JButton("종료");
        buttonPanel.add(saveButton);
        buttonPanel.add(exitButton);
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
