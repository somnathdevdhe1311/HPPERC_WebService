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
@Table(name = "tbl_job_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobTypes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "job_type_sequence")
	@SequenceGenerator(name = "job_type_sequence",
						sequenceName = "job_type_sequence",
						allocationSize = 1)
	private Long id;
	
	private String jobType;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "placement_id", referencedColumnName = "id")
	private Placement placement; 
}
