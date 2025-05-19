#ifndef SCREEN_HPP
#define SCREEN_HPP

#include "common/Enums.hpp"

class screen {
    public:
        bool showMessage();

        TransactionType getInput();
};

#endif