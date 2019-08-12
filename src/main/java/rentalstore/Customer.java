package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = getHeader();
        double thisAmount = getTotalAmount();
        for (Rental each : this.rentals) {
            frequentRenterPoints = getFrequentRenterPoints(frequentRenterPoints, each);
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        result = getFooter(totalAmount, frequentRenterPoints, result);
        return result;
    }

    private String getFooter(double totalAmount, int frequentRenterPoints, String result) {
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    private String getHeader() {
        return "Rental Record for " + getName() + "\n";
    }

    public int getFrequentRenterPoints(int frequentRenterPoints, Rental each) {
        frequentRenterPoints++;
        //add bonus for a two day new release rental
        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    public double getTotalAmount() {
        double thisAmount = 0;
        for (Rental each : this.rentals) {
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDayRented() > 2) {
                        thisAmount += (each.getDayRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDayRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDayRented() > 3) {
                        thisAmount += (each.getDayRented() - 3) * 1.5;
                    }
                    break;
            }
        }
        return thisAmount;
    }
}
