import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
/**
 * 
 * @author Surya Senthil
 *
 * All the GUI Design Elements for the Window
 */
public class DisplayPanel extends JPanel
{
  private JTextField xText, oText;
  private int xCount, oCount;

  public DisplayPanel()
  {
    super(new GridLayout(2, 3, 10, 0));
    setBorder(new EmptyBorder(0, 0, 5, 0));

    add(new JLabel("    X Won:"));
    add(new JLabel("    O Won:"));

    Font displayFont = new Font("Monospaced", Font.BOLD, 16);

    xText = new JTextField("  " + xCount, 5);
    xText.setFont(displayFont);
    xText.setEditable(false);
    xText.setBackground(Color.GREEN);
    add(xText);

    oText = new JTextField("  " + oCount, 5);
    oText.setFont(displayFont);
    oText.setEditable(false);
    oText.setBackground(Color.RED);
    add(oText);

  }
  public void won(String a)
  {
      if(a.equals("X"))
         xCount++;
      else
         oCount++;
      xText.setText("  " + xCount);
      oText.setText("  " + oCount);
  }

  
}
