class Pixel:
    def __init__(self,R,G,B):
        self.R=R
        self.G=G
        self.B=B
    def to_list(self):
        return [self.R,self.G,self.B]