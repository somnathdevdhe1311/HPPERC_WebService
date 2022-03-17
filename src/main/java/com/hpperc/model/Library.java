package com.hpperc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_library")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
					generator = "library_sequence")
	@SequenceGenerator(name = "library_sequence",
						sequenceName = "library_sequence",
						allocationSize = 1)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "university_id", referencedColumnName = "id")
	private University university;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "library")
	private List<LibrarySections> sections;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "library")
	private List<LibraryItInfrastructure> infrastructure;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "library")
	private List<LibraryStaff> staff;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "library")
	private List<LibraryAdvisoryCommitee> commitee;
	
	private String description;
	
	private String timing;
	
	private boolean isActive;
	
	@Embedded
	private CommonFeilds common;
}
