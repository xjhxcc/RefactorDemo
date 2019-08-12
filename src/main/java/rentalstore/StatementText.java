package rentalstore;

public class StatementText extends Statement{
    @Override
    public String getHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    public String getBody(Customer customer) {
        return null;
    }

    @Override
    public String getFooter(Customer customer) {
        String result= "Amount owed is " + customer.getTotalAmount() + "\n";
//        result += "You earned " + (customer.getFrequentRenterPoints()) + " frequent renter points";
        return null;
    }
}
