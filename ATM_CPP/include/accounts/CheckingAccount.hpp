#ifndef CHECKING_ACCOUNT_HPP
#define CHECKING_ACCOUNT_HPP

#include "Account.hpp"

class CheckingAccount : public Account{
    private:
        int debitCardNumber;
    public:
        CheckingAccount(int accountNumber, float totalBalance, float availableBalance);
};

#endif