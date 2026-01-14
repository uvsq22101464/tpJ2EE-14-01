package fr.uvsq.spring.project.service;

import fr.uvsq.spring.project.entity.Questions;

public class FournisseurDeQuestions implements Fournisseur {

	private Questions lesQuestions;

	public Questions getLesQuestions() {
		return lesQuestions;
	}

	public void setLesQuestions(Questions lesQuestions) {
		this.lesQuestions = lesQuestions;
	}
	
	public void genereQuestionnaire() {
		String question = lesQuestions.popQuestion();
		System.out.print(question + "\n");
		
	}
	
}
