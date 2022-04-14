// SPDX-License-Identifier: MIT

pragma solidity ^0.8.0;

contract Naming{

    string name;
    string public nameTwo = "No getter needed";
    string public constant nameThree = "I can't be changed";

    constructor(string memory  _name){
        name = _name;
    }
    function getName() public view returns (string memory){
        return name;
    }
    function setName(string memory newName) public{
        name = newName;
    }
}
