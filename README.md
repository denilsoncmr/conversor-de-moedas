# Conversor de Moedas com API e Interface Gráfica

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![Gson](https://img.shields.io/badge/Gson-2.10.1-blue)](https://github.com/google/gson)
[![License](https://img.shields.io/badge/license-MIT-green)](#)

Este projeto é um **Conversor de Moedas** desenvolvido em **Java**, que interage com o usuário através de **JOptionPane**. As taxas de câmbio são obtidas dinamicamente usando a **API ExchangeRate**, garantindo conversões atualizadas e precisas.

## Funcionalidades

- Interface gráfica simples e intuitiva via `JOptionPane`.
- Atualmente são **9 opções distintas de conversão de moedas** (ex.: BRL ➔ USD, USD ➔ EUR, etc.).
- Atualização em **tempo real** das taxas de câmbio via **API ExchangeRate**.
- Manipulação de dados JSON utilizando a biblioteca **Gson**.

## Tecnologias Utilizadas

- **Java**
- **Swing (JOptionPane)**
- **Gson**
- **ExchangeRate API**

## Dependências

Você pode adicionar o **Gson** ao seu projeto via Maven:
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version> <!-- ou a versão mais recente -->
</dependency>
```
Ou baixar o `.jar` e adicioná-lo manualmente ao seu projeto.

## Como Executar o Projeto

- Certifique-se de ter o Java JDK instalado na sua máquina.

- Clone o repositório ou baixe o projeto.

- Adicione a biblioteca Gson ao classpath do projeto.

- Compile e execute o programa.

- Siga as instruções na interface gráfica para realizar conversões de moedas.

## Observações

- É necessária conexão com a internet para que o programa possa acessar a API de câmbio.
- O projeto está configurado para ser simples e educativo, podendo ser expandido para novas funcionalidades como histórico de conversões, múltiplos idiomas, ou suporte para mais moedas.

## Licença
Este projeto é de uso livre para fins educacionais.

