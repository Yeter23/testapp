package mapper;

import com.yeter.testapp.dto.Request.Create.StudentsCreateRequest;
import com.yeter.testapp.dto.Request.Filter.StudentFilterRequest;
import com.yeter.testapp.dto.Request.Update.StudentUpdateRequest;
import com.yeter.testapp.dto.Response.StudentsResponse;
import com.yeter.testapp.entity.Students;
import org.mapstruct.Mapper;

@Mapper
public interface StudentsMapper {
    StudentsResponse toResponse(Students students);
    Students toEntity(StudentFilterRequest student);
    Students toEntity(StudentUpdateRequest student);
    Students toEntity(StudentsCreateRequest student);

}

