package com.ds.ems.admin;

import org.apache.struts.action.Action;

public class AdminUSERUpdate extends Action {
	private String ouname;
	private String nuname;
	private String opwd;
	private String npwd;
	public String getOuname() {
		return ouname;
	}
	public void setOuname(String ouname) {
		this.ouname = ouname;
	}
	public String getNuname() {
		return nuname;
	}
	public void setNuname(String nuname) {
		this.nuname = nuname;
	}
	public String getOpwd() {
		return opwd;
	}
	public void setOpwd(String opwd) {
		this.opwd = opwd;
	}
	public String getNpwd() {
		return npwd;
	}
	public void setNpwd(String npwd) {
		this.npwd = npwd;
	}
}
