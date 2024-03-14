class Tarea8U2Python: 

    book_shop = BookShop()

    while True:
        print("\n------ Welcome ------\n")
        print("What do you want to do?\n")
        print("1. Add user.\n2. Add book.\n3. Users.\n4. Books.\n5. Rent a book.\n" +
             "6. Users who have already purchased.\n" +
             "7. Rented books.\n8. Unrented books.\n9. Exit.")
        x = int(input())
        if x == 1:
            name = input("\nName: ")
            address = input("Address: ")
            phone = int(input("Phone: "))
            user = User(name, address, phone)
            user.create_user_id()
            book_shop.add_user(user)
        elif x == 2:
            name = input("\nName: ")
            author = input("Author: ")
            price = float(input("Price: "))
            book = Books(name, author, price)
            book.create_book_id()
            book_shop.add_book(book)
        elif x == 3:
            book_shop.show_info_users()
        elif x == 4:
            book_shop.show_info_books()
        elif x == 5:
            user_id = input("User ID: ")
            if book_shop.users_purchased(user_id):
                book_id = input("Book ID: ")
                if book_shop.rented_books(book_id):
                    book_shop.add_rented_book(book_id)
                    book_shop.add_users_purchases(user_id)
                    print("\nPurchased successful")
        elif x == 6:
            book_shop.show_user_purchased()
        elif x == 7:
            book_shop.show_rented_books()
        elif x == 8:
            book_shop.show_unrented_books()