package morbey.springframework.springaiintro.services;

import morbey.springframework.springaiintro.model.Answer;
import morbey.springframework.springaiintro.model.GetCapitalRequest;
import morbey.springframework.springaiintro.model.GetCapitalResponse;
import morbey.springframework.springaiintro.model.Question;

public interface OpenAIService {

    GetCapitalResponse getCapital(GetCapitalRequest country);

    String getAnswer(String question);

    Answer getAnswer(Question question);

    Answer getCapitalWithInfo(GetCapitalRequest getCapitalRequest);
}
