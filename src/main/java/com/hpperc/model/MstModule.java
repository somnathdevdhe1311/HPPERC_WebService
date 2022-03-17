package com.hpperc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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

import lombok.Data;

@Entity
@Table(name = "mst_module")
@Data
public class MstModule {

	@Id
	@Column(name = "module_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long moduleId;
	
	@Column(name = "module_name")
	private String moduleName;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="moduleId")
	private List<MstSubModule> mstSubModuleList;
 
}
