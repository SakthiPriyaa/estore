package com.nec.SpecuBackend.Dao;

import java.util.List;

import com.nec.SpecuBackend.Model.Event;

public interface EventDao {
	
void saveOrUpdateEvent(Event event);
	
	void deleteEvent(int eid);
	
	Event getEvent(int eid);
	
	List<Event> listEvents();
	
	List<Event> listEventByEventAt();

}
