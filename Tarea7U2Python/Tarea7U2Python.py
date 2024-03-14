from Employee import Employee
from Bank import Bank

employees = []

employee1 = Employee("Mariana Esteves", 25, 7000, 759497490, 'A')
employee1.add_account(759497490, 'A')
employees.append(employee1)

employee2 = Employee("Luis Rodriguez", 31, 12500.43, 453688939, 'B')
employee2.add_account(453688939, 'B')
employees.append(employee2)

employee3 = Employee("Elizabeth Castro", 40, 15000.87, 74943990, 'C')
employee3.add_account(74943990, 'C')
employees.append(employee3)

bank = Bank()

while True:
        print("\n--- Welcome ---\n")
        print("What do you want to do?\n")
        print("1. Employees information.")
        print("2. Consult employee.")
        print("3. Existing accounts.")
        print("4. Consult account.")
        print("5. Exit.")

        choice = int(input("Enter your choice: "))

        if choice == 1:
            print("\n--- Employees Information ---\n")
            for employee in employees:
                employee.get_data()

        elif choice == 2:
            print("\n--- Consult Employee ---\n")
            for index, employee in enumerate(employees, 1):
                print(f"{index}. {employee.name}")
            employee_index = int(input("Select employee (1-3): ")) - 1
            employees[employee_index].get_data()

        elif choice == 3:
            bank.show_accounts()

        elif choice == 4:
            account_number = int(input("\nEnter the account number to consult: "))
            bank.consult_account(account_number)

        elif choice == 5:
            print("Exiting...")
            break

        else:
            print("Invalid choice. Please enter a valid option.")
