package section3;

import java.util.StringJoiner;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String userName = JOptionPane.showInputDialog("Do you know how to white code");

		// 2. If they say "yes", tell them they will rule the world.
		if (userName.equals("yes")) {
			// 3. Otherwise, wish them good luck washing dishes.
			JOptionPane.showMessageDialog(null, "you will rule the world");

		
		}
		else {
			JOptionPane.showMessageDialog(null, "good luck washing dishes");
		}
	}
}
