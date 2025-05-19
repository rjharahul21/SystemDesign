#include "CashDeposit.hpp"

CashDeposit::CashDeposit(int transactionId, 
                         TransactionStatus status, 
                         int creationDate, 
                         int amount,
                         int cashDepositLimit)
    : Deposit(transactionId, status, creationDate, amount), cashDepositLimit(cashDepositLimit) {}