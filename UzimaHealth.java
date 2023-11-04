
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.scene.image.Image;
import javax.swing.border.*;
import javax.swing.BorderFactory;

public class UzimaHealth {
    public static void main(String[] args) {
        // creating a frame for our health record
        JFrame frame = new JFrame();
        frame.setTitle(" UZIMA HEALTH RECORDS");
        frame.setSize(1200, 900);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of the application
        frame.setLayout(null);
        frame.setResizable(false);// prevents the frame from being resized

        ImageIcon record = new ImageIcon("IMG-20211113-WA0002.jpg ");// resets the frame image from the default Ja va
                                                                     // icon
        frame.setIconImage(record.getImage());
        frame.getContentPane().setBackground(Color.cyan);// Sets the background color of the fram

        // Sets the title and image of the hospital logo

        JLabel label = new JLabel("WELCOME TO UZIMA HEALTH CENTER!!!");
        Border border = BorderFactory.createLineBorder(Color.ORANGE, 6);
        label.setHorizontalTextPosition(JLabel.CENTER);// Sets a text position left,right,center
        label.setVerticalTextPosition(JLabel.TOP);// Sets a text position Top,Center or bottom of Image or Icon
        label.setForeground(new Color(250, 0, 0));// Sets font color of Text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));// sets font of text
        label.setIconTextGap(10);// sets gap of text to image
        label.setBackground(Color.BLACK);// Sets background color
        label.setOpaque(true);// displays background color
        label.setBorder(border);// sets the color of the border
        label.setVerticalAlignment(JLabel.TOP);// sets the vertical position of the icon plus text;top,center bottom
        label.setHorizontalAlignment(JLabel.CENTER);// sets the horizontal position of the icon plus the
                                                    // text,left,center,right
        label.setBounds(0, 0, 1180, 115);
        frame.add(label);
        ImageIcon image = new ImageIcon("IMG-20211204-WA0003.jpg");
        label.setIcon(image);
        // label.pack();

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.blue);
        panel1.setBounds(0, 10, 50, 50);
        frame.add(panel1);

        // provides prompts for the user to enter the recquired inputs
        JLabel id = new JLabel("Enter your Gender/Sex\n Male/Female/Other");
        JTextField idNo = new JTextField();
        // Illness Type
        JLabel ill = new JLabel(
                "What are you suffering from?\nMALARIA\nHIV/AIDS\nTYPHOID\nTUBERCULOSIS\nAny other(Specify)");
        JTextField dis = new JTextField();
        JLabel p = new JLabel("WHAT POSITION ARE YOU?");
        JRadioButton patient = new JRadioButton("Patient");
        JRadioButton doctor = new JRadioButton("Doctor");

        // Gives abasic description of the type type of illness in the database
        JPanel malaria = new JPanel();
        JPanel Hiv = new JPanel();
        JPanel typhoid = new JPanel();
        JPanel tuberculoisis = new JPanel();
        // Gives a summarry of the user
        JPanel sum = new JPanel();
        JLabel summary = new JLabel("SUMMARY:");
        JLabel tel = new JLabel(" Telephone No:");
        JTextField tele = new JTextField();
        JLabel bill = new JLabel("Pay bill here");
        // Name Entry
        JLabel nam = new JLabel("Enter your name");
        JTextField name = new JTextField();
        // Gender Entry
        JLabel gen = new JLabel("Enter your Gender/Sex\n Male/Female/Other");
        JTextField gender = new JTextField();
        // Position Entry
        JLabel pos = new JLabel("Enter your Gender/Sex\n Male/Female/Other");
        JTextField position = new JTextField();
        // ID No. Entryew JTextField();
        JLabel inv = new JLabel("Invoice:");
        // Gives invoice of the entries
        JLabel upname = new JLabel("Your name is:");
        JLabel upill = new JLabel("Your are suffering from:");
        JLabel upbill = new JLabel("Total Bill paid is:");
        JPanel panel = new JPanel();

        // set bounds of the components and background color
        /*
         * malaria.setBackground(Color.BLACK);
         * malaria.setBounds(100,200,50,210);
         * frame.add(malaria);
         */

    }

}
