# ATM-Java-ConsoleApplication
# ATM Simulation

This Java program simulates a basic ATM system with features such as checking balance, withdrawing money, depositing money, and changing the PIN. It is implemented using a command-line interface.

## Flow of the Code

### 1. Main Entry Point - `ATM.java`

- Initiates the ATM system.
- Loads default customer data.
- Calls the `init` method.

### 2. Initialization - `ATM.java`

- Prompts the user to enter the card number and PIN.
- Invokes `CardProcessView` to process the card.

### 3. Card Processing - `CardProcessView.java`

- Calls `CardProcessViewModel` to get the card details.
- Displays a welcome message and options for the user.
- Based on user input, invokes specific functionality using different views (e.g., `CheckBalanceView`, `WithdrawMoneyView`).

### 4. Card Processing Logic - `CardProcessViewModel.java`

- Utilizes `Repository` to retrieve card details.
- Validates the entered PIN.
- Returns the card if the validation is successful.

### 5. Additional Views - `CheckBalanceView.java`, `WithdrawMoneyView.java`, etc.

- Handle specific functionalities like checking balance, withdrawing money, depositing money, and changing PIN.

### 6. Repository - `Repository.java`

- Manages data storage (not provided in the code snippet).

## Usage

1. Clone the repository:
https://github.com/muthupradeeshs/ATM-Java-ConsoleApplication)https://github.com/muthupradeeshs/ATM-Java-ConsoleApplication
## Console Output ScreenShot
https://drive.google.com/drive/folders/1GnP51zWLHBdo2JF8YK6tWUnnNnK-GpD_
