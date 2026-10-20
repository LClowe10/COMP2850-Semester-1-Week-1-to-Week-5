# Task 12.1: Point class

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def distance(self):
        return (((self.x) ** 2) + ((self.y) ** 2)) ** 0.5

    def distanceTo(self, x2, y2):
        return (((x2 - self.x) ** 2) + ((y2 - self.y) ** 2)) ** 0.5


