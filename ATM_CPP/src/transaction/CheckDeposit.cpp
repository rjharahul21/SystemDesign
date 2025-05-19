#include "CheckDeposit.hpp"

CheckDeposit::CheckDeposit(int transactionId, 
                           TransactionStatus status, 
                           int creationDate, 
                           int amount, 
                           int checkNumber, 
                           int bankCode)
    : Deposit(transactionId, status, creationDate, amount), checkNumber(checkNumber), bankCode(bankCode) {}

int CheckDeposit::getCheckNumber() const {
    return checkNumber;
}