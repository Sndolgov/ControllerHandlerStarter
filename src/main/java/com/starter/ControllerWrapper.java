package com.starter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ControllerWrapper
{
    private Object result;
    private boolean isSomething;
}
