#include "Card.hpp"

Card::Card(std::string cardNumber, std::string customername,  int cardExpiry, int pin)
    : cardNumber(cardNumber), customerName(customerName), cardExpiry(cardExpiry), pin(pin) {}

std::string Card::getCardNumber() const {
    return cardNumber;
}

int Card::getPin() const{
    return pin;
}