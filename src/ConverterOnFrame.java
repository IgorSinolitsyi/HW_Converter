import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterOnFrame extends JFrame implements ActionListener {
    private JLabel labelConverter;
    private JTextField fieldAnswer;
    private JLabel labelWriteNum;
    private JTextField fieldVal;
    private JButton buttonClose;
    private JButton buttonConvert;
    private JComboBox comboBoxFrom;
    private JComboBox comboBoxTo;
    double lendthInMm[] = {1000.0f, 304.8f, 25.4f, 914.0f, 1609000.0f};

    public ConverterOnFrame() {
        setLayout(null);
        setSize(440, 180);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        labelConverter = new JLabel("CONVERTER");
        fieldAnswer = new JTextField("1");
        labelWriteNum = new JLabel("LANGTH:");

        fieldVal = new JTextField("1");
        buttonConvert = new JButton("CONVERT");
        buttonClose = new JButton("CLOSE");

        String comboBoxListeFrom[] = {"метр", "фут", "дюйм", "ярд", "миля"};

        comboBoxFrom = new JComboBox(comboBoxListeFrom);
        comboBoxTo = new JComboBox(comboBoxListeFrom);

        labelConverter.setFont(new Font("Castellar", Font.BOLD, 16));
        labelWriteNum.setFont(new Font("Castellar", Font.BOLD, 14));
        labelConverter.setBounds(150, 15, 200, 20);
        labelWriteNum.setBounds(15, 50, 80, 25);
        fieldVal.setBounds(85, 50, 70, 25);
        comboBoxFrom.setBounds(165, 50, 60, 25);
        fieldAnswer.setBounds(240, 50, 70, 25);
        comboBoxTo.setBounds(325, 50, 60, 25);
        buttonConvert.setBounds(50, 90, 150, 25);
        buttonClose.setBounds(230, 90, 150, 25);

        buttonClose.addActionListener(this);
        buttonConvert.addActionListener(this);
        comboBoxTo.addActionListener(this);
        comboBoxFrom.addActionListener(this);
        fieldVal.addActionListener(this);

        add(fieldAnswer);
        add(labelConverter);
        add(labelWriteNum);
        add(fieldVal);
        add(comboBoxFrom);
        add(comboBoxTo);
        add(buttonClose);
        add(buttonConvert);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonClose) {
            System.exit(0);
        } else {
            fieldAnswer.setText(convertValve());
        }
    }


    String convertValve() {
        double value = Double.valueOf(fieldVal.getText());
        double answer = (lendthInMm[comboBoxFrom.getSelectedIndex()] * value) / lendthInMm[comboBoxTo.getSelectedIndex()];
        return String.format("%.2f", answer);
    }
}