
package elly;


import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

  
class CarRentalView 
    extends JFrame
       implements ActionListener 
{ 
    //variables and components declaration

    private Container container; 
    private JLabel title; 
    private JLabel daysRented; 
    private JTextField itsDaysRented; 
    private JLabel baseCost;

    //price per day for car hire
    private static final double PRICE_PER_DAY = 2000.00;

    private String vehicleType, vehicleFeature, customerName,
            debitCard, startingDate, finalDate;
    private int daysrented;
    private double rentingCost;

    //variables to hold ranges of random numbers
    private static double a = 0.0, b = (1.0/10.0), c = 2*b, d = 3*b,
            f = 4*b, g = 5*b, h = 6*b, i = 7*b, j = 8*b, k = 9*b,
            l = 10*b;

    private JTextField itsBaseCost;
    private JLabel custName;
    private JTextField itsCustomerName;
    private JLabel creditCard;
    private JTextField itsCreditCard;
    private JLabel startingPeriod;
    private JComboBox itsStartMonth; 
    private static String[] months = {"January", "February", "March", "April",
   "May", "June", "July", "August","September", "October", "November", "December"};
    private JComboBox itsStartDay; 
    private static String[] days = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
   "11", "12", "13", "14","15", "16", "17", "18", "19", "20", "21", "22", "23","24", "25", "26",
    "27", "28", "29", "30", "31"};
    private JComboBox  itsStartHour;
    private static String[] hours = {"7am", "8am", "9am", "10am","11am", "noon", "1pm", "2pm", "3pm",
   "4pm", "5pm"};
    private JLabel endingPeriod;
    private JComboBox itsEndMonth;
    private JComboBox itsEndDay;
    private JComboBox itsEndHour;
    private JLabel check;
    private ButtonGroup checker; 
    private JCheckBox itsManual; 
    private JCheckBox itsAir; 
    private JCheckBox itsCD; 
    private JLabel choose; 
    private ButtonGroup chooser; 
    private JRadioButton compact; 
    private JRadioButton full_size; 
    private JRadioButton luxury; 
    private JRadioButton SUV; 
    private JButton submit; 
    private JButton reset; 
    private JTextArea output; 
    private JLabel res; 
    private JTextArea resadd;
    private JPanel displayCar;
  
    //constructor
    public CarRentalView() 
    { 
        setTitle("Felix Car Rental services");
        setBounds(200, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(false); 
  
        container = getContentPane(); 
        container.setLayout(null); 
        
        /*title = new JLabel("Felix Car Rentals");
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(400, 30); 
        container.add(title);*/
  
        daysRented = new JLabel("Enter days rented: "); 
        daysRented.setFont(new Font("Arial", Font.PLAIN, 15)); 
        daysRented.setSize(200, 20); 
        daysRented.setLocation(270, 25);
        container.add(daysRented); 
  
        itsDaysRented = new JTextField("1"); 
        itsDaysRented.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsDaysRented.setSize(20, 20);
        itsDaysRented.setLocation(410, 25);
        container.add(itsDaysRented); 
  
        baseCost = new JLabel("The base cost is: "); 
        baseCost.setFont(new Font("Arial", Font.PLAIN, 15)); 
        baseCost.setSize(200, 20); 
        baseCost.setLocation(430, 25);
        container.add(baseCost); 
  
        itsBaseCost = new JTextField("" + PRICE_PER_DAY);
        itsBaseCost.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsBaseCost.setSize(40, 20);
        itsBaseCost.setLocation(560, 25);
        container.add(itsBaseCost); 
        
        custName = new JLabel("Customer Name: "); 
        custName.setFont(new Font("Arial", Font.PLAIN, 15)); 
        custName.setSize(200, 20); 
        custName.setLocation(230, 75);
        container.add(custName); 
  
        itsCustomerName = new JTextField(18); 
        itsCustomerName.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsCustomerName.setSize(200, 20); 
        itsCustomerName.setLocation(360, 75);
        container.add(itsCustomerName); 
        
        creditCard = new JLabel("Credit Card: "); 
        creditCard.setFont(new Font("Arial", Font.PLAIN, 15)); 
        creditCard.setSize(200, 20); 
        creditCard.setLocation(560, 75);
        container.add(creditCard);  
  
        itsCreditCard = new JTextField(18); 
        itsCreditCard.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsCreditCard.setSize(200, 20); 
        itsCreditCard.setLocation(650, 75);
        container.add(itsCreditCard); 
        
        startingPeriod = new JLabel("starting month/day/hour:");
        startingPeriod.setFont(new Font("Arial", Font.PLAIN, 15)); 
        startingPeriod.setSize(300, 20);
        startingPeriod.setLocation(230, 125);
        container.add(startingPeriod);
        
  
        itsStartMonth = new JComboBox(months); 
        itsStartMonth.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsStartMonth.setSize(80, 20); 
        itsStartMonth.setLocation(420, 125);
        container.add(itsStartMonth); 
  
        itsStartDay = new JComboBox(days); 
        itsStartDay.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsStartDay.setSize(50, 20); 
        itsStartDay.setLocation(510, 125);
        container.add(itsStartDay);
        
        itsStartHour = new JComboBox(hours); 
        itsStartHour.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsStartHour.setSize(70, 20); 
        itsStartHour.setLocation(570, 125);
        container.add(itsStartHour); 
        
        endingPeriod = new JLabel("ending month/day/hour:");
        endingPeriod.setFont(new Font("Arial", Font.PLAIN, 15)); 
        endingPeriod.setSize(300, 20);
        endingPeriod.setLocation(230, 175);
        container.add(endingPeriod);
        
  
        itsEndMonth = new JComboBox(months); 
        itsEndMonth.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsEndMonth.setSize(80, 20); 
        itsEndMonth.setLocation(420, 175);
        container.add(itsEndMonth); 
  
        itsEndDay = new JComboBox(days); 
        itsEndDay.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsEndDay.setSize(50, 20); 
        itsEndDay.setLocation(510, 175);
        container.add(itsEndDay);
        
        itsEndHour = new JComboBox(hours); 
        itsEndHour.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsEndHour.setSize(70, 20); 
        itsEndHour.setLocation(570, 175);
        container.add(itsEndHour);
        
        /*check = new JLabel("Check: ");
        check.setFont(new Font("Arial", Font.PLAIN, 15)); 
        check.setSize(100, 20);
        check.setLocation(100, 340); 
        container.add(check);*/
        
        itsManual = new JCheckBox("manual", false); 
        itsManual.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsManual.setSize(80, 20); 
        itsManual.setLocation(70, 225);
        container.add(itsManual); 
  
        itsAir = new JCheckBox("air cond", true);
        itsAir.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsAir.setSize(100, 20);
        itsAir.setLocation(150, 225);
        container.add(itsAir);
        
        itsCD = new JCheckBox("CD player", true);
        itsCD.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsCD.setSize(100, 20); 
        itsCD.setLocation(250, 225);
        container.add(itsCD);
        
        //button group for check boxes
        checker = new ButtonGroup(); 
        checker.add(itsManual); 
        checker.add(itsAir);
        checker.add(itsCD);
        
        choose = new JLabel("Choose one: "); 
        choose.setFont(new Font("Arial", Font.PLAIN, 15)); 
        choose.setSize(100, 20);
        choose.setLocation(360, 225);
        container.add(choose);
        
        compact = new JRadioButton ("compact", true); 
        compact.setFont(new Font("Arial", Font.PLAIN, 15)); 
        compact.setSize(90, 20);
        compact.setLocation(450, 225);
        container.add(compact); 
  
        full_size = new JRadioButton ("full-size", false);
        full_size.setFont(new Font("Arial", Font.PLAIN, 15)); 
        full_size.setSize(90, 20);
        full_size.setLocation(540, 225);
        container.add(full_size);
        
        luxury = new JRadioButton ("luxury", false);
        luxury.setFont(new Font("Arial", Font.PLAIN, 15)); 
        luxury.setSize(80, 20);
        luxury.setLocation(627, 225);
        container.add(luxury);
        
        SUV = new JRadioButton ("SUV", false);
        SUV.setFont(new Font("Arial", Font.PLAIN, 15)); 
        SUV.setSize(80, 20);
        SUV.setLocation(710, 225);
        container.add(SUV);
        
        //button group for radio buttons
        chooser = new ButtonGroup(); 
        chooser.add(compact); 
        chooser.add(full_size);
        chooser.add(luxury);
        chooser.add(SUV);
  
        submit = new JButton("Submit"); 
        submit.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submit.setSize(100, 25); 
        submit.setLocation(120, 75);
        submit.addActionListener(this); 
        container.add(submit); 
  
        reset = new JButton("Clear");
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(100, 25); 
        reset.setLocation(10, 75);
        reset.addActionListener(this); 
        container.add(reset); 
        
        //display area for text ouput
        output = new JTextArea(); 
        output.setFont(new Font("Arial", Font.PLAIN, 15)); 
        output.setSize(300, 250);
        output.setLocation(50, 275);
        output.setLineWrap(true); 
        output.setEditable(false); 
        container.add(output); 
        
        //display area for car
        displayCar = new JPanel();
        displayCar.setSize(450, 250);
        displayCar.setLocation(400, 275);
        output.setLineWrap(true); 
        output.setEditable(false); 
        displayCar.setBackground(Color.white);
        container.add(displayCar);
        
        setVisible(true); 
    }  
    
    public void actionPerformed(ActionEvent e) 
    { 
        //submit button clicked
        if (e.getSource() == submit) 
        { 
            //a graphic "clear" to reset the previous car
            Graphics clear = displayCar.getGraphics();
            clear.setColor(Color.white);
            clear.fillRect(0,0,450,250);
            //retrieving checked buttons
            if(itsManual.isSelected())
            {
               vehicleType = " Vehicle Model: Manual \n";

            }
            if(itsAir.isSelected())
            {
               vehicleType = " Vehicle Model: Air Cond \n";
            }
            if(itsCD.isSelected())
            {
               vehicleType = " Vehicle Model: CD Player \n";
            }

            //Compact car

            if(compact.isSelected())
            {
                vehicleFeature = " Vehicle Feature:  Compact \n";

                //code to draw the car
                Graphics graphic = displayCar.getGraphics();
                double Picker = Math.random();

                //car dimensions and color determined from random number "Picker"
                if ((Picker>=a)&&(Picker<b))
                {
                    graphic.setColor(Color.red);

                }
                else if ((Picker>=b)&&(Picker<c))
                {
                    graphic.setColor(Color.black);


                }
                else if ((Picker>=c)&&(Picker<d))
                {
                    graphic.setColor(Color.blue);

                }
                else if ((Picker>=d)&&(Picker < f))
                {
                    graphic.setColor(Color.cyan);

                }
                else if ((Picker>=f)&&(Picker<g))
                {
                    graphic.setColor(Color.orange);

                }
                else if ((Picker>=g)&&(Picker<h))
                {
                    graphic.setColor(Color.pink);

                }
                else if ((Picker>=h)&&(Picker<i))
                {
                    graphic.setColor(Color.darkGray);

                }
                else if ((Picker>=i)&&(Picker<j))
                {
                    graphic.setColor(Color.magenta);

                }
                else if ((Picker>=j)&&(Picker<k))
                {
                    graphic.setColor(Color.lightGray);

                }
                else if ((Picker>=k)&&(Picker<l))
                {
                    graphic.setColor(Color.yellow);

                }
                //drawing the car
                graphic.fillRect(110, 80, 225, 40);

                //petals flower 1
                graphic.fillOval(30,160,20,20);
                graphic.fillOval(30,180,20,20);
                graphic.fillOval(50,160,20,20);
                graphic.fillOval(50,180,20,20);

                // petals flower 2
                graphic.fillOval(80,160,20,20);
                graphic.fillOval(80,180,20,20);
                graphic.fillOval(100,160,20,20);
                graphic.fillOval(100,180,20,20);

                // petals flower 3
                //graphic.setColor(Color.red);
                graphic.fillOval(150,160,20,20);
                graphic.fillOval(150,180,20,20);
                graphic.fillOval(170,160,20,20);
                graphic.fillOval(170,180,20,20);

                // petals flower 4
                //graphic.setColor(Color.red);
                graphic.fillOval(190,160,20,20);
                graphic.fillOval(190,180,20,20);
                graphic.fillOval(210,160,20,20);
                graphic.fillOval(210,180,20,20);

                // petals flower 5
                //graphic.setColor(Color.red);
                graphic.fillOval(230,160,20,20);
                graphic.fillOval(230,180,20,20);
                graphic.fillOval(250,160,20,20);
                graphic.fillOval(250,180,20,20);

                // petals flower 6
                //graphic.setColor(Color.red);
                graphic.fillOval(270,160,20,20);
                graphic.fillOval(270,180,20,20);
                graphic.fillOval(290,160,20,20);
                graphic.fillOval(290,180,20,20);

                // this is for the upper polygon
                int[]x = {145,160,250,280};
                int[]y = {80,40,40,80};

                graphic.fillPolygon(x,y,4);

                //this is for car's wheel
                graphic.setColor(Color.white);
                graphic.fillOval(145, 100, 40, 40);
                graphic.drawOval(145, 140, 40, 40);

                // this is also for cars wheel
                graphic.setColor(Color.black);
                graphic.fillOval(150, 105, 30, 35);
                graphic.drawOval(150, 105, 30, 35);

                // this is also cars wheel
                graphic.setColor(Color.white);
                graphic.fillOval(255,100,40,40);
                graphic.drawOval(255,140,40,40);

                //this is also for cars wheel
                graphic.setColor(Color.black);
                graphic.fillOval(260,105,30,35);
                graphic.drawOval(260,105,30,35);

                // this is also cars wheel
                graphic.setColor(Color.white);
                graphic.fillOval(160, 111, 10, 20);
                graphic.drawOval(160, 111, 10, 20);

                //this is also cars wheel
                graphic.setColor(Color.white);
                graphic.fillOval(270, 111, 10, 20);
                graphic.drawOval(270, 111, 10, 20);

                // this is the value of declaration part of polygon
                int []x1={165,175,220,240};
                int []y1={70,50,50,70};

                //this is for polygon
                graphic.setColor(Color.white);
                graphic.fillPolygon(x1,y1,4);
                graphic.drawPolygon(x1,y1,4);

                // this is for car's window
                graphic.setColor(Color.black);
                graphic.fillRect(197,50,10,20);
                graphic.drawRect(197,50,10,20);


                //this is for car rear lights
                graphic.setColor(Color.red);
                graphic.fillRect(110,90,10,25);
                graphic.drawRect(110,90,10,25);

                //this is for car headlights
                graphic.setColor(Color.yellow);
                graphic.fillOval(319,90,15,17);
                graphic.drawOval(319,90,15,17);

                //center flower 1
                graphic.setColor(Color.black);
                graphic.fillOval(40,170,20,20);
                graphic.drawRect(48,175,5,40);

                //car path
                graphic.drawLine(10,140,440,140);
                graphic.drawLine(10,142,440,142);

                //center flower 2
                graphic.setColor(Color.orange);
                graphic.fillOval(90,170,20,20);
                graphic.drawRect(98,175,5,40);

                //center flower 3
                graphic.setColor(Color.pink);
                graphic.fillOval(160,170,20,20);
                graphic.drawRect(168,175,5,40);

                //center flower 4
                graphic.setColor(Color.yellow);
                graphic.fillOval(200,170,20,20);
                graphic.drawRect(208,175,5,40);

                //center flower 5
                graphic.setColor(Color.magenta);
                graphic.fillOval(240,170,20,20);
                graphic.drawRect(248,175,5,40);

                //center flower 6
                graphic.setColor(Color.darkGray);
                graphic.fillOval(280,170,20,20);
                graphic.drawRect(288,175,5,40);
                output.setEditable(false);
            }



            //Full size car

            if(full_size.isSelected())
            {
                vehicleFeature = " Vehicle Feature: Full Size \n";
                //code to draw the car
                Graphics graphic = displayCar.getGraphics();
                double Picker = Math.random();

                //car dimensions and color determined from random number "Picker"
                if ((Picker>=a)&&(Picker<b))
                {
                    graphic.setColor(Color.red);

                }
                else if ((Picker>=b)&&(Picker<c))
                {
                    graphic.setColor(Color.black);


                }
                else if ((Picker>=c)&&(Picker<d))
                {
                    graphic.setColor(Color.blue);

                }
                else if ((Picker>=d)&&(Picker < f))
                {
                    graphic.setColor(Color.cyan);

                }
                else if ((Picker>=f)&&(Picker<g))
                {
                    graphic.setColor(Color.orange);

                }
                else if ((Picker>=g)&&(Picker<h))
                {
                    graphic.setColor(Color.pink);

                }
                else if ((Picker>=h)&&(Picker<i))
                {
                    graphic.setColor(Color.darkGray);

                }
                else if ((Picker>=i)&&(Picker<j))
                {
                    graphic.setColor(Color.magenta);

                }
                else if ((Picker>=j)&&(Picker<k))
                {
                    graphic.setColor(Color.lightGray);

                }
                else if ((Picker>=k)&&(Picker<l))
                {
                    graphic.setColor(Color.yellow);

                }
                //drawing the car
                graphic.fillRect(110, 80, 225, 50);

                //petals flower 1
                graphic.fillOval(30,160,20,20);
                graphic.fillOval(30,180,20,20);
                graphic.fillOval(50,160,20,20);
                graphic.fillOval(50,180,20,20);

                // petals flower 2
                graphic.fillOval(80,160,20,20);
                graphic.fillOval(80,180,20,20);
                graphic.fillOval(100,160,20,20);
                graphic.fillOval(100,180,20,20);

                // petals flower 3
                //graphic.setColor(Color.red);
                graphic.fillOval(150,160,20,20);
                graphic.fillOval(150,180,20,20);
                graphic.fillOval(170,160,20,20);
                graphic.fillOval(170,180,20,20);

                // petals flower 4
                //graphic.setColor(Color.red);
                graphic.fillOval(190,160,20,20);
                graphic.fillOval(190,180,20,20);
                graphic.fillOval(210,160,20,20);
                graphic.fillOval(210,180,20,20);

                // petals flower 5
                //graphic.setColor(Color.red);
                graphic.fillOval(230,160,20,20);
                graphic.fillOval(230,180,20,20);
                graphic.fillOval(250,160,20,20);
                graphic.fillOval(250,180,20,20);

                // petals flower 6
                //graphic.setColor(Color.red);
                graphic.fillOval(270,160,20,20);
                graphic.fillOval(270,180,20,20);
                graphic.fillOval(290,160,20,20);
                graphic.fillOval(290,180,20,20);

                // this is for the upper polygon
                int[]x = {110,125,250,300};
                int[]y = {80,40,40,80};

                graphic.fillPolygon(x,y,4);

                //this is for car's wheel
                graphic.setColor(Color.white);
                graphic.fillOval(145, 100, 40, 40);
                graphic.drawOval(145, 140, 40, 40);

                // this is also for cars wheel
                graphic.setColor(Color.black);
                graphic.fillOval(150, 105, 30, 35);
                graphic.drawOval(150, 105, 30, 35);

                // this is also cars wheel
                graphic.setColor(Color.white);
                graphic.fillOval(255,100,40,40);
                graphic.drawOval(255,140,40,40);

                //this is also for cars wheel
                graphic.setColor(Color.black);
                graphic.fillOval(260,105,30,35);
                graphic.drawOval(260,105,30,35);

                // this is also cars wheel
                graphic.setColor(Color.white);
                graphic.fillOval(160, 111, 10, 20);
                graphic.drawOval(160, 111, 10, 20);

                //this is also cars wheel
                graphic.setColor(Color.white);
                graphic.fillOval(270, 111, 10, 20);
                graphic.drawOval(270, 111, 10, 20);

                // this is the value of declaration part of polygon
                int []x1={120,130,250,270};
                int []y1={75,50,50,75};

                //this is for polygon
                graphic.setColor(Color.white);
                graphic.fillPolygon(x1,y1,4);
                graphic.drawPolygon(x1,y1,4);

                // this is for car's window
                graphic.setColor(Color.black);
                graphic.fillRect(130,50,5,25);
                graphic.drawRect(130,50,5,25);

                graphic.fillRect(180,50,5,25);
                graphic.drawRect(180,50,5,25);

                graphic.fillRect(240,50,5,25);
                graphic.drawRect(240,50,5,25);



                //this is for car rear lights
                graphic.setColor(Color.red);
                graphic.fillRect(110,90,10,25);
                graphic.drawRect(110,90,10,25);

                //this is for car headlights
                graphic.setColor(Color.yellow);
                graphic.fillOval(319,90,15,20);
                graphic.drawOval(319,90,15,20);

                //center flower 1
                graphic.setColor(Color.blue);
                graphic.fillOval(40,170,20,20);
                graphic.drawRect(48,175,5,40);

                //car path
                graphic.drawLine(10,140,440,140);
                graphic.drawLine(10,142,440,142);

                //center flower 2
                graphic.setColor(Color.orange);
                graphic.fillOval(90,170,20,20);
                graphic.drawRect(98,175,5,40);

                //center flower 3
                graphic.setColor(Color.pink);
                graphic.fillOval(160,170,20,20);
                graphic.drawRect(168,175,5,40);

                //center flower 4
                graphic.setColor(Color.yellow);
                graphic.fillOval(200,170,20,20);
                graphic.drawRect(208,175,5,40);

                //center flower 5
                graphic.setColor(Color.magenta);
                graphic.fillOval(240,170,20,20);
                graphic.drawRect(248,175,5,40);

                //center flower 6
                graphic.setColor(Color.darkGray);
                graphic.fillOval(280,170,20,20);
                graphic.drawRect(288,175,5,40);
                output.setEditable(false);
            }
            //Luxury car


            if(luxury.isSelected())
            {
               vehicleFeature = " Vehicle Feature: Luxury \n";
                //code to draw the car
                Graphics graphic = displayCar.getGraphics();
                double Picker = Math.random();

                //car dimensions and color determined from random number "Picker"
                if ((Picker>=a)&&(Picker<b))
                {
                    graphic.setColor(Color.red);

                }
                else if ((Picker>=b)&&(Picker<c))
                {
                    graphic.setColor(Color.black);


                }
                else if ((Picker>=c)&&(Picker<d))
                {
                    graphic.setColor(Color.blue);

                }
                else if ((Picker>=d)&&(Picker < f))
                {
                    graphic.setColor(Color.cyan);

                }
                else if ((Picker>=f)&&(Picker<g))
                {
                    graphic.setColor(Color.orange);

                }
                else if ((Picker>=g)&&(Picker<h))
                {
                    graphic.setColor(Color.pink);

                }
                else if ((Picker>=h)&&(Picker<i))
                {
                    graphic.setColor(Color.darkGray);

                }
                else if ((Picker>=i)&&(Picker<j))
                {
                    graphic.setColor(Color.magenta);

                }
                else if ((Picker>=j)&&(Picker<k))
                {
                    graphic.setColor(Color.lightGray);

                }
                else if ((Picker>=k)&&(Picker<l))
                {
                    graphic.setColor(Color.yellow);

                }
                //drawing the car
                graphic.fillRect(70, 80, 290, 50);

                //petals flower 1
                graphic.fillOval(30,160,20,20);
                graphic.fillOval(30,180,20,20);
                graphic.fillOval(50,160,20,20);
                graphic.fillOval(50,180,20,20);

                // petals flower 2
                graphic.fillOval(80,160,20,20);
                graphic.fillOval(80,180,20,20);
                graphic.fillOval(100,160,20,20);
                graphic.fillOval(100,180,20,20);

                // petals flower 3
                //graphic.setColor(Color.red);
                graphic.fillOval(150,160,20,20);
                graphic.fillOval(150,180,20,20);
                graphic.fillOval(170,160,20,20);
                graphic.fillOval(170,180,20,20);

                // petals flower 4
                //graphic.setColor(Color.red);
                graphic.fillOval(190,160,20,20);
                graphic.fillOval(190,180,20,20);
                graphic.fillOval(210,160,20,20);
                graphic.fillOval(210,180,20,20);

                // petals flower 5
                //graphic.setColor(Color.red);
                graphic.fillOval(230,160,20,20);
                graphic.fillOval(230,180,20,20);
                graphic.fillOval(250,160,20,20);
                graphic.fillOval(250,180,20,20);

                // petals flower 6
                //graphic.setColor(Color.red);
                graphic.fillOval(270,160,20,20);
                graphic.fillOval(270,180,20,20);
                graphic.fillOval(290,160,20,20);
                graphic.fillOval(290,180,20,20);

                // this is for the upper polygon
                int[]x = {110,125,250,300};
                int[]y = {80,40,40,80};

                graphic.fillPolygon(x,y,4);

                //this is for car's wheel
                graphic.setColor(Color.white);
                graphic.fillOval(145, 100, 40, 40);
                graphic.drawOval(145, 140, 40, 40);

                // this is also for cars wheel
                graphic.setColor(Color.black);
                graphic.fillOval(150, 105, 30, 35);
                graphic.drawOval(150, 105, 30, 35);

                // this is also cars wheel
                graphic.setColor(Color.white);
                graphic.fillOval(255,100,40,40);
                graphic.drawOval(255,140,40,40);

                //this is also for cars wheel
                graphic.setColor(Color.black);
                graphic.fillOval(260,105,30,35);
                graphic.drawOval(260,105,30,35);

                // this is also cars wheel
                graphic.setColor(Color.white);
                graphic.fillOval(160, 111, 10, 20);
                graphic.drawOval(160, 111, 10, 20);

                //this is also cars wheel
                graphic.setColor(Color.white);
                graphic.fillOval(270, 111, 10, 20);
                graphic.drawOval(270, 111, 10, 20);

                // this is the value of declaration part of polygon
                int []x1={120,130,250,270};
                int []y1={75,50,50,75};

                //this is for polygon
                graphic.setColor(Color.white);
                graphic.fillPolygon(x1,y1,4);
                graphic.drawPolygon(x1,y1,4);

                // this is for car's window
                graphic.setColor(Color.black);
                graphic.fillRect(130,50,5,25);
                graphic.drawRect(130,50,5,25);

                graphic.fillRect(180,50,5,25);
                graphic.drawRect(180,50,5,25);

                graphic.fillRect(240,50,5,25);
                graphic.drawRect(240,50,5,25);


                //this is for car rear lights
                graphic.setColor(Color.magenta);
                graphic.fillRect(70,90,10,25);
                graphic.drawRect(70,90,10,25);

                //this is for car headlights
                graphic.setColor(Color.cyan);
                graphic.fillOval(347,90,15,20);
                graphic.drawOval(347,90,15,20);

                //center flower 1
                graphic.setColor(Color.black);
                graphic.fillOval(40,170,20,20);
                graphic.drawRect(48,175,5,40);

                //car path
                graphic.drawLine(10,140,440,140);
                graphic.drawLine(10,142,440,142);

                //center flower 2
                graphic.setColor(Color.orange);
                graphic.fillOval(90,170,20,20);
                graphic.drawRect(98,175,5,40);

                //center flower 3
                graphic.setColor(Color.pink);
                graphic.fillOval(160,170,20,20);
                graphic.drawRect(168,175,5,40);

                //center flower 4
                graphic.setColor(Color.yellow);
                graphic.fillOval(200,170,20,20);
                graphic.drawRect(208,175,5,40);

                //center flower 5
                graphic.setColor(Color.magenta);
                graphic.fillOval(240,170,20,20);
                graphic.drawRect(248,175,5,40);

                //center flower 6
                graphic.setColor(Color.darkGray);
                graphic.fillOval(280,170,20,20);
                graphic.drawRect(288,175,5,40);
                output.setEditable(false);
            }

            //SUV Car

            if(SUV.isSelected())
            {
                vehicleFeature = " Vehicle Feature: SUV \n";
                //code to draw the car
                Graphics graphic = displayCar.getGraphics();
                double Picker = Math.random();

                //car dimensions and color determined from random number "Picker"
                if ((Picker>=a)&&(Picker<b))
                {
                    graphic.setColor(Color.red);

                }
                else if ((Picker>=b)&&(Picker<c))
                {
                    graphic.setColor(Color.black);


                }
                else if ((Picker>=c)&&(Picker<d))
                {
                    graphic.setColor(Color.blue);

                }
                else if ((Picker>=d)&&(Picker < f))
                {
                    graphic.setColor(Color.cyan);

                }
                else if ((Picker>=f)&&(Picker<g))
                {
                    graphic.setColor(Color.orange);

                }
                else if ((Picker>=g)&&(Picker<h))
                {
                    graphic.setColor(Color.pink);

                }
                else if ((Picker>=h)&&(Picker<i))
                {
                    graphic.setColor(Color.darkGray);

                }
                else if ((Picker>=i)&&(Picker<j))
                {
                    graphic.setColor(Color.magenta);

                }
                else if ((Picker>=j)&&(Picker<k))
                {
                    graphic.setColor(Color.lightGray);

                }
                else if ((Picker>=k)&&(Picker<l))
                {
                    graphic.setColor(Color.yellow);

                }

                graphic.fillRect(107, 80, 225, 40);

                //petals flower 1
                graphic.fillOval(30,160,20,20);
                graphic.fillOval(30,180,20,20);
                graphic.fillOval(50,160,20,20);
                graphic.fillOval(50,180,20,20);

                // petals flower 2
                graphic.fillOval(80,160,20,20);
                graphic.fillOval(80,180,20,20);
                graphic.fillOval(100,160,20,20);
                graphic.fillOval(100,180,20,20);

                // petals flower 3
                //graphic.setColor(Color.red);
                graphic.fillOval(150,160,20,20);
                graphic.fillOval(150,180,20,20);
                graphic.fillOval(170,160,20,20);
                graphic.fillOval(170,180,20,20);

                // petals flower 4
                //graphic.setColor(Color.red);
                graphic.fillOval(190,160,20,20);
                graphic.fillOval(190,180,20,20);
                graphic.fillOval(210,160,20,20);
                graphic.fillOval(210,180,20,20);

                // petals flower 5
                //graphic.setColor(Color.red);
                graphic.fillOval(230,160,20,20);
                graphic.fillOval(230,180,20,20);
                graphic.fillOval(250,160,20,20);
                graphic.fillOval(250,180,20,20);

                // petals flower 6
                //graphic.setColor(Color.red);
                graphic.fillOval(270,160,20,20);
                graphic.fillOval(270,180,20,20);
                graphic.fillOval(290,160,20,20);
                graphic.fillOval(290,180,20,20);


                // this is for the upper polygon
                int[]x = {110,125,250,300};
                int[]y = {80,40,40,80};

                graphic.fillPolygon(x,y,4);

                //this is for car's wheel
                graphic.setColor(Color.white);
                graphic.fillOval(145, 100, 40, 40);
                graphic.drawOval(145, 140, 40, 40);

                // this is also for cars wheel
                graphic.setColor(Color.black);
                graphic.fillOval(150, 105, 30, 35);
                graphic.drawOval(150, 105, 30, 35);

                // this is also cars wheel
                graphic.setColor(Color.white);
                graphic.fillOval(255,100,40,40);
                graphic.drawOval(255,140,40,40);

                //this is also for cars wheel
                graphic.setColor(Color.black);
                graphic.fillOval(260,105,30,35);
                graphic.drawOval(260,105,30,35);

                // this is also cars wheel
                graphic.setColor(Color.white);
                graphic.fillOval(160, 111, 10, 20);
                graphic.drawOval(160, 111, 10, 20);

                //this is also cars wheel
                graphic.setColor(Color.white);
                graphic.fillOval(270, 111, 10, 20);
                graphic.drawOval(270, 111, 10, 20);

                // this is the value of declaration part of polygon
                int []x1={120,130,250,270};
                int []y1={75,50,50,75};

                //this is for polygon
                graphic.setColor(Color.white);
                graphic.fillPolygon(x1,y1,4);
                graphic.drawPolygon(x1,y1,4);

                // this is for car's window
                graphic.setColor(Color.black);
                graphic.fillRect(130,50,5,25);
                graphic.drawRect(130,50,5,25);

                graphic.fillRect(180,50,5,25);
                graphic.drawRect(180,50,5,25);

                graphic.fillRect(240,50,5,25);
                graphic.drawRect(240,50,5,25);

                //this is for car rear lights
                graphic.setColor(Color.red);
                graphic.fillOval(107,90,10,25);
                graphic.drawOval(107,90,10,25);

                //this is for car headlights
                graphic.setColor(Color.cyan);
                graphic.fillRect(316,90,15,17);
                graphic.drawRect(316,90,15,17);

                //center flower 1
                graphic.setColor(Color.black);
                graphic.fillOval(40,170,20,20);
                graphic.drawRect(48,175,5,40);

                //car path
                graphic.setColor(Color.black);
                graphic.drawLine(10,140,440,140);
                graphic.drawLine(10,142,440,142);

                //center flower 2
                graphic.setColor(Color.red);
                graphic.fillOval(90,170,20,20);
                graphic.drawRect(98,175,5,40);

                //center flower 2
                graphic.setColor(Color.pink);
                graphic.fillOval(90,170,20,20);
                graphic.drawRect(98,175,5,40);

                //center flower 3
                graphic.setColor(Color.green);
                graphic.fillOval(160,170,20,20);
                graphic.drawRect(168,175,5,40);

                //center flower 4
                graphic.setColor(Color.yellow);
                graphic.fillOval(200,170,20,20);
                graphic.drawRect(208,175,5,40);

                //center flower 5
                graphic.setColor(Color.magenta);
                graphic.fillOval(240,170,20,20);
                graphic.drawRect(248,175,5,40);

                //center flower 6
                graphic.setColor(Color.darkGray);
                graphic.fillOval(280,170,20,20);
                graphic.drawRect(288,175,5,40);
                output.setEditable(false);
            }

            customerName = " Customer Name: " + itsCustomerName.getText() + "\n";
            debitCard = " Credit Card: " + itsCreditCard.getText() + "\n";
            daysrented = Integer.parseInt (itsDaysRented.getText());

            //calculating renting cost for the given days
            rentingCost = (double)daysrented * PRICE_PER_DAY;
            startingDate  = " Starting Date: " +(String)itsStartMonth.getSelectedItem()
                + "/" + (String)itsStartDay.getSelectedItem()
                + "/" + (String)itsStartHour.getSelectedItem()+";\n";

            finalDate  = " Final Date:" + (String)itsEndMonth.getSelectedItem()
                + "/" + (String)itsEndDay.getSelectedItem()
                + "/" + (String)itsEndHour.getSelectedItem() + ".\n";
            output.setText(customerName + debitCard + vehicleType + vehicleFeature
                      + startingDate + finalDate + " Renting Cost: " + rentingCost +"\n\n");


        }

        //resetting button
        else if (e.getSource() == reset)
        {
            String def = "";
            itsCustomerName.setText(def);
            itsCreditCard.setText(def);
            output.setText(def);
            itsStartMonth.setSelectedIndex(0);
            itsStartDay.setSelectedIndex(0);
            itsStartHour.setSelectedIndex(0);
            itsEndMonth.setSelectedIndex(0);
            itsEndDay.setSelectedIndex(0);
            itsEndHour.setSelectedIndex(0);

            //a graphic "clear" to reset the previous car
            Graphics res = displayCar.getGraphics();
            res.setColor(Color.white);
            res.fillRect(0,0,450,250);
        }
    } 
} 