package com.example.messagesendertwilio.constans;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ConstansTwilio {
    ACCOUNT_SID("AC70f9dd02f0798785cd20238abd8ed992"),
    AUTH_TOKEN("f1bfb4ea42cf89e3b05bcbd7d0bb0da5"),
    PHONE_NUMBER("+17725714478");

    private String value;
}
