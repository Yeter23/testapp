//package com.yeter.testapp.controller;
//
//import com.yeter.testapp.model.Question;
//import com.yeter.testapp.service.QuestionService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RestController
//@RequestMapping( path = "/question")
//public class QuestionController {
//    @Autowired
//    QuestionService questionService;
//
//    @GetMapping( path = "/allQuestion")
//
//public ResponseEntity< List<Question> >getAllQuestion(){
//
//        return  questionService.getAllQuestions();
//
//}
//@GetMapping( path = "/category/{category}")
//
//public ResponseEntity< List<Question> >getQuestionByCategory(String category){
//return questionService.getQuestionsByCategory(category);
//}
//@PostMapping(path = "/add")
//public ResponseEntity< String>addQuestion ( @RequestBody Question question){
// return questionService.addQuestion(question);
//}
//}
