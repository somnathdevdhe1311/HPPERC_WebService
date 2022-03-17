package com.hpperc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "university_facilities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UniversityFacilities {

	@Id
	@Column(name = "uni_facility_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uniFacilityId;

	@Column(name = "university_id", insertable=false, updatable=false)
	Long universityId;
	
	
	@Column(name = "facility_id", insertable=false, updatable=false)
	Long facilityId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="university_id" )
	private University university;
	
	@OneToOne(cascade=CascadeType.ALL )
	@JoinColumn(name="facility_id" )
	private Facility facility;
	
	@OneToMany
	@JoinColumn(name ="uni_facility_id", referencedColumnName ="uni_facility_id" )
	private List<FaciltyDetails> faciltyDetails; 
	  
}
