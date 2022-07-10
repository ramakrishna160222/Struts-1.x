package com.ds.ems.employee;

import org.apache.struts.action.ActionForm;

public class EmployeeReg extends ActionForm {
		private String name,email,address;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		
}
