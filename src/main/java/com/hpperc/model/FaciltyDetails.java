package com.hpperc.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "facilty_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FaciltyDetails {

	@Id
	@Column(name = "facility_detail_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long facilityDetailId;
	
	@Column(name = "uni_facility_id")
	private Long uniFacilityId;
  
	@Column(name = "facility_description")
	String facilityDescription;
	
	
}
