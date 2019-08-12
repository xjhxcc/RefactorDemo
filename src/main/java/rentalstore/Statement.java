package rentalstore;

public abstract class Statement {
    public abstract String getHeader(Customer customer);
    public abstract String getBody(Customer customer);
    public abstract String getFooter(Customer customer);
}
