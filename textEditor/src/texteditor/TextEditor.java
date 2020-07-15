
package texteditor;

import javax.swing.JFrame;

public class TextEditor {

  
    public static void main(String[] args) {
        // TODO code application logic here
        textEditorGUI obj = new textEditorGUI();
        obj.setBounds(0,0,700,700);
        obj.setTitle("Notepad");
        obj.setVisible(true);
        obj.setDeafaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
    }
    
}
