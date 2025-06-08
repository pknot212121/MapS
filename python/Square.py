class Square:
    def __init__(self,tl,tr,dr,dl,phase):
        self.tl = tl
        self.tr = tr
        self.dr = dr
        self.dl = dl
        self.phase = phase
    def __str__(self):
        return self.tl,self.tr,self.dr,self.dl,self.phase