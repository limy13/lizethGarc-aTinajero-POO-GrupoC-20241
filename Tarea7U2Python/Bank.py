class Bank:
    
    def __init__(self):
        self.accounts = []

    def add_account(self, account_number, account_type, owner):
        account_info = f"Account number: {account_number}\nAccount type: {account_type}\nOwner: {owner}\n"
        self.accounts.append(account_info)

    def show_accounts(self):
        if self.accounts:
            print("--- Accounts ---")
            for account in self.accounts:
                print(account)
        else:
            print("No accounts found.")

    def consult_account(self, account_number):
        for account in self.accounts:
            if account_number in account:
                print("Account information:")
                print(account)
                return
        print("Account not found.")