package com.br.reclameaqui.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Samuel Catalano
 */

@Entity
@Table(name = "company")
public class Company implements Serializable {
	
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
}