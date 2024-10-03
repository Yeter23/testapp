package mapper;

import com.yeter.testapp.dto.Request.Create.VariantCreateRequest;
import com.yeter.testapp.dto.Request.Filter.VariantFilterRequest;
import com.yeter.testapp.dto.Request.Update.VariantUpdateRequest;
import com.yeter.testapp.dto.Response.VariantResponse;
import com.yeter.testapp.entity.Variant;
import org.mapstruct.Mapper;

@Mapper
public interface VariantMapper {
    VariantResponse torResponse (Variant variants);
    Variant toEntity (VariantCreateRequest variant);
    Variant toEntity (VariantFilterRequest variant);
    Variant toEntity(VariantUpdateRequest variant);


}
