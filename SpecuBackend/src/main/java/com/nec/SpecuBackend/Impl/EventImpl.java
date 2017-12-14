package com.nec.SpecuBackend.Impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nec.SpecuBackend.Dao.EventDao;
import com.nec.SpecuBackend.Model.Event;

@Repository("eventDAO")
public class EventImpl implements EventDao{
	
	@Autowired
	SessionFactory sessionFactory;

	public EventImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdateEvent(Event event) {
		sessionFactory.getCurrentSession().saveOrUpdate(event);

	}

	@Transactional
	public void deleteEvent(int eid) {
		Event eventToDelete = new Event();
		eventToDelete.setEid(eid);
		sessionFactory.getCurrentSession().delete(eventToDelete);
	}

	@Transactional
	public Event getEvent(int eid) {
		String hql = "from Event where eid=:eid";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("eid", eid);
		List<Event> gotEvent = query.getResultList();
		if (gotEvent != null && !gotEvent.isEmpty())
			return gotEvent.get(0);
		return null;
	}

	@Transactional
	public List<Event> listEvents() {
		String hql = "from Event";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Event> listOfEvents = query.getResultList();
		return listOfEvents;
	}
	
	@Transactional
	public List<Event> listEventByEventAt(){
	
		String hql = "from Event e where eventAt >=:eventDate ORDER BY e.eventAt ASC";
		Query query = sessionFactory.getCurrentSession().createQuery(hql).setParameter("eventDate",new Date());
		List<Event> listOfEvents = query.getResultList();
		return listOfEvents;
	}

	

}
