package com.hpperc.model;

import javax.persistence.Embedded;
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
@Table(name = "tbl_finance")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Finance {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "finance_sequence")
	@SequenceGenerator(name = "finance_sequence", sequenceName = "finance_sequence", allocationSize = 1)
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "university_id", referencedColumnName = "id")
	private University university;
	
	private String title;
	
	private int year;
	
	private String description;
	
	private String documentName;
	
	private String documentPath;
	
	private String documentExt;
	
	private long documentSize;
	
	private boolean isActive;
	
	@Embedded
	private CommonFeilds common;
}
