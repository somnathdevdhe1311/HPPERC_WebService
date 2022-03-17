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
@Table(name = "tbl_placement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Placement {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "placement_sequence")
	@SequenceGenerator(name = "placement_sequence",
						sequenceName = "placement_sequence",
						allocationSize = 1)
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "university_id", referencedColumnName = "id")
	private University university;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "placement")	
	private List<JobTypes> jobType;
	
	private int academicYear;
	
	private int noOfOrg;
	
	private int noOfStudPlaced;
	
	private float highestPackage;
	
	private float lowestPackage;
	
	private float avgPackage;
	
	private boolean isActive;
	
	@Embedded
	private CommonFeilds common;


}
