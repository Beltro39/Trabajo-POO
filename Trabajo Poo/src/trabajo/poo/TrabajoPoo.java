package trabajo.poo;
public class TrabajoPoo {
  public static void main(String[] args) {
        //Menus De inicio de sesion
        MenuDeConsola menuInicioSesion= new MenuDeConsola("**********************\n   Inicio de sesión\n**********************");
        MenuDeConsola menuCrearUsuario= new MenuDeConsola("************************\n   Registro de Usuario\n************************");
        MenuDeConsola menuIniciarCliente= new MenuDeConsola("******************************\n  Inicio de sesión cliente \n******************************");
        MenuDeConsola menuIniciarOperario= new MenuDeConsola("*****************************\n  Inicio de sesión operario \n*****************************");
        MenuDeConsola menuIniciarAdministrador= new MenuDeConsola("**********************************\n  Inicio de sesión administrador \n**********************************");
        MenuDeConsola menuIniciarJefe= new MenuDeConsola("*************************\n  Inicio de sesión jefe \n*************************");
        MenuDeConsola menuIniciarAdministradorSistema= new MenuDeConsola("**********************************************\n  Inicio de sesión administrador del sistema \n**********************************************");
        
        //Creacion de opciones del menu de Inicio
        SiguienteMenu crearUsuario= new SiguienteMenu(menuCrearUsuario, "Registrarse");
        SiguienteMenu iniciarCliente= new SiguienteMenu(menuIniciarCliente, "Iniciar como cliente");
        SiguienteMenu iniciarOperario= new SiguienteMenu(menuIniciarOperario, "Iniciar como operario");
        SiguienteMenu iniciarAdministrador= new SiguienteMenu(menuIniciarAdministrador, "Iniciar como administrador");
        SiguienteMenu iniciarJefe= new SiguienteMenu(menuIniciarJefe, "Iniciar como jefe");
        SiguienteMenu iniciarAdministradorSistema= new SiguienteMenu(menuIniciarAdministradorSistema, "Iniciar como administrador del sistema");
        
        //Añadir las opciones al menu de Inicio
        menuInicioSesion.añadirOpcion(crearUsuario);
        menuInicioSesion.añadirOpcion(iniciarCliente);
        menuInicioSesion.añadirOpcion(iniciarOperario);
        menuInicioSesion.añadirOpcion(iniciarAdministrador);
        menuInicioSesion.añadirOpcion(iniciarJefe);
        menuInicioSesion.añadirOpcion(iniciarAdministradorSistema);
        
        
        
        //Creacion de opciones de crear Usuario
        menuCrearUsuario.setMensajeMenu("Registre su cédula: ");
        
        
        //Creacion de opciones de inicio de sesion cliente
        MenuDeConsola menuIngresarDatos= new MenuDeConsola("");
        menuIngresarDatos.setMensajeMenu("Digite su cedula");
        
        SiguienteMenu btnIngresarDatos= new SiguienteMenu(menuIngresarDatos, "Digitar datos");
        SiguienteMenu RegresarInicioSesion= new SiguienteMenu(menuInicioSesion, "Regresar");
        
        menuIniciarCliente.añadirOpcion(btnIngresarDatos);
        menuIniciarCliente.añadirOpcion(RegresarInicioSesion);
        
        
        //Creacion de opciones de inicio de sesion operario
          //MenuDeConsola menuIngresarDatosOperario= new MenuDeConsola("");
          //menuIngresarDatosOperario.setMensajeMenu("Digite su cedula");
        
          //SiguienteMenu btnIngresarOperario= new SiguienteMenu(menuIngresarDatos, "Digitar datos");

        menuIniciarOperario.añadirOpcion(btnIngresarDatos);
        menuIniciarOperario.añadirOpcion(RegresarInicioSesion);
        
        
        //Creacion de opciones de inicio de sesion administrador
          //MenuDeConsola menuIngresarDatosAdministrador= new MenuDeConsola("");
          //menuIngresarDatosAdministrador.setMensajeMenu("Digite su cedula");
        
          // SiguienteMenu btnIngresarAdministrador= new SiguienteMenu(menuIngresarDatos, "Digitar datos");

        menuIniciarAdministrador.añadirOpcion(btnIngresarDatos);
        menuIniciarAdministrador.añadirOpcion(RegresarInicioSesion);
        
        
        //Creacion de opciones de inicio de sesion jefe
          //MenuDeConsola menuIngresarDatosJefe= new MenuDeConsola("");
          //menuIngresarDatosOperario.setMensajeMenu("Digite su cedula");
        
          //SiguienteMenu btnIngresarOperario= new SiguienteMenu(menuIngresarDatosOperario, "Digitar datos");

        menuIniciarJefe.añadirOpcion(btnIngresarDatos);
        menuIniciarJefe.añadirOpcion(RegresarInicioSesion);
        
        //Creacion de opciones de inicio de sesion Administrador del Sistema
        menuIniciarAdministradorSistema.añadirOpcion(btnIngresarDatos);
        menuIniciarAdministradorSistema.añadirOpcion(RegresarInicioSesion);
        
        
        menuInicioSesion.lanzarMenu();
        //MenuInicioSesion.añadirOpcion();
        
        //MenuInicioSesion.añadirOpcion();
        
    }
    
}
