package com.hpperc.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_meeting")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Meeting {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
					generator = "meeting_sequence")
	@SequenceGenerator(name = "meeting_sequence",
						sequenceName = "meeting_sequence",
						allocationSize = 1)	
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "university_id", referencedColumnName = "id")
	private University university;
	
	private Date date;
	
	private String time;
	
	private String title;
	
	private String agenda;
	
	private String documentName;
	
	private String documentPath;
	
	private long documentSize;	
	
	private String documentExtension;
	
	private Boolean isActive;
	
	@Embedded
	private CommonFeilds common;
	
	@Transient
	private String dateInStr;
	
}
