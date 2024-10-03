package mapper;

import com.yeter.testapp.dto.Request.Create.ExamCreateRequest;
import com.yeter.testapp.dto.Request.Filter.ExamFilterRequest;
import com.yeter.testapp.dto.Request.Update.ExamUpdateRequest;
import com.yeter.testapp.dto.Response.ExamResponse;
import com.yeter.testapp.entity.Exam;
import org.mapstruct.Mapper;

@Mapper
public interface ExamMapper {
    ExamResponse toResponse(Exam exam);
    Exam toEntity (ExamCreateRequest exam);
    Exam toEntity (ExamFilterRequest exam);
    Exam toEntity (ExamUpdateRequest exam);
}
