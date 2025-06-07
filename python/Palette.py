from PIL import Image

def generate_palette(kolor_start, kolor_koniec, liczba_kolorow=256):
    """
    Generuje płaską listę kolorów (paletę) dla Pillow, tworząc gradient.

    :param kolor_start: Krotka (R, G, B) dla koloru początkowego.
    :param kolor_koniec: Krotka (R, G, B) dla koloru końcowego.
    :param liczba_kolorow: Ile kolorów ma mieć paleta (domyślnie 256).
    :return: Płaska lista [R, G, B, R, G, B, ...]
    """
    paleta = []
    r1, g1, b1 = kolor_start
    r2, g2, b2 = kolor_koniec

    for i in range(liczba_kolorow-1):
        # Oblicz, w którym miejscu gradientu jesteśmy (od 0.0 do 1.0)
        wspolczynnik = i / (liczba_kolorow - 1)
        
        # Interpolacja liniowa dla każdego kanału koloru
        r = int(r1 + wspolczynnik * (r2 - r1))
        g = int(g1 + wspolczynnik * (g2 - g1))
        b = int(b1 + wspolczynnik * (b2 - b1))
        
        paleta.extend([r, g, b])
    paleta.extend([0,0,255])
        
    return paleta

# GREEN = (40, 140, 60) 

# # Neutralny, jasny szary
# GRAY = (180, 180, 180)

# # --- Wygenerowanie palety ---
# paleta_mapy = generate_palette(GREEN, GRAY)

# # Wyświetlmy kilka pierwszych i ostatnich wartości, żeby zobaczyć, jak wygląda
# print("Początek palety (pierwsze 3 kolory):")
# print(paleta_mapy[:9])  # 3 * 3 = 9 wartości

# print("\nKoniec palety (ostatnie 3 kolory):")
# print(paleta_mapy[-9:])

# szerokosc, wysokosc = 256, 100
# obraz_gradientu = Image.new('P', (szerokosc, wysokosc))

# # 2. Przygotuj dane pikseli (indeksy kolorów z palety)
# # Chcemy, aby pierwsza kolumna pikseli miała kolor 0, druga kolor 1 itd.
# # Tworzymy listę [0, 1, 2, ..., 255] i powtarzamy ją dla każdej linii obrazu.
# dane_pikseli = list(range(szerokosc)) * wysokosc

# # 3. Wstaw dane pikseli do obrazu
# obraz_gradientu.putdata(dane_pikseli)

# # 4. NAJWAŻNIEJSZY KROK: Dołącz naszą wygenerowaną paletę do obrazu
# obraz_gradientu.putpalette(paleta_mapy)

# # 5. Zapisz obraz, aby zobaczyć efekt
# obraz_gradientu.save("gradient_mapa.png")

# print("\nWygenerowano obraz 'gradient_mapa.png' z paletą kolorów.")