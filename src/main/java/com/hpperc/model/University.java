package com.hpperc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "tbl_university")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "university_sequence")
	@SequenceGenerator(allocationSize = 1, name = "university_sequence")
	private Long id;
	
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "university")	
	private List<Course> courses;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "university")	
	private List<Meeting> meeting;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "university")	
	private List<Placement> placement;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "university")
	private List<Library> library;
}
