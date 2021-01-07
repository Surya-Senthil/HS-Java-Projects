import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;
/**
 * 
 * @author Surya Senthil
 *
 * Code for the Ultimate TicTacToe Game
 */

public class Ultimate extends JFrame implements ActionListener
{
   
   private JButton swap, a1, a2, a3, a4, a5, a6, a7, a8, a9, b1, b2, b3, b4, b5, b6, b7, b8, b9, c1, c2, c3, c4, c5, c6, c7, c8, c9, d1, d2, d3, d4, d5, d6, d7, d8, d9, e1, e2, e3, e4, e5, e6, e7, e8, e9, f1, f2, f3, f4, f5, f6, f7, f8, f9, g1, g2, g3, g4, g5, g6, g7, g8, g9, h1, h2, h3, h4, h5, h6, h7, h8, h9, i1, i2, i3, i4, i5, i6, i7, i8, i9; 
   private int turns = 0;    
   private DisplayPanel display = new DisplayPanel();
   private int currGrid;
   private boolean one, two, three, four, five, six, seven, eight, nine;
   private int next;
   private JFrame window;
   private JLabel title, madeby;
   private JPanel a, b, c, d, e, f, g, h, i, main, credit;
   
   public Ultimate()
   {
      window = new JFrame("Ultimate Tic Tac Toe");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setBounds(400,100,677,655);
      window.setVisible(true);
      
      main = new JPanel();
      main.setLayout(new BorderLayout());
      
      credit = new JPanel();
      credit.setLayout(new BorderLayout());
      
      title = new JLabel("Tic Tac Toe", JLabel.CENTER);
      title.setFont(new Font("Comic Sans MS", Font.BOLD, 48));
      title.setForeground(Color.BLUE);
      
      madeby = new JLabel("                                - Surya and Shayan", JLabel.CENTER);
      madeby.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
      madeby.setForeground(Color.BLUE);

      credit.add(title, BorderLayout.CENTER);
      credit.add(madeby, BorderLayout.SOUTH);
      
      window.setLayout(new BorderLayout());
      main.add(display, BorderLayout.NORTH);
      JPanel grid = new JPanel();
      grid.setLayout(new GridLayout(3, 3));
      
      swap = new JButton("Switch between Ultimate and Regular Tic Tac Toe");
      swap.addActionListener(this);
      swap.setActionCommand("switch");
      main.add(swap, BorderLayout.SOUTH);
      
      a = new JPanel();
      a.setLayout(new GridLayout(3, 3));
      b = new JPanel();
      b.setLayout(new GridLayout(3, 3));
      c = new JPanel();
      c.setLayout(new GridLayout(3, 3));
      d = new JPanel();
      d.setLayout(new GridLayout(3, 3));
      e = new JPanel();
      e.setLayout(new GridLayout(3, 3));
      f = new JPanel();
      f.setLayout(new GridLayout(3, 3));
      g = new JPanel();
      g.setLayout(new GridLayout(3, 3));
      h = new JPanel();
      h.setLayout(new GridLayout(3, 3));
      i = new JPanel();
      i.setLayout(new GridLayout(3, 3));
           
      
          
      a.setBackground(Color.BLACK);
      b.setBackground(Color.BLACK);
      c.setBackground(Color.BLACK);
      d.setBackground(Color.BLACK);
      e.setBackground(Color.BLACK);
      f.setBackground(Color.BLACK);
      g.setBackground(Color.BLACK);
      h.setBackground(Color.BLACK);
      i.setBackground(Color.BLACK);
      
      a1 = new JButton();
      a2 = new JButton();
      a3 = new JButton();
      a4 = new JButton();
      a5 = new JButton();
      a6 = new JButton();
      a7 = new JButton();
      a8 = new JButton();
      a9 = new JButton();
   
      b1 = new JButton();
      b2 = new JButton();
      b3 = new JButton();
      b4 = new JButton();
      b5 = new JButton();
      b6 = new JButton();
      b7 = new JButton();
      b8 = new JButton();
      b9 = new JButton();
   
      c1 = new JButton();
      c2 = new JButton();
      c3 = new JButton();
      c4 = new JButton();
      c5 = new JButton();
      c6 = new JButton();
      c7 = new JButton();
      c8 = new JButton();
      c9 = new JButton();
   
      d1 = new JButton();
      d2 = new JButton();
      d3 = new JButton();
      d4 = new JButton();
      d5 = new JButton();
      d6 = new JButton();
      d7 = new JButton();
      d8 = new JButton();
      d9 = new JButton();
   
      e1 = new JButton();
      e2 = new JButton();
      e3 = new JButton();
      e4 = new JButton();
      e5 = new JButton();
      e6 = new JButton();
      e7 = new JButton();
      e8 = new JButton();
      e9 = new JButton();
   
      f1 = new JButton();
      f2 = new JButton();
      f3 = new JButton();
      f4 = new JButton();
      f5 = new JButton();
      f6 = new JButton();
      f7 = new JButton();
      f8 = new JButton();
      f9 = new JButton();
   
      g1 = new JButton();
      g2 = new JButton();
      g3 = new JButton();
      g4 = new JButton();
      g5 = new JButton();
      g6 = new JButton();
      g7 = new JButton();
      g8 = new JButton();
      g9 = new JButton();
   
      h1 = new JButton();
      h2 = new JButton();
      h3 = new JButton();
      h4 = new JButton();
      h5 = new JButton();
      h6 = new JButton();
      h7 = new JButton();
      h8 = new JButton();
      h9 = new JButton();
   
      i1 = new JButton();
      i2 = new JButton();
      i3 = new JButton();
      i4 = new JButton();
      i5 = new JButton();
      i6 = new JButton();
      i7 = new JButton();
      i8 = new JButton();
      i9 = new JButton();
      
      a1.addActionListener(this);
      a2.addActionListener(this);
      a3.addActionListener(this);
      a4.addActionListener(this);
      a5.addActionListener(this);
      a6.addActionListener(this);
      a7.addActionListener(this);
      a8.addActionListener(this);
      a9.addActionListener(this);
      
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      b5.addActionListener(this);
      b6.addActionListener(this);
      b7.addActionListener(this);
      b8.addActionListener(this);
      b9.addActionListener(this);
      
      c1.addActionListener(this);
      c2.addActionListener(this);
      c3.addActionListener(this);
      c4.addActionListener(this);
      c5.addActionListener(this);
      c6.addActionListener(this);
      c7.addActionListener(this);
      c8.addActionListener(this);
      c9.addActionListener(this);
      
      d1.addActionListener(this);
      d2.addActionListener(this);
      d3.addActionListener(this);
      d4.addActionListener(this);
      d5.addActionListener(this);
      d6.addActionListener(this);
      d7.addActionListener(this);
      d8.addActionListener(this);
      d9.addActionListener(this);
      
      e1.addActionListener(this);
      e2.addActionListener(this);
      e3.addActionListener(this);
      e4.addActionListener(this);
      e5.addActionListener(this);
      e6.addActionListener(this);
      e7.addActionListener(this);
      e8.addActionListener(this);
      e9.addActionListener(this);
      
      f1.addActionListener(this);
      f2.addActionListener(this);
      f3.addActionListener(this);
      f4.addActionListener(this);
      f5.addActionListener(this);
      f6.addActionListener(this);
      f7.addActionListener(this);
      f8.addActionListener(this);
      f9.addActionListener(this);
      
      g1.addActionListener(this);
      g2.addActionListener(this);
      g3.addActionListener(this);
      g4.addActionListener(this);
      g5.addActionListener(this);
      g6.addActionListener(this);
      g7.addActionListener(this);
      g8.addActionListener(this);
      g9.addActionListener(this);
   
      h1.addActionListener(this);
      h2.addActionListener(this);
      h3.addActionListener(this);
      h4.addActionListener(this);
      h5.addActionListener(this);
      h6.addActionListener(this);
      h7.addActionListener(this);
      h8.addActionListener(this);
      h9.addActionListener(this);
   
      i1.addActionListener(this);
      i2.addActionListener(this);
      i3.addActionListener(this);
      i4.addActionListener(this);
      i5.addActionListener(this);
      i6.addActionListener(this);
      i7.addActionListener(this);
      i8.addActionListener(this);
      i9.addActionListener(this);
   
      a1.setActionCommand("a1");
      a2.setActionCommand("a2");
      a3.setActionCommand("a3");
      a4.setActionCommand("a4");
      a5.setActionCommand("a5");
      a6.setActionCommand("a6");
      a7.setActionCommand("a7");
      a8.setActionCommand("a8");
      a9.setActionCommand("a9");
   
      b1.setActionCommand("b1");
      b2.setActionCommand("b2");
      b3.setActionCommand("b3");
      b4.setActionCommand("b4");
      b5.setActionCommand("b5");
      b6.setActionCommand("b6");
      b7.setActionCommand("b7");
      b8.setActionCommand("b8");
      b9.setActionCommand("b9");
   
      c1.setActionCommand("c1");
      c2.setActionCommand("c2");
      c3.setActionCommand("c3");
      c4.setActionCommand("c4");
      c5.setActionCommand("c5");
      c6.setActionCommand("c6");
      c7.setActionCommand("c7");
      c8.setActionCommand("c8");
      c9.setActionCommand("c9");
   
      d1.setActionCommand("d1");
      d2.setActionCommand("d2");
      d3.setActionCommand("d3");
      d4.setActionCommand("d4");
      d5.setActionCommand("d5");
      d6.setActionCommand("d6");
      d7.setActionCommand("d7");
      d8.setActionCommand("d8");
      d9.setActionCommand("d9");
   
      e1.setActionCommand("e1");
      e2.setActionCommand("e2");
      e3.setActionCommand("e3");
      e4.setActionCommand("e4");
      e5.setActionCommand("e5");
      e6.setActionCommand("e6");
      e7.setActionCommand("e7");
      e8.setActionCommand("e8");
      e9.setActionCommand("e9");
   
      f1.setActionCommand("f1");
      f2.setActionCommand("f2");
      f3.setActionCommand("f3");
      f4.setActionCommand("f4");
      f5.setActionCommand("f5");
      f6.setActionCommand("f6");
      f7.setActionCommand("f7");
      f8.setActionCommand("f8");
      f9.setActionCommand("f9");
   
      g1.setActionCommand("g1");
      g2.setActionCommand("g2");
      g3.setActionCommand("g3");
      g4.setActionCommand("g4");
      g5.setActionCommand("g5");
      g6.setActionCommand("g6");
      g7.setActionCommand("g7");
      g8.setActionCommand("g8");
      g9.setActionCommand("g9");
   
      h1.setActionCommand("h1");
      h2.setActionCommand("h2");
      h3.setActionCommand("h3");
      h4.setActionCommand("h4");
      h5.setActionCommand("h5");
      h6.setActionCommand("h6");
      h7.setActionCommand("h7");
      h8.setActionCommand("h8");
      h9.setActionCommand("h9");
   
      i1.setActionCommand("i1");
      i2.setActionCommand("i2");
      i3.setActionCommand("i3");
      i4.setActionCommand("i4");
      i5.setActionCommand("i5");
      i6.setActionCommand("i6");
      i7.setActionCommand("i7");
      i8.setActionCommand("i8");
      i9.setActionCommand("i9");
      
      a1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      a2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      a3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      a4.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      a5.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      a6.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      a7.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      a8.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      a9.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
   
      b1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      b2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      b3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      b4.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      b5.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      b6.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      b7.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      b8.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      b9.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
   
      c1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      c2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      c3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      c4.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      c5.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      c6.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      c7.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      c8.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      c9.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
   
      d1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      d2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      d3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      d4.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      d5.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      d6.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      d7.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      d8.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      d9.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
   
      e1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      e2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      e3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      e4.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      e5.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      e6.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      e7.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      e8.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      e9.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
   
      f1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      f2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      f3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      f4.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      f5.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      f6.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      f7.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      f8.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      f9.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
   
      g1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      g2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      g3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      g4.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      g5.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      g6.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      g7.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      g8.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      g9.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
   
      h1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      h2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      h3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      h4.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      h5.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      h6.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      h7.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      h8.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      h9.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
   
      i1.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      i2.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      i3.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      i4.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      i5.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      i6.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      i7.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      i8.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      i9.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
      
      a.add(a1);
      a.add(a2);
      a.add(a3);
      a.add(a4);
      a.add(a5);
      a.add(a6);
      a.add(a7);
      a.add(a8);
      a.add(a9);
   
      b.add(b1);
      b.add(b2);
      b.add(b3);
      b.add(b4);
      b.add(b5);
      b.add(b6);
      b.add(b7);
      b.add(b8);
      b.add(b9);
   
      c.add(c1);
      c.add(c2);
      c.add(c3);
      c.add(c4);
      c.add(c5);
      c.add(c6);
      c.add(c7);
      c.add(c8);
      c.add(c9);
   
      d.add(d1);
      d.add(d2);
      d.add(d3);
      d.add(d4);
      d.add(d5);
      d.add(d6);
      d.add(d7);
      d.add(d8);
      d.add(d9);
   
      e.add(e1);
      e.add(e2);
      e.add(e3);
      e.add(e4);
      e.add(e5);
      e.add(e6);
      e.add(e7);
      e.add(e8);
      e.add(e9);
      
      f.add(f1);
      f.add(f2);
      f.add(f3);
      f.add(f4);
      f.add(f5);
      f.add(f6);
      f.add(f7);
      f.add(f8);
      f.add(f9);
   
      g.add(g1);
      g.add(g2);
      g.add(g3);
      g.add(g4);
      g.add(g5);
      g.add(g6);
      g.add(g7);
      g.add(g8);
      g.add(g9);
   
      h.add(h1);
      h.add(h2);
      h.add(h3);
      h.add(h4);
      h.add(h5);
      h.add(h6);
      h.add(h7);
      h.add(h8);
      h.add(h9);
   
      i.add(i1);
      i.add(i2);
      i.add(i3);
      i.add(i4);
      i.add(i5);
      i.add(i6);
      i.add(i7);
      i.add(i8);
      i.add(i9);
      
      grid.add(a);
      grid.add(b);
      grid.add(c);
      grid.add(d);
      grid.add(e);
      grid.add(f);
      grid.add(g);
      grid.add(h);
      grid.add(i);
      
      main.add(grid, BorderLayout.CENTER);  
      window.add(main, BorderLayout.CENTER);
      window.add(credit, BorderLayout.NORTH);
   }
   public void reset()
   {
      a1.setText("");
      a2.setText("");
      a3.setText("");
      a4.setText("");
      a5.setText("");
      a6.setText("");
      a7.setText("");
      a8.setText("");
      a9.setText("");
   
      b1.setText("");
      b2.setText("");
      b3.setText("");
      b4.setText("");
      b5.setText("");
      b6.setText("");
      b7.setText("");
      b8.setText("");
      b9.setText("");
   
      c1.setText("");
      c2.setText("");
      c3.setText("");
      c4.setText("");
      c5.setText("");
      c6.setText("");
      c7.setText("");
      c8.setText("");
      c9.setText("");
   
      d1.setText("");
      d2.setText("");
      d3.setText("");
      d4.setText("");
      d5.setText("");
      d6.setText("");
      d7.setText("");
      d8.setText("");
      d9.setText("");
   
      e1.setText("");
      e2.setText("");
      e3.setText("");
      e4.setText("");
      e5.setText("");
      e6.setText("");
      e7.setText("");
      e8.setText("");
      e9.setText("");
   
      f1.setText("");
      f2.setText("");
      f3.setText("");
      f4.setText("");
      f5.setText("");
      f6.setText("");
      f7.setText("");
      f8.setText("");
      f9.setText("");
   
      g1.setText("");
      g2.setText("");
      g3.setText("");
      g4.setText("");
      g5.setText("");
      g6.setText("");
      g7.setText("");
      g8.setText("");
      g9.setText("");
   
      h1.setText("");
      h2.setText("");
      h3.setText("");
      h4.setText("");
      h5.setText("");
      h6.setText("");
      h7.setText("");
      h8.setText("");
      h9.setText("");
   
      i1.setText("");
      i2.setText("");
      i3.setText("");
      i4.setText("");
      i5.setText("");
      i6.setText("");
      i7.setText("");
      i8.setText("");
      i9.setText("");
      
      a1.setBackground(new JButton().getBackground());
      a2.setBackground(new JButton().getBackground());
      a3.setBackground(new JButton().getBackground());
      a4.setBackground(new JButton().getBackground());
      a5.setBackground(new JButton().getBackground());
      a6.setBackground(new JButton().getBackground());
      a7.setBackground(new JButton().getBackground());
      a8.setBackground(new JButton().getBackground());
      a9.setBackground(new JButton().getBackground());
   
      b1.setBackground(new JButton().getBackground());
      b2.setBackground(new JButton().getBackground());
      b3.setBackground(new JButton().getBackground());
      b4.setBackground(new JButton().getBackground());
      b5.setBackground(new JButton().getBackground());
      b6.setBackground(new JButton().getBackground());
      b7.setBackground(new JButton().getBackground());
      b8.setBackground(new JButton().getBackground());
      b9.setBackground(new JButton().getBackground());
   
      c1.setBackground(new JButton().getBackground());
      c2.setBackground(new JButton().getBackground());
      c3.setBackground(new JButton().getBackground());
      c4.setBackground(new JButton().getBackground());
      c5.setBackground(new JButton().getBackground());
      c6.setBackground(new JButton().getBackground());
      c7.setBackground(new JButton().getBackground());
      c8.setBackground(new JButton().getBackground());
      c9.setBackground(new JButton().getBackground());
   
      d1.setBackground(new JButton().getBackground());
      d2.setBackground(new JButton().getBackground());
      d3.setBackground(new JButton().getBackground());
      d4.setBackground(new JButton().getBackground());
      d5.setBackground(new JButton().getBackground());
      d6.setBackground(new JButton().getBackground());
      d7.setBackground(new JButton().getBackground());
      d8.setBackground(new JButton().getBackground());
      d9.setBackground(new JButton().getBackground());
   
      e1.setBackground(new JButton().getBackground());
      e2.setBackground(new JButton().getBackground());
      e3.setBackground(new JButton().getBackground());
      e4.setBackground(new JButton().getBackground());
      e5.setBackground(new JButton().getBackground());
      e6.setBackground(new JButton().getBackground());
      e7.setBackground(new JButton().getBackground());
      e8.setBackground(new JButton().getBackground());
      e9.setBackground(new JButton().getBackground());
   
      f1.setBackground(new JButton().getBackground());
      f2.setBackground(new JButton().getBackground());
      f3.setBackground(new JButton().getBackground());
      f4.setBackground(new JButton().getBackground());
      f5.setBackground(new JButton().getBackground());
      f6.setBackground(new JButton().getBackground());
      f7.setBackground(new JButton().getBackground());
      f8.setBackground(new JButton().getBackground());
      f9.setBackground(new JButton().getBackground());
   
      g1.setBackground(new JButton().getBackground());
      g2.setBackground(new JButton().getBackground());
      g3.setBackground(new JButton().getBackground());
      g4.setBackground(new JButton().getBackground());
      g5.setBackground(new JButton().getBackground());
      g6.setBackground(new JButton().getBackground());
      g7.setBackground(new JButton().getBackground());
      g8.setBackground(new JButton().getBackground());
      g9.setBackground(new JButton().getBackground());
   
      h1.setBackground(new JButton().getBackground());
      h2.setBackground(new JButton().getBackground());
      h3.setBackground(new JButton().getBackground());
      h4.setBackground(new JButton().getBackground());
      h5.setBackground(new JButton().getBackground());
      h6.setBackground(new JButton().getBackground());
      h7.setBackground(new JButton().getBackground());
      h8.setBackground(new JButton().getBackground());
      h9.setBackground(new JButton().getBackground());
   
      i1.setBackground(new JButton().getBackground());
      i2.setBackground(new JButton().getBackground());
      i3.setBackground(new JButton().getBackground());
      i4.setBackground(new JButton().getBackground());
      i5.setBackground(new JButton().getBackground());
      i6.setBackground(new JButton().getBackground());
      i7.setBackground(new JButton().getBackground());
      i8.setBackground(new JButton().getBackground());
      i9.setBackground(new JButton().getBackground());
   
      turns = 0;
   }
     
   
   
