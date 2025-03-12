## Zmienne i typy danych
```
//Zmienne podstawowe
int var is 1;
double varDouble is 1.11;
string varString is "nazwa";
bool varBool is true;
bool varBool2 is false;

//Zmienne złożone
List<string> varList is ["a","b","c"];
Point center is (100,100);
Landmass nazwa is (10,10) with perimeter=funct, height=funct2;
```

## Instrukcje sterujące if/else

```
if (x>100) do {..}
eif (x<50) do {..}
else do {..}

if (p = (10,20)) do {}
else do {..}
```

## Instrukcje sterujące repeat / as long as
```
repeat with i 5 {..}
repeat with i from 1 to 10 {..}

repeat with x from 1 to 100{
	landmass l = (100*x,0)
  landmass l2 = (-100*x,0)
    
}

iterate x through list {..}
iterate x with i through list {..}

as long as () do {..}
```

## Funkcje
```
function funct2(int x, int y) : double{
	return 2·sin(4·x)·cos(3·y) + 0.5·e^(-(x²+y²)/8);
}

// funkcja bez parametrów
function nazwa (){
    landmass a is (100,100) with perimeter is Circle(50), height is funct2;
}
```
## Podstwowe funkcje wbudowane
```
Square(50)
Circle(10)
Polygon(pointsList)
Random(100)
```
## Operacje arytmetyczne
```
double d1 is 2.3;
double d2 is 1.4;

d1 is d1+d2;
d1 is d1^d2;
d1 is d1/d2;
d1 is d1*d2;
```
## Porównanie
```
bool b1 is false;

b1 is 1>2;
b1 is 2<1;
b1 is 1 != 1;
b1 os 1 = 3;
```

