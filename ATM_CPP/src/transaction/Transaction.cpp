#include "Transaction.hpp"

Transaction::Transaction(int transactionId, TransactionStatus status, int creationDate)
    : transactionId(transactionId), status(status), creationDate(creationDate) {}

bool Transaction::saveTransaction() const{
    return true;
}