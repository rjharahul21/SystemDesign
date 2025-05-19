#include "BalanceInquiry.hpp"

BalanceInquiry::BalanceInquiry(int transactionId, TransactionStatus status, int creationDate, int accountId)
    : Transaction(transactionId, status, creationDate), accountId(accountId) {}

int BalanceInquiry::getAccountId() const{
    return accountId;
}