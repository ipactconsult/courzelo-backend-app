package com.courzelo.courzelo_core.CourzeloCore.iserviceRest;

import com.courzelo.courzelo_core.CourzeloCore.dto.QuizDTO;

import java.util.List;

public interface IServiceRestQuiz {
    public QuizDTO addquiz(QuizDTO quiz);
    public QuizDTO updatequiz(String id, QuizDTO quizdto);
    public List<QuizDTO> getallquiz();
    public void delete(String id);
}
