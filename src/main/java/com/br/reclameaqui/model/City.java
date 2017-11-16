package com.br.reclameaqui.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Samuel Catalano
 */

@Entity
@Table(name = "city")
public class City implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@Getter
	@Setter
	private Long id;
	
	@Column(name = "name", nullable = false, length = Integer.MAX_VALUE)
	@Getter
	@Setter
	private String name;
	
	@Column(name = "state", nullable = false, length = Integer.MAX_VALUE)
	@Getter
	@Setter
	private String state;
}