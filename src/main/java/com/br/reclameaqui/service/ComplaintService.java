package com.br.reclameaqui.service;

import com.br.reclameaqui.model.Complaint;
import com.br.reclameaqui.repository.ComplaintRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Samuel Catalano
 */

@Service
@Slf4j
@RequiredArgsConstructor
public class ComplaintService{
	
	private final ComplaintRepository repository;
	
	/**
	 * Save new Complaint.
	 * @param complaint the complaint
	 * @return {@link Complaint}
	 */
	public Complaint save(final Complaint complaint) {
		return this.repository.save(complaint);
	}
	
	/**
	 * Find by title.
	 * @param title the title
	 * @return List of {@link Complaint}
	 */
	public List<Complaint> findByTitle(final String title) {
		return this.repository.findByTitle(title);
	}
	
	/**
	 * Find by description.
	 * @param description the description
	 * @return List of {@link Complaint}
	 */
	public List<Complaint> findByDescription(final String description) {
		return this.repository.findByDescription(description);
	}
	
	/**
	 * Find by city.
	 * @param city the city
	 * @return List of {@link Complaint}
	 */
	public List<Complaint> findByCity(final String city) {
		return this.repository.findByCity(city);
	}
	
	/**
	 * Find by state.
	 * @param state the state
	 * @return List of {@link Complaint}
	 */
	public List<Complaint> findByState(final String state) {
		return this.repository.findByState(state);
	}
	
	/**
	 * Find all complaints.
	 * @return all complaints
	 */
	public List<Complaint> findAll() {
		return (List<Complaint>) this.repository.findAll();
	}
}