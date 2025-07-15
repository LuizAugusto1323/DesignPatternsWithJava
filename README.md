# Design Patterns em Java

Este projeto foi desenvolvido como um estudo prático dos principais **padrões de projeto (Design Patterns)** em Java, com foco nos três grandes grupos: **Creational**, **Structural** e **Behavioral**.

---

## 🎯 Objetivo

O objetivo é **entender e aplicar na prática** os padrões de projeto mais comuns da engenharia de software orientada a objetos, observando como cada padrão resolve um tipo específico de problema de design e arquitetura, promovendo **manutenibilidade**, **escalabilidade** e **reutilização de código**.

---

## 🧱 Estrutura do Projeto

|--- designPatterns/

│ |--- adapter/ -> Adapter Pattern (USB/CardReader)

│ |--- builder/ -> Builder Pattern (Person Builder)

│ |--- facade/ -> Facade Pattern (CepAPI, CrmService -> Facade)

│ |--- observer/ -> Observer Pattern (Notificações)

│ |--- singleton/ -> Singleton Pattern (três modos)

│ |--- strategy/ -> Strategy Pattern (Behavior)

O diretório `test` contém classes simples de execução para validar os exemplos implementados, sendo todos invocados pela classe principal `Main`.

---

## ✅ Padrões implementados

### 🏗️ Creational

- **Singleton**
  - Eager Initialization
  - Lazy Initialization
  - LazyHolder (Thread-safe)
- **Builder**
  - Utilizado para construir objetos `Person` de forma controlada e imutável, permitindo a criação fluente com segurança e encapsulamento total.

### 🧩 Structural

- **Facade**
  - Simplifica o acesso a um subsistema complexo (`CrmService` + `CepAPI`).
- **Adapter**
  - Permite que uma classe (`MemoryCard`) seja usada como se fosse outra (`USB`), usando um adaptador (`CardReader`) entre elas.

### 🔁 Behavioral

- **Strategy**
  - Define comportamentos dinâmicos para um robô (agressivo, defensivo, normal).
- **Observer**
  - Permite que múltiplos ouvintes (`EmailObserver`, `SMSObserver`) sejam notificados sempre que um evento ocorrer em um objeto observado.

---

## 📌 Como executar

1. Clone o projeto.
2. Compile e execute com sua IDE Java favorita (ex: IntelliJ)
3. A execução da classe Main.java mostrará a saída dos testes de cada padrão.
