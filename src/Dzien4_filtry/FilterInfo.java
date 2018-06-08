package Dzien4_filtry;

import java.sql.Date;

public class FilterInfo {

	private Long id;
	private String browserInfo;
	private Date dateTime;
	private String parameters;
	private Long executionTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public Long getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(Long executionTime) {
		this.executionTime = executionTime;
	}

	public String getBrowserInfo() {
		return browserInfo;
	}

	public void setBrowserInfo(String browserInfo) {
		this.browserInfo = browserInfo;
	}

}