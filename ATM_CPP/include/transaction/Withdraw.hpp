#ifndef WITHDRAW_HPP
#define WITHDRAW_HPP

#include "Transaction.hpp"

class Withdraw : public Transaction {
    private:
        int amount;
    public:
        Withdraw(int transactionId, TransactionStatus status, int creationDate, int amount);
        int getAmount() const;
};

#endif