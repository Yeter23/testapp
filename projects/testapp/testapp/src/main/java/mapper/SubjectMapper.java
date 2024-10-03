package mapper;

import com.yeter.testapp.dto.Request.Create.SubjectCreateRequest;
import com.yeter.testapp.dto.Request.Filter.SubjectFilterRequest;
import com.yeter.testapp.dto.Request.Update.SubjectUpdateRequest;
import com.yeter.testapp.dto.Response.SubjectResponse;
import com.yeter.testapp.entity.Subject;
import org.mapstruct.Mapper;

@Mapper
public interface SubjectMapper {
    SubjectResponse toResponse(Subject subject);
    Subject toEntity (SubjectFilterRequest subject);
    Subject toEntity (SubjectUpdateRequest subject);
    Subject toEntity(SubjectCreateRequest subject);

}
