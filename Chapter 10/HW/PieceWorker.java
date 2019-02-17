/*
10.10: Pieceworker employee
Peter Phan 11/9/2014
 */


public class PieceWorker extends Employee {

    private double wage;
    private double pieces;

    // five-argument constructor
    public PieceWorker(String first, String last, String ssn, int month, int day, int year, double Wage, double Pieces) {
        super(first, last, ssn, month, day, year);
        setWage(Wage);
        setPieces(Pieces);
    }

    public final void setWage(double Wage) {
        if (Wage < 0.0) {
            wage = 0.0;
        }
        else {
            wage = Wage;
        }
    }

    public double getWage() {
        return wage;
    }

    public final void setPieces(double Pieces) {
        pieces = Pieces;
    }

    public double getPieces() {
        return pieces;
    }

    public double earnings() {
        return getWage() * getPieces();
    }

    @Override
    public String toString() {
        return String.format("Piece Worker: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "wage per piece", getWage(),"pieces produced", getPieces());
    }
}
