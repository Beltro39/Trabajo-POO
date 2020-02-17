
package trabajo.poo;

import java.awt.AWTException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Regresar extends OpcionDeMenu{
    //atributos
    MenuDeConsola anteriorMenu;
    //constructores
    Regresar(MenuDeConsola anteriorMenu){
      this.anteriorMenu= anteriorMenu;
    }
    //metodos
    public void ejecutar(){
      try {
             RobotPresiona.limpiarpantalla();
         } catch (AWTException ex) {
             Logger.getLogger(SiguienteMenu.class.getName()).log(Level.SEVERE, null, ex);
         }
      anteriorMenu.lanzarMenu();
    }
    public String toString(){
        return "Regresar al menu anterior";
    }
}
