package mapper;

import com.yeter.testapp.dto.Request.Create.ResultsCreateRequest;
import com.yeter.testapp.dto.Request.Filter.ResultsFilterRequest;
import com.yeter.testapp.dto.Request.Update.ResultsUpdateRequest;
import com.yeter.testapp.dto.Response.ResultsResponse;
import com.yeter.testapp.entity.Results;
import org.mapstruct.Mapper;

@Mapper
public interface ResultsMapper {
    ResultsResponse toResponse(Results results);
    Results toEntity(ResultsCreateRequest results);
    Results toEntity (ResultsUpdateRequest results);
    Results toEntity(ResultsFilterRequest results);

}
