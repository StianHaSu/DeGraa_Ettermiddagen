import javax.swing.JTextField;

import javax.swing.*;
import java.awt.event.FocusAdapter;  
import java.awt.event.FocusEvent;  

public class GhostText extends JTextField{
    private String hint;
    public GhostText(String basic, int columns){
        super(basic, columns);
        hint = basic;
        this.addFocusListener(new FocusAdapter(){
    
            @Override 
            public void focusGained(FocusEvent e){
                if (getText().equals(hint)) {  
                    setText("");   
            }

        }
            @Override  
            public void focusLost(FocusEvent e) {  
              if (getText().equals(hint)|| getText().length()==0) {  
                setText(hint);  
          }
        }
    });
    }
}
