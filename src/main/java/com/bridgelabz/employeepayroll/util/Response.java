package com.bridgelabz.employeepayroll.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
    private String message;
    private int errorCode;

    public Response() {

    }
}
