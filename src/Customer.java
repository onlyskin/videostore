import java.util.ArrayList;
import java.util.List;

public class Customer {
    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }
    
    public void addRental(Rental rental) {
        rentals.add(rental);
    }
    
    public String getName() {
        return name;
    }

    public Rental[] getRentals() {
        return rentals.toArray(new Rental[rentals.size()]);
    }

    public String getStatement() {
        StatementMaker statementMaker = new StatementMaker();
        return statementMaker.makeStatement(this);
    }

    private String name;
    private List<Rental> rentals;
}
