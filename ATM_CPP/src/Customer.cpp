#include "Customer.hpp"

Customer::Customer(std::string name, Address address, std::string email, std::string phone, CustomerStatus status) 
            : name(name), address(address), email(email), phone(phone), status(status) {}

void Customer::setCard(const Card* const card) {
    this->card = card;
}

void Customer::setAccount(const Account* const account) {
    this->account = account;
}

std::string Customer::getCarNumber() const {
    return card->getCardNumber();
}

int Customer::getPin() const {
    return card->getPin();
}

float Customer::checkBalance() const {
    return account->getAvailableBalance();
}