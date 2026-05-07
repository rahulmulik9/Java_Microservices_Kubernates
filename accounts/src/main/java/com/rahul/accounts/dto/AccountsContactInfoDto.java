package com.rahul.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Map;


/*@ConfigurationProperties : Marks your class as a holder for configuration data
Bind everything under accounts in YAML to this class*/
//@ConfigurationProperties(prefix = "accounts")
//public record AccountsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
//
//}

@ConfigurationProperties(prefix = "accounts")
@Getter
@Setter
public class AccountsContactInfoDto {

    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;

}