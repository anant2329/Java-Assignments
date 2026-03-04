package projectmain.Ticket;

public interface Ticket {
    float price = 4.50f;

    void setTicketDetails(int ticketno, String date, float distance, int qtys);
    float calculateTicketPrice();
}
