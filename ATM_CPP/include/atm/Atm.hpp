#ifndef ATM_HPP
#define ATM_HPP

#include<map>

#include "Address.hpp"
#include "Customer.hpp"

class Atm {
    private:
        int id;
        Address location;
        std::map<const std::string, const Customer*> customers;
    public:
        Atm(int id, Address address);
        void addCustomer(const Customer* const customer);
        bool authenticateUser(std::string cardNumber, int pin);
        float checkBalance(std::string);
};

#endif