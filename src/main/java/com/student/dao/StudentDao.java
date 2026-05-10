package com.student.dao;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="studentTable")
public class StudentDao {
	
	@Id
	private int sid;
	private String sname;
	private String standard;
	private int smarks;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "StudentRepository [sid=" + sid + ", sname=" + sname + ", standard=" + standard + ", smarks=" + smarks
				+ "]";
	}
	public StudentDao(int sid, String sname, String standard, int smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.standard = standard;
		this.smarks = smarks;
	}
	public StudentDao() {
		super();
	}
	

}
