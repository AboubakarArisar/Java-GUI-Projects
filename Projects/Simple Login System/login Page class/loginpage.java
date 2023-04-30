import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;



class loginpage implements ActionListener
{
    JFrame frame = new JFrame();
    JButton login = new JButton("Login");
    JButton reset = new JButton("Reset");
    JTextField idText = new JTextField();
    JPasswordField code = new JPasswordField();
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JLabel result = new JLabel();
    HashMap<String,String> copy = new HashMap<String,String>();
   loginpage (HashMap<String,String> Actualdata)
    {copy = Actualdata;

        username.setBounds(50,100,75,25);
        password.setBounds(50,150,75,25);
        result.setBounds(125,250,250,35);
        result.setHorizontalAlignment(SwingConstants.CENTER);
        frame.setBounds(125,250,250,35);
        idText.setBounds(125,100,200,25);
        code.setBounds(125,150,200,25);
        login.setBounds(125,200,100,25);
        login.setFocusable(false);
        login.addActionListener(this);
        reset.setBounds(225,200,100,25);
        reset.setFocusable(false);
        reset.addActionListener(this);
        frame.add(login);
        frame.add(reset);
        frame.add(username);
        frame.add(password);
        frame.add(result);
        frame.add(idText);
        frame.add(code);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==reset)
       {
           idText.setText("");
           code.setText("");
       }
       if(e.getSource()==login)
       {
           String id = idText.getText();
           String pin = String.valueOf(code.getText());
           if(copy.containsValue(id))
           {
              if(copy.get(id).equals(pin))
              {
                  result.setForeground(Color.BLACK);
                  result.setText("Login Successfull");
                  frame.dispose();
                  welcomepage welcome = new welcomepage(id);
              }
              else
              {
                  result.setForeground(Color.RED);
                  result.setText("Wrong Password");
              }
           }
           else
           {

               result.setForeground(Color.RED);
               result.setText("User not Found");
           }
       }

    }
}
