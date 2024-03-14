class BankAccount:
    def __init__(self, account_number, account_type):
        self.account_number = account_number
        self.account_type = account_type

    def __str__(self):
        return f"Account number: {self.account_number}\nAccount type: {self.account_type}\n"