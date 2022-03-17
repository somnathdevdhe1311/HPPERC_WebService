package com.hpperc.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_library_infrastructure")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibraryItInfrastructure {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
					generator = "library_infrastructure_sequence")
	@SequenceGenerator(name = "library_infrastructure_sequence",
						sequenceName = "library_infrastructure_sequence",
						allocationSize = 1)
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "library_id", referencedColumnName = "id")
	private Library library;
	
	private String infrastructure;
}
