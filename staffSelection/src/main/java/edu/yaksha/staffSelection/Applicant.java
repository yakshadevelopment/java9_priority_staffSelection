package edu.yaksha.staffSelection;

public class Applicant implements Comparable<Applicant> {
	private String name;
	private Integer subject1;
	private Integer subject2;
	private Integer subject3;
	private Integer total;
	private Integer percentage;
	public Applicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Applicant(String name, Integer subject1, Integer subject2, Integer subject3, Integer total,
			Integer percentage) {
		super();
		this.name = name;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.total = total;
		this.percentage = percentage;
	}
	
	public Applicant(String name, Integer subject1, Integer subject2, Integer subject3) {
		super();
		this.name = name;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSubject1() {
		return subject1;
	}
	public void setSubject1(Integer subject1) {
		this.subject1 = subject1;
	}
	public Integer getSubject2() {
		return subject2;
	}
	public void setSubject2(Integer subject2) {
		this.subject2 = subject2;
	}
	public Integer getSubject3() {
		return subject3;
	}
	public void setSubject3(Integer subject3) {
		this.subject3 = subject3;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getPercentage() {
		return percentage;
	}
	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		String stg=String.format("%-15s %-5s %-5s %-5s %-10s %-10s",name,subject1,subject2,subject3,total,percentage);
		return stg;
	}
	public int compareTo(Applicant app)
	{
		return this.name.compareTo(app.name);
	}
	
}
