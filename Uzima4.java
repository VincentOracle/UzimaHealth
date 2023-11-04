
    
    package uzima;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.Color;
    import java.awt.Font;
    import java.nio.file.NotLinkException;
    import javafx.geometry.Pos;
    import javafx.scene.image.Image;
    import java.util.Calendar;
    import javax.swing.border.*;
    
    
    public class Backup4 {
        public static void main(String [] args){
            // Creating a frame for Trials
             JFrame frame= new JFrame();
             frame.setTitle("UZIMA HEALTH SYSTEM:*************The system has a record of Specific disease signs and the possible cure and medicines to be admnistered by the specialised depending on the Disease diagnosised.************");
             frame.setVisible(true);
              frame.setSize(1400,900);
              frame.setLayout(null);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              frame.setResizable(true);
              frame.getContentPane().setBackground(Color.PINK);
              ImageIcon record = new ImageIcon("IMG-20211113-WA0002.jpg ");// resets the frame image from the default Ja va icon
              frame.setIconImage(record.getImage());
              frame.getContentPane().setBackground(Color.cyan);//Sets the background color of the frame 
              JPanel dateTime= new JPanel();
              dateTime.setBackground(Color.BLUE);
              dateTime.setLayout(null);
              dateTime.setBounds(1,1,80,140);
              Border timBorder= BorderFactory.createLineBorder(Color.RED,3);
              dateTime.setBorder(timBorder);
              frame.add(dateTime);
              //frame.getContentPane().setLayout(null);
              JLabel label= new JLabel("WELCOME TO UZIMA HEALTH CENTER!!!");
              Border border= BorderFactory.createLineBorder(Color.ORANGE,6);
              label.setHorizontalTextPosition(JLabel.CENTER);//Sets a text position left,right,center
              label.setVerticalTextPosition(JLabel.TOP);//Sets a text position Top,Center or bottom of Image or Icon
              label.setForeground(new Color(0,250,0));// Sets font color of Text(green)
               // label.setFont(new Font("calibri",Font.ITALIC,30));//sets font of text
              label.setFont(new Font(null, Font.ITALIC,30));
              label.setIconTextGap(20);//sets gap of text to image 
              label.setBackground(Color.black);//Sets background color 
              label.setOpaque(true);//displays background color
              label.setBorder(border);//sets the color of the border
              label.setVerticalAlignment(JLabel.TOP);//sets the vertical position of the icon plus text;top,center bottom
              label.setHorizontalAlignment(JLabel.CENTER);//sets the horizontal position of the icon plus the text,left,center,right
              label.setBounds(75,0,1200,120);
            //addds the welcoming label
              frame.add(label);
              ImageIcon image= new ImageIcon("IMG-20211204-WA0003.jpg");
              label.setIcon(image);
              frame.pack();// makes the frame to accomodate every size of the components
    
              //Creating panels and adding to the frame components
     JPanel Malaria= new JPanel();
     Malaria.setLayout(null);
    JPanel Hiv =new JPanel();
    Hiv.setLayout(null);
    JPanel Typhoid= new JPanel();
    Typhoid.setLayout(null);
    //Gives a summarry of the user
    JPanel sum=new JPanel();
    sum.setLayout(null);
    Malaria.setLayout(null);
    
    //Displays the info to the user
    JLabel dat= new JLabel("DATE:");
    JLabel tim= new JLabel("TIME:");
    JLabel log= new JLabel("LOGIN");
    JLabel mal= new JLabel("MALARIA");
    JLabel hiv = new JLabel("HIV/AIDS");
    JLabel typ = new JLabel("TYPHOID");
    JLabel summary= new JLabel("SUMMARY:");
    JLabel tel= new JLabel(" Telephone No:");
    JTextField tele= new JTextField();
    JLabel bill= new JLabel("Pay bill here:");
    JLabel name= new JLabel("Enter your names:");
    //First Name Entry
    JLabel fnam= new JLabel("Firstname");
    JTextField fname= new JTextField();
    //Second name entry
    JLabel snam= new JLabel("Secondname");
    JTextField sname = new JTextField();
    //Gender Entry
    JLabel gen= new JLabel("Select your Gender/Sex:");
    JCheckBox male= new JCheckBox();
    JLabel males =new JLabel("Male");
    JCheckBox female = new JCheckBox();
    JLabel females = new JLabel("Female");
    JLabel other= new JLabel("Other(Specify)");
    JTextArea othe = new JTextArea();//Other Gender specifies 
    //Position Entry
    JLabel pos= new JLabel("Enter Telephone Number:");
    JTextField position= new JTextField();
    //ID No. Entry JTextField();
    JLabel id=new JLabel("Enter your ID No./Birth Cert:");
    JTextField Id= new JTextField();
    //clicks or selects position
    JLabel sel= new JLabel("CLICK POSITION BUTTON");
    JRadioButton doc= new JRadioButton();
    JRadioButton pat= new JRadioButton();
    JLabel docs= new JLabel("Doctor");
    JLabel pats = new JLabel("Patient");
    //patient or doctor enters the illness diagnosised
    
    JPanel ilin=new JPanel();//sets the panel to the frame 
    ilin.setLayout(null);
    JLabel il= new JLabel("Record the illness");
    //Sets the panel to the frame
    JTextField ILn=new JTextField();
    //Gives the invoice of the information captured
    
    JLabel inv= new JLabel("INVOICE:");
    //Gives invoice of the entries
    JLabel upname= new JLabel("Your name is:");
    JLabel upill= new JLabel("Your are suffering from:");
    JLabel upbill=new JLabel("Total Bill paid is:");
    JLabel balance= new JLabel("Blance is:");
    JButton con= new JButton("CONFIRM");//Sets the textField of the disease
    JPanel medicine= new JPanel();
    JLabel medication = new JLabel("MEDICINES ARE:");
    JLabel suc=new JLabel("Process successfull...");
    //Works on the summary Panels
    String countries[]= {"Kenya","Uganda","Tanzania","Ethiopia","Eritrea","Somalia","Egypt","South Africa","Ghana","Sudan","Rwanda"};
    String Date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    String month[]={"January","February","March","April","May","June","July","August","Semptember","October","November","December"};
    String year[]={"1985","1986","1987","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"}; 
    JLabel cont= new JLabel("Select country Name");
    JLabel dates= new JLabel("Select Date,Month & Year of Birth");
    JComboBox contr= new JComboBox<>(countries);//Allows one to Select Country
    JLabel datbirth = new JLabel("Date");
    JComboBox datebirth= new JComboBox<>(Date);
    JLabel mon= new JLabel("Month");
    JComboBox months= new JComboBox<>(month);
    JLabel years= new JLabel("Year");
    JComboBox yearbirth= new JComboBox<>(year);
    
    //JTextField county= new JTextField();
    JLabel mod= new JLabel("Choose mode of Payment");
    JRadioButton cas= new JRadioButton();
    JLabel cash= new JLabel("Cash-Money");
    JRadioButton mpsa= new JRadioButton();
    JLabel mpesa= new JLabel("M-Pesa");
    JRadioButton pay= new JRadioButton();
    JLabel paypal= new JLabel("PayPal");
    JLabel paybill = new JLabel("PayBill");
    JTextField payBill = new JTextField();
    JButton send = new JButton("SEND");
    JPanel sum1 =new JPanel();//First Pnel in the summary
    JPanel sum2 = new JPanel();//Second Panel in the summary
    JPanel sum3 = new JPanel();//third panel
    JPanel sum4 = new JPanel();//Fourth panel
    //Allows manual addition of Components to the panel
    sum1.setLayout(null);
    sum2.setLayout(null);
    sum3.setLayout(null);
    sum4.setLayout(null);              
    //set bounds of the components
    dat.setBounds(10,2,50,50);//sets Bound to the Date label
    tim.setBounds(10,50,50,50);// sets the bound to time label
    Malaria.setBounds(200,45,300,450);//sets the Bound to the Malaria Panel
    mal.setBounds(120,60,75,50);
    Hiv.setBounds(550,45,300,450);//Set the Bounds To the HIV panel
    hiv.setBounds(120,60,75,50);
    Typhoid.setBounds(900,45,300,450);//Sets the Bounds To Typhoid Panel
    typ.setBounds(120,60,75,50);
    sum.setBounds(200,520,1000,270);
    log.setBounds(35,100,120,120);
    name.setBounds(15,155,200,50);
    fnam.setBounds(15,175,170,55);
    fname.setBounds(10,230,85,55);
    snam.setBounds(120,175,170,55);
    sname.setBounds(105,230,85,55);
    gen.setBounds(15,275,150,50);
    male.setBounds(15,315,40,35);
    males.setBounds(60,310,150,50);
    female.setBounds(15,365,40,35);
    females.setBounds(60,360,150,50);
    other.setBounds(220,315,70,45);
    othe.setBounds(220,390,70,45);
    pos.setBounds(15,385,170,55);
    position.setBounds(15,440,170,55);
    id.setBounds(15,500,150,50);//Sets the bounds to ID label
    Id.setBounds(15,555,170,55);//sets the bound to the ID TextField
    sel.setBounds(25,603,150,50);//sets bound to select label
    doc.setBounds(15,642,20,20);//sets bound to the doctor radioButton
    docs.setBounds(40,625,150,50);
    pat.setBounds(15,680,20,20);
    pats.setBounds(40,665,150,50);
    sum1.setBounds(10,10,200,180);
    cont.setBounds(40,10,140,50);//sets the bounds for the country label
    contr.setBounds(30,50,140,30);//sets the bounds of the country ComboBox
    dates.setBounds(8,70,200,50);
    datbirth.setBounds(10,95,75,50);//sets the bounds of the date birth label
    datebirth.setBounds(5,130,45,30);//Sets the Bounds of The date birth ComboBox
    mon.setBounds(80,95,100,50);//Sets the bounds of the months label
    months.setBounds(64,130,72,30);//Sets the bounds of the months ComboBox
    years.setBounds(165,95,75,50);//Sets thre Bounds Of the year label
    yearbirth.setBounds(150,130,54,30);//sets the bound of the year ComboBox
    sum2.setBounds(220,10,200,180);
    mod.setBounds(30,10,150,30);//Sets the Bound For The mode Of payment Label
    cas.setBounds(40,45,20,20);
    cash.setBounds(65,30,75,50);//Sets the bound for the cash label
    mpsa.setBounds(40,80,20,20);
    mpesa.setBounds(65,65,75,50);//Sets the bounds for the mpesa label
    pay.setBounds(40,120,20,20);
    paypal.setBounds(65,105,75,50);
    sum3.setBounds(430,10,200,180);
    paybill.setBounds(50,10,75,50);
    payBill.setBounds(22,60,160,50);
    send.setBounds(70,125,65,30);
    sum4.setBounds(637,5,355,200);
    inv.setBounds(150,-10,100,70);
    ilin.setBounds(1210,120,155,700);//Sets the bounds of the panel
    il.setBounds(25,10,130,50);//sets the bounds of the text
    ILn.setBounds(20,50,130,50);//sets the bounds of the textfield
    con.setBounds(50,120,90,50);//sets the bounds of the Button to confirm the illness
    medicine.setBounds(5,180,145,300);//sets the bounds for the medicine panel
    medication.setBounds(35,5,100,35);//sets the bounds for the medication label
    suc.setBounds(45,350,80,20);
    
    //sets background and ForeGround color of every component
    dat.setForeground(new Color(0,250,0));//Sets the foreground Font color
    tim.setForeground(new Color(0,250,0));
    Border ml= BorderFactory.createLineBorder(Color.black,2);
    Border hv= BorderFactory.createLineBorder(Color.black,2);
    Border ty= BorderFactory.createLineBorder(Color.black,2);
    Malaria.setOpaque(true);
    Malaria.setBorder(ml);
    Hiv.setOpaque(true);
    Hiv.setBorder(hv);
    Typhoid.setOpaque(true);
    Typhoid.setBorder(ty);
    Border bord1= BorderFactory.createLineBorder(Color.blue,3);
    Border bord2= BorderFactory.createLineBorder(Color.blue,3);
    Border bord3= BorderFactory.createLineBorder(Color.blue,3);
    Border bord4= BorderFactory.createLineBorder(Color.red,4);
    Malaria.setBackground(Color.LIGHT_GRAY);
    mal.setFont(new Font(null, Font.ITALIC,15));
    mal.setForeground(Color.BLACK);
    Hiv.setBackground(Color.LIGHT_GRAY);
    hiv.setFont(new Font(null, Font.ITALIC,15));
    hiv.setForeground(Color.BLACK);
    Typhoid.setBackground(Color.LIGHT_GRAY);
    typ.setFont(new Font(null, Font.ITALIC,15));
    typ.setForeground(Color.BLACK);
    ilin.setBackground(Color.magenta);
    sum.setBackground(Color.gray);
    con.setBackground(Color.green);
    medicine.setLayout(null);
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
    inv.setForeground(Color.MAGENTA);
    inv.setFont(new Font("calibri",Font.BOLD,20));
    dates.setForeground(Color.DARK_GRAY);
    //Adds the panel components to the frame
    dateTime.add(dat);
    dateTime.add(tim);
    frame.add(Malaria);
    Malaria.add(mal);//adds the Malaria Label
    frame.add(Hiv);
    Hiv.add(hiv);//adds the HIV label
    frame.add(Typhoid);
    Typhoid.add(typ);//adds the Typhoid Label
    frame.add(ilin);
    frame.add(sum);//adds the summary Panel
    frame.add(log);
    frame.add(name);//adds the name text
    frame.add(fnam);//adds the first name text
    frame.add(fname);//adds the first name TextField
    frame.add(snam);//adds the second name text
    frame.add(sname);//adds the second name TextField
    frame.add(gen);//adds the Gender label
    frame.add(male);
    frame.add(males);
    frame.add(female);
    frame.add(females);
    frame.add(other);
    frame.add(othe);
    frame.add(pos);
    frame.add(position);
    frame.add(id);//adds ID label
    frame.add(Id);//adds the ID textField
    frame.add(doc);
    frame.add(docs);
    frame.add(pat);
    frame.add(pats);
    frame.add(sel);//adds the select label to the frame
    //add the labels,TextFields,TextArea and buttons to the panels
    ilin.add(il);//adds text to the panel
    ilin.add(ILn);//adds the textField to the panel
    ilin.add(con);//adds the confirm button to the panel
    ilin.add(medicine);//adss the medicine panel
    ilin.add(suc);//provides the Success message
    medicine.add(medication);//adds the medication label to the medicine panel
    sum.add(cont);//adds the country label to the panel
    sum.add(contr);//adds the country area to the panel
    sum.add(sum1);//adds the first summury panel to the summary panel
    sum1.add(dates);
    sum1.add(datbirth);
    sum1.add(datebirth);
    sum1.add(mon);
    sum1.add(months);
    sum1.add(yearbirth);
    sum1.add(years);
    sum.add(sum2);
    sum2.add(mod);
    sum2.add(cas);
    sum2.add(cash);
    sum2.add(mpsa);
    sum2.add(mpesa);
    sum2.add(pay);
    sum2.add(paypal);
    sum.add(sum3);
    sum3.add(paybill);
    sum3.add(payBill);
    sum3.add(send);
    sum.add(sum4);
    sum4.add(inv);
    Malaria.add(mal);
    
             JLabel lastlabel= new JLabel("Thank You!!!");
             JLabel good =new JLabel("GOOD LUCK!!!");
              Border bord= BorderFactory.createLineBorder(Color.green,2);
              lastlabel.setHorizontalTextPosition(JLabel.LEFT);//Sets a text position left,right,center
              good.setHorizontalTextPosition(JLabel.LEFT);//sets the text position of the Goodluck text position
              lastlabel.setVerticalTextPosition(JLabel.BOTTOM);//Sets a text position Top,Center or bottom of Image or Icon
              good.setVerticalTextPosition(JLabel.BOTTOM);//sets the good luck text to the Bottom 
              lastlabel.setForeground(new Color(0,0,250));// Sets font color of Text
              good.setForeground(new Color(20,100,250));
              lastlabel.setFont(new Font("MV Boli",Font.PLAIN,25));//sets font of text
              good.setFont(new Font("Calibri",Font.ITALIC,25));
              lastlabel.setBackground(Color.lightGray);//Sets background color
              good.setBackground(Color.LIGHT_GRAY); 
              lastlabel.setOpaque(true);//displays background color
              good.setOpaque(true);
              lastlabel.setBorder(bord);//sets the color of the border
              lastlabel.setVerticalAlignment(JLabel.BOTTOM);//sets the vertical position of the icon plus text;top,center bottom
              good.setVerticalAlignment(JLabel.BOTTOM); 
              lastlabel.setHorizontalAlignment(JLabel.LEFT);//sets the horizontal position of the icon plus the text,left,center,right
              good.setHorizontalAlignment(JLabel.LEFT);
              lastlabel.setBounds(5,500,250,50);
              good.setBounds(15,550,200,50);
              ilin.add(lastlabel);
              ilin.add(good);
    
    
    }
    }


