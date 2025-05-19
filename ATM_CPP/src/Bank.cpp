#include "Bank.hpp"

Bank::Bank(std::string name, int code)
    : name(name), code(code) {}

Bank& Bank::getBankInstance(std::string name, int code) {
    static Bank instanse(name, code);
    return instanse;
}

int Bank::getBankCode() const {
    return code;
}

void Bank::addAtm(const Atm* const atm) {
    atms.push_back(atm);
}

void Bank::addAccount(const Account* const account) {
    accounts.push_back(account);
}