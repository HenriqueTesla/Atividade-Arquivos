# 📁 Manipulação de Arquivos em Java

Este projeto contém exemplos simples de **leitura e escrita de arquivos texto** em Java, utilizando as classes `FileWriter`, `FileReader`, `BufferedReader` e conceitos de orientação a objetos com uma classe `Cliente`.

## 🎯 Objetivos

- Criar arquivos `.txt` com texto simples
- Ler arquivos e exibir o conteúdo no terminal
- Gravar uma lista de objetos `Cliente` em um arquivo
- Recriar objetos a partir de dados lidos de um arquivo

---

## 🧱 Estrutura do Projeto

ManipulacaoArquivosJava/  
├── Cliente.java  
├── EscritorSimples.java  
├── LeitorSimples.java  
├── GravadorDeClientes.java  
├── LeitorDeClientes.java  
└── README.md  

---

## ⚙️ Pré-requisitos

- Java JDK 8 ou superior instalado
- Um terminal ou prompt de comando
- (Opcional) Um editor de código como **VS Code**, **IntelliJ** ou **Eclipse**

---

## 🚀 Como compilar e executar

1. **Abra o terminal** na pasta do projeto (onde estão os arquivos `.java`).

2. **Compile todos os arquivos**: javac *.java

---

💡 Observações
Se você tentar ler um arquivo que não existe, ocorrerá um erro de FileNotFoundException.

O projeto utiliza try-with-resources para garantir que os arquivos sejam fechados corretamente.

O formato usado no arquivo de clientes é nome;idade. Você pode facilmente adaptar para CSV ou JSON no futuro.
