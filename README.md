# 🎮 Loja de Games API

Este projeto é uma API RESTful desenvolvida em Java com Spring Boot, que simula o backend de uma loja de games. Ela permite o gerenciamento de produtos e categorias, incluindo funcionalidades de cadastro, listagem, atualização e remoção.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **Jakarta Validation**
- **MySQL (ou H2 para testes)**
- **Postman ou Insomnia (para testes de endpoints)**

---

## 🧱 Estrutura do Projeto

### Modelos

- `Categoria`: representa a categoria do jogo (ex: RPG, Aventura, Estratégia).
- `Produto`: representa os jogos da loja, contendo título, descrição e data de cadastro.

As entidades possuem relacionamento:
- `Categoria` → `Produto`: **@OneToMany**
- `Produto` → `Categoria`: **@ManyToOne**

### Validações

- Campos obrigatórios validados com `@NotNull`, `@NotBlank` e `@Size`.
- Atualizações com timestamp automático usando `@UpdateTimestamp`.

---

## Testando a API

Você pode testar os endpoints com ferramentas como **Postman** ou **Insomnia**. Basta rodar a aplicação e fazer requisições para os endpoints listados acima.

---

## 👩‍💻 Autora

Desenvolvido por **Sandy Machado**, apaixonada por inovação, código limpo e backend com propósito.  
Conecte-se comigo no [LinkedIn](https://www.linkedin.com/in/sandy-machado-/) 💙
