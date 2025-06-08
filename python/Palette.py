from PIL import Image

def generate_palette(kolor_start, kolor_koniec, liczba_kolorow=256):
    paleta = []
    r1, g1, b1 = kolor_start
    r2, g2, b2 = kolor_koniec

    for i in range(liczba_kolorow-2):
        wspolczynnik = i / (liczba_kolorow - 2)
        
        r = int(r1 + wspolczynnik * (r2 - r1))
        g = int(g1 + wspolczynnik * (g2 - g1))
        b = int(b1 + wspolczynnik * (b2 - b1))
        
        paleta.extend([r, g, b])
    paleta.extend([0,0,0])
    paleta.extend([0,0,255])
        
    return paleta
