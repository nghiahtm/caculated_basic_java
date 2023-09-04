import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionListener {
    private final MainForm mainForm;
    MainController(MainForm view){
        this.mainForm = view;
        view.getBtnKetQua().addActionListener(this);
    }

    private String getResult(){
        if(validateDateNumber(mainForm.getTextFieldA()) != null && validateDateNumber(mainForm.getTextFieldB()) != null){
            Solution solution = new Solution(
                    validateDateNumber(mainForm.getTextFieldA()),
                    validateDateNumber(mainForm.getTextFieldB())
            );
            return "Diện tích: "+solution.tinhDienTich()+ "\nChu vi: "+solution.tinhChuVi();
        }
        return null;
    }

    private Double validateDateNumber (JTextField textField){
        try {
            if (!"".equals(textField.getText())) {
                return Double.parseDouble(textField.getText());
            } else {
                JOptionPane.showMessageDialog(mainForm, "Số không được rỗng.");
            }
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(mainForm, "Số không hợp lệ.");
        }
        return null;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        mainForm.getTextArea().setText(getResult());
    }
}