   public void overallWon()
   { 
      if(!(e1.getBackground().equals(new JButton().getBackground())) && a1.getBackground().equals(e1.getBackground()) && e1.getBackground().equals(i1.getBackground()))
      {
         if(e1.getBackground().equals(Color.RED))
         {
            JOptionPane.showMessageDialog(null, "Game Over, O Won - Resetting.");
            display.won("O");
            reset();
         }
         else
         {
            JOptionPane.showMessageDialog(null, "Game Over, X Won - Resetting.");
            display.won("X");
            reset();
         }
               
      }
      if(!(e1.getBackground().equals(new JButton().getBackground())) && c1.getBackground().equals(e1.getBackground()) && c1.getBackground().equals(g1.getBackground()))
      {
         if(e1.getBackground().equals(Color.RED))
         {
            JOptionPane.showMessageDialog(null, "Game Over, O Won - Resetting.");
            display.won("O");
            reset();
         }
         else
         {
            JOptionPane.showMessageDialog(null, "Game Over, X Won - Resetting.");
            display.won("X");
            reset();
         }
      }      
      if(!(a1.getBackground().equals(new JButton().getBackground())) && c1.getBackground().equals(a1.getBackground()) && c1.getBackground().equals(b1.getBackground()))
      {
         if(a1.getBackground().equals(Color.RED))
         {
            JOptionPane.showMessageDialog(null, "Game Over, O Won - Resetting.");
            display.won("O");
            reset();
         }
         else
         {
            JOptionPane.showMessageDialog(null, "Game Over, X Won - Resetting.");
            display.won("X");
            reset();
         }
      }      
      if(!(e1.getBackground().equals(new JButton().getBackground())) && d1.getBackground().equals(e1.getBackground()) && d1.getBackground().equals(g1.getBackground()))
      {
         if(e1.getBackground().equals(Color.RED))
         {
            JOptionPane.showMessageDialog(null, "Game Over, O Won - Resetting.");
            display.won("O");
            reset();
         }
         else
         {
            JOptionPane.showMessageDialog(null, "Game Over, X Won - Resetting.");
            display.won("X");
            reset();
         }
      }      
      if(!(g1.getBackground().equals(new JButton().getBackground())) && g1.getBackground().equals(i1.getBackground()) && i1.getBackground().equals(h1.getBackground()))
      {
         if(g1.getBackground().equals(Color.RED))
         {
            JOptionPane.showMessageDialog(null, "Game Over, O Won - Resetting.");
            display.won("O");
            reset();
         }
         else
         {
            JOptionPane.showMessageDialog(null, "Game Over, X Won - Resetting.");
            display.won("X");
            reset();
         }
      }      
      if(!(e1.getBackground().equals(new JButton().getBackground())) && b1.getBackground().equals(e1.getBackground()) && h1.getBackground().equals(e1.getBackground()))
      {
         if(e1.getBackground().equals(Color.RED))
         {
            JOptionPane.showMessageDialog(null, "Game Over, O Won - Resetting.");
            display.won("O");
            reset();
         }
         else
         {
            JOptionPane.showMessageDialog(null, "Game Over, X Won - Resetting.");
            display.won("X");
            reset();
         }
      }      
      if(!(a1.getBackground().equals(new JButton().getBackground())) && a1.getBackground().equals(d1.getBackground()) && a1.getBackground().equals(g1.getBackground()))
      {
         if(a1.getBackground().equals(Color.RED))
         {
            JOptionPane.showMessageDialog(null, "Game Over, O Won - Resetting.");
            display.won("O");
            reset();
         }
         else
         {
            JOptionPane.showMessageDialog(null, "Game Over, X Won - Resetting.");
            display.won("X");
            reset();
         } 
      }      
      if(!(c1.getBackground().equals(new JButton().getBackground())) && c1.getBackground().equals(i1.getBackground()) && c1.getBackground().equals(f1.getBackground()))
      {
         if(c1.getBackground().equals(Color.RED))
         {
            JOptionPane.showMessageDialog(null, "Game Over, O Won - Resetting.");
            display.won("O");
            reset();
         }
         else
         {
            JOptionPane.showMessageDialog(null, "Game Over, X Won - Resetting.");
            display.won("X");
            reset();
         }
      }           
      if(!(a1.getBackground().equals(new JButton().getBackground())) && !(b1.getBackground().equals(new JButton().getBackground())) && !(c1.getBackground().equals(new JButton().getBackground())) && !(d1.getBackground().equals(new JButton().getBackground())) && !(e1.getBackground().equals(new JButton().getBackground())) && !(f1.getBackground().equals(new JButton().getBackground())) && !(g1.getBackground().equals(new JButton().getBackground())) && !(h1.getBackground().equals(new JButton().getBackground())) && !(i1.getBackground().equals(new JButton().getBackground())))   
      {
         JOptionPane.showMessageDialog(null, "Game Over, Tie - Resetting.");
         reset();
      }
   }
   
