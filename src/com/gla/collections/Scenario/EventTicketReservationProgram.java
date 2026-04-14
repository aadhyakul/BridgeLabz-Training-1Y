package com.gla.collections.Scenario;
import java.util.*;

class BookingItem implements Comparable<BookingItem>{
    String user; boolean vip;

    BookingItem(String u,boolean v){ user=u; vip=v; }

    public int compareTo(BookingItem o){
        return Boolean.compare(o.vip,this.vip);
    }
}

public class EventTicketReservationProgram {
    public static void main(String[] args) {

        PriorityQueue<BookingItem> pq = new PriorityQueue<>();
        pq.add(new BookingItem("U1",true));
        pq.add(new BookingItem("U2",false));

        while(!pq.isEmpty()){
            System.out.println(pq.poll().user);
        }
    }
}