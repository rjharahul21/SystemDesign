#include "Withdraw.hpp"

Withdraw::Withdraw(int transactionId, TransactionStatus status, int creationDate, int amount)
    : Transaction(transactionId, status, creationDate), amount(amount) {}

int Withdraw::getAmount() const {
    return amount;
}