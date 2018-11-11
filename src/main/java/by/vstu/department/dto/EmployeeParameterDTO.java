package by.vstu.department.dto;

import by.vstu.department.model.enums.AnketaParameterStatusType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class EmployeeParameterDTO {

    @NotNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Long parameterId;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private ParameterDTO parameter;

    private AnketaParameterStatusType status = AnketaParameterStatusType.NOT_FILLED;

    @NotNull
    private Long count;

    private LocalDateTime created;
}
