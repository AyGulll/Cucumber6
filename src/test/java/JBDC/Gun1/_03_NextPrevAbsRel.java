package JBDC.Gun1;

import JBDC.Gun2.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends JDBCParent {

    @Test
    public void test1() throws SQLException {
        ResultSet rs=sorguEkrani.executeQuery("select * from language");

        rs.next(); // bir adım ileri
        System.out.println("1.Satır="+ rs.getString(2)); // 2.Column index değil      -ing

        rs.next();  // bir adım ileri
        System.out.println("2.Satır="+ rs.getString("name")); // 2.Column index değil - ital

        rs.previous(); // bir adım geri
        System.out.println("1.Satır="+ rs.getString(2)); // 2.Column index değil      -ing
    }

    @Test
    public void test2() throws SQLException {
        ResultSet rs=sorguEkrani.executeQuery("select * from film");

        rs.absolute(10); // 10 satıra direk git
        System.out.println("10.Satır title="+ rs.getString("title"));

        rs.absolute(5); // 5 satıra direk git
        System.out.println("5.Satır title="+ rs.getString("title"));

        rs.relative(5); // en son nerdeysen, ordan itibaren 5 git.
        System.out.println("10.Satır title="+ rs.getString("title"));

        rs.next(); //11 e git
    }
// rs.next() : sonraki satır
    // rs.previous : önceki satır
    // rs.absolute(10) : baştan itibaren 10.satıra gider.
    // rs.relative(10) : bulunduğu yerden 10.satıra gider.
    // rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
    // rs.relative(-5) :  - (eksi) bulundu yerden 5 satır geri


}


