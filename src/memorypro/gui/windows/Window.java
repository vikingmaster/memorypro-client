/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorypro.gui.windows;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import memorypro.MemoryPro;

/**
 *
 * @author c2yshest
 */
public class Window extends JFrame {
    public Integer type ;
    public MemoryPro app ;
    
    public Window(){
        
    }
    
    public Window(MemoryPro app){
        setApp(app);
    }
    
    public void setApp(MemoryPro app){
        this.app = app ;
    }
    
    public void setType(Integer type){
        this.type = type ;
    }
    
    public static final Integer
        LOGIN       = 0,
        MAIN        = 1,
        NOTES       = 3,
        NEW_NOTE    = 4,
        ACCOUNT     = 5,
        BROWSE      = 6,
        EDIT_NOTE   = 7
    ;
}