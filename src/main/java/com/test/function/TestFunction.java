package com.test.function;

import com.nothinginvoker.sdk.Function;
import com.nothinginvoker.sdk.InvocationResult;

import java.util.Collections;
import java.util.Map;

public class TestFunction implements Function {

    @Override
    public InvocationResult execute(Map<String, Object> payload) {
        return new InvocationResult()
                .withStatusCode(200)
                .withData(Collections.singletonMap("message", "Hello from test function!"));
    }
}
