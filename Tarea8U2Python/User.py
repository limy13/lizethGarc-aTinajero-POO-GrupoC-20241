import random

class User:
    
    def __init__(self, name="", address="", phone=0):
        self.id = []
        self.name = name
        self.address = address
        self.phone = phone

    def create_user_id(self):
        self.x = random.randint(1, 1000)
        self.y = str(self.x)
        band2 = False
        band = False
        while not band:
            for i in self.id:
                if self.y == i:
                    band2 = True

            if band2:
                self.x = random.randint(1, 1000)
                self.y = str(self.x)
            else:
                self.id.append(self.y)
                band = True

    def user_info(self):
        return "\nName: {}\nAddress: {}\nPhone: {}\nUser ID: {}".format(self.name, self.address, self.phone, self.y)