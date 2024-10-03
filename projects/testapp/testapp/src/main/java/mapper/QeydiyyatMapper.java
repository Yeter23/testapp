package mapper;

import com.yeter.testapp.dto.Request.Create.QeydiyyatCreateRequest;
import com.yeter.testapp.dto.Request.Filter.QeydiyyatFilterRequest;
import com.yeter.testapp.dto.Request.Update.QeydiyyatUpdateRequest;
import com.yeter.testapp.dto.Response.QeydiyyatResponse;
import com.yeter.testapp.entity.Qeydiyyat;
import org.mapstruct.Mapper;

@Mapper
public interface QeydiyyatMapper {
    QeydiyyatResponse toResponse(Qeydiyyat qeydiyyat);
    Qeydiyyat toEntity (QeydiyyatUpdateRequest qeydiyyat);
    Qeydiyyat toEntity(QeydiyyatCreateRequest qeydiyyat);
    Qeydiyyat toEntity(QeydiyyatFilterRequest qeydiyyat);

}
