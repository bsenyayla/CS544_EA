package Domain;

public class AccountEntry {
    private String date;
    private Double amount;
    private String description;
    private String fromAccountNumber;
    private String fromPersonName;

    public AccountEntry() {
    }

    public AccountEntry(String date, Double amount, String description, String fromAccountNumber, String fromPersonName) {
        this.date = date;
        this.amount = amount;
        this.description = description;
        this.fromAccountNumber = fromAccountNumber;
        this.fromPersonName = fromPersonName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    public String getFromPersonName() {
        return fromPersonName;
    }

    public void setFromPersonName(String fromPersonName) {
        this.fromPersonName = fromPersonName;
    }

    @Override
    public String toString() {
        return "AccountEntry{" +
                "date='" + date + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", fromAccountNumber='" + fromAccountNumber + '\'' +
                ", fromPersonName='" + fromPersonName + '\'' +
                '}';
    }
}
