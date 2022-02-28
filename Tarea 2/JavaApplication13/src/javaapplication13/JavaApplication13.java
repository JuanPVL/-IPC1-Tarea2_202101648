package javaapplication13;
public class JavaApplication13 {

   
    public static void main(String[] args) {
        
        Usuario[] usuarios = new Usuario[50];
        
     
        usuarios[0] = new Usuario(0,"Juan Pedro","Valle Lema","202101648");
               
        Login login = new Login(usuarios);
        login.setVisible(true);
    }
    
}
