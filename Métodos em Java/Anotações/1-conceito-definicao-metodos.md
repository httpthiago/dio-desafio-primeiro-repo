# Métodos em Java

### O que é um método?

- É um bloco de código que é executado quando é feita uma requisição (chamada) a ele;
- É responsável por definir e realizar um comportamento ;
- Todo método precisa ser definido dentro de uma classe.

### Como definir um método?
`<visibilidade> <tipo_método> <modificador> <tipo_retorno> <nome>(<parametros>) <exceções> {<corpo>}`

- Visibilidade (opcional) : "public","private" ou "protected";
- Tipo do método(opcional): abstrato ou concreto;
- Modificador(opcional): "static" ou "final";
- Tipo de retorno(obrigatório): tipo de dado ou "void";
- Nome(obrigatório): nome fornecido ao método;
- Parâmetros(opcional): parâmetros que o método pode receber;
- Exceções(opcional): exceções que o método pode receber;
- Corpo(opcional): código que possui ou vazio.

#### Exemplo em Java:

> Definição do método somar

```java
class Calculadora{
    public static int somar(int numero1, int numero2) {
		return numero1 + numero2;
	}
}

```

> Chamada do método na função somar

```java
class Main{
	public static void main(String[] args) {
		System.out.println(Calculadora.somar(5, 5));
	}
}
```
