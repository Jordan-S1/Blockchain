# Blockchain

This project is a simple implementation of a blockchain in Java. It demonstrates the basic concepts of blockchain technology, including blocks, hashing, proof of work, transactions, wallets, and digital signatures.

## Getting Started

To get started with this project, you need to have Java and Visual Studio Code installed on your machine. Ensure that the required libraries (`bcprov-jdk18on-1.80.jar` and `gson-2.9.1.jar`) are included in the `lib` folder.

## Folder Structure

The workspace contains the following folders:

- `src`: Contains the source code for the project.
- `lib`: Contains the external libraries (e.g., Gson and BouncyCastle) used in the project.
- `bin`: Contains the compiled output files.

## Running the Project

To run the project, open the `BlockChain.java` file in Visual Studio Code and run the `main` method. This will create a simple blockchain with multiple blocks, simulate transactions between wallets, and print the blockchain data in JSON format.

## Project Structure

- `Block.java`: Defines the `Block` class, which represents a single block in the blockchain. Includes methods for mining and adding transactions.
- `BlockChain.java`: Contains the `main` method, manages the blockchain, and validates the chain.
- `StringUtil.java`: Contains utility methods for hashing, digital signatures, and generating Merkle roots.
- `Transaction.java`: Defines the `Transaction` class, which handles the creation and validation of transactions.
- `TransactionInput.java`: Represents inputs for transactions, referencing unspent transaction outputs (UTXOs).
- `TransactionOutput.java`: Represents outputs of transactions, including ownership and value.
- `Wallet.java`: Implements wallets for managing keys, balances, and creating transactions.

## Features

- **Blocks and Blockchain**: Implements a chain of blocks with proof of work.
- **Transactions**: Supports creating and validating transactions with inputs and outputs.
- **Wallets**: Includes wallet functionality with public/private key pairs and digital signatures.
- **Security**: Uses SHA-256 hashing and ECDSA for digital signatures (via BouncyCastle library).
- **Merkle Root**: Calculates Merkle roots for transactions in a block.

## External Libraries

- **Gson**: Used for converting objects to JSON format.
- **BouncyCastle**: Provides cryptographic algorithms, including ECDSA.

## License

This project is licensed under the MIT License.