   public void gridWon(int grid, String type)
   {
      if(type.equals("X"))
      
         switch(grid)
         {
            case 1:
               if(!one)
               {
                  a1.setBackground(Color.GREEN);
                  a2.setBackground(Color.GREEN);
                  a3.setBackground(Color.GREEN);
                  a4.setBackground(Color.GREEN);
                  a5.setBackground(Color.GREEN);
                  a6.setBackground(Color.GREEN);
                  a7.setBackground(Color.GREEN);
                  a8.setBackground(Color.GREEN);
                  a9.setBackground(Color.GREEN);
               
                  overallWon();
               }
               break;
            case 2:
               if(!two)
               {
                  b1.setBackground(Color.GREEN);
                  b2.setBackground(Color.GREEN);
                  b3.setBackground(Color.GREEN);
                  b4.setBackground(Color.GREEN);
                  b5.setBackground(Color.GREEN);
                  b6.setBackground(Color.GREEN);
                  b7.setBackground(Color.GREEN);
                  b8.setBackground(Color.GREEN);
                  b9.setBackground(Color.GREEN);
               
                  overallWon();
               }
               break;
         
            case 3:
               if(!three)
               {
                  c1.setBackground(Color.GREEN);
                  c2.setBackground(Color.GREEN);
                  c3.setBackground(Color.GREEN);
                  c4.setBackground(Color.GREEN);
                  c5.setBackground(Color.GREEN);
                  c6.setBackground(Color.GREEN);
                  c7.setBackground(Color.GREEN);
                  c8.setBackground(Color.GREEN);
                  c9.setBackground(Color.GREEN);
               
                  overallWon();
               }
               break;
         
            case 4:
               if(!four)
               {
                  d1.setBackground(Color.GREEN);
                  d2.setBackground(Color.GREEN);
                  d3.setBackground(Color.GREEN);
                  d4.setBackground(Color.GREEN);
                  d5.setBackground(Color.GREEN);
                  d6.setBackground(Color.GREEN);
                  d7.setBackground(Color.GREEN);
                  d8.setBackground(Color.GREEN);
                  d9.setBackground(Color.GREEN);
               
                  overallWon();
               }
               break;
         
            case 5:
               if(!five)
               {
                  e1.setBackground(Color.GREEN);
                  e2.setBackground(Color.GREEN);
                  e3.setBackground(Color.GREEN);
                  e4.setBackground(Color.GREEN);
                  e5.setBackground(Color.GREEN);
                  e6.setBackground(Color.GREEN);
                  e7.setBackground(Color.GREEN);
                  e8.setBackground(Color.GREEN);
                  e9.setBackground(Color.GREEN);
               
                  overallWon();
               }
               break;
         
            case 6:
               if(!six)
               {
                  f1.setBackground(Color.GREEN);
                  f2.setBackground(Color.GREEN);
                  f3.setBackground(Color.GREEN);
                  f4.setBackground(Color.GREEN);
                  f5.setBackground(Color.GREEN);
                  f6.setBackground(Color.GREEN);
                  f7.setBackground(Color.GREEN);
                  f8.setBackground(Color.GREEN);
                  f9.setBackground(Color.GREEN);
               
                  overallWon();
               }
               break;
         
            case 7:
               if(!seven)
               {
                  g1.setBackground(Color.GREEN);
                  g2.setBackground(Color.GREEN);
                  g3.setBackground(Color.GREEN);
                  g4.setBackground(Color.GREEN);
                  g5.setBackground(Color.GREEN);
                  g6.setBackground(Color.GREEN);
                  g7.setBackground(Color.GREEN);
                  g8.setBackground(Color.GREEN);
                  g9.setBackground(Color.GREEN);
               
                  overallWon();
               }
               break;
         
            case 8:
               if(!eight)
               {
                  h1.setBackground(Color.GREEN);
                  h2.setBackground(Color.GREEN);
                  h3.setBackground(Color.GREEN);
                  h4.setBackground(Color.GREEN);
                  h5.setBackground(Color.GREEN);
                  h6.setBackground(Color.GREEN);
                  h7.setBackground(Color.GREEN);
                  h8.setBackground(Color.GREEN);
                  h9.setBackground(Color.GREEN);
               
                  overallWon();
               }
               break;
         
            case 9:
               if(!nine)
               {
                  i1.setBackground(Color.GREEN);
                  i2.setBackground(Color.GREEN);
                  i3.setBackground(Color.GREEN);
                  i4.setBackground(Color.GREEN);
                  i5.setBackground(Color.GREEN);
                  i6.setBackground(Color.GREEN);
                  i7.setBackground(Color.GREEN);
                  i8.setBackground(Color.GREEN);
                  i9.setBackground(Color.GREEN);
               
                  overallWon();
               }
               break;
         
         }
      else
         switch(grid)
         {
            case 1:
               if(!one)
               {
                  a1.setBackground(Color.RED);
                  a2.setBackground(Color.RED);
                  a3.setBackground(Color.RED);
                  a4.setBackground(Color.RED);
                  a5.setBackground(Color.RED);
                  a6.setBackground(Color.RED);
                  a7.setBackground(Color.RED);
                  a8.setBackground(Color.RED);
                  a9.setBackground(Color.RED);
               
                  overallWon();
               }
               break;
         
            case 2:
               if(!two)
               {
                  b1.setBackground(Color.RED);
                  b2.setBackground(Color.RED);
                  b3.setBackground(Color.RED);
                  b4.setBackground(Color.RED);
                  b5.setBackground(Color.RED);
                  b6.setBackground(Color.RED);
                  b7.setBackground(Color.RED);
                  b8.setBackground(Color.RED);
                  b9.setBackground(Color.RED);
               
                  overallWon();
               }
               break;
         
            case 3:
               if(!three)
               {
                  c1.setBackground(Color.RED);
                  c2.setBackground(Color.RED);
                  c3.setBackground(Color.RED);
                  c4.setBackground(Color.RED);
                  c5.setBackground(Color.RED);
                  c6.setBackground(Color.RED);
                  c7.setBackground(Color.RED);
                  c8.setBackground(Color.RED);
                  c9.setBackground(Color.RED);
               
                  overallWon();
               }
               break;
         
            case 4:
               if(!four)
               {
                  d1.setBackground(Color.RED);
                  d2.setBackground(Color.RED);
                  d3.setBackground(Color.RED);
                  d4.setBackground(Color.RED);
                  d5.setBackground(Color.RED);
                  d6.setBackground(Color.RED);
                  d7.setBackground(Color.RED);
                  d8.setBackground(Color.RED);
                  d9.setBackground(Color.RED);
               
                  overallWon();
               }
               break;
         
            case 5:
               if(!five)
               {
                  e1.setBackground(Color.RED);
                  e2.setBackground(Color.RED);
                  e3.setBackground(Color.RED);
                  e4.setBackground(Color.RED);
                  e5.setBackground(Color.RED);
                  e6.setBackground(Color.RED);
                  e7.setBackground(Color.RED);
                  e8.setBackground(Color.RED);
                  e9.setBackground(Color.RED);
               
                  overallWon();
               }
               break;
         
            case 6:
               if(!six)
               {
                  f1.setBackground(Color.RED);
                  f2.setBackground(Color.RED);
                  f3.setBackground(Color.RED);
                  f4.setBackground(Color.RED);
                  f5.setBackground(Color.RED);
                  f6.setBackground(Color.RED);
                  f7.setBackground(Color.RED);
                  f8.setBackground(Color.RED);
                  f9.setBackground(Color.RED);
               
                  overallWon();
               }
               break;
         
            case 7:
               if(!seven)
               {
                  g1.setBackground(Color.RED);
                  g2.setBackground(Color.RED);
                  g3.setBackground(Color.RED);
                  g4.setBackground(Color.RED);
                  g5.setBackground(Color.RED);
                  g6.setBackground(Color.RED);
                  g7.setBackground(Color.RED);
                  g8.setBackground(Color.RED);
                  g9.setBackground(Color.RED);
               
                  overallWon();
               }
               break;
         
            case 8:
               if(!eight)
               {
                  h1.setBackground(Color.RED);
                  h2.setBackground(Color.RED);
                  h3.setBackground(Color.RED);
                  h4.setBackground(Color.RED);
                  h5.setBackground(Color.RED);
                  h6.setBackground(Color.RED);
                  h7.setBackground(Color.RED);
                  h8.setBackground(Color.RED);
                  h9.setBackground(Color.RED);
               
                  overallWon();
               }
               break;
         
            case 9:
               if(!nine)
               {
                  i1.setBackground(Color.RED);
                  i2.setBackground(Color.RED);
                  i3.setBackground(Color.RED);
                  i4.setBackground(Color.RED);
                  i5.setBackground(Color.RED);
                  i6.setBackground(Color.RED);
                  i7.setBackground(Color.RED);
                  i8.setBackground(Color.RED);
                  i9.setBackground(Color.RED);
               
                  overallWon();
               }
               break;
         
         }   
   }
   
