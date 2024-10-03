package mapper;


import com.yeter.testapp.dto.Request.Create.QuestionCreateRequest;
import com.yeter.testapp.dto.Request.Filter.QuestionFilterRequest;
import com.yeter.testapp.dto.Request.Update.QuestionUpdateRequest;
import com.yeter.testapp.dto.Response.QuestionResponse;
import com.yeter.testapp.entity.Question;
import org.mapstruct.Mapper;

@Mapper
public interface QuestionMapper {
    QuestionResponse toResponse(Question question);
    Question toEntity (QuestionFilterRequest question);
    Question toEntity (QuestionCreateRequest question);
    Question  toEntity (QuestionUpdateRequest question);

}
