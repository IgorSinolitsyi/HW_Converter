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
    double lendthInMm[]  = {1000.0f, 304.8f, 25.4f,914.0f,1609000.0f};
}
