#include "Transfer.hpp"

Transfer::Transfer(int transactionId, 
         TransactionStatus status, 
         int creationDate,
         int destinationAccountNumber,
         int sourceNccountNumber,
         int amount)
    : Transaction(transactionId, status, creationDate), 
      destinationAccountNumber(destinationAccountNumber),
      sourceNccountNumber(sourceNccountNumber),
      amount(amount) {}

int Transfer::getDestinationAccount() const {
    return destinationAccountNumber;
}