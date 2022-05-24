package com.example.demo.port.out;

import com.example.demo.port.in.TestInResponse;

public interface TestOutPort {

    TestInResponse generateData(TestOutRequest testOutRequest);
}
