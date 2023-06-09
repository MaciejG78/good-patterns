package com.example.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User user, LocalDateTime orderDate, String product, Double quantity);

}
