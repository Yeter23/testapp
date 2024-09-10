//package com.yeter.testapp.service;
//
//import com.yeter.testapp.dao.QuestionDao;
//import com.yeter.testapp.dao.QuizDao;
//import com.yeter.testapp.model.Question;
//import com.yeter.testapp.model.QuestionWrapper;
//import com.yeter.testapp.model.Quiz;
//import com.yeter.testapp.model.Response;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//
//public class QuizService {
//    @Autowired
//    QuizDao quizDao;
//    @Autowired
//    QuestionDao questionDao;
//    public ResponseEntity<String> createQuiz(String category,int numQ,String title){
//        List<Question> questions= questionDao.findRandomQuestionsByCategory(category,numQ);
//        Quiz quiz= new Quiz();
//        quiz.setTitle(title);
//        quiz.setQuestion(questions);
//        quizDao.save(quiz);
//        return new ResponseEntity<>("success",HttpStatus.CREATED);
//    }
//    public ResponseEntity<List<QuestionWrapper>>getQuizQuestions(@PathVariable Integer id){
//       Optional<Quiz> quiz = quizDao.findById(id);
//       List<Question> questionsFromDB=quiz.get().getQuestions();
//       List<QuestionWrapper> questionsForUser=new ArrayList<>();
//       for(Question q: questionsFromDB){
//           QuestionWrapper qw =new QuestionWrapper(q.getId(),q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
//           questionsForUser.add(qw);
//
//       }
//       return new ResponseEntity<>(questionsForUser,HttpStatus.OK);
//    }
//    public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses){
//        Quiz quiz= quizDao.findById(id).get();
//        List<Question> questions= quiz.getQuestions();
//        int right=0;
//        int i=0;
//        for(Response response:responses){
//            if(response.getResponse().equals(questions.get(i).getRightAnswer()))
//                right++;
//            i++;
//        }
//        return new ResponseEntity<>(right,HttpStatus.OK);
//    }
//}
