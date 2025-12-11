#include <stdio.h>

float balance = 1000.00;

void deposit()
{
    float amount;
    printf("\nEnter the amount to deposit: $");
    scanf("%f", &amount);

    if (amount <= 0)
    {
        printf("\nInvalid Amount! Deposit amount must be positive.\n");
    }
    else
    {
        balance += amount; // Adds the amount to the balance
        printf("\nSuccessfully deposited $%.2f\n", amount);
        printf("Your new balance is $%.2f\n", balance);
    }
}

void withdraw()
{
    float amount;
    printf("\nEnter the amount to withdraw: $");
    scanf("%f", &amount);

    if (amount <= 0)
    {
        printf("\nInvalid Amount! Withdrawal amount must be positive.\n");
    }
    else if (amount > balance)
    {
        printf("\nInsufficient Balance! You cannot withdraw $%.2f\n", amount);
        printf("Your current balance is $%.2f\n", balance);
    }
    else
    {
        balance -= amount;
        printf("\nSuccessfully withdrew $%.2f\n", amount);
        printf("Your remaining balance is $%.2f\n", balance);
    }
}

void balanceEnquiry()
{
    printf("\nYour current account balance is: $%.2f\n", balance);
}

int main()
{
    int choice;

    printf("--- Bank Application Menu ---\n"
           "1. Deposit Money\n"
           "2. Withdraw Money\n"
           "3. Check Balance\n"
           "4. Exit\n"
           "---------------------------\n");

    while (1)
    {
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        if (choice != 4)
        {
            switch (choice)
            {
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                balanceEnquiry();
                break;
            default:
                printf("\nInvalid choice! Please select a valid option from the menu.\n");
            }
        }
        else
        {
            printf("\nThank you for using our banking service! Goodbye! 👋\n");
            break;
        }
    }

    return 0;
}