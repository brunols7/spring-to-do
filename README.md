# 📋 Spring Boot To-Do (Lista de Tarefas - Desafio Sem Banco de Dados)

Este projeto é um desafio prático para treinar os conhecimentos iniciais de **Spring Boot**, sem utilizar banco de dados. Toda a persistência das tarefas é feita em **memória**, utilizando uma lista (`List<Task>`).

---

## 🚀 O que foi colocado em prática

- ✅ Estrutura em camadas (Controller, Service, DTO, Model)
- ✅ Uso do Spring Boot puro (sem JPA)
- ✅ Armazenamento de dados com `List<>` ao invés de banco
- ✅ Boas práticas com `DTO` para entrada e saída
- ✅ Tratamento de exceções com `Exception` personalizada
- ✅ Uso do `@RestController`, `@RequestMapping`, `@Autowired`, `@RequestBody`, etc.
- ✅ Organização de código limpa e separada por pacotes

---

## 🔧 Tecnologias utilizadas

- Java 17+
- Spring Boot 3+
- Maven
- Lombok

---

## 📦 Como rodar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/brunols7/spring-to-do.git
````

2. Abra no IntelliJ, Eclipse ou VS Code.

3. Rode o projeto com a classe principal `ToDoApplication`.

4. Acesse as rotas usando o Postman ou Insomnia em `http://localhost:8080`.

---

## 📌 Endpoints disponíveis

| Método | Rota          | Descrição                       |
| ------ | ------------- | ------------------------------- |
| GET    | `/tasks`      | Lista todas as tarefas          |
| GET    | `/tasks/{id}` | Busca uma tarefa pelo ID        |
| POST   | `/tasks`      | Cria uma nova tarefa            |
| PUT    | `/tasks/{id}` | Atualiza uma tarefa existente   |
| PATCH  | `/tasks/{id}` | Marca uma tarefa como concluída |
| DELETE | `/tasks/{id}` | Remove uma tarefa da lista      |

---

## 📥 Exemplo de JSON para criar uma tarefa

```json
{
  "title": "Estudar Spring Boot",
  "description": "Fazer o desafio proposto com lista em memória"
}
```

---

## ❗ Tratamento de erros

* Se o ID informado não existir, é lançada uma exceção personalizada `TaskNotFoundException`.
* Pode ser estendido para outros tipos de erro.

---

## 👨‍💻 Autor

Feito por brunols7 como prática de desenvolvimento com Java e Spring Boot.

---

# 📋 Spring Boot To-Do (Task List - No Database Challenge)

This is a practical challenge project to train initial knowledge of **Spring Boot**, without using a database. All task data is stored **in memory** using a simple `List<Task>`.

---

## 🚀 What was practiced

* ✅ Layered architecture (Controller, Service, DTO, Model)
* ✅ Pure Spring Boot (no JPA or database)
* ✅ In-memory data with `List<>`
* ✅ Use of `DTO`s for request/response
* ✅ Custom exception handling
* ✅ Use of annotations like `@RestController`, `@RequestMapping`, `@Autowired`, `@RequestBody`, etc.
* ✅ Clean and modular code

---

## 🔧 Tech Stack

* Java 17+
* Spring Boot 3+
* Maven
* Lombok

---

## 📦 How to run

1. Clone the repository:

```bash
git clone https://github.com/brunols7/spring-to-do.git
```

2. Open it in IntelliJ, Eclipse or VS Code.

3. Run the application from the main class `ToDoApplication`.

4. Access the routes using Postman or Insomnia at `http://localhost:8080`.

---

## 📌 Available Endpoints

| Method | Route         | Description              |
| ------ | ------------- | ------------------------ |
| GET    | `/tasks`      | List all tasks           |
| GET    | `/tasks/{id}` | Get task by ID           |
| POST   | `/tasks`      | Create a new task        |
| PUT    | `/tasks/{id}` | Update an existing task  |
| PATCH  | `/tasks/{id}` | Mark a task as completed |
| DELETE | `/tasks/{id}` | Delete a task            |

---

## 📥 Sample JSON to create a task

```json
{
  "title": "Study Spring Boot",
  "description": "Complete the memory list challenge"
}
```

---

## ❗ Error handling

* If the given ID doesn't exist, a custom `TaskNotFoundException` is thrown.
* Easily extendable for other cases.

---

## 👨‍💻 Author

Created by brunols7 as Java and Spring Boot practice.
