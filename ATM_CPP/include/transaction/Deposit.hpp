#ifndef DEPOSIT_HPP
#define DEPOSIT_HPP

#include "Transaction.hpp"

class Deposit : public Transaction{
    private:
        int amount;
    public:
        Deposit(int transactionId, TransactionStatus status, int creationDate, int amount);
        int getAmount() const;
};

#endif