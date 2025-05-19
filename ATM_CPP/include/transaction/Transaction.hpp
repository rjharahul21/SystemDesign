#ifndef TRANSACTION_HPP
#define TRANSACTION_HPP

#include "Enums.hpp"

class Transaction {
    private:
        int transactionId;
        TransactionStatus status;
        int creationDate;
    public:
        Transaction(int transactionId, TransactionStatus status, int creationDate);
        bool saveTransaction() const;
};

#endif