package com.rahul.accounts.service;


import com.rahul.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);

}