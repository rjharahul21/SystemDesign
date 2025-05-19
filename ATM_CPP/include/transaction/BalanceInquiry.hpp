#ifndef BALANCE_INQUIRY_HPP
#define BALANCE_INQUIRY_HPP

#include "Transaction.hpp"

class BalanceInquiry : public Transaction{
    private:
        int accountId;
    public:
        BalanceInquiry(int transactionId, TransactionStatus status, int creationDate, int accountId);
        int getAccountId() const;
};

#endif