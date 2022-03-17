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
@Table(name = "tbl_course_users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseUsers {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_user_sequence")
	@SequenceGenerator(name = "course_user_sequence", sequenceName = "course_user_sequence",  allocationSize = 1)
	private Long id;
	
	private String isPrimary;
	
	@ManyToOne
	@JoinColumn(name = "course_id", referencedColumnName = "id")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user; 
}
