package pojo;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @Column(name="creditCardNumber")
    long creditCardNumber;

    @Column(name = "bankName")
    String bankName;

    @Column(name = "fullName")
    String fullName;

    @Column(name = "exp_month")
    String expiration_month;

    @Column(name = "exp_year")
    String expiration_year;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "creditCardNumber")
    Passenger passenger;

    public Payment() {
    }

    public Payment(long creditCardNumber, String bankName, String fullName, String expiration_month, String expiration_year, Passenger passenger) {
        this.creditCardNumber = creditCardNumber;
        this.bankName = bankName;
        this.fullName = fullName;
        this.expiration_month = expiration_month;
        this.expiration_year = expiration_year;
        this.passenger = passenger;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getExpiration_month() {
        return expiration_month;
    }

    public void setExpiration_month(String expiration_month) {
        this.expiration_month = expiration_month;
    }

    public String getExpiration_year() {
        return expiration_year;
    }

    public void setExpiration_year(String expiration_year) {
        this.expiration_year = expiration_year;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
