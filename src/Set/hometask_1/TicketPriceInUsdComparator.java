package Set.hometask_1;

import java.util.Comparator;

public class TicketPriceInUsdComparator implements Comparator<Ticket> {
    @Override
    public int compare (Ticket o1 , Ticket o2) {
        return o1.priceInUsd - o2.priceInUsd;
    }
}
