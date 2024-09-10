/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class conexion {
     public Connection conexionBD;
    public final String bd = "db_empresa";
    public final String urlConexion = String.format("jdbc:mysql://localhost:3306/%s",bd);
    public final String usuario = "empresa";
    public final String contra = "17sept04";
    public final String jbdc = "com.mysql.cj.jdbc.Driver";
    
    public void abrir_conexion(){
        try{
            Class.forName(jbdc);
            conexionBD=DriverManager.getConnection(urlConexion,usuario,contra);
          //    JOptionPane.showMessageDialog(null, "Conexión exitosa", "Información", JOptionPane.INFORMATION_MESSAGE);
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("Algo salio mal :( " + ex.getMessage());
        }
    }
    public void cerrar_conexion(){
    try{
        conexionBD.close();
        }
        catch (SQLException ex){
            System.out.println("Algo salio mal :( "+ ex.getMessage());
       
    }
    }
    
}
