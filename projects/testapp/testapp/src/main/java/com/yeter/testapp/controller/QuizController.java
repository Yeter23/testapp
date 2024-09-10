//package com.yeter.testapp.controller;
//
//import com.yeter.testapp.model.Question;
//import com.yeter.testapp.model.QuestionWrapper;
//import com.yeter.testapp.model.Quiz;
//import com.yeter.testapp.model.Response;
//import com.yeter.testapp.service.QuizService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "/quiz")
//
//public class QuizController {
//    QuizService quizService;
//    @PostMapping(path = "/create")
//    public ResponseEntity<String>createQuiz(@RequestParam String category,@RequestParam int numQ,@RequestParam String title){
//        return quizService.createQuiz(category,numQ,title);
//    }
//    @GetMapping( path = "/get/{id}")
//    public ResponseEntity<List<QuestionWrapper>>getQuizQuestions(@PathVariable Integer id){
//    return   quizService.getQuizQuestions(id);
//    }
//@PostMapping(path = "/submit/{id}")
//    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id,@RequestBody List<Response> responses){
//        return quizService.calculateResult(id,responses);
//
//
//}
//
//}
