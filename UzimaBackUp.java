
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
// import javafx.geometry.Pos;
//import javafx.scene.image.Image;
import javax.swing.border.*;

public class UzimaBackUp {

    public static void main(String[] args) {
        // Creating a frame for Trials
        JFrame frame = new JFrame();
        frame.setTitle("UZIMA HEALTH RECORDS");
        frame.setVisible(true);
        frame.setSize(1400, 900);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.getContentPane().setBackground(Color.PINK);
        ImageIcon record = new ImageIcon("IMG-20211113-WA0002.jpg ");// resets the frame image from the default Ja va
                                                                     // icon
        frame.setIconImage(record.getImage());
        frame.getContentPane().setBackground(Color.cyan);// Sets the background color of the frame
        JLabel label = new JLabel("WELCOME TO UZIMA HEALTH CENTER!!!");
        Border border = BorderFactory.createLineBorder(Color.ORANGE, 6);
        label.setHorizontalTextPosition(JLabel.CENTER);// Sets a text position left,right,center
        label.setHorizontalTextPosition(JLabel.CENTER);// Sets a text
        label.setVerticalTextPosition(JLabel.TOP);// Sets a text position Top,Center or bottom of Image or Icon
        label.setForeground(new Color(0, 250, 0));// Sets font color of Text
        label.setFont(new Font("MV Boli", Font.PLAIN, 30));// sets font of text
        label.setIconTextGap(20);// sets gap of text to image
        label.setBackground(Color.black);// Sets background color
        label.setOpaque(true);// displays background color
        label.setBorder(border);// sets the color of the border
        label.setVerticalAlignment(JLabel.TOP);// sets the vertical position of the icon plus text;top,center bottom
        label.setHorizontalAlignment(JLabel.CENTER);// sets the horizontal position of the icon plus the
                                                    // text,left,center,right
        label.setBounds(75, 0, 1200, 120);
        frame.add(label);
        ImageIcon image = new ImageIcon("IMG-20211204-WA0003.jpg");
        label.setIcon(image);
        frame.pack();// makes the frame to accomodate every size of the components
        // Creating panels and adding to the frame components
        JPanel malaria = new JPanel();
        JPanel Hiv = new JPanel();
        JPanel typhoid = new JPanel();
        // Gives a summarry of the user
        JPanel sum = new JPanel();
        sum.setLayout(null);
        // Displays the info to the user
        JLabel log = new JLabel("LOGIN");
        JLabel mal = new JLabel("MALARIA");
        JLabel hiv = new JLabel("HIV");
        JLabel typ = new JLabel("TYPHOID");
        JLabel summary = new JLabel("SUMMARY:");
        JLabel tel = new JLabel(" Telephone No:");
        JTextField tele = new JTextField();
        JLabel bill = new JLabel("Pay bill here");
        JLabel name = new JLabel("Enter your names:");
        // First Name Entry
        JLabel fnam = new JLabel("Firstname");
        JTextField fname = new JTextField();
        // Second name entry
        JLabel snam = new JLabel("Secondname");
        JTextField sname = new JTextField();
        // Gender Entry
        JLabel gen = new JLabel("Select your Gender/Sex\n Male/Female/Other(Specify)\n");
        JCheckBox male = new JCheckBox();
        JLabel males = new JLabel("Male");
        JCheckBox female = new JCheckBox();
        JLabel females = new JLabel("Female");
        JCheckBox othe = new JCheckBox();
        JLabel other = new JLabel("Other");
        // Position Entry
        JLabel pos = new JLabel("Enter Telephone Number:");
        JTextField position = new JTextField();
        // ID No. Entry JTextField();
        JLabel id = new JLabel("Enter your ID No./Birth Cert:");
        JTextField Id = new JTextField();
        // clicks or selects position
        JLabel sel = new JLabel("CLICK POSITION BUTTON");
        JRadioButton doc = new JRadioButton();
        JRadioButton pat = new JRadioButton();
        JLabel docs = new JLabel("Doctor");
        JLabel pats = new JLabel("Patient");
        // patient or doctor enters the illness diagnosised

        JPanel ilin = new JPanel();// sets the panel to the frame
        ilin.setLayout(null);
        JLabel il = new JLabel("Record the illness");
        // Sets the panel to the frame
        JTextField ILn = new JTextField();
        // Gives the invoice of the information captured
        JLabel inv = new JLabel("Invoice:");
        // Gives invoice of the entries
        JLabel upname = new JLabel("Your name is:");
        JLabel upill = new JLabel("Your are suffering from:");
        JLabel upbill = new JLabel("Total Bill paid is:");
        JButton con = new JButton("CONFIRM");// Sets the textField of the disease
        JLabel cont = new JLabel("Enter country Name");
        JTextField contr = new JTextField();
        JPanel sum1 = new JPanel();
        JPanel sum2 = new JPanel();
        JPanel sum3 = new JPanel();
        JPanel sum4 = new JPanel();
        // set bounds of the components
        malaria.setBounds(200, 45, 300, 450);
        Hiv.setBounds(550, 45, 300, 450);
        typhoid.setBounds(900, 45, 300, 450);
        sum.setBounds(200, 520, 1000, 270);
        log.setBounds(15, 100, 120, 120);
        name.setBounds(15, 155, 200, 50);
        fnam.setBounds(15, 175, 170, 55);
        fname.setBounds(10, 230, 85, 55);
        snam.setBounds(120, 175, 170, 55);
        sname.setBounds(105, 230, 85, 55);
        gen.setBounds(15, 275, 150, 50);
        male.setBounds(15, 315, 40, 35);
        males.setBounds(60, 310, 150, 50);
        female.setBounds(15, 365, 40, 35);
        females.setBounds(60, 360, 150, 50);
        pos.setBounds(15, 385, 170, 55);
        position.setBounds(15, 440, 170, 55);
        id.setBounds(15, 500, 150, 50);
        Id.setBounds(15, 555, 170, 55);
        sel.setBounds(25, 603, 150, 50);
        doc.setBounds(15, 642, 20, 20);
        docs.setBounds(40, 625, 150, 50);
        pat.setBounds(15, 680, 20, 20);
        pats.setBounds(40, 665, 150, 50);
        cont.setBounds(25, 10, 140, 50);// sets the bounds for the country label
        contr.setBounds(15, 50, 140, 30);// sets the bounds of the textField
        sum1.setBounds(10, 10, 200, 180);
        sum2.setBounds(220, 10, 200, 180);
        sum3.setBounds(430, 10, 200, 180);
        sum4.setBounds(637, 5, 355, 200);
        ilin.setBounds(1210, 120, 155, 700);// Sets the bounds of the panel
        il.setBounds(25, 10, 130, 50);// sets the bounds of the text
        ILn.setBounds(20, 50, 130, 50);// sets the bounds of the textfield
        con.setBounds(50, 120, 90, 50);// sets the bounds of the Button to confirm the illness

        // sets background color of every component
        Border ml = BorderFactory.createLineBorder(Color.black, 2);
        Border hv = BorderFactory.createLineBorder(Color.black, 2);
        Border ty = BorderFactory.createLineBorder(Color.black, 2);
        malaria.setOpaque(true);
        malaria.setBorder(ml);
        Hiv.setOpaque(true);
        Hiv.setBorder(hv);
        typhoid.setOpaque(true);
        typhoid.setBorder(ty);
        Border bord1 = BorderFactory.createLineBorder(Color.blue, 3);
        Border bord2 = BorderFactory.createLineBorder(Color.blue, 3);
        Border bord3 = BorderFactory.createLineBorder(Color.blue, 3);
        Border bord4 = BorderFactory.createLineBorder(Color.red, 4);
        malaria.setBackground(Color.LIGHT_GRAY);
        Hiv.setBackground(Color.LIGHT_GRAY);
        typhoid.setBackground(Color.LIGHT_GRAY);
        ilin.setBackground(Color.magenta);
        sum.setBackground(Color.gray);
        con.setBackground(Color.green);
        contr.setBackground(Color.WHITE);
        sum1.setBackground(Color.orange);
        sum2.setBackground(Color.orange);
        sum3.setBackground(Color.orange);
        sum4.setBackground(Color.DARK_GRAY);
        sum4.setAlignmentY(3);
        sum1.setOpaque(true);
        sum1.setBorder(bord1);
        sum2.setOpaque(true);
        sum2.setBorder(bord2);
        sum3.setOpaque(true);
        sum3.setBorder(bord3);
        sum4.setOpaque(true);
        sum4.setBorder(bord4);
        // Adds the panel components to the frame
        frame.add(malaria);
        frame.add(Hiv);
        frame.add(typhoid);
        frame.add(ilin);
        frame.add(sum);
        frame.add(log);
        frame.add(name);// adds the name text
        frame.add(fnam);// adds the first name text
        frame.add(fname);// adds the first name TextField
        frame.add(snam);// adds the second name text
        frame.add(sname);// adds the second name TextField
        frame.add(gen);
        frame.add(male);
        frame.add(males);
        frame.add(female);
        frame.add(females);
        frame.add(othe);
        frame.add(other);
        frame.add(pos);
        frame.add(position);
        frame.add(id);
        frame.add(Id);
        frame.add(doc);
        frame.add(docs);
        frame.add(pat);
        frame.add(pats);
        frame.add(sel);
        // add the labels,TextFields,TextArea and buttons to the panels
        ilin.add(il);// adds text to the panel
        ilin.add(ILn);// adds the textField to the panel
        ilin.add(con);// adds the confirm button to the panel
        sum.add(cont);// adds the country label to the panel
        sum.add(contr);// adds the country area to the panel
        sum.add(sum1);// adds the first summury panel to the summary panel
        sum.add(sum2);
        sum.add(sum3);
        sum.add(sum4);

    }

}
