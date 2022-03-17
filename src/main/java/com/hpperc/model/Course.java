package com.hpperc.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name = "tbl_course")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_sequence")
	@SequenceGenerator(name = "course_sequence", sequenceName = "course_sequence",  allocationSize = 1)
	private Long id;	

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "university_id", referencedColumnName = "id")
	private University university;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "course")
	private List<CourseAttachment> attachment;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy ="course") 
	private List<CourseUsers> courseusers;

	private String courseName;

	private int duration;

	private String academicSession;

	private String nomenclature;

	private String regulatingBody;

	private int startingYear;

	private int oldStartingYear;

	private String department;

	private int seatProposed;

	private String status;

	private boolean isArchive;

	private String rejectedComment;

	private Date createdOn;

	private Long createdBy;

	private Date updatedOn;

	private Long updatedBy;

	private Date inspectedOn;

	private Long inspectedBy;

	private Date approvedOn;

	private Long approvedBy;

	private Date rejectedOn;

	private Long rejectedBy;
	
	private Date assignOn;

	private Long assignBy;
}
