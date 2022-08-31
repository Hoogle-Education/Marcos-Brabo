# Adaptações iniciais

## Estruturas seleção

```java
int a = 2, b = 3;
boolean teste = a == b;

if ( a == b ) {

} else {

}
```

## Operador Ternário

```java
int maior = (a > b) ? a : b;
// substitui
// if (a > b) {
    //   maior = a;
    // } else {
    //   maior = b;
    // }  
```

## Estruturas de repetição

```
1. inicialização
2. verificação
3. atualização
```

## Estruturas `while`

```java
int quantidade = 10;

while (quantidade > 0) {
  System.out.println("Estou vendendendo...");
  quantidade--;
}
```

Este aqui primeiro inicia fazendo, e depois começa verificando se deve continuar.

```java
do {

} while()
```

## Estrutura `for`


```java
for (/*inicialização*/; /*verificação*/; /*atualização*/) {
  // ...
}
```

```java
for (int i = 0; i < n; i++) {
  // seu código aqui
}
```