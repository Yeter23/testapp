//package com.yeter.testapp.dao;
//
//import com.yeter.testapp.model.Question;
//import com.yeter.testapp.model.Quiz;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//
//public interface QuizDao extends JpaRepository<Quiz,Integer> {
//    List<Question>findByCategory(String category);
//    @Query(value="SELECT * FROM question q Where q.category=:category ORDER BY RANDOM() LIMIT:numQ",nativeQuery = true)
//    List<Question> findRandomQuestionsByCategory(String category,int numQ);
//
//}
