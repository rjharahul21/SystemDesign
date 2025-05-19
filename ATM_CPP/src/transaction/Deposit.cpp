#include "Deposit.hpp"

Deposit::Deposit(int transactionId, TransactionStatus status, int creationDate, int amount)
    : Transaction(transactionId, status, creationDate), amount(amount) {}

int Deposit::getAmount() const {
    return amount;
}