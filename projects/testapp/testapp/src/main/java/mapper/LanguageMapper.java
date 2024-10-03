package mapper;

import com.yeter.testapp.dto.Request.Create.LanguageCreateRequest;
import com.yeter.testapp.dto.Request.Filter.LanguageFilterRequest;
import com.yeter.testapp.dto.Request.Update.LanguageUpdateRequest;
import com.yeter.testapp.dto.Response.LanguageResponse;
import com.yeter.testapp.entity.Language;
import org.mapstruct.Mapper;

@Mapper
public interface LanguageMapper {
    LanguageResponse toResponse (Language language);
    Language toEntity (LanguageFilterRequest language);
    Language toEntity(LanguageCreateRequest language);
    Language toEntity(LanguageUpdateRequest language);

}
