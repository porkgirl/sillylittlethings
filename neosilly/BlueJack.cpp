//
// Created by emily on 2/19/2026.
//

#include "BlueJack.h"
#include <iostream>
#include <list>


int main() {
    std::list<int> deck;
    std::cout << "BlueJack Alpha Build 0.1" << std::endl;

    for (int i = 0; i < 4; i++) {
        for (int o = 1; o < 10; o++) {
            deck.push_back(o);
        }
        for (int k = 0; k < 4; k++) {
            deck.push_back(10);
        }
    }

    for (int deck : deck) {
        std::cout << deck;
        std::cout << " ";
    }
}
