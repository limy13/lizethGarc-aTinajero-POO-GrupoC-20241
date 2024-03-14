class BookShop:
    
    def __init__(self):
        self.users = []
        self.books = []
        self.unrented_books = []
        self.rented_books = []
        self.users_purchased = []

    def add_user(self, new_user):
        self.users.append(new_user)
        print("\nSuccessful registration\n")

    def add_book(self, new_book):
        self.books.append(new_book)
        self.unrented_books.append(new_book)
        print("\nSuccessful registration\n")

    def show_info_users(self):
        for x, user in enumerate(self.users, 1):
            print("---- User", x, "----")
            print(user.user_info())

    def show_info_books(self):
        for x, book in enumerate(self.books, 1):
            print("\n---- Book", x, "----")
            print(book.book_info())

    def rented_books(self, book_id):
        band = False
        for book in self.books:
            if book.book_info().find(book_id) != -1:
                band = True
        if not band:
            print("Rent failed")
        return band

    def add_rented_book(self, book_id):
        for book in self.books:
            if book.book_info().find(book_id) != -1:
                self.rented_books.append(book)
                self.unrented_books.remove(book)

    def add_users_purchases(self, user_id):
        for user in self.users:
            if user.user_info().find(user_id) != -1:
                self.users_purchased.append(user)

    def show_unrented_books(self):
        for x, book in enumerate(self.unrented_books, 1):
            print("---- Book", x, "----")
            print(book.book_info())

    def users_purchased(self, user_id):
        band = False
        for user in self.users:
            if user.user_info().find(user_id) != -1:
                band = True
        return band

    def show_rented_books(self):
        for x, book in enumerate(self.rented_books, 1):
            print("---- Book", x, "----")
            print(book.book_info())

    def show_user_purchased(self):
        for x, user in enumerate(self.users_purchased, 1):
            print("---- User", x, "----")
            print(user.user_info())