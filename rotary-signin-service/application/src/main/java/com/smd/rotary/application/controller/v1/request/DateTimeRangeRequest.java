package com.smd.rotary.application.controller.v1.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.smd.rotary.constant.AppConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@ApiModel("时间区间请求")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DateTimeRangeRequest {

    @JsonFormat(pattern = "yyyy-MM-dd'T'hh:mm:ss", timezone = AppConstants.TIME_ZONE)
    @ApiParam(value = "开始时间", example = "2021-01-01T00:00:00")
    private LocalDateTime beginAt;

    @NotNull(message = "结束时间不可为空")
    @JsonFormat(pattern = "yyyy-MM-dd'T'hh:mm:ss", timezone = AppConstants.TIME_ZONE)
    @ApiParam(value = "结束时间", example = "2022-01-01T23:59:59")
    private LocalDateTime endAt;
}
