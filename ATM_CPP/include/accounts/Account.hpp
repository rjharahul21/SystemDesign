#ifndef ACCOUNT_H
#define ACCOUNT_H

class Account{
    private:
        int accountNumber;
        float totalBalance;
        float availableBalance;
    public:
        Account(int accountNumber, float totalBalance, float availableBalance);
        float getAvailableBalance() const;
};

#endif