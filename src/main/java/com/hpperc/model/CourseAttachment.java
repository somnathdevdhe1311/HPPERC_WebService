package com.hpperc.model;

import javax.persistence.Entity;
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
@Table(name = "tbl_course_attachment")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseAttachment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_attachment_sequence")
	@SequenceGenerator(name = "course_attachment_sequence", sequenceName = "course_attachment_sequence", allocationSize = 1)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "course_id", referencedColumnName = "id")
	private Course course;
	
	private String type;
	
	private String name;
	
	private String path;
	
	private String extension;
	
	private long size;
	
}
