#ifndef CUSTOMER_HPP
#define CUSTOMER_HPP

#include <string>
#include "Account.hpp"
#include "Card.hpp"
#include "Address.hpp"
#include "Enums.hpp"

class Customer{
    private:
        std::string name;
        std::string email;
        std::string phone;
        Address address;
        CustomerStatus status;
        const Card* card;
        const Account* account;
    public:
        Customer(std::string name, Address address, std::string email, std::string phone, CustomerStatus status);
        void setCard(const Card* const card);
        void setAccount(const Account* const account);
        std::string getCarNumber() const;
        int getPin() const;
        float checkBalance() const;
};

#endif