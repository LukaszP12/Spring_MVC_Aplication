package pojo;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue
    @Column(name = "ticket_id", unique = true, nullable = false)
    long ticket_id;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "passenger_id")
    Passenger passengerDetails;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "flight_id")
    FlightDetails flightDetails;

    public Ticket() {
    }

    public Ticket(long ticket_id, Passenger passengerDetails, FlightDetails flightDetails) {
        this.ticket_id = ticket_id;
        this.passengerDetails = passengerDetails;
        this.flightDetails = flightDetails;
    }

    public long getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(long ticket_id) {
        this.ticket_id = ticket_id;
    }

    public Passenger getPassengerDetails() {
        return passengerDetails;
    }

    public void setPassengerDetails(Passenger passengerDetails) {
        this.passengerDetails = passengerDetails;
    }

    public FlightDetails getFlightDetails() {
        return flightDetails;
    }

    public void setFlightDetails(FlightDetails flightDetails) {
        this.flightDetails = flightDetails;
    }
}
