#include "Account.hpp"

Account::Account(int accountNumber, float totalBalance, float availableBalance)
    : accountNumber(accountNumber), totalBalance(totalBalance), availableBalance(availableBalance) {}

float Account::getAvailableBalance() const {
    return availableBalance;
}