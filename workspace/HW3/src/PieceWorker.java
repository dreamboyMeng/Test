
public class PieceWorker extends Employee {
	private double wage; // wage per piece
	private int pieces; // number of pieces produced
	
	public PieceWorker(String firstName, String lastName, 
			String socialSecurityNumber, double wage, int pieces) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (wage < 0.0) 
			throw new IllegalArgumentException("Wage per piece must be >= 0.0");
		
		if (Math.floor(pieces) != pieces)
			throw new IllegalArgumentException("Pieces must be an integer");
		else if (pieces < 0.0)
			throw new IllegalArgumentException("Pieces must be non-negative integer");
		
		this.wage = wage;
		this.pieces = pieces;
	}
	
	public void setWage(double wage) {
		if (wage < 0.0) 
			throw new IllegalArgumentException("Wage per piece must be >= 0.0");
		
		this.wage = wage;
	}
	
	public void setPieces(int pieces) {
		if (Math.floor(pieces) != pieces)
			throw new IllegalArgumentException("Pieces must be an integer");
		else if (pieces < 0.0)
			throw new IllegalArgumentException("Pieces must be non-negative integer");
		
		this.pieces = pieces;
	}
	
	public double getWage() {
		return wage;
	}
	
	public int getPieces() {
		return pieces;
	}
	
	@Override
	public double earnings() {
		return wage * pieces;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f, %s: %2d", "pieceWorker", super.toString(), "wage", getWage(), "pieces", getPieces());
	}
}
