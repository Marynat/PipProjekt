package Menu;

import database.Uzytkownik;

public abstract class Menu {
	public Uzytkownik user;
    
	  public void setUser(Uzytkownik user){
	  	this.user = user;
	  }
	  
	  abstract public void initialize();
	  
	}

