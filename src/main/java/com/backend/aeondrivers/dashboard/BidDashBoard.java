package com.backend.aeondrivers.dashboard;

import com.backend.aeondrivers.person.bid.Bid;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

/**
 * @author tsypk on 27.11.2021 12:20
 * @project AeonDrivers
 */
@NoArgsConstructor
@Getter
@Setter
public class BidDashBoard {
    private static ArrayList<Bid> bids;


    public static void addBid(Bid bid) {
        bids.add(bid);
    }
}
