package fr.uvsq.spring.project.entity;

public class QuestionJava implements Questions {

	@Override
	public String popQuestion() {
		return "Quel est le prénom de l'auteur de Java ? Ryan ou James ?";
	}

}
