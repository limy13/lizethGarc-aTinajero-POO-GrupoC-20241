class Employee:
    def __init__(self, name, age, salary, account_number, account_type):
        self.name = name
        self.age = age
        self.salary = salary
        self.accounts = [BankAccount(account_number, account_type)]
        self.account_number = account_number
        self.account_type = account_type

    def add_account(self, account_number, account_type):
        self.accounts.append(BankAccount(account_number, account_type))

    def get_data(self):
        print("\nName:", self.name)
        print("Age:", self.age)
        print("Salary:", self.salary)
        print("\n--- Accounts ---")
        for account in self.accounts:
            print(account)