import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.*;
/**
 * 
 * @author Surya Senthil
 *
 * Code for a BMI Calculator
 */
public class BodyFat implements ActionListener{
   private JLabel wel, hl, sen, ft, lbs, wal, hlin, nk, nkin, hpin, bmisen, pbfsen, whrsen, hp, walin;
   private JTextField hltxt, hltxt2, weltxt, waltxt, nktxt, hptxt;
   private int protein;
   private double bmi, whr, pbf;
   private String bmi1, whr1, weight1;
   private JPanel bottom, mid, top, gender, clcal;
   private JFrame one;
   private JPanel levOfActTable, sedentary, moderate, active;
   private JLabel sex, levOfActLabel;
   private ButtonGroup mf, levOfActSma;
   private JRadioButton male, female, sedent, moder, activ;
   private JButton clear, calculate;
   private GridBagConstraints gc;
   private GridBagConstraints gc2;
//    private GridBagConstraints gc3;
   
   public static void main(String[] args){
      BodyFat gui = new BodyFat();
      
   }
   public BodyFat(){
      //Frames and panels
      one = new JFrame("BMI and Body Fat Calculator");
      top = new JPanel();
      gender = new JPanel();
      mid = new JPanel();
      clcal = new JPanel();
      bottom = new JPanel();
            
      //Variables
      bmi =  0.0;
      whr = 0.0;
      pbf = 0.0;
      protein = 0;
      bmi1 = "";
      whr1 = "";
      weight1 = "";
      gc = new GridBagConstraints();
      gc2 = new GridBagConstraints();
      gc.insets = new Insets(5,0,0,0);
      
      //Height section
      hl = new JLabel("Height:");
      hltxt = new JTextField(4);
      ft = new JLabel(" feet");
      hltxt2 = new JTextField(4);
      hlin = new JLabel(" inches");
      
      //Weight section  
      wel = new JLabel("Weight:");
      weltxt = new JTextField(4);
      lbs = new JLabel(" pounds");
      
      //Wasit section
      wal = new JLabel("Waist:");
      waltxt = new JTextField(4);
      walin = new JLabel(" inches");
      
      //Neck section
      nk = new JLabel("Neck:");
      nktxt = new JTextField(4);
      nkin = new JLabel(" inches");
      
      //Hips section
      hp = new JLabel("Hips (Female):");
      hptxt = new JTextField(4);
      hpin = new JLabel(" inches"); 
      
      //Parts of Activity Table
      levOfActTable = new JPanel();
      sedentary = new JPanel();
      moderate = new JPanel();
      active = new JPanel();   
      
      //Sentence section
      bmisen = new JLabel("<html>&ensp&ensp&nbsp Body Mass Index: </html>");
      whrsen = new JLabel("<html> Waist-to-Height ratio: </html>");
      pbfsen = new JLabel("<html>&ensp&ensp&nbsp Percent Body Fat: </html>");
      sen = new JLabel();
            
      //Buttons and Labels
      sex = new JLabel("Sex: ");
      levOfActLabel = new JLabel("<html>&emsp&emsp&ensp Level of &nbsp&nbsp<br/>&ensp&emsp&emsp Activity: &nbsp</html>");
      mf = new ButtonGroup();
      levOfActSma = new ButtonGroup();
      male = new JRadioButton("<html><font color=rgb(255,165,0)>Male</font></html>");
      female = new JRadioButton("<html><font color=rgb(255,20,147)>Female</font></html>");
      sedent = new JRadioButton("<html><font color=red>sedentary</font></html>");
      moder = new JRadioButton("<html><font color=blue>moderate</font></html>");
      activ = new JRadioButton("<html><font color=green>active</font></html>");
      clear = new JButton("Clear");
      calculate = new JButton("Calculate");
            
   //Set Panel and Frame Layouts
      
      //Adding RadioButtons to Button Groups
      mf.add(male);
      mf.add(female);
      levOfActSma.add(sedent); 
      levOfActSma.add(moder);
      levOfActSma.add(activ);     
      
      //LevOfActTable
      levOfActTable.setLayout(new GridLayout(3, 1));
      levOfActTable.add(sedentary);
      levOfActTable.add(moderate);
      levOfActTable.add(active);
      
      levOfActSma.add(sedent);
      levOfActSma.add(moder);
      levOfActSma.add(activ);
      
         //Sedentary
         sedentary.setLayout(new BorderLayout());
         sedentary.add(sedent, BorderLayout.CENTER);
         sedentary.setBorder(BorderFactory.createLineBorder(Color.black));
         
         //Moderate
         moderate.setLayout(new BorderLayout());
         moderate.add(moder, BorderLayout.CENTER);
         moderate.setBorder(BorderFactory.createLineBorder(Color.black));
         
         //Active
         active.setLayout(new BorderLayout());
         active.add(activ, BorderLayout.CENTER);
         active.setBorder(BorderFactory.createLineBorder(Color.black));
            
      //Add Labels to Top Panel
      top.setLayout(new GridBagLayout());
      gc.anchor = GridBagConstraints.LINE_END;
      gc.ipadx = 5;
      gc.ipady = 5;
      gc.weighty = 3;
      gc.weightx = 0;
      gc.gridx = 0;
      gc.gridy = 0;
      top.add(hl, gc);
      
      gc.gridx = 0;
      gc.gridy = 1;
      top.add(wel, gc);
            
      gc.gridx = 0;
      gc.gridy = 2;
      top.add(wal, gc);
            
      gc.gridx = 0;
      gc.gridy = 3;
      top.add(nk, gc);
            
      gc.gridx = 0;
      gc.gridy = 4;
      top.add(hp, gc);
      
      gc.anchor = GridBagConstraints.CENTER;
      gc.gridx = 1;
      gc.gridy = 0;
      top.add(hltxt, gc);
            
      gc.gridx = 1;
      gc.gridy = 1;
      top.add(weltxt, gc);
      
      gc.gridx = 1;
      gc.gridy = 2;
      top.add(waltxt, gc);
            
      gc.gridx = 1;
      gc.gridy = 3;
      top.add(nktxt, gc);
            
      gc.gridx = 1;
      gc.gridy = 4;
      top.add(hptxt, gc);
      
      gc.anchor = GridBagConstraints.LINE_START;
      gc.gridx = 2;
      gc.gridy = 0;
      top.add(ft, gc);
            
      gc.gridx = 2;
      gc.gridy = 1;
      top.add(lbs, gc);
      
      gc.gridx = 2;
      gc.gridy = 2;
      top.add(walin, gc);
      
      gc.gridx = 2;
      gc.gridy = 3;
      top.add(nkin, gc);
      
      gc.gridx = 2;
      gc.gridy = 4;
      top.add(hpin, gc);
      
      gc.anchor = GridBagConstraints.CENTER;
      gc.gridx = 3;
      gc.gridy = 0;
      top.add(hltxt2, gc);
           
      gc.anchor = GridBagConstraints.LINE_START;
      gc.gridx = 4;
      gc.gridy = 0;
      top.add(hlin, gc);
      
      //Add Labels to Gender Panel
      gender.setLayout(new GridBagLayout());
      gc.anchor = GridBagConstraints.LINE_END;
      gc.ipadx = 5;
      gc.ipady = 5;
      gc.weighty = 0;
      gc.weightx = 0;
      gc.gridx = 1;
      gc.gridy = 0;
      gender.add(sex, gc);
      
      gc.gridx = 2;
      gc.gridy = 0;
      gender.add(male, gc);
      
      gc.gridx = 3;
      gc.gridy = 0;
      gender.add(female, gc);
      
      //Add Labels to middle panel
      mid.setLayout(new GridBagLayout());
      gc.anchor = GridBagConstraints.LINE_START;
      gc.ipadx = 0;
      gc.ipady = 0;
      gc.weighty = 0;
      gc.weightx = 0;
      gc.gridx = 0;
      gc.gridy = 0;
      mid.add(levOfActLabel, gc);
      
      gc.gridx = 1;
      gc.gridy = 0;
      mid.add(levOfActTable, gc);
      
      //Add Labels to clcal panel
      clcal.setLayout(new FlowLayout());
      clcal.add(clear);
      clcal.add(calculate);
      
      //Add Labels to bottom panel
      bottom.setLayout(new GridBagLayout());
      gc2.anchor = GridBagConstraints.CENTER;
      gc2.gridx = 0;
      gc2.gridy = 0;
      bottom.add(bmisen, gc2);
      
      gc2.gridx = 0;
      gc2.gridy = 1;
      bottom.add(whrsen, gc2);
      
      gc2.gridx = 0;
      gc2.gridy = 2;
      bottom.add(pbfsen, gc2);
      
      gc2.gridx = 0;
      gc2.gridy = 3;
      bottom.add(sen, gc2);
            
      //Adding all Panels to Frame
      one.setLayout(new GridBagLayout());
      gc.anchor = GridBagConstraints.CENTER;
      gc.ipadx = 0;
      gc.ipady = 0;
      gc.weighty = 0;
      gc.weightx = 0;
      gc.gridx = 0;
      gc.gridy = 0;
      one.add(top, gc);
      
      gc.weighty = 0;
      gc.gridx = 0;
      gc.gridy = 1;
      one.add(gender, gc);
      
      gc.anchor = GridBagConstraints.WEST;
      gc.gridx = 0;
      gc.gridy = 2;
      one.add(mid, gc);
      
      gc.anchor = GridBagConstraints.CENTER;
      gc.gridx = 0;
      gc.gridy = 3;
      one.add(clcal, gc);
      
      gc.anchor = GridBagConstraints.CENTER;
      gc.gridx = 0;
      gc.gridy = 4;
      one.add(bottom, gc);   
            
      //Set Defaults
      one.setSize(375, 550);
      one.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      one.setVisible(true);
      
         //Action commands
         clear.setActionCommand("clear");
         calculate.setActionCommand("calc");
         male.setActionCommand("m");
         female.setActionCommand("f");
         sedent.setActionCommand("sed");
         moder.setActionCommand("mod");
         activ.setActionCommand("act");
   
         //Action Listeners     
         clear.addActionListener(this);
         calculate.addActionListener(this);
         male.addActionListener(this);
         female.addActionListener(this);
         sedent.addActionListener(this);
         moder.addActionListener(this);
         activ.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      //Initializing Decimal Format
      DecimalFormat df = new DecimalFormat("#.#");
      DecimalFormat df1 = new DecimalFormat("#.##");
            
      
      //Disabling Hips for Male
      if(male.isSelected()){
         hptxt.setText("0");
         hptxt.setEditable(false);
      }
      else if(female.isSelected()){
         hptxt.setEditable(true);
      }


      
      //Actions for Calculate Button
      if(e.getActionCommand().equals("calc")){
         //Variables
         double height = Double.parseDouble(hltxt.getText())*12+Double.parseDouble(hltxt2.getText());
         double weight = Double.parseDouble(weltxt.getText());
         double waist = Double.parseDouble(waltxt.getText());
         double neck = Double.parseDouble(nktxt.getText());
         double hip = Double.parseDouble(hptxt.getText());

         
         //Formulas
         bmi = 703*weight/(height*height);
         whr = waist/height;
         double pbfmn = 86.010*Math.log10(waist-neck)-70.041*Math.log10(height)+36.76;
         double pbfwm = (495/(1.29579-(0.35004*(Math.log10(waist*2.54+hip*2.54-neck*2.54)))+0.22100*Math.log10(height*2.54)))-450;
         //BMI First Line
         if(bmi < 18.5)
            bmi1 = "less than normal";
         if(bmi <= 25 && bmi >= 18.5)
            bmi1 = "normal";
         if(bmi > 25)
            bmi1 = "greater than normal";  
            
         //Waist to Height Ratio   
         if(female.isSelected() && whr <= 0.34)
            whr1 = "less than normal.";
         if(female.isSelected() && whr < 0.48 && whr > 0.42)
            whr1 = "normal.";
         if(female.isSelected() && whr >= 0.49)
            whr1 = "greater than normal.";
         if(male.isSelected() && whr <= 0.34)
            whr1 = "less than normal.";
         if(male.isSelected() && whr < 0.52 && whr > 0.43)
            whr1 = "normal.";
         if(male.isSelected() && whr >= 0.53)
            whr1 = "greater than normal.";
         
         //Customize Line One
         if(bmi < 15)
            weight1 = "very severely underwieght or <br/>have no mass to distribute.";
         if(bmi >= 15 && bmi < 16){
            weight1 = "severely underwieght or have <br/>improper weight loss.";
            JOptionPane.showMessageDialog(null, "You are severely underweight.Seeing a doctor is advised.", "WARNING", JOptionPane.INFORMATION_MESSAGE);
         }
         if(bmi >= 16 && bmi < 18.5)
            weight1 = "underweight or have improper <br/>weight loss.";
         if(bmi <= 25 && bmi >= 18.5)
            weight1 = "normal.";
         if(bmi > 25 && bmi <= 30)
            weight1 = "overwieght or have unusual <br/>mass distribution.";
         if(bmi > 30 && bmi <= 35)
            weight1 = "moderately obese or have <br/>unusual mass distribution.";
         if(bmi > 35 && bmi <= 40)
            weight1 = "severely obese or have unusual<br/> mass distribution.";
         if(bmi > 40){
            JOptionPane.showMessageDialog(null, "You are severely overweight. Seeing a doctor is advised.", "WARNING", JOptionPane.INFORMATION_MESSAGE);
            weight1 = "morbid or have unusual mass <br/>distribution.";
         }
         
         //Protein In Diet Section
         if(sedent.isSelected())
            protein = 49;
         if(moder.isSelected())
            protein = 69;
         if(activ.isSelected())
            protein = 89;      
               
         //Full Customized Paragraph
         if(female.isSelected()){
            pbf = pbfwm;
            bmisen.setText("<html>&emsp&emsp&emsp&ensp Body Mass Index: " + df.format(bmi) + " lbs/in²</html>");
            whrsen.setText("<html> Waist-to-Height ratio: " + df1.format(whr) + "</html>");
            pbfsen.setText("<html>&emsp&emsp&ensp Percent Body Fat: " + df.format(pbf) + "%</html>");
            sen.setText("<html><center> <br/>Your BMI is " + bmi1 + ", and your <br/>waist-to-height ratio is " + whr1 + " <br/>You may be " + weight1 + "<br/>Your diet should contain at least " + protein + " grams<br/> of protein per day.</center></html>");
            }
         else{
            pbf = pbfmn;
            hptxt.setEditable(false);
            bmisen.setText("<html>&emsp&emsp&emsp&ensp Body Mass Index: " + df.format(bmi) + " lbs/in²</html>");
            whrsen.setText("<html> Waist-to-Height ratio: " + df1.format(whr) + "</html>");
            pbfsen.setText("<html>&emsp&emsp&ensp Percent Body Fat: " + df.format(pbf) + "%</html>");
            sen.setText("<html><center> <br/>Your BMI is " + bmi1 + ", and your <br/>waist-to-height ratio is " + whr1 + " <br/>You may be " + weight1 + "<br/>Your diet should contain at least " + protein + " grams<br/> of protein per day.</center></html>");
         }
      }
      
      //Actions for Clear Button
      if(e.getActionCommand().equals("clear")){
         hltxt.setText("");
         hltxt2.setText("");
         weltxt.setText("");
         waltxt.setText("");
         nktxt.setText("");
         hptxt.setText("");
         
         mf.clearSelection();
         levOfActSma.clearSelection();
         sen.setText("");
         hptxt.setEditable(true);
      }
   }
}