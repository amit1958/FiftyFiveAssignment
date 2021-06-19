package Utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class OtpManager {
	public static Connection connectSqlDb(String dbName) throws SQLException {
		
        String serverName = "jdbc:postgresql://msilsmp-preprod.cmedneqruv6c.ap-south-1.rds.amazonaws.com:5432/common-customer";
        return DriverManager.getConnection("jdbc:postgresql://" + serverName + ";databaseName=" + dbName + ";integratedSecurity=true");
    }
    
    public static String getLastOptForUser(String userName) throws SQLException {
        String otp = null;
        Connection connection = connectSqlDb("common-customer");
        Statement statement = connection.createStatement();
        String query = "select otp from otp_details where contact_info= '" + userName + "' order by created desc";
        ResultSet result = statement.executeQuery(query);
        while(result.next()) {
            otp = result.getString("otp");
        }
        return otp;
    }
    
    public static void main(String[] args) throws SQLException {
        String userName = "7011040591";
        String lastOtp = getLastOptForUser(userName);
        System.out.println(lastOtp);
    }
    
}

