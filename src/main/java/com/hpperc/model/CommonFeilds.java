package com.hpperc.model;

import java.util.Date;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommonFeilds {

	private Long createdBy;

	private Date createdOn;

	private Long updatedBy;

	private Date updatedOn;
}
