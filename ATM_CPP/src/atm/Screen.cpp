#include "Screen.hpp"

bool screen::showMessage() {
    return true;
}

TransactionType screen::getInput() {
    return TransactionType::Withdraw;
}