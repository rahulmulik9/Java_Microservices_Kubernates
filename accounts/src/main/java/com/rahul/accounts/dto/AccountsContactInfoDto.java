package com.rahul.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;


/*@ConfigurationProperties : Marks your class as a holder for configuration data
Bind everything under accounts in YAML to this class*/
@ConfigurationProperties(prefix = "accounts")
public record AccountsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {

}
