package packman;

import javax.swing.JFrame;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowCount = 21;
		int columnCount = 19;
		int tileSize = 32;
		int boardWidth = columnCount * tileSize;
		int boardHeight = rowCount * tileSize;
		
		JFrame frame = new JFrame("Pack Man");
		//frame.setVisible(true);
		frame.setSize(boardWidth,boardHeight);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PacMan pacmanGame = new PacMan();
		frame.add(pacmanGame);
		frame.pack();
		pacmanGame.requestFocus();
		frame.setVisible(true);
	}

}
