# Sistema de Gerenciamento de Cemitério

Sistema desktop para gerenciamento de informações de falecidos, responsáveis, sepulturas e exumações. Desenvolvido em **Java**, com **interface gráfica (GUI)** e **integração com banco de dados**.

## Funcionalidades

- Cadastro, buesca, edição e exclusão de:
  - Falecidos
  - Familiar responsáveis
  - Sepulturas
  - Funcionários/Administradores
- Consulta de dados por CPF, nome ou ID
- Controle de exumações e manutenções
- Validações de entrada (ex: datas, campos obrigatórios)
- Interface gráfica intuitiva
- Persistência dos dados em banco de dados

## Tecnologias Utilizadas

- **Java 21+**
- **Swing** (GUI) - em desenvolvimento
- **MySQL** (banco de dados relacional) - em desenvolvimento
- **VSCode** – IDE utilizada

## Como Executar

1. Clone o repositório:
  ```bash
  git clone https://github.com/seu-usuario/sistema-cemiterio.git
  ```

2. Importe o projeto na sua IDE (Eclipse, IntelliJ, NetBeans, etc.)

3. Configure o banco de dados:
- Crie o banco com o script `database.sql` (na pasta `/db`)
- Atualize o arquivo de configuração com suas credenciais:
  ```Java
  String url = "EXEMPLO";
  String user = "EXEMPLO";
  String password = "EXEMPLO";
  ```

4. Execute o projeto a partir da classe `Main.java`

## Estrutura Básica

**Legenda das Pastas**
- `app/` – Ponto de entrada da aplicação
- `core/` – Camada intermediária entre a aplicação e o modelo
- `model/` – Estrutura e dados do domínio da aplicação
  - `localidade/` – Entidades físicas do cemitério (cemitérios, túmulos, etc.)
  - `pessoas/` – Entidades humanas do sistema (falecidos, parentes, administradores)
  - `servicos/` – Serviços e operações realizadas (exumações, manutenções, etc.)
- Possui em varios modulos:
  - `controller/` – Padrões recorrentes para controle
  - `core/` – Padrões recorrentes de lógica central
  - `utils/` – Padrões recorrentes de classes utilitárias de herança
  - `view/` – Padrões recorrentes de interfaces gráficas

```
📦 src
┣📂 app
┣📂 core
┃ ┣📂 controller
┃ ┣📂 utils
┃ ┗📂 view
┗📂 model
  ┣📂 localidade
  ┃ ┣📂 cemiterio
  ┃ ┣📂 tumulo
  ┃ ┗📂 utils
  ┣📂 pessoas
  ┃ ┣📂 adm
  ┃ ┣📂 finado
  ┃ ┣📂 parente
  ┃ ┗📂 utils
  ┗📂 servicos
    ┣📂 core
    ┣📂 utils
    ┗📂 view
```

## Artefatos do Projeto

### Levantamento de Requisitos

Aqui foram definidos os **objetivos**, **público-alvo**, **necessidade da implementação**, **impacto e benefícios**, **critérios de sucesso da solução**, além dos **requisitos funcionais e não funcionais**.

[Levantamento de Requisitos (PDF)](https://github.com/AzumaNoDoragon/Sepulcrum/blob/main/documentacao/Levantamento%20de%20requisios.pdf)

### Diagrama de Casos de Uso

Visualização dos atores e funcionalidades do sistema:

[Diagrama de Casos de Uso (PDF)](https://github.com/AzumaNoDoragon/Sepulcrum/blob/main/documentacao/Diagrama%20de%20Casos%20de%20uso.pdf)

### Diagrama de Classes

Representação das principais classes e suas relações no sistema:

[Diagrama de Classes (PDF)](https://github.com/AzumaNoDoragon/Sepulcrum/blob/main/documentacao/Diagrama%20de%20Classes.pdf)

### Protótipo de Alta Fidelidade

Protótipo desenvolvido no Figma, representando a interface gráfica planejada para o sistema:

[Acessar Protótipo no Figma – Sepulcrum](https://www.figma.com/proto/A5obT1irJp1okvwqMJ6vkt/Sepulcrum?node-id=0-1&t=4ha3TvRyFWAvMtRV-1)

## ⚠️ Limitações

- Não possui autenticação de usuários
- Apenas um parente responsável por falecido
- Interface básica, sem responsividade

## Contribuições

Contribuições são bem-vindas! Para isso:

- Fork o projeto
- Crie uma branch: `feature/sua-feature`
- Faça commit das alterações
- Envie um pull request

**Nota:** Projeto acadêmico desenvolvido para fins de aprendizado.