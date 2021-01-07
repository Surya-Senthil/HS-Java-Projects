import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author Surya Senthil
 *
 * Code for the TicTacToe Game
 */
public class TicTacToe extends JFrame implements ActionListener
{
  
   private JButton one1, two2, three3, four4, five5, six6, seven7, eight8, nine9, swap;
   private int turns = 0;    
   private DisplayPanel display = new DisplayPanel();
   private JFrame window;
   private JPanel main, credit;
   private JLabel title, madeby;
   
   public TicTacToe()
   {
      window = new JFrame("Tic Tac Toe");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setVisible(true);
      window.setResizable(true);
      window.setBounds(400,100,677,655);
      window.setLayout(new BorderLayout());
      
      main = new JPanel();
      main.setLayout(new BorderLayout());
      
      credit = new JPanel();
      credit.setLayout(new BorderLayout());
      
      title = new JLabel("Tic Tac Toe", JLabel.CENTER);
      title.setFont(new Font("Comic Sans MS", Font.BOLD, 48));
      title.setForeground(Color.BLUE);
      
      madeby = new JLabel("                                - Created By: Surya Senthil", JLabel.CENTER);
      madeby.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
      madeby.setForeground(Color.BLUE);

      credit.add(title, BorderLayout.CENTER);
      credit.add(madeby, BorderLayout.SOUTH);
      
      main.add(display, BorderLayout.NORTH);
      JPanel grid = new JPanel();
      grid.setLayout(new GridLayout(3, 3));
      
      swap = new JButton("Switch between Ultimate and Regular Tic Tac Toe");
      swap.addActionListener(this);
      swap.setActionCommand("switch");
      main.add(swap, BorderLayout.SOUTH);
      
      one1 = new JButton();
      two2 = new JButton();
      three3 = new JButton();
      four4 = new JButton();
      five5 = new JButton();
      six6 = new JButton();
      seven7 = new JButton();
      eight8 = new JButton();
      nine9 = new JButton();
      
      one1.setFont(new Font("Comic Sans MS", Font.BOLD, 90));
      two2.setFont(new Font("Comic Sans MS", Font.BOLD, 90));
      three3.setFont(new Font("Comic Sans MS", Font.BOLD, 90));
      four4.setFont(new Font("Comic Sans MS", Font.BOLD, 90));
      five5.setFont(new Font("Comic Sans MS", Font.BOLD, 90));
      six6.setFont(new Font("Comic Sans MS", Font.BOLD, 90));
      seven7.setFont(new Font("Comic Sans MS", Font.BOLD, 90));
      eight8.setFont(new Font("Comic Sans MS", Font.BOLD, 90));
      nine9.setFont(new Font("Comic Sans MS", Font.BOLD, 90));
            
      grid.add(one1);
      grid.add(two2);
      grid.add(three3);
      grid.add(four4);
      grid.add(five5);
      grid.add(six6);
      grid.add(seven7);
      grid.add(eight8);
      grid.add(nine9);
   
      main.add(grid, BorderLayout.CENTER);
      
      one1.addActionListener(this);
      two2.addActionListener(this);
      three3.addActionListener(this);
      four4.addActionListener(this);
      five5.addActionListener(this);
      six6.addActionListener(this);
      seven7.addActionListener(this);
      eight8.addActionListener(this);
      nine9.addActionListener(this);
      
      window.add(main, BorderLayout.CENTER);
      window.add(credit, BorderLayout.NORTH);
   }
   public void reset()
   {
      one1.setText("");
      two2.setText("");
      three3.setText("");
      four4.setText("");
      five5.setText("");
      six6.setText("");
      seven7.setText("");
      eight8.setText("");
      nine9.setText("");
      
      turns = -1;
   }
   
      
   public void actionPerformed(ActionEvent e) 
   {
      
      JButton subject = (JButton)e.getSource(); 
      
      if(e.getActionCommand().equals("switch"))
      {
         window.dispose();
         new Ultimate();
         return; 
      }     
      if(!subject.getText().equals(""))
      {
         JOptionPane.showMessageDialog(null, "Spot taken");
         turns--;
      }
      else if(turns%2 == 0)
         subject.setText("X");
      else
         subject.setText("O");
      
      if(!five5.getText().equals("") && one1.getText().equals(five5.getText()) && five5.getText().equals(nine9.getText()))
      {
         JOptionPane.showMessageDialog(null, "Game Over, " + subject.getText() + " Won - Resetting.");
         display.won(subject.getText());
         reset();
      }
      else if(!five5.getText().equals("") && three3.getText().equals(five5.getText()) && three3.getText().equals(seven7.getText()))
      {
         JOptionPane.showMessageDialog(null, "Game Over, " + subject.getText() + " Won - Resetting.");
         display.won(subject.getText());
         reset();
      }      
      else if(!one1.getText().equals("") && three3.getText().equals(one1.getText()) && three3.getText().equals(two2.getText()))
      {
         JOptionPane.showMessageDialog(null, "Game Over, " + subject.getText() + " Won - Resetting.");
         display.won(subject.getText());
         reset();
      }      
      else if(!five5.getText().equals("") && four4.getText().equals(five5.getText()) && four4.getText().equals(six6.getText()))
      {
         JOptionPane.showMessageDialog(null, "Game Over, " + subject.getText() + " Won - Resetting.");
         display.won(subject.getText());
         reset();
      }      
      else if(!seven7.getText().equals("") && seven7.getText().equals(nine9.getText()) && nine9.getText().equals(eight8.getText()))
      {
         JOptionPane.showMessageDialog(null, "Game Over, " + subject.getText() + " Won - Resetting.");
         display.won(subject.getText());
         reset();
      }      
      else if(!five5.getText().equals("") && two2.getText().equals(five5.getText()) && eight8.getText().equals(five5.getText()))
      {
         JOptionPane.showMessageDialog(null, "Game Over, " + subject.getText() + " Won - Resetting.");
         display.won(subject.getText());
         reset();
      }      
      else if(!one1.getText().equals("") && one1.getText().equals(four4.getText()) && one1.getText().equals(seven7.getText()))
      {
         JOptionPane.showMessageDialog(null, "Game Over, " + subject.getText() + " Won - Resetting.");
         display.won(subject.getText());
         reset();
      }      
      else if(!three3.getText().equals("") && three3.getText().equals(nine9.getText()) && three3.getText().equals(six6.getText()))
      {
         JOptionPane.showMessageDialog(null, "Game Over, " + subject.getText() + " Won - Resetting.");
         display.won(subject.getText());
         reset();
      }           
      if(!one1.getText().equals("") && !two2.getText().equals("") && !three3.getText().equals("") && !four4.getText().equals("") && !five5.getText().equals("") && !six6.getText().equals("") && !seven7.getText().equals("") && !eight8.getText().equals("") && !nine9.getText().equals(""))   
      {
         JOptionPane.showMessageDialog(null, "Game Over - Tie");
         reset();
      }  
       
      turns++;
      
   }
   public static void main(String[] args)
   {
      TicTacToe a = new TicTacToe();
   }
   
}