package com.hpperc.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_module_access")
public class UserModuleAccess {

	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
 
	@Column(name = "user_id")
	private Long userId; 
	
	@Column(name = "module_id")
	private Long moduleId;
	
	@Column(name = "sub_module_id")
	private Long subModuleId;
	
	@Column(name = "applicable_access")
	private String applicableAccess;
	
	@OneToOne
    @JoinColumn(name="module_id", referencedColumnName="module_id" ,insertable = false, updatable = false) 
	private MstModule mstModule;
	
	@OneToOne
    @JoinColumn(name="sub_module_id", referencedColumnName="sub_module_id" ,insertable = false, updatable = false) 
	private MstSubModule mstSubModule;
	
}
