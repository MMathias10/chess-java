package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	public Board(int rows, int columns) {
		super();
		this.setRows(rows);
		this.setColumns(columns);
		pieces = new Piece[rows][columns];
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	} 
	
	public Piece peice(int row,int colunm) {
		return pieces[row][colunm];
	}
	public Piece peice(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	
}