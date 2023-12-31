package com.korea.sbb.question;


import com.korea.sbb.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question,Integer> {
  Question findBySubject(String subject);
  Question findBySubjectAndContent(String subject,String content);
  List<Question> findBySubjectLike(String subject);

}
