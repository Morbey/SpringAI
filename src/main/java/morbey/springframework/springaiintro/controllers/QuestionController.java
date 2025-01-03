package morbey.springframework.springaiintro.controllers;

import morbey.springframework.springaiintro.model.Answer;
import morbey.springframework.springaiintro.model.GetCapitalRequest;
import morbey.springframework.springaiintro.model.GetCapitalResponse;
import morbey.springframework.springaiintro.model.Question;
import morbey.springframework.springaiintro.services.OpenAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private final OpenAIService openAiService;

    public QuestionController(OpenAIService openAiService) {
        this.openAiService = openAiService;
    }

    @GetMapping("/capitalWithInfo")
    public Answer getCapitalWithInfo(@RequestBody GetCapitalRequest getCapitalRequest) {
        return openAiService.getCapitalWithInfo(getCapitalRequest);
    }

    @GetMapping("/capital")
    public GetCapitalResponse getCapital(@RequestBody GetCapitalRequest getCapitalRequest) {
        return openAiService.getCapital(getCapitalRequest);
    }

    @GetMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAiService.getAnswer(question);
    }
}
