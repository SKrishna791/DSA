class HashMap:
    def __init__(self,size = 7):
        self.data_map = [None]*size

    def __hash(self,key):
        my_hash = 0
        for letter in key:
            my_hash = (ord(letter)+my_hash*23)%len(self.data_map)
        return my_hash

    def print_table(self):
        for i,val in enumerate(self.data_map):
            print(i,": ",val)

    def set_item(self,key,value):
        index = self.__hash(key)
        if(self.data_map[index] is None):
            self.data_map[index] = []
        self.data_map[index].append([key,value])

    def get_item(self,key):
        index = self.__hash(key)
        if self.data_map[index] is not None:
            for i in range(len(self.data_map[index])):
                if self.data_map[index][i][0] == key:
                    return self.data_map[index][i][1]
                return None


a = HashMap(7)
a.set_item("bolts",10)
a.set_item("screw",43)
a.set_item("lumber",3)
a.set_item("washer",12)
a.print_table()

print(a.get_item('washers'))