#ifndef CHECK_DEPOSIT_HPP
#define CHECK_DEPOSIT_HPP

#include "Deposit.hpp"

class CheckDeposit : public Deposit {
    private:
        int checkNumber;
        int bankCode;
    public:
        CheckDeposit(int transactionId, 
                     TransactionStatus status, 
                     int creationDate, 
                     int amount, 
                     int checkNumber, 
                     int bankCode);
        int getCheckNumber() const;
};

#endif