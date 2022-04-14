package id206214280_id316650399;

import java.util.Objects;

public class OpenQuestions extends Questions {

	private String answerText;
	
	public OpenQuestions(String questionText,String answerText) {
		super(questionText);
		this.answerText=answerText;
	}
	
	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(answerText);
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof OpenQuestions) ){
			return false;
		}
		if(!(super.equals(other))) {
			return false;
		}

		return  true;

	}
	
	@Override
	public String toString() {
		return super.toString()+"and the answer is: "+answerText+"\n\n";
	}


	
	

	
	
	
	
}
