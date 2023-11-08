package _JDBC.Gun1;

import JBDC.Gun2.JDBCParent;
import org.testng.annotations.Test;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _06_Todo extends JDBCParent {
    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini absolute ile yazdırınız
    // TODO : city tablosundaki tüm satırlardaki şehir isimlerini relative ile yazdırınız

    @Test
    public void test1() throws SQLException {

        ResultSet rs = sorguEkrani.executeQuery("select * from city");

        while (rs.absolute(10))
            System.out.println(rs.getString("city"));


    }

    @Test
    public void test2() throws SQLException {

        ResultSet rs = sorguEkrani.executeQuery("select * from city");

        while (rs.relative(10))
            System.out.println(rs.getString("city"));


    }
}



