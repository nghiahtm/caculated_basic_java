import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainForm extends JFrame {
    private JTextField textFieldA;
    private JTextField textFieldB;private JButton btnKetQua;
    private JTextArea textArea;

    public JTextField getTextFieldA() {
        return textFieldA;
    }

    public JTextField getTextFieldB() {
        return textFieldB;
    }

    public JButton getBtnKetQua() {
        return btnKetQua;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public MainForm() {
        setTitle("Tính chu vi - diện tích");
        // tạo các label hằng số
        JLabel labelHangSo = new JLabel("Nhập:");
        JLabel labelCD = new JLabel("Chiều dài:");
        JLabel labelCR = new JLabel("Chiều rộng:");
        labelHangSo.setBounds(20, 20, 50, 20);
        labelCD.setBounds(20, 50, 80, 20);
        labelCR.setBounds(20, 70, 80, 20);
        // tạo các trường nhập hằng số
        textFieldA = new JTextField();
        textFieldB = new JTextField();
        textFieldA.setBounds(85, 50, 40, 20);
        textFieldB.setBounds(90, 70, 40, 20);
        // tạo button để tính nghiệm của phương trình bậc 2
        btnKetQua = new JButton("Kết Quả");
        btnKetQua.setBounds(20, 100, 80, 30);
        // tạo textarea để hiện thị kết quả
        textArea = new JTextArea();
        textArea.setEnabled(false);
        textArea.setBounds(20, 150, 350, 150);

        add(labelHangSo);
        add(labelCD);
        add(textFieldA);
        add(labelCR);
        add(textFieldB);
        add(btnKetQua);
        add(textArea);
        setFocusable(true);
        addKeyListener(new Keychecker());
        // thiết lập bố cục (layout)
        setLayout(null);
        // thiết lập kích thước jframe
        setSize(450, 400);
        // hiển thị jframe
        setVisible(true);
    }

}

class Keychecker implements KeyListener {

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
       if(e.getKeyCode() == 27){
           final JDialog frame = new JDialog();
           frame.setTitle("Bạn ấn ESC");
           frame.getContentPane().add(
                   new JLabel("Chúc mừng bán ấn ESC")
           );
           frame.setBounds(350, 350, 200, 200);
           frame.setModal(true);
           frame.setVisible(true);
       }
    }

    public void keyReleased(KeyEvent e) {
    }

}