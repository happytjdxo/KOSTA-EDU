package org.education.kosta.vo;

public class Company {
	private String companyName;
	private String grade;

	public Company(String companyName, String grade) {
		this.companyName = companyName;
		this.grade = grade;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", grade=" + grade + "]";
	}
}