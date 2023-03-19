package demo.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class Subject {
	@Field(name="subject_name")
	private String subjectNmae;
	@Field(name="marks_obtained")
	private int marksObtained;
	public String getSubjectNmae() {
		return subjectNmae;
	}
	public void setSubjectNmae(String subjectNmae) {
		this.subjectNmae = subjectNmae;
	}
	public int getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}
	
	
}