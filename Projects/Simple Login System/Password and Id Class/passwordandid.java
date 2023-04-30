import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

class passwordandid
{
    HashMap<String,String> data = new HashMap<String,String>();
    passwordandid()
    {
        data.put("Aboubakar","Arisar34@");
        data.put("memon","memon");
        data.put("latki","latki");
    }
    HashMap getData()
    {
        return data;
    }
}
