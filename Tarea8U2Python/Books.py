import random

class Books:
    def __init__(self, name="", author="", price=0.0):
        self.random = random.Random()
        self.id = []
        self.name = name
        self.author = author
        self.price = price
        self.y = ""
        self.x = 0
        self.bookShop = BookShop()

    def create_book_id(self):
        self.x = self.random.randint(1, 1000)
        self.y = str(self.x)
        band2 = False
        band = False
        while not band:
            for i in self.id:
                if self.y == i:
                    band2 = True

            if band2:
                self.x = self.random.randint(1, 1000)
                self.y = str(self.x)
            else:
                self.id.append(self.y)
                band = True

    def book_info(self):
        return "\nName: {}\nAuthor: {}\nPrice: {}\nBook ID: {}".format(self.name, self.author, self.price, self.y)