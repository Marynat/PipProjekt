package Wzorce;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

import database.Typ;
import database.Uzytkownik;

public class ActionProxy extends AbstractAction {
	private Action action;
	private Uzytkownik user;

	public ActionProxy(Action action_1, Uzytkownik user, String name, String desc) {
		super();
		putValue(NAME, name);
		putValue(SHORT_DESCRIPTION, desc);
		this.action = action_1;
		this.user = user;
	}

	private boolean checkRole(Typ typ) {
		return user.getTyp().equals(typ);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (checkRole(Typ.KIEROWNIK)) {
			action.actionPerformed(e);
		} else {
			System.out.println("Tylko uzytkownik o typu " + Typ.KIEROWNIK + " ma dostep do tego przycisku");
		}

	}
}
