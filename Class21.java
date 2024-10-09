// online diary project
import java.awt.*;
import java.awt.event.*;

public class Class21 {
    Frame f,f1,f2;
    TextField tf,tf1;
    String name = "";
    String password = "";
    Button b1;
    Dialog d;
    Label l,l1,l2;
    Panel p;
    Class21() {
        f = new Frame("Online Personal notepad");
        f1 = new Frame("Register here");
        f2 = new Frame("This is your personal notepad");
        f1.setSize(400,400);
        f2.setSize(400,400);
        p = new Panel();
        p.setBounds(0,0,150,400);
        p.setBackground(Color.red);
        p.setLayout(null);
        Label lp = new Label("For new users!");
        lp.setBackground(Color.white);
        lp.setBounds(30,150,90,20);
        Button b = new Button("Click here");
        b.setBounds(30,180,60,30);
        p.add(b);
        p.add(lp);
        Label e1 = new Label();
        e1.setBounds(180,280,200,30);
        Label e2 = new Label();
        e2.setBounds(100,300,250,30);
        tf = new TextField();
        tf.setBounds(200,150,120,30);
        tf1 = new TextField();
        tf1.setBounds(200,200,120,30);
        b1 = new Button("login");
        b1.setBounds(230,250,60,30);
        l1 = new Label("Enter username");
        l1.setBackground(Color.MAGENTA);
        l2 = new Label("Enter the password");
        l2.setBackground(Color.pink);
        l1.setBounds(200,120,120,20);
        l2.setBounds(200,180,120,20);
        l = new Label("Welcome to online notepad");
        l.setBounds(180,50,150,40);
        l.setBackground(Color.orange);
        TextArea textArea = new TextArea();
        textArea.setBounds(10,50,380,320);
        Label lt1,lt2;
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        lt1 = new Label("Enter your name:");
        lt1.setBackground(Color.pink);
        lt2 = new Label("Enter password:");
        lt2.setBackground(Color.yellow);

        // Set bounds for registration fields
        lt1.setBounds(50, 100, 150, 20);
        lt2.setBounds(50, 150, 150, 20);
        t1.setBounds(220, 100, 120, 30);
        t2.setBounds(220, 150, 120, 30);
        Button submit = new Button("submit");
        submit.setBounds(180, 200, 80, 30);
        f.add(e1);
        f1.add(e2);
        f2.add(textArea);
        f1.add(submit);
        f1.setBackground(Color.BLUE);
        f1.add(lt1);
        f1.add(lt2);
        f1.add(t1);
        f1.add(t2);
        f.add(l);
        f.add(l1);
        f.add(l2);
        f.add(b1);
        f.add(tf1);
        f.add(tf);
        f.add(p);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f1.setLayout(null);
        f2.setLayout(null);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                f1.setVisible(true);

            }
        });
        b1.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                String n1 = "";
                        n1 = tf.getText();
                String p1 = "";
                        p1 = tf1.getText();
                if (n1.equals("") || p1.equals("")) {
                    e1.setText("Enter all informations correctly");

                }else if(n1.equals(name) && p1.equals( password)) {
                    f.setVisible(false);
                    f2.setVisible(true);
                } else {
                  e1.setText("incorrect password or username");
                }


            }
        });
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = t1.getText();
                password = t2.getText();
                if (name.equals("") || password.equals("")) {
                    e2.setText("Please enter the informations correctly");
                } else {
                    f1.setVisible(false);
                    f.setVisible(true);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Class21();
    }

}