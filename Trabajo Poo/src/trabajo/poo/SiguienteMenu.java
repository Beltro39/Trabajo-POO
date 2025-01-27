package trabajo.poo;

import java.awt.AWTException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SiguienteMenu extends OpcionDeMenu {
     MenuDeConsola proximoMenu;
     String nombreOpcion;
    
    SiguienteMenu(MenuDeConsola proximoMenu, String nombreOpcion){
      this.proximoMenu= proximoMenu;
      this.nombreOpcion= nombreOpcion;
    }
    
   
    public void ejecutar(){
         try {
             RobotPresiona.limpiarpantalla();
         } catch (AWTException ex) {
             Logger.getLogger(SiguienteMenu.class.getName()).log(Level.SEVERE, null, ex);
         }
      //proximoMenu.menuAnterior= this;   
     // proximoMenu.menuAnteriorMetodo() 
         
      proximoMenu.lanzarMenu();
    }
    
    
    
    public String toString(){
      return this.nombreOpcion;
    }
    
    
}
