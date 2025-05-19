#ifndef CARD_HPP
#define CARD_HPP

#include <string>

class Card {
    private:
        std::string cardNumber;
        std::string customerName;
        int cardExpiry;
        int pin;
    public:
        Card(std::string cardNumber, std::string customerName, int cardExpiry, int pin);
        std::string getCardNumber() const;
        int getPin() const;
};

#endif