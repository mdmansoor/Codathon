package com.flopper.framework.customer;

import com.opensymphony.xwork2.ActionSupport;

public class appointmentbookingbean extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String appointmentDate;
	private String hour;
	private String minute;
	private String emailID;

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getMinute() {
		return minute;
	}

	public void setMinute(String minute) {
		this.minute = minute;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getEmailID() {
		return emailID;
	}

	@Override
	public void validate() {
		validateAppointmentDate();
		validateHour();
		validateMinute();
		validateEmailID();
	}

	public void validateAppointmentDate() {
		if (appointmentDate.equals("")) {
			this.addFieldError("appointmentDate",
					"AppointmentDate cannot be blank");

		}
		return;
	}

	public void validateHour() {
		if (hour.equals("")) {
			this.addFieldError("hour", "Hour cannot be blank");

		}
		return;
	}

	public void validateMinute() {
		this.addFieldError("minute", "Minute cannot be blank");
		if (minute.equals("")) {
			this.addFieldError("minute", "Minute cannot be blank");

		}
		return;
	}

	public void validateEmailID() {
		if (emailID.equals("")) {
			this.addFieldError("emailID", "Email ID cannot be blank");
			return;
		}
		if (!isValidEmail(emailID)) {
			this.addFieldError("emailID", "Please enter valid Email Id ");
		}

		return;
	}

	public final boolean isValidEmail(String value) {
		String regex = "^([a-zA-Z0-9_\\.\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\+\\=\\{\\[\\}\\]\\;\\:\\?\\/\\,\\<\\>\\~\\*])+\\@(([a-zA-Z0-9_\\.\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\+\\=\\{\\[\\}\\]\\;\\:\\?\\/\\,\\<\\>\\~\\*])+\\.)+([a-zA-Z0-9_\\.\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\+\\=\\{\\[\\}\\]\\;\\:\\?\\/\\,\\<\\>\\~\\*]{2,4})+$";
		if (value.length() > 60)
			return false;
		else if (value.matches(regex))
			return true;
		return false;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(appointmentDate + " " + hour + " " + minute);

		if (appointmentDate.equals("mans"))
			return SUCCESS;
		else
			return ERROR;
	}
}
