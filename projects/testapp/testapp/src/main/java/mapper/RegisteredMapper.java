package mapper;

import com.yeter.testapp.dto.Request.Create.RegisteredCreateRequest;
import com.yeter.testapp.dto.Request.Filter.RegisteredfilterRequest;
import com.yeter.testapp.dto.Request.Update.RegisteredUpdateRequest;
import com.yeter.testapp.dto.Response.RegisteredResponse;
import com.yeter.testapp.entity.Registered;
import org.mapstruct.Mapper;

@Mapper
public interface RegisteredMapper {
    RegisteredResponse toResponse(Registered registered);
    Registered toEntity (RegisteredCreateRequest registered);
    Registered toEntity (RegisteredfilterRequest registered);
    Registered toEntity (RegisteredUpdateRequest registered);


}

