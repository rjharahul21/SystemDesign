#ifndef SAVING_ACCOUNT_HPP
#define SAVING_ACCOUNT_HPP

#include "Account.hpp"

class SavingAccount : public Account{
    private:
        float withdrawllimit;
    public:
        SavingAccount(int accountNumber, float totalBalance, float availableBalance);
};

#endif