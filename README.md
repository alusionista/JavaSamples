# Real Estate Management System

Este projeto consiste em um sistema de gerenciamento imobiliário que permite a representação de cidades, endereços, proprietários, imóveis e locações. O sistema é implementado em Java e utiliza classes para representar os diferentes elementos do domínio.

## Classes

### Cidade

Uma classe que representa uma cidade, com os seguintes atributos:

- `codCid`: int
- `nomeCid`: String

A classe possui um construtor padrão que inicializa todos os campos como `""` ou `0` e métodos getters e setters para cada atributo.

### Endereco

Uma classe que representa um endereço, com os seguintes atributos:

- `rua`: String
- `num`: int
- `cidade`: Cidade

A classe possui um construtor padrão que inicializa todos os campos como `""` ou `0` e métodos getters e setters para cada atributo, incluindo um getter e um setter para o atributo `cidade`.

### Proprietario

Uma classe que representa um proprietário, com os seguintes atributos:

- `cpf_Prop`: int
- `nome_Prop`: String
- `endereco`: Endereco

A classe possui um construtor padrão que inicializa todos os campos como `""` ou `0` e métodos getters e setters para cada atributo, incluindo um getter e um setter para o atributo `endereco`.

### Imovel

Uma classe abstrata que representa um imóvel, com os seguintes atributos:

- `tipoMaterial`: String
- `valorAluguel`: int
- `endereco`: Endereco
- `proprietario`: Proprietario

A classe possui um construtor padrão que inicializa todos os campos como `""` ou `0` e métodos getters e setters para cada atributo, incluindo um getter e um setter para os atributos `endereco` e `proprietario`.

### Casa

Uma classe que representa uma casa, que herda da classe abstrata Imovel, com o seguinte atributo adicional:

- `numQuartos`: int

A classe possui um construtor padrão que inicializa todos os campos como `""` ou `0` e métodos getters e setters para cada atributo.

### Apartamento

Uma classe que representa um apartamento, que herda da classe abstrata Imovel, com os seguintes atributos adicionais:

- `nomeEdificio`: String
- `areaInterna`: int

A classe possui um construtor padrão que inicializa todos os campos como `""` ou `0` e métodos getters e setters para cada atributo.

### Locacao

Uma classe que representa uma locação, com os seguintes atributos:

- `imovel`: Imovel
- `mesesContrato`: int
- `valorMensal`: int

A classe possui um construtor padrão que inicializa todos os campos como `""` ou `0` e métodos getters e setters para cada atributo, incluindo um getter e um setter para o atributo `imovel`.

### Leitura

Uma classe estática que contém um método estático `inData(String)` que recebe uma descrição, recebe um input via terminal e retorna esse input em formato de string.

## Documentação

A documentação para cada classe pode ser encontrada nos comentários dentro do código-fonte.

## Como usar

1. Clone o repositório:

   ```shell
   git clone https://github.com/seu-usuario/real-estate-management.git
   ```

2. Acesse o diretório do projeto:

   ```shell
   cd real-estate-management
   ```

3. Compile e execute o código:

   ```shell
   javac Main.java
   java Main
   ```

   Certifique-se de ter o JDK configurado corretamente no seu sistema.

4. Siga as instruções fornecidas pelo programa para interagir com o sistema de gerenciamento imobiliário.

Certifique-se de ajustar o código para atender aos requisitos e às necessidades específicas do seu sistema de gerenciamento imobiliário.

Espero que isso ajude!
