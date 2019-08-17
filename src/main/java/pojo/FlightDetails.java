package pojo;

import javax.persistence.*;

@Entity
@Table(name = "flightDetails")
public class FlightDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    long flight_id;

    @Column(name = "flight_name")
    String flight_name;

    @Column(name = "airplane_id")
    long airplane_id;

    @Column(name = "fromPlace")
    String from;

    @Column(name = "dest")
    String dest;

    @Column(name = "arrivalTime")
    String arrivalTime;

    @Column(name = "travelClass")
    private String travelClass;

    @Column(name = "totalSeats")
    int totalSeats;

    @Column(name = "availableSeats")
    int availableSeats;

    @Column(name = "amount")
    int amount;

    @Column(name="deptDate")
    String deptDate;

    @Column(name="arrDate")
    String arrDate;

    public FlightDetails() {
    }


    public FlightDetails(long flight_id, String flight_name, long airplane_id, String from, String dest, String arrivalTime, String travelClass, int totalSeats, int availableSeats, int amount, String deptDate, String arrDate) {
        this.flight_id = flight_id;
        this.flight_name = flight_name;
        this.airplane_id = airplane_id;
        this.from = from;
        this.dest = dest;
        this.arrivalTime = arrivalTime;
        this.travelClass = travelClass;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
        this.amount = amount;
        this.deptDate = deptDate;
        this.arrDate = arrDate;
    }

    public long getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(long flight_id) {
        this.flight_id = flight_id;
    }

    public String getFlight_name() {
        return flight_name;
    }

    public void setFlight_name(String flight_name) {
        this.flight_name = flight_name;
    }

    public long getAirplane_id() {
        return airplane_id;
    }

    public void setAirplane_id(long airplane_id) {
        this.airplane_id = airplane_id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDeptDate() {
        return deptDate;
    }

    public void setDeptDate(String deptDate) {
        this.deptDate = deptDate;
    }

    public String getArrDate() {
        return arrDate;
    }

    public void setArrDate(String arrDate) {
        this.arrDate = arrDate;
    }


}
