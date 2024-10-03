package mapper;

import com.yeter.testapp.dto.Request.Create.LevelCreateRequest;
import com.yeter.testapp.dto.Request.Filter.LevelFilterRequest;
import com.yeter.testapp.dto.Request.Update.LevelUpdateRequest;
import com.yeter.testapp.dto.Response.LevelResponse;
import com.yeter.testapp.entity.Level;
import org.mapstruct.Mapper;

@Mapper
public interface LevelMapper {
    LevelResponse toResponse(Level level);
    Level toEntity (LevelFilterRequest level);
    Level toEntity (LevelUpdateRequest level);
    Level toEntity (LevelCreateRequest level);
}
