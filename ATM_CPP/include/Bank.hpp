#ifndef BANK_HPP
#define BANK_HPP

#include "Atm.hpp"
#include "Account.hpp"
#include <vector>

class Bank {
    private:
        std::string name;
        int code;
        std::vector<const Atm*> atms;
        std::vector<const Account*> accounts;
        Bank(std::string name, int code);
    public:
        static Bank& getBankInstance(std::string name, int code);
        int getBankCode() const;
        void addAtm(const Atm *atm);
        void addAccount(const Account *account);
};

#endif