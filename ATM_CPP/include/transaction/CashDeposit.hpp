#ifndef CASH_DEPOSIT_HPP
#define cASH_DEPOSIT_HPP

#include "Deposit.hpp"

class CashDeposit : public Deposit {
    private:
        int cashDepositLimit;
    public:
        CashDeposit(int transactionId, 
                     TransactionStatus status, 
                     int creationDate, 
                     int amount,
                     int cashDepositLimit);
};

#endif