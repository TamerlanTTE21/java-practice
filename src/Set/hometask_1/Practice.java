package Set.hometask_1;

import java.util.HashSet;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        Set<Ticket> tickets = new HashSet<>();
        fillTickets(tickets);
        TicketPriceInUsdComparator priceInUsdComparator = new TicketPriceInUsdComparator();

        System.out.println("Доступные билеты: ");
        for (Ticket ticket : tickets) {
            tickets.stream().sorted(priceInUsdComparator);
            System.out.println("  * " + ticket);
        }
    }

    private static void fillTickets(Set<Ticket> tickets) {
        tickets.add(new Ticket("Лондон", "Париж", 376));
        tickets.add(new Ticket("Милан", "Стамбул", 298));
        tickets.add(new Ticket("Берлин", "Бостон", 1273));
        tickets.add(new Ticket("Пекин", "Рим", 846));
        tickets.add(new Ticket("Санкт-Петербург", "Афины", 284));
        tickets.add(new Ticket("Сидней", "Токио", 1738));
        tickets.add(new Ticket("Мюнхен", "Дубай", 974));
    }
}
