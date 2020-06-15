import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;

public class IpFinder extends JFrame implements ActionListener {

    JLabel l;
    JTextField tf;
    JButton b;

    IpFinder(){
        super("Ip finder in this section");
        l=new JLabel ("Enter your URL");
        l.setBounds (50,70,150,120);
        tf = new JTextField ();
        tf.setBounds (50,100,200,20);
        b=new JButton ("Find your IP");
        b.setBounds (50,150,80,30);
        b.addActionListener (this);
        add (l);
        add (tf);
        add (b);
        setSize (400,400);
        setLayout (null);
        setVisible (true);


    }

    @Override
    public void actionPerformed (ActionEvent actionEvent) {

        String url = tf.getText ();
        try{
            InetAddress ia = InetAddress.getByName (url);
            String ip = ia.getHostAddress ();
            JOptionPane.showMessageDialog (this,ip);
        }
        catch (UnknownHostException e){
            JOptionPane.showMessageDialog (this, e.toString());
        }

    }

    public static void main (String[] args) {

        new IpFinder ();
    }
}
