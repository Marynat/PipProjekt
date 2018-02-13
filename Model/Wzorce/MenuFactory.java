package Wzorce;

import Menu.KlientMenu;
import Menu.Menu;
import Menu.PracownikMenu;
import database.Typ;
import database.Uzytkownik;

public class MenuFactory {
	public static Menu createMenu(Typ typ, Uzytkownik user){
	      Menu menu = null;
	     switch (typ) {
							case KIEROWNIK:	
								menu = new PracownikMenu();
								break;
							case FARMACEUTA:
								menu = new PracownikMenu();
								break;
							case KLIENT:
								menu = new KlientMenu();
								break;
							default:
								System.out.println("Zly typ uzytkownika");
							}
						
	    	menu.setUser(user);
	    	return menu;
	    }
	}

