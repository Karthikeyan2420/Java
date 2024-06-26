// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract SimpleStorage {
    uint256 public storedData;

    function set(uint256 x) public {
        storedData = x;
    }

    function get() public view returns (uint256) {
        return storedData;
    }

    function deposit(uint256 x) public {
        storedData += x;
    }

    function withdraw(uint256 x) public {
        require(storedData >= x, "Insufficient balance");
        storedData -= x;
    }

    function transfer(address to, uint256 x) public {
        require(storedData >= x, "Insufficient balance");
        SimpleStorage(to).deposit(x);
        storedData -= x;
    }

    function getBalance() public view returns (uint256) {
        return storedData;
    }
}
