package com.hpperc.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

@Entity
@Table(name = "users")
public class User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int getPasswordResetCount() {
		return passwordResetCount;
	}

	public void setPasswordResetCount(int passwordResetCount) {
		this.passwordResetCount = passwordResetCount;
	}

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	

	private String username;
	private String password;
	private boolean enabled;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="user")
	private List<CourseUsers> courseusers;
	
	@Column(name = "first_name")
	private String firstName="";
	
	@Column(name = "middle_name")
	private String middleName="";
	
	@Column(name = "last_name")
	private String lastName="";
	
	@Column(name = "mobile_no")
	private String mobileNo;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "address")
	private String address;
	 
 
	
	@Column(name = "password_reset_count", nullable = false, columnDefinition = "int default 0") 
	private int passwordResetCount=0;
	
	@Column(name = "is_archive")
	private String isArchive="N";
	 
	

	@Column(name = "reset_password_token",columnDefinition = "TEXT")
    private String resetPasswordToken;
	
	

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")
			)
	private Set<Role> roles = new HashSet<>(); 

	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinTable(
				name = "user_university",
				joinColumns = @JoinColumn(name = "user_id"),
				inverseJoinColumns = @JoinColumn(name = "university_id")
			)
	@Where(clause = "status = 'V'")
	private University university; 
	
	
	@Column(name = "profile_photo_path")
	private String profilePhotoPath;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}	
	
	public String getAddress() {
		return address;
	}

	public String getResetPasswordToken() {
		return resetPasswordToken;
	}

	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProfilePhotoPath() {
		return profilePhotoPath;
	}

	public void setProfilePhotoPath(String profilePhotoPath) {
		this.profilePhotoPath = profilePhotoPath;
	}

	public String getIsArchive() {
		return isArchive;
	}

	public void setIsArchive(String isArchive) {
		this.isArchive = isArchive;
	}
	
	public List<CourseUsers> getCourseusers() {
		return courseusers;
	}

	public void setCourseusers(List<CourseUsers> courseusers) {
		this.courseusers = courseusers;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}
	
}