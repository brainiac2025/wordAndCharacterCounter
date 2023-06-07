import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    JLabel lblwordcount;
    JLabel lblchracterCount;
    JButton countButton;
    JTextArea input;


    public Main(){
        super("Word and Character Count");
        lblchracterCount=new JLabel("Characters");
        lblchracterCount.setBounds(20, 30, 100, 20);

        lblwordcount=new JLabel("Words");
        lblwordcount.setBounds(20,50,100,20);

        input=new JTextArea();
        JScrollPane jsp= new JScrollPane(input);
        jsp.setBounds(20,80, 200, 100);

        countButton=new JButton("COUNT");
        countButton.setBounds(85, 200, 80, 40);
        countButton.addActionListener(this);

        add(lblwordcount); add(lblchracterCount); add(jsp); add(countButton);
        setSize(250, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }


    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==countButton){
            lblchracterCount.setText("");
            String text=input.getText();
            lblchracterCount.setText("Character: "+text.length());
            lblwordcount.setText("");
            String words[]=text.split("\\s");
            lblwordcount.setText("Word: "+words.length );

        }
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");  // Windows Look and feel
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        new Main();

    }
}