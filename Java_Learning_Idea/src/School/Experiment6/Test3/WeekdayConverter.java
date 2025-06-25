package School.Experiment6.Test3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeekdayConverter extends JFrame {
    private JTextField inputField;
    private JTextField outputField;
    private JButton convertButton;

    public WeekdayConverter() {
        setTitle("日子数与星期几转换");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //创建布局
        setLayout(new FlowLayout());

        //创建组件
        JLabel inputLabel = new JLabel("输入日子对应的数字：");
        inputField = new JTextField(5);
        outputField = new JTextField(10);
        outputField.setEditable(false);
        convertButton = new JButton("转换");

        //添加组件到窗口
        add(inputLabel);
        add(inputField);
        add(convertButton);
        add(new JLabel("星期几："));
        add(outputField);

        //添加按钮监听器
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int day = Integer.parseInt(inputField.getText());
                    if (day < 1 || day > 7) {
                        throw new IllegalArgumentException("您输入的数字不是1-7");
                    }
                    String weekday = getWeekday(day);
                    outputField.setText(weekday);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(WeekdayConverter.this,
                            "BadDataException: " + ex.getMessage(),
                            "无效日期", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private String getWeekday(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                throw new IllegalArgumentException("您输入的数字不是1-7");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WeekdayConverter().setVisible(true);
            }
        });
    }
}