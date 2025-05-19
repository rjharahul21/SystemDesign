#ifndef TRANSFER_HPP
#define TRANSFER_HPP

#include "Transaction.hpp"

class Transfer : Transaction {
    private:
        int destinationAccountNumber;
        int sourceNccountNumber;
        int amount;
    public:
        Transfer(int transactionId, 
                 TransactionStatus status, 
                 int creationDate,
                 int destinationAccountNumber,
                 int sourceNccountNumber,
                 int amount);
        int getDestinationAccount() const;
};

#endif