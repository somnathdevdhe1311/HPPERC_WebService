package com.hpperc.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "mst_sub_module")
@Data
public class MstSubModule {

	@Id
	@Column(name = "sub_module_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long subModuleId;
	
	@Column(name = "sub_module_name")
	private String moduleName;
	
	@Column(name = "module_id")
	private Long moduleId;
	 
	@Column(name = "access_applicable")
	private String accessApplicable;
}
