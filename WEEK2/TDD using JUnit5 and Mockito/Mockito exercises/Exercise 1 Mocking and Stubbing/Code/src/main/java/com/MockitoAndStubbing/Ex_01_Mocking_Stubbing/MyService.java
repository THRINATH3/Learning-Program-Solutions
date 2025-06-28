package com.MockitoAndStubbing.Ex_01_Mocking_Stubbing;

/**
 * Hello world!
 *
 */
public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}

