Classes
Cidade
Uma classe que representa uma cidade, com os seguintes atributos:

codCid: int
nomeCid: String
Construtor padrão que inicia todos os campos como "" ou 0 e métodos getters e setters para cada atributo.

Endereco
Uma classe que representa um endereço, com os seguintes atributos:

rua: String
num: int
cidade: Cidade
Construtor padrão que inicia todos os campos como "" ou 0 e métodos getters e setters para cada atributo, incluindo um getter e um setter para o atributo cidade.

Proprietario
Uma classe que representa um proprietário, com os seguintes atributos:

cpf_Prop: int
nome_Prop: String
endereco: Endereco
Construtor padrão que inicia todos os campos como "" ou 0 e métodos getters e setters para cada atributo, incluindo um getter e um setter para o atributo endereco.

Imovel
Uma classe abstrata que representa um imóvel, com os seguintes atributos:

tipoMaterial: String
valorAluguel: int
endereco: Endereco
proprietario: Proprietario
Construtor padrão que inicia todos os campos como "" ou 0 e métodos getters e setters para cada atributo, incluindo um getter e um setter para o atributo endereco e proprietario.

Casa
Uma classe que representa uma casa, que herda da classe abstrata Imovel, com o seguinte atributo adicional:

numQuartos: int
Construtor padrão que inicia todos os campos como "" ou 0 e métodos getters e setters para cada atributo.

Apartamento
Uma classe que representa um apartamento, que herda da classe abstrata Imovel, com os seguintes atributos adicionais:

nomeEdificio: String
areaInterna: int
Construtor padrão que inicia todos os campos como "" ou 0 e métodos getters e setters para cada atributo.

Locacao
Uma classe que representa uma locação, com os seguintes atributos:

imovel: Imovel
mesesContrato: int
valorMensal: int
Construtor padrão que inicia todos os campos como "" ou 0 e métodos getters e setters para cada atributo, incluindo um getter e um setter para o atributo imovel.

Leitura
Uma classe estática que contém um método estático inData(String) que recebe uma descrição, recebe um input via terminal e retorna esse input em formato de string.

Documentação
A documentação para cada classe pode ser encontrada nos comentários dentro do código-fonte.