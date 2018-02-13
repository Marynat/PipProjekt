package Wzorce;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.Typ;
import database.Uzytkownik;

public class UserMapper {
	  public static Uzytkownik map(ResultSet rs) throws SQLException{
	    Uzytkownik user = new Uzytkownik();
	  	while (rs.next()) {
	  					user.setId(rs.getInt(1));
						user.setNazwaU(rs.getString(2));
						user.setHaslo(rs.getString(3).toCharArray());
						user.setTyp(Typ.valueOf(rs.getString(4)));
						user.setImie(rs.getString(5));
						user.setNazwisko(rs.getString(6));
						
	    return user;
	  }
	    
	    return null;
	  }
	}
