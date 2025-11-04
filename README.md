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

### Separação de Responsabilidades e Princípio Aberto/Fechado

#### Antes

```java
public double getSpeed() {
    return switch (type) {
        case EUROPEAN -> getBaseSpeed();
        case AFRICAN -> Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
        case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
    };
}

public String getCry() {
    return switch (type) {
        case EUROPEAN -> "Sqoork!";
        case AFRICAN -> "Sqaark!";
        case NORWEGIAN_BLUE -> voltage > 0 ? "Bzzzzzz" : "...";
    };
}
```

#### Depois

EuropeanParrot

```java

@Override
public double getSpeed() {
    return BASE_SPEED;
}

@Override
public String getCry() {
    return "Sqoork!";
}
```

AfricanParrot

```java

@Override
public double getSpeed() {
    return Math.max(0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
}

@Override
public String getCry() {
    return "Sqaark!";
}
```

NorwegianBlueParrot

```java

@Override
public double getSpeed() {
    return (isNailed) ? 0 : Math.min(24.0, voltage * BASE_SPEED);
}

@Override
public String getCry() {
    return voltage > 0 ? "Bzzzzzz" : "...";
}
```

#### Justificativa:

A lógica foi dividida em classes pequenas e coesas, respeitando o Princípio de Responsabilidade Única.
O código está aberto para extensão, mas fechado para modificação, permitindo que novos tipos de papagaio possam ser
adicionados sem modificar o código existente. Antes era necessário alterar a classe `Parrot`, editando dois blocos
`switch`.

### Testes Facilitados

#### Justificativa:

Os testes estão mais fáceis de manter e entender, pois cada tipo de papagaio tem os seus próprios testes bem definidos.