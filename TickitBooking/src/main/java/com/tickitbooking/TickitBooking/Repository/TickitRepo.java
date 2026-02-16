package com.tickitbooking.TickitBooking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.tickitbooking.TickitBooking.Entity.Tickit;

public interface TickitRepo extends JpaRepository<Tickit, Integer> {

}
