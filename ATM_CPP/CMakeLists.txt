cmake_minimum_required(VERSION 3.10)
project(ATMSystem)

set(CMAKE_CXX_STANDARD 17)

include_directories(
    ${CMAKE_SOURCE_DIR}/include
    ${CMAKE_SOURCE_DIR}/include/accounts
    ${CMAKE_SOURCE_DIR}/include/atm
    ${CMAKE_SOURCE_DIR}/include/transaction
    ${CMAKE_SOURCE_DIR}/include/common
)

file(GLOB_RECURSE SOURCES "main.cpp" "src/*.cpp" "src/account/*.cpp" "src/atm/*.cpp" "src/transaction/*.cpp")

add_executable(atm ${SOURCES})
