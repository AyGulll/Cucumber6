package JBDC.Gun1;

import JBDC.Gun2.JDBCParent;
import org.testng.annotations.Test;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_Giris extends JDBCParent {
    @Test
    public void test() throws SQLException {
        ResultSet sonuc=sorguEkrani.executeQuery("select * from customer");


        sonuc.next();

        System.out.println(sonuc.getString("first_name") );
        System.out.println(sonuc.getString("last_name") );
    }
}
