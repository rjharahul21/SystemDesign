#ifndef ENUMS_HPP
#define ENUMS_HPP

enum class TransactionType { 
    BalanceInquiry, 
    DepositeCash, 
    DepositeCheck, 
    Withdraw, 
    Transfer
};

enum class TransactionStatus {
    Sucess, 
    Failuar, 
    Blocked, 
    Full, 
    Partial, 
    None
};

enum class CustomerStatus {
    Active, 
    Blocked, 
    Banned, 
    Compromised, 
    Archived, 
    Closed, 
    Unknown
};

#endif