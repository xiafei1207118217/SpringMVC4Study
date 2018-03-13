package com.xiafei.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "Student_info")
public class Student implements Serializable{
	
	@Column(name="id")
	public String id;
	
	@Column(name="name")
	public String name;
	
	@Column(name="age")
	public String age;
}
