package boardgame;

public class Position {
	private int row;
	private int column;
	public Position(int rown, int column) {
		//super();
		this.setRown(rown);
		this.setColumn(column);
	}
	public int getRown() {
		return row;
	}
	public void setRown(int rown) {
		this.row = rown;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	@Override
	public String toString() {
		return row+ "," + column;
	}
	

}
