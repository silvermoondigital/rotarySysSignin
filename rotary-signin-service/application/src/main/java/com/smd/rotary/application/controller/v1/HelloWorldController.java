package com.smd.rotary.application.controller.v1;

import com.smd.rotary.application.dto.response.ApiResult;
import com.smd.rotary.application.dto.response.StatusCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "API for test", tags = "API 測試")
@RequestMapping("/v1/hello-world")
@CrossOrigin(allowCredentials = "true")
@RestController
public class HelloWorldController {

    @ApiOperation("Hello World")
    @GetMapping
    public ApiResult helloWorld() {
        return new ApiResult(StatusCode.SUCCESS, "Hello World");
    }

}
