with open('A.txt', 'r', encoding='utf-8') as dosya:
    metin = dosya.read()
    kelimeler = metin.split()

kelimeler = [kelime for kelime in kelimeler if len(kelime) >= 3]

with open('kelime_havuzu.txt', 'w', encoding='utf-8') as dosya:
    for kelime in kelimeler:
        dosya.write(kelime + '\n')
