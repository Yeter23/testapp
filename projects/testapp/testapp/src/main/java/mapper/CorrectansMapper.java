package mapper;

import com.yeter.testapp.dto.Request.Create.CorrectansCreateRequest;

import com.yeter.testapp.dto.Request.Filter.CorrectansFilterRequest;

import com.yeter.testapp.dto.Request.Update.CorrectansUpdateRequest;

import com.yeter.testapp.dto.Response.CorrectansResponse;

import com.yeter.testapp.entity.Correctans;

import org.mapstruct.Mapper;

@Mapper
public interface CorrectansMapper {
    CorrectansResponse toResponse(Correctans correctans);
  Correctans toEntity(CorrectansFilterRequest correctans);
   Correctans toEntity(CorrectansUpdateRequest correctans);
   Correctans toEntity(CorrectansCreateRequest correctans);
}
