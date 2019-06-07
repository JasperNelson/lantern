package main;
import java.io.IOException;
import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.input.KeyType;

public class HUB extends my{
	private Terminal terminal;
	private Screen screen;
	private Character player;
	private initiate levelGenerator;

	public HUB(Terminal terminal, Screen screen, String playerName) {
		this.terminal = terminal;
		this.screen = screen;
		this.player = new Character(playerName, 100);
		this.levelGenerator = new initiate();
	}
	void menue() throws IOException {
		TextGraphics textGraphics = terminal.newTextGraphics();

		textGraphics.putString(0, 8, "Controlls: Press esc to exit") ;
		textGraphics.putString(0, 9, "Type Atk to see your attacks  type AtkName ");
		textGraphics.putString(0, 10, "followed by target to attack");
		textGraphics.putString(0, 11, "type left to go left,");
		textGraphics.putString(0, 12," right to go right,");
		textGraphics.putString(0, 13,"\n front to go forward"); 
		textGraphics.putString(0, 14,"and back to go back");
		textGraphics.putString(0, 15,"type search to search");
		textGraphics.putString(0, 16,"type end to endturn", SGR.BOLD);
		
		// Make sure the textGraphics show on the screen.
		screen.refresh();
	}
	//the basis of the user instruction 
	void dialogue() {
		initiate a= new initiate();
		for(int i = 0; i < a.StartupRoomArray().length; i++) 
		{
			System.out.println();
			for(int j = 0; j < a.StartupRoomArray()[i].length; j++)
			{
				System.out.print(a.StartupRoomArray()[i][j]);
			}
			
		}
		

	}
}