   public void gridTied(int grid)
   {
      switch(grid)
      {
         case 1:
            a1.setBackground(Color.GRAY);
            a2.setBackground(Color.GRAY);
            a3.setBackground(Color.GRAY);
            a4.setBackground(Color.GRAY);
            a5.setBackground(Color.GRAY);
            a6.setBackground(Color.GRAY);
            a7.setBackground(Color.GRAY);
            a8.setBackground(Color.GRAY);
            a9.setBackground(Color.GRAY);
               
            overallWon();
            break;
         case 2:
            b1.setBackground(Color.GRAY);
            b2.setBackground(Color.GRAY);
            b3.setBackground(Color.GRAY);
            b4.setBackground(Color.GRAY);
            b5.setBackground(Color.GRAY);
            b6.setBackground(Color.GRAY);
            b7.setBackground(Color.GRAY);
            b8.setBackground(Color.GRAY);
            b9.setBackground(Color.GRAY);
               
            overallWon();
            break;
         case 3:
            c1.setBackground(Color.GRAY);
            c2.setBackground(Color.GRAY);
            c3.setBackground(Color.GRAY);
            c4.setBackground(Color.GRAY);
            c5.setBackground(Color.GRAY);
            c6.setBackground(Color.GRAY);
            c7.setBackground(Color.GRAY);
            c8.setBackground(Color.GRAY);
            c9.setBackground(Color.GRAY);
            
            overallWon();
            break;
         case 4:
            d1.setBackground(Color.GRAY);
            d2.setBackground(Color.GRAY);
            d3.setBackground(Color.GRAY);
            d4.setBackground(Color.GRAY);
            d5.setBackground(Color.GRAY);
            d6.setBackground(Color.GRAY);
            d7.setBackground(Color.GRAY);
            d8.setBackground(Color.GRAY);
            d9.setBackground(Color.GRAY);
            
            overallWon();
            break;
         case 5:
            e1.setBackground(Color.GRAY);
            e2.setBackground(Color.GRAY);
            e3.setBackground(Color.GRAY);
            e4.setBackground(Color.GRAY);
            e5.setBackground(Color.GRAY);
            e6.setBackground(Color.GRAY);
            e7.setBackground(Color.GRAY);
            e8.setBackground(Color.GRAY);
            e9.setBackground(Color.GRAY);
            
            overallWon();
            break;
         case 6:
            f1.setBackground(Color.GRAY);
            f2.setBackground(Color.GRAY);
            f3.setBackground(Color.GRAY);
            f4.setBackground(Color.GRAY);
            f5.setBackground(Color.GRAY);
            f6.setBackground(Color.GRAY);
            f7.setBackground(Color.GRAY);
            f8.setBackground(Color.GRAY);
            f9.setBackground(Color.GRAY);
            
            overallWon();
            break;
         case 7:
            g1.setBackground(Color.GRAY);
            g2.setBackground(Color.GRAY);
            g3.setBackground(Color.GRAY);
            g4.setBackground(Color.GRAY);
            g5.setBackground(Color.GRAY);
            g6.setBackground(Color.GRAY);
            g7.setBackground(Color.GRAY);
            g8.setBackground(Color.GRAY);
            g9.setBackground(Color.GRAY);
            
            overallWon();
            break;
         case 8:
            h1.setBackground(Color.GRAY);
            h2.setBackground(Color.GRAY);
            h3.setBackground(Color.GRAY);
            h4.setBackground(Color.GRAY);
            h5.setBackground(Color.GRAY);
            h6.setBackground(Color.GRAY);
            h7.setBackground(Color.GRAY);
            h8.setBackground(Color.GRAY);
            h9.setBackground(Color.GRAY);
            
            overallWon();
            break;
         case 9:
            i1.setBackground(Color.GRAY);
            i2.setBackground(Color.GRAY);
            i3.setBackground(Color.GRAY);
            i4.setBackground(Color.GRAY);
            i5.setBackground(Color.GRAY);
            i6.setBackground(Color.GRAY);
            i7.setBackground(Color.GRAY);
            i8.setBackground(Color.GRAY);
            i9.setBackground(Color.GRAY);
            
            overallWon();
            break;
            
      }
   
   }
   public void actionPerformed(ActionEvent bin)
   {
      JButton subject = (JButton)bin.getSource(); 
      
      if(bin.getActionCommand().equals("switch"))
      {
         window.dispose();
         new TicTacToe();
         return;
      }
      
      if(!subject.getText().equals(""))
      {
         JOptionPane.showMessageDialog(null, "Spot taken");
         return;
      }
      else if(one == true && (subject.getActionCommand().equals("a1") || subject.getActionCommand().equals("a2") || subject.getActionCommand().equals("a3") || subject.getActionCommand().equals("a4") || subject.getActionCommand().equals("a5") || subject.getActionCommand().equals("a6") || subject.getActionCommand().equals("a7") || subject.getActionCommand().equals("a8") || subject.getActionCommand().equals("a9")))
      {
         JOptionPane.showMessageDialog(null, "Square finished");
         return;
      }
      else if(two == true && (subject.getActionCommand().equals("b1") || subject.getActionCommand().equals("b2") || subject.getActionCommand().equals("b3") || subject.getActionCommand().equals("b4") || subject.getActionCommand().equals("b5") || subject.getActionCommand().equals("b6") || subject.getActionCommand().equals("b7") || subject.getActionCommand().equals("b8") || subject.getActionCommand().equals("b9")))
      {
         JOptionPane.showMessageDialog(null, "Square finished");
         return;
      }
      else if(three == true && (subject.getActionCommand().equals("c1") || subject.getActionCommand().equals("c2") || subject.getActionCommand().equals("c3") || subject.getActionCommand().equals("c4") || subject.getActionCommand().equals("c5") || subject.getActionCommand().equals("c6") || subject.getActionCommand().equals("c7") || subject.getActionCommand().equals("c8") || subject.getActionCommand().equals("c9")))
      {
         JOptionPane.showMessageDialog(null, "Square finished");
         return;
      }
      else if(four == true && (subject.getActionCommand().equals("d1") || subject.getActionCommand().equals("d2") || subject.getActionCommand().equals("d3") || subject.getActionCommand().equals("d4") || subject.getActionCommand().equals("d5") || subject.getActionCommand().equals("d6") || subject.getActionCommand().equals("d7") || subject.getActionCommand().equals("d8") || subject.getActionCommand().equals("d9")))
      {
         JOptionPane.showMessageDialog(null, "Square finished");
         return;
      }
      else if(five == true && (subject.getActionCommand().equals("e1") || subject.getActionCommand().equals("e2") || subject.getActionCommand().equals("e3") || subject.getActionCommand().equals("e4") || subject.getActionCommand().equals("e5") || subject.getActionCommand().equals("e6") || subject.getActionCommand().equals("e7") || subject.getActionCommand().equals("e8") || subject.getActionCommand().equals("e9")))
      {
         JOptionPane.showMessageDialog(null, "Square finished");
         return;
      }
      else if(six == true && (subject.getActionCommand().equals("f1") || subject.getActionCommand().equals("f2") || subject.getActionCommand().equals("f3") || subject.getActionCommand().equals("f4") || subject.getActionCommand().equals("f5") || subject.getActionCommand().equals("f6") || subject.getActionCommand().equals("f7") || subject.getActionCommand().equals("f8") || subject.getActionCommand().equals("f9")))
      {
         JOptionPane.showMessageDialog(null, "Square finished");
         return;
      }
      else if(seven == true && (subject.getActionCommand().equals("g1") || subject.getActionCommand().equals("g2") || subject.getActionCommand().equals("g3") || subject.getActionCommand().equals("g4") || subject.getActionCommand().equals("g5") || subject.getActionCommand().equals("g6") || subject.getActionCommand().equals("g7") || subject.getActionCommand().equals("g8") || subject.getActionCommand().equals("g9")))
      {
         JOptionPane.showMessageDialog(null, "Square finished");
         return;
      }
      else if(eight == true && (subject.getActionCommand().equals("h1") || subject.getActionCommand().equals("h2") || subject.getActionCommand().equals("h3") || subject.getActionCommand().equals("h4") || subject.getActionCommand().equals("h5") || subject.getActionCommand().equals("h6") || subject.getActionCommand().equals("h7") || subject.getActionCommand().equals("h8") || subject.getActionCommand().equals("h9")))
      {
         JOptionPane.showMessageDialog(null, "Square finished");
         return;
      }
      else if(nine == true && (subject.getActionCommand().equals("i1") || subject.getActionCommand().equals("i2") || subject.getActionCommand().equals("i3") || subject.getActionCommand().equals("i4") || subject.getActionCommand().equals("i5") || subject.getActionCommand().equals("i6") || subject.getActionCommand().equals("i7") || subject.getActionCommand().equals("i8") || subject.getActionCommand().equals("i9")))
      {
         JOptionPane.showMessageDialog(null, "Square finished");
         return;
      }
      else if(next == 1 && !subject.getActionCommand().equals("a1") && !subject.getActionCommand().equals("a2") && !subject.getActionCommand().equals("a3") && !subject.getActionCommand().equals("a4") && !subject.getActionCommand().equals("a5") && !subject.getActionCommand().equals("a6") && !subject.getActionCommand().equals("a7") && !subject.getActionCommand().equals("a8") && !subject.getActionCommand().equals("a9"))
      {
         JOptionPane.showMessageDialog(null, "Play first square");
         return;
      }
      else if(next == 2 && !subject.getActionCommand().equals("b1") && !subject.getActionCommand().equals("b2") && !subject.getActionCommand().equals("b3") && !subject.getActionCommand().equals("b4") && !subject.getActionCommand().equals("b5") && !subject.getActionCommand().equals("b6") && !subject.getActionCommand().equals("b7") && !subject.getActionCommand().equals("b8") && !subject.getActionCommand().equals("b9"))
      {
         JOptionPane.showMessageDialog(null, "Play second square");
         return;
      }
      else if(next == 3 && !subject.getActionCommand().equals("c1") && !subject.getActionCommand().equals("c2") && !subject.getActionCommand().equals("c3") && !subject.getActionCommand().equals("c4") && !subject.getActionCommand().equals("c5") && !subject.getActionCommand().equals("c6") && !subject.getActionCommand().equals("c7") && !subject.getActionCommand().equals("c8") && !subject.getActionCommand().equals("c9"))
      {
         JOptionPane.showMessageDialog(null, "Play third square");
         return;
      }
      else if(next == 4 && !subject.getActionCommand().equals("d1") && !subject.getActionCommand().equals("d2") && !subject.getActionCommand().equals("d3") && !subject.getActionCommand().equals("d4") && !subject.getActionCommand().equals("d5") && !subject.getActionCommand().equals("d6") && !subject.getActionCommand().equals("d7") && !subject.getActionCommand().equals("d8") && !subject.getActionCommand().equals("d9"))
      {
         JOptionPane.showMessageDialog(null, "Play fourth square");
         return;
      }
      else if(next == 5 && !subject.getActionCommand().equals("e1") && !subject.getActionCommand().equals("e2") && !subject.getActionCommand().equals("e3") && !subject.getActionCommand().equals("e4") && !subject.getActionCommand().equals("e5") && !subject.getActionCommand().equals("e6") && !subject.getActionCommand().equals("e7") && !subject.getActionCommand().equals("e8") && !subject.getActionCommand().equals("e9"))
      {
         JOptionPane.showMessageDialog(null, "Play fifth square");
         return;
      }
      else if(next == 6 && !subject.getActionCommand().equals("f1") && !subject.getActionCommand().equals("f2") && !subject.getActionCommand().equals("f3") && !subject.getActionCommand().equals("f4") && !subject.getActionCommand().equals("f5") && !subject.getActionCommand().equals("f6") && !subject.getActionCommand().equals("f7") && !subject.getActionCommand().equals("f8") && !subject.getActionCommand().equals("f9"))
      {
         JOptionPane.showMessageDialog(null, "Play sixth square");
         return;
      }
      else if(next == 7 && !subject.getActionCommand().equals("g1") && !subject.getActionCommand().equals("g2") && !subject.getActionCommand().equals("g3") && !subject.getActionCommand().equals("g4") && !subject.getActionCommand().equals("g5") && !subject.getActionCommand().equals("g6") && !subject.getActionCommand().equals("g7") && !subject.getActionCommand().equals("g8") && !subject.getActionCommand().equals("g9"))
      {
         JOptionPane.showMessageDialog(null, "Play seventh square");
         return;
      }
      else if(next == 8 && !subject.getActionCommand().equals("h1") && !subject.getActionCommand().equals("h2") && !subject.getActionCommand().equals("h3") && !subject.getActionCommand().equals("h4") && !subject.getActionCommand().equals("h5") && !subject.getActionCommand().equals("h6") && !subject.getActionCommand().equals("h7") && !subject.getActionCommand().equals("h8") && !subject.getActionCommand().equals("h9"))
      {
         JOptionPane.showMessageDialog(null, "Play eigth square");
         return;
      }
      else if(next == 9 && !subject.getActionCommand().equals("i1") && !subject.getActionCommand().equals("i2") && !subject.getActionCommand().equals("i3") && !subject.getActionCommand().equals("i4") && !subject.getActionCommand().equals("i5") && !subject.getActionCommand().equals("i6") && !subject.getActionCommand().equals("i7") && !subject.getActionCommand().equals("i8") && !subject.getActionCommand().equals("i9"))
      {
         JOptionPane.showMessageDialog(null, "Play ninth square");
         return;
      }
      else if(turns%2 == 0)
         subject.setText("X");
      else
         subject.setText("O");
      if(!a5.getText().equals("") && a1.getText().equals(a5.getText()) && a5.getText().equals(a9.getText()))
      {
         gridWon(1, subject.getText());
         one = true;
      }
      else if(!a5.getText().equals("") && a3.getText().equals(a5.getText()) && a3.getText().equals(a7.getText()))
      {
         gridWon(1, subject.getText());
         one = true;
      }      
      else if(!a1.getText().equals("") && a3.getText().equals(a1.getText()) && a3.getText().equals(a2.getText()))
      {
         gridWon(1, subject.getText());
         one = true;
      }      
      else if(!a5.getText().equals("") && a4.getText().equals(a5.getText()) && a4.getText().equals(a6.getText()))
      {
         gridWon(1, subject.getText());
         one = true;
      }      
      else if(!a7.getText().equals("") && a7.getText().equals(a9.getText()) && a9.getText().equals(a8.getText()))
      {
         gridWon(1, subject.getText());
         one = true;
      }      
      else if(!a5.getText().equals("") && a2.getText().equals(a5.getText()) && a8.getText().equals(a5.getText()))
      {
         gridWon(1, subject.getText());
         one = true;
      }      
      else if(!a1.getText().equals("") && a1.getText().equals(a4.getText()) && a1.getText().equals(a7.getText()))
      {
         gridWon(1, subject.getText());
         one = true;
      }      
      else if(!a3.getText().equals("") && a3.getText().equals(a9.getText()) && a3.getText().equals(a6.getText()))
      {
         gridWon(1, subject.getText());
         one = true;
      }           
      if(!a1.getText().equals("") && !a2.getText().equals("") && !a3.getText().equals("") && !a4.getText().equals("") && !a5.getText().equals("") && !a6.getText().equals("") && !a7.getText().equals("") && !a8.getText().equals("") && !a9.getText().equals(""))   
      {
         gridTied(1);
         one = true;
      } 
      
      
      if(!b5.getText().equals("") && b1.getText().equals(b5.getText()) && b5.getText().equals(b9.getText()))
      {
         gridWon(2, subject.getText());
         two = true;
      }
      else if(!b5.getText().equals("") && b3.getText().equals(b5.getText()) && b3.getText().equals(b7.getText()))
      {
         gridWon(2, subject.getText());
         two = true;
      }      
      else if(!b1.getText().equals("") && b3.getText().equals(b1.getText()) && b3.getText().equals(b2.getText()))
      {
         gridWon(2, subject.getText());
         two = true; 
      }      
      else if(!b5.getText().equals("") && b4.getText().equals(b5.getText()) && b4.getText().equals(b6.getText()))
      {
         gridWon(2, subject.getText());
         two = true;
      }      
      else if(!b7.getText().equals("") && b7.getText().equals(b9.getText()) && b9.getText().equals(b8.getText()))
      {
         gridWon(2, subject.getText());
         two = true;
      }      
      else if(!b5.getText().equals("") && b2.getText().equals(b5.getText()) && b8.getText().equals(b5.getText()))
      {
         gridWon(2, subject.getText());
         two = true;
      }      
      else if(!b1.getText().equals("") && b1.getText().equals(b4.getText()) && b1.getText().equals(b7.getText()))
      {
         gridWon(2, subject.getText());
         two = true;
      }      
      else if(!b3.getText().equals("") && b3.getText().equals(b9.getText()) && b3.getText().equals(b6.getText()))
      {
         gridWon(2, subject.getText());
         two = true;
      }           
      if(!b1.getText().equals("") && !b2.getText().equals("") && !b3.getText().equals("") && !b4.getText().equals("") && !b5.getText().equals("") && !b6.getText().equals("") && !b7.getText().equals("") && !b8.getText().equals("") && !b9.getText().equals(""))   
      {
         gridTied(2);
         two = true;
      }
   
   
      if(!c5.getText().equals("") && c1.getText().equals(c5.getText()) && c5.getText().equals(c9.getText()))
      {
         gridWon(3, subject.getText());
         three = true;
      }
      else if(!c5.getText().equals("") && c3.getText().equals(c5.getText()) && c3.getText().equals(c7.getText()))
      {
         gridWon(3, subject.getText());
         three = true;
      }      
      else if(!c1.getText().equals("") && c3.getText().equals(c1.getText()) && c3.getText().equals(c2.getText()))
      {
         gridWon(3, subject.getText()); 
         three = true;  
      }      
      else if(!c5.getText().equals("") && c4.getText().equals(c5.getText()) && c4.getText().equals(c6.getText()))
      {
         gridWon(3, subject.getText());
         three = true;  
      }      
      else if(!c7.getText().equals("") && c7.getText().equals(c9.getText()) && c9.getText().equals(c8.getText()))
      {
         gridWon(3, subject.getText());
         three = true;
      }      
      else if(!c5.getText().equals("") && c2.getText().equals(c5.getText()) && c8.getText().equals(c5.getText()))
      {
         gridWon(3, subject.getText());
         three = true;
      }      
      else if(!c1.getText().equals("") && c1.getText().equals(c4.getText()) && c1.getText().equals(c7.getText()))
      {
         gridWon(3, subject.getText());  
         three = true; 
      }      
      else if(!c3.getText().equals("") && c3.getText().equals(c9.getText()) && c3.getText().equals(c6.getText()))
      {
         gridWon(3, subject.getText());
         three = true;  
      }           
      if(!c1.getText().equals("") && !c2.getText().equals("") && !c3.getText().equals("") && !c4.getText().equals("") && !c5.getText().equals("") && !c6.getText().equals("") && !c7.getText().equals("") && !c8.getText().equals("") && !c9.getText().equals(""))   
      {
         gridTied(3);
         three = true;
      }
      
   
      if(!d5.getText().equals("") && d1.getText().equals(d5.getText()) && d5.getText().equals(d9.getText()))
      {
         gridWon(4, subject.getText());
         four = true;
      }
      else if(!d5.getText().equals("") && d3.getText().equals(d5.getText()) && d3.getText().equals(d7.getText()))
      {
         gridWon(4, subject.getText());
         four = true;
      }      
      else if(!d1.getText().equals("") && d3.getText().equals(d1.getText()) && d3.getText().equals(d2.getText()))
      {
         gridWon(4, subject.getText());
         four = true;   
      }      
      else if(!d5.getText().equals("") && d4.getText().equals(d5.getText()) && d4.getText().equals(d6.getText()))
      {
         gridWon(4, subject.getText()); 
         four = true;  
      }      
      else if(!d7.getText().equals("") && d7.getText().equals(d9.getText()) && d9.getText().equals(d8.getText()))
      {
         gridWon(4, subject.getText()); 
         four = true; 
      }      
      else if(!d5.getText().equals("") && d2.getText().equals(d5.getText()) && d8.getText().equals(d5.getText()))
      {
         gridWon(4, subject.getText());
         four = true;
      }      
      else if(!d1.getText().equals("") && d1.getText().equals(d4.getText()) && d1.getText().equals(d7.getText()))
      {
         gridWon(4, subject.getText()); 
         four = true;  
      }      
      else if(!d3.getText().equals("") && d3.getText().equals(d9.getText()) && d3.getText().equals(d6.getText()))
      {
         gridWon(4, subject.getText());
         four = true;   
      }           
      if(!d1.getText().equals("") && !d2.getText().equals("") && !d3.getText().equals("") && !d4.getText().equals("") && !d5.getText().equals("") && !d6.getText().equals("") && !d7.getText().equals("") && !d8.getText().equals("") && !d9.getText().equals(""))   
      {
         gridTied(4);
         four = true;
      }
   
   
      if(!e5.getText().equals("") && e1.getText().equals(e5.getText()) && e5.getText().equals(e9.getText()))
      {
         gridWon(5, subject.getText());
         five = true;
      }
      else if(!e5.getText().equals("") && e3.getText().equals(e5.getText()) && e3.getText().equals(e7.getText()))
      {
         gridWon(5, subject.getText());
         five = true;
      }      
      else if(!e1.getText().equals("") && e3.getText().equals(e1.getText()) && e3.getText().equals(e2.getText()))
      {
         gridWon(5, subject.getText());
         five = true;   
      }      
      else if(!e5.getText().equals("") && e4.getText().equals(e5.getText()) && e4.getText().equals(e6.getText()))
      {
         gridWon(5, subject.getText()); 
         five = true;  
      }      
      else if(!e7.getText().equals("") && e7.getText().equals(e9.getText()) && e9.getText().equals(e8.getText()))
      {
         gridWon(5, subject.getText()); 
         five = true; 
      }      
      else if(!e5.getText().equals("") && e2.getText().equals(e5.getText()) && e8.getText().equals(e5.getText()))
      {
         gridWon(5, subject.getText());
         five = true;
      }      
      else if(!e1.getText().equals("") && e1.getText().equals(e4.getText()) && e1.getText().equals(e7.getText()))
      {
         gridWon(5, subject.getText());
         five = true;   
      }      
      else if(!e3.getText().equals("") && e3.getText().equals(e9.getText()) && e3.getText().equals(e6.getText()))
      {
         gridWon(5, subject.getText());
         five = true;   
      }           
      if(!e1.getText().equals("") && !e2.getText().equals("") && !e3.getText().equals("") && !e4.getText().equals("") && !e5.getText().equals("") && !e6.getText().equals("") && !e7.getText().equals("") && !e8.getText().equals("") && !e9.getText().equals(""))   
      {
         gridTied(5);
         five = true;
      }
      
      
      if(!f5.getText().equals("") && f1.getText().equals(f5.getText()) && f5.getText().equals(f9.getText()))
      {
         gridWon(6, subject.getText());
         six = true;
      }
      else if(!f5.getText().equals("") && f3.getText().equals(f5.getText()) && f3.getText().equals(f7.getText()))
      {
         gridWon(6, subject.getText());
         six = true;
      }      
      else if(!f1.getText().equals("") && f3.getText().equals(f1.getText()) && f3.getText().equals(f2.getText()))
      {
         gridWon(6, subject.getText()); 
         six = true;
      }      
      else if(!f5.getText().equals("") && f4.getText().equals(f5.getText()) && f4.getText().equals(f6.getText()))
      {
         gridWon(6, subject.getText());
         six = true;
      }      
      else if(!f7.getText().equals("") && f7.getText().equals(f9.getText()) && f9.getText().equals(f8.getText()))
      {
         gridWon(6, subject.getText());
         six = true;
      }      
      else if(!f5.getText().equals("") && f2.getText().equals(f5.getText()) && f8.getText().equals(f5.getText()))
      {
         gridWon(6, subject.getText());
         six = true;
      }      
      else if(!f1.getText().equals("") && f1.getText().equals(f4.getText()) && f1.getText().equals(f7.getText()))
      {
         gridWon(6, subject.getText()); 
         six = true;
      }      
      else if(!f3.getText().equals("") && f3.getText().equals(f9.getText()) && f3.getText().equals(f6.getText()))
      {
         gridWon(6, subject.getText());
         six = true;
      }           
      if(!f1.getText().equals("") && !f2.getText().equals("") && !f3.getText().equals("") && !f4.getText().equals("") && !f5.getText().equals("") && !f6.getText().equals("") && !f7.getText().equals("") && !f8.getText().equals("") && !f9.getText().equals(""))   
      {
         gridTied(6);
         six = true;
      }
   
   
      if(!g5.getText().equals("") && g1.getText().equals(g5.getText()) && g5.getText().equals(g9.getText()))
      {
         gridWon(7, subject.getText());
         seven = true;
      }
      else if(!g5.getText().equals("") && g3.getText().equals(g5.getText()) && g3.getText().equals(g7.getText()))
      {
         gridWon(7, subject.getText());
         seven = true;
      }      
      else if(!g1.getText().equals("") && g3.getText().equals(g1.getText()) && g3.getText().equals(g2.getText()))
      {
         gridWon(7, subject.getText()); 
         seven = true; 
      }      
      else if(!g5.getText().equals("") && g4.getText().equals(g5.getText()) && g4.getText().equals(g6.getText()))
      {
         gridWon(7, subject.getText());
         seven = true;
      }      
      else if(!g7.getText().equals("") && g7.getText().equals(g9.getText()) && g9.getText().equals(g8.getText()))
      {
         gridWon(7, subject.getText());
         seven = true;
      }      
      else if(!g5.getText().equals("") && g2.getText().equals(g5.getText()) && g8.getText().equals(g5.getText()))
      {
         gridWon(7, subject.getText());
         seven = true;
      }      
      else if(!g1.getText().equals("") && g1.getText().equals(g4.getText()) && g1.getText().equals(g7.getText()))
      {
         gridWon(7, subject.getText());
         seven = true;
      }      
      else if(!g3.getText().equals("") && g3.getText().equals(g9.getText()) && g3.getText().equals(g6.getText()))
      {
         gridWon(7, subject.getText());
         seven = true;
      }           
      if(!g1.getText().equals("") && !g2.getText().equals("") && !g3.getText().equals("") && !g4.getText().equals("") && !g5.getText().equals("") && !g6.getText().equals("") && !g7.getText().equals("") && !g8.getText().equals("") && !g9.getText().equals(""))   
      {
         gridTied(7);
         seven = true;
      }
   
   
      if(!h5.getText().equals("") && h1.getText().equals(h5.getText()) && h5.getText().equals(h9.getText()))
      {
         gridWon(8, subject.getText());
         eight = true;
      }
      else if(!h5.getText().equals("") && h3.getText().equals(h5.getText()) && h3.getText().equals(h7.getText()))
      {
         gridWon(8, subject.getText());
         eight = true;
      }      
      else if(!h1.getText().equals("") && h3.getText().equals(h1.getText()) && h3.getText().equals(h2.getText()))
      {
         gridWon(8, subject.getText());
         eight = true;
      }      
      else if(!h5.getText().equals("") && h4.getText().equals(h5.getText()) && h4.getText().equals(h6.getText()))
      {
         gridWon(8, subject.getText());
         eight = true;
      }      
      else if(!h7.getText().equals("") && h7.getText().equals(h9.getText()) && h9.getText().equals(h8.getText()))
      {
         gridWon(8, subject.getText());
         eight = true;
      }      
      else if(!h5.getText().equals("") && h2.getText().equals(h5.getText()) && h8.getText().equals(h5.getText()))
      {
         gridWon(8, subject.getText());
         eight = true;
      }      
      else if(!h1.getText().equals("") && h1.getText().equals(h4.getText()) && h1.getText().equals(h7.getText()))
      {
         gridWon(8, subject.getText());
         eight = true;
      }      
      else if(!h3.getText().equals("") && h3.getText().equals(h9.getText()) && h3.getText().equals(h6.getText()))
      {
         gridWon(8, subject.getText());
         eight = true;
      }           
      if(!h1.getText().equals("") && !h2.getText().equals("") && !h3.getText().equals("") && !h4.getText().equals("") && !h5.getText().equals("") && !h6.getText().equals("") && !h7.getText().equals("") && !h8.getText().equals("") && !h9.getText().equals(""))   
      {
         gridTied(8);
         eight = true;
      }
   
   
      if(!i5.getText().equals("") && i1.getText().equals(i5.getText()) && i5.getText().equals(i9.getText()))
      {
         gridWon(9, subject.getText());
         nine = true;
      }
      else if(!i5.getText().equals("") && i3.getText().equals(i5.getText()) && i3.getText().equals(i7.getText()))
      {
         gridWon(9, subject.getText());
         nine = true;
      }      
      else if(!i1.getText().equals("") && i3.getText().equals(i1.getText()) && i3.getText().equals(i2.getText()))
      {
         gridWon(9, subject.getText()); 
         nine = true;
      }      
      else if(!i5.getText().equals("") && i4.getText().equals(i5.getText()) && i4.getText().equals(i6.getText()))
      {
         gridWon(9, subject.getText());
         nine = true;
      }      
      else if(!i7.getText().equals("") && i7.getText().equals(i9.getText()) && i9.getText().equals(i8.getText()))
      {
         gridWon(9, subject.getText());
         nine = true;
      }      
      else if(!i5.getText().equals("") && i2.getText().equals(i5.getText()) && i8.getText().equals(i5.getText()))
      {
         gridWon(9, subject.getText());
         nine = true;
      }      
      else if(!i1.getText().equals("") && i1.getText().equals(i4.getText()) && i1.getText().equals(i7.getText()))
      {
         gridWon(9, subject.getText());  
         nine = true;
      }      
      else if(!i3.getText().equals("") && i3.getText().equals(i9.getText()) && i3.getText().equals(i6.getText()))
      {
         gridWon(9, subject.getText());  
         nine = true;
      }           
      if(!i1.getText().equals("") && !i2.getText().equals("") && !i3.getText().equals("") && !i4.getText().equals("") && !i5.getText().equals("") && !i6.getText().equals("") && !i7.getText().equals("") && !i8.getText().equals("") && !i9.getText().equals(""))   
      {
         gridTied(9);
         nine = true;
      }
      
      else if(one == true && (subject.getActionCommand().equals("a1") || subject.getActionCommand().equals("b1") || subject.getActionCommand().equals("c1") || subject.getActionCommand().equals("d1") || subject.getActionCommand().equals("e1") || subject.getActionCommand().equals("f1") || subject.getActionCommand().equals("g1") || subject.getActionCommand().equals("h1") || subject.getActionCommand().equals("i1")))
         next = 0;
      else if(two == true && (subject.getActionCommand().equals("a2") || subject.getActionCommand().equals("b2") || subject.getActionCommand().equals("c2") || subject.getActionCommand().equals("d2") || subject.getActionCommand().equals("e2") || subject.getActionCommand().equals("f2") || subject.getActionCommand().equals("g2") || subject.getActionCommand().equals("h2") || subject.getActionCommand().equals("i2")))
         next = 0;
      else if(three == true && (subject.getActionCommand().equals("a3") || subject.getActionCommand().equals("b3") || subject.getActionCommand().equals("c3") || subject.getActionCommand().equals("d3") || subject.getActionCommand().equals("e3") || subject.getActionCommand().equals("f3") || subject.getActionCommand().equals("g3") || subject.getActionCommand().equals("h3") || subject.getActionCommand().equals("i3")))
         next = 0;
      else if(four == true && (subject.getActionCommand().equals("a4") || subject.getActionCommand().equals("b4") || subject.getActionCommand().equals("c4") || subject.getActionCommand().equals("d4") || subject.getActionCommand().equals("e4") || subject.getActionCommand().equals("f4") || subject.getActionCommand().equals("g4") || subject.getActionCommand().equals("h4") || subject.getActionCommand().equals("i4")))
         next = 0;
      else if(five == true && (subject.getActionCommand().equals("a5") || subject.getActionCommand().equals("b5") || subject.getActionCommand().equals("c5") || subject.getActionCommand().equals("d5") || subject.getActionCommand().equals("e5") || subject.getActionCommand().equals("f5") || subject.getActionCommand().equals("g5") || subject.getActionCommand().equals("h5") || subject.getActionCommand().equals("i5")))
         next = 0;
      else if(six == true && (subject.getActionCommand().equals("a6") || subject.getActionCommand().equals("b6") || subject.getActionCommand().equals("c6") || subject.getActionCommand().equals("d6") || subject.getActionCommand().equals("e6") || subject.getActionCommand().equals("f6") || subject.getActionCommand().equals("g6") || subject.getActionCommand().equals("h6") || subject.getActionCommand().equals("i6")))
         next = 0;
      else if(seven == true && (subject.getActionCommand().equals("a7") || subject.getActionCommand().equals("b7") || subject.getActionCommand().equals("c7") || subject.getActionCommand().equals("d7") || subject.getActionCommand().equals("e7") || subject.getActionCommand().equals("f7") || subject.getActionCommand().equals("g7") || subject.getActionCommand().equals("h7") || subject.getActionCommand().equals("i7")))
         next = 0;
      else if(eight == true && (subject.getActionCommand().equals("a8") || subject.getActionCommand().equals("b8") || subject.getActionCommand().equals("c8") || subject.getActionCommand().equals("d8") || subject.getActionCommand().equals("e8") || subject.getActionCommand().equals("f8") || subject.getActionCommand().equals("g8") || subject.getActionCommand().equals("h8") || subject.getActionCommand().equals("i8")))
         next = 0;
      else if(nine == true && (subject.getActionCommand().equals("a9") || subject.getActionCommand().equals("b9") || subject.getActionCommand().equals("c9") || subject.getActionCommand().equals("d9") || subject.getActionCommand().equals("e9") || subject.getActionCommand().equals("f9") || subject.getActionCommand().equals("g9") || subject.getActionCommand().equals("h9") || subject.getActionCommand().equals("i9")))
         next = 0;
         
      else if(subject.getActionCommand().equals("a1") || subject.getActionCommand().equals("b1") || subject.getActionCommand().equals("c1") || subject.getActionCommand().equals("d1") || subject.getActionCommand().equals("e1") || subject.getActionCommand().equals("f1") || subject.getActionCommand().equals("g1") || subject.getActionCommand().equals("h1") || subject.getActionCommand().equals("i1"))
         next = 1;
      else if(subject.getActionCommand().equals("a2") || subject.getActionCommand().equals("b2") || subject.getActionCommand().equals("c2") || subject.getActionCommand().equals("d2") || subject.getActionCommand().equals("e2") || subject.getActionCommand().equals("f2") || subject.getActionCommand().equals("g2") || subject.getActionCommand().equals("h2") || subject.getActionCommand().equals("i2"))
         next = 2;
      else if(subject.getActionCommand().equals("a3") || subject.getActionCommand().equals("b3") || subject.getActionCommand().equals("c3") || subject.getActionCommand().equals("d3") || subject.getActionCommand().equals("e3") || subject.getActionCommand().equals("f3") || subject.getActionCommand().equals("g3") || subject.getActionCommand().equals("h3") || subject.getActionCommand().equals("i3"))
         next = 3;
      else if(subject.getActionCommand().equals("a4") || subject.getActionCommand().equals("b4") || subject.getActionCommand().equals("c4") || subject.getActionCommand().equals("d4") || subject.getActionCommand().equals("e4") || subject.getActionCommand().equals("f4") || subject.getActionCommand().equals("g4") || subject.getActionCommand().equals("h4") || subject.getActionCommand().equals("i4"))
         next = 4;
      else if(subject.getActionCommand().equals("a5") || subject.getActionCommand().equals("b5") || subject.getActionCommand().equals("c5") || subject.getActionCommand().equals("d5") || subject.getActionCommand().equals("e5") || subject.getActionCommand().equals("f5") || subject.getActionCommand().equals("g5") || subject.getActionCommand().equals("h5") || subject.getActionCommand().equals("i5"))
         next = 5;
      else if(subject.getActionCommand().equals("a6") || subject.getActionCommand().equals("b6") || subject.getActionCommand().equals("c6") || subject.getActionCommand().equals("d6") || subject.getActionCommand().equals("e6") || subject.getActionCommand().equals("f6") || subject.getActionCommand().equals("g6") || subject.getActionCommand().equals("h6") || subject.getActionCommand().equals("i6"))
         next = 6;
      else if(subject.getActionCommand().equals("a7") || subject.getActionCommand().equals("b7") || subject.getActionCommand().equals("c7") || subject.getActionCommand().equals("d7") || subject.getActionCommand().equals("e7") || subject.getActionCommand().equals("f7") || subject.getActionCommand().equals("g7") || subject.getActionCommand().equals("h7") || subject.getActionCommand().equals("i7"))
         next = 7;
      else if(subject.getActionCommand().equals("a8") || subject.getActionCommand().equals("b8") || subject.getActionCommand().equals("c8") || subject.getActionCommand().equals("d8") || subject.getActionCommand().equals("e8") || subject.getActionCommand().equals("f8") || subject.getActionCommand().equals("g8") || subject.getActionCommand().equals("h8") || subject.getActionCommand().equals("i8"))
         next = 8;
      else if(subject.getActionCommand().equals("a9") || subject.getActionCommand().equals("b9") || subject.getActionCommand().equals("c9") || subject.getActionCommand().equals("d9") || subject.getActionCommand().equals("e9") || subject.getActionCommand().equals("f9") || subject.getActionCommand().equals("g9") || subject.getActionCommand().equals("h9") || subject.getActionCommand().equals("i9"))
         next = 9;      
      if(next != 1)
         a.setBackground(Color.BLACK);
      if(next != 2)
         b.setBackground(Color.BLACK);
      if(next != 3)
         c.setBackground(Color.BLACK);
      if(next != 4)
         d.setBackground(Color.BLACK);
      if(next != 5)
         e.setBackground(Color.BLACK);
      if(next != 6)
         f.setBackground(Color.BLACK);
      if(next != 7)
         g.setBackground(Color.BLACK);
      if(next != 8)
         h.setBackground(Color.BLACK);
      if(next != 9)
         i.setBackground(Color.BLACK);
      if(next != 0)
      {
         a.setBackground(Color.BLACK);
         b.setBackground(Color.BLACK);
         c.setBackground(Color.BLACK);
         d.setBackground(Color.BLACK);
         e.setBackground(Color.BLACK);
         f.setBackground(Color.BLACK);
         g.setBackground(Color.BLACK);
         h.setBackground(Color.BLACK);
         i.setBackground(Color.BLACK);
      }
         
      if(next == 1)
         a.setBackground(Color.YELLOW);
      if(next == 2)
         b.setBackground(Color.YELLOW);
      if(next == 3)
         c.setBackground(Color.YELLOW);
      if(next == 4)
         d.setBackground(Color.YELLOW);
      if(next == 5)
         e.setBackground(Color.YELLOW);
      if(next == 6)
         f.setBackground(Color.YELLOW);
      if(next == 7)
         g.setBackground(Color.YELLOW);
      if(next == 8)
         h.setBackground(Color.YELLOW);
      if(next == 9)
         i.setBackground(Color.YELLOW);
      if(next == 0)
      {
         if(!one)
            a.setBackground(Color.YELLOW);
         if(!two)
            b.setBackground(Color.YELLOW);
         if(!three)
            c.setBackground(Color.YELLOW);
         if(!four)
            d.setBackground(Color.YELLOW);
         if(!five)
            e.setBackground(Color.YELLOW);
         if(!six)
            f.setBackground(Color.YELLOW);
         if(!seven)
            g.setBackground(Color.YELLOW);
         if(!eight)
            h.setBackground(Color.YELLOW);
         if(!nine)
            i.setBackground(Color.YELLOW);
      }
         
      turns++;
   
   }
}