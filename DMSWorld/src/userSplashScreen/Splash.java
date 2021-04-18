/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userSplashScreen;

/**
 *
 * @author kichl
 */
public class Splash {
    
    public static void main(String[] args){
        SplashScreen ss = new SplashScreen();
        ss.setVisible(true);
        
        try{
            
            for(int i=0;i<=100;i++){
                Thread.sleep(30);
                
                ss.jLabel2.setText(" "+i);
                ss.jProgressBar1.setValue(i);
                
            } 
            
        }
        catch(Exception e){
            
        }
        
    }
    
}
