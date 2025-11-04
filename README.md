# 🦜 Parrot Refactoring Kata – Refatoração em Java

## 📘 Sobre o Projeto Original

O **Parrot Refactoring Kata** é um exercício didático de engenharia de software criado
por [Emily Bache](https://github.com/emilybache/Parrot-Refactoring-Kata) para praticar **refatoração**.

O código original simula três tipos de papagaios (`European`, `African` e `Norwegian Blue`) e calcula:

- a **velocidade** de voo.
- o **grito** característico de cada um.

### Estrutura Original

No código original, todas as regras estavam concentradas em **uma única classe (`Parrot`)**, que utilizava um `switch`
para tratar o comportamento de cada tipo de papagaio.  
Esse design tornava o sistema funcional, mas **difícil de manter e estender**.

#### Principais problemas identificados

- **Baixa coesão:** uma única classe contendo múltiplas responsabilidades.
- **Alto acoplamento:** a classe `Parrot` conhece detalhes internos de todos os tipos.
- **Dificuldade de extensão:** adicionar um novo tipo exigia modificar o `switch`.
- **Pouca clareza:** trechos com lógica condicional e cálculos duplicados.

---

## 🔧 Objetivo da Refatoração

O propósito da refatoração foi **melhorar a clareza, coesão e extensibilidade do código**, **sem alterar o comportamento
funcional** já testado.

Foram aplicadas **boas práticas de engenharia de software e princípios SOLID**, com apoio de testes automatizados para
garantir que tudo continuasse funcionando como antes.

---

## 🚀 Melhorias Implementadas

Em breve...