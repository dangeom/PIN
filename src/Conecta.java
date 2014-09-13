
 import java.sql.Connection;  
 import java.sql.DriverManager;  
 import java.sql.SQLException;  
 import javax.swing.JOptionPane;  
 
 public class Conecta {  
   final private String url = "jdbc:postgresql://localhost:5432/Estacionamento";  
   final private String usuario = "postgres";  
   final private String senha = "admin";  
   final private String driver = "org.postgresql.Driver";  
   Connection con;  
   public Connection conecta() {  
     try {  
       Class.forName(driver);  
     } catch (ClassNotFoundException cnfe) {  
       JOptionPane.showMessageDialog(null, "não encontrado");  
       System.out.println("Driver não encontrado!!");  
       cnfe.printStackTrace();  
     }  
     try {  
       con = DriverManager.getConnection(url, usuario, senha);  
       
     } catch (SQLException se) {  
       System.out.println("Não foi possivel conectar");  
       se.printStackTrace();  
     }  
     return con;  
   }  
 } 