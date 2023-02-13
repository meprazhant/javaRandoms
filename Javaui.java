import javax.swing.*;

public class Javaui {
    public static void main(String[] args) {
        JFrame j1 = new JFrame("Java UI | Prashant");
        JLabel headlbl = new JLabel("Calculate Square and Factorial");
        JLabel enter = new JLabel("Enter the Number");
        JButton btn = new JButton("Square");
        JButton btn1 = new JButton("Factorial");
        JTextArea text = new JTextArea();
        JLabel result = new JLabel("Result:");
        JTextArea text1 = new JTextArea();

        headlbl.setBounds(50, 10, 400, 50);
        enter.setBounds(10, 70, 200, 20);
        text.setBounds(150, 70, 200, 20);
        btn1.setBounds(190, 120, 160, 20);
        btn.setBounds(10, 120, 160, 20);
        result.setBounds(10, 170, 200, 20);
        text1.setBounds(150, 170, 200, 20);

        j1.add(btn);
        j1.add(text);
        j1.add(btn1);
        j1.add(headlbl);
        j1.add(enter);
        j1.add(result);
        j1.add(text1);

        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int num = Integer.parseInt(text.getText());
                int sq = num * num;
                text1.setText(String.valueOf(sq));
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int num = Integer.parseInt(text.getText());
                int fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact = fact * i;
                }
                text1.setText(String.valueOf(fact));
            }
        });

        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.setLayout(null);// using no layout managers
        j1.setSize(400, 240);
        j1.setVisible(true);
    }
}
