### Solução final e um melhor arquivo README estão na branch 'docker'

**Instituto Federal de Educação, Ciência e Tecnologia da Paraíba**

**Campus Cajazeiras**

**Curso Superior de Tecnologia em Análise e Desenvolvimento de Sistemas**

**Programação Orientada a Serviços**

**Professor: Ricardo de Sousa Job**

<h3 align="center">
  Atividade Avaliativa - WebServices SOAP
</h3>

Implemente uma aplicação que dispõem quatro microservices: **hotel**, **passagem**, **agência** e **clientes**.

No serviço de **clientes** deve ser implementado um serviço que mantém um cadastro compartilhado de cliente. Cada entidade cliente deve possuir um identificador, nome, cpf e renda. O serviço deve disponibilizar uma forma de acesso aos dados da entidade cliente. Este serviço será utilizado para realizar as reservas nos demais serviços.

Nos demais serviços deve ser possível realizar uma reserva para um cliente. Os serviços devem possuir no mínimo duas entidades e não deve persistir uma entidade cliente. Deve ser possível, em todos os serviços, realizar as operações de CRUD das entidades.

No serviço de **agência** deve fornecer um recurso que permite solicitar um pacote. O pacote deve possuir uma passagem e uma reserva em um hotel.


**Observações:**

Forma de entrega: um repositório na [organization](https://github.com/ifpb-disciplinas-2016-2).

O projeto deve ser **implantado com o Docker** e deve conter **um roteiro** de como realizar a implantação da aplicação.

Após a implementação, **encaminhar** um email com o link do repositório para o email sousajob@gmail.com.
Prazo para entrega: **08 de maio de 2017, às 23h**.

<hr/>


#### ROTEIRO PARA IMPLANTAR E UTILIZAR A APLICAÇÃO


1. Certifique-se que o seu serviço **Docker** esteja iniciado.

2. Certifique-se que não há outros serviços rodando na porta 8080;

3. No terminal de linha de comando, execute `docker network create cliente_default_ntw`. Este comando é necessário para criarmos a rede docker que será usada para comunicação entre os containers da aplicação e do banco de dados.



Os endpoints dos recursos estão disponíveis em:

| Recurso | URI |
|----|-----|
| Cliente | http://localhost:8080/ativ2-soap-server/ClienteResourcesService?wsdl |
| Hotel | http://localhost:8080/ativ2-soap-server/HotelResourcesService?wsdl |
| Reseva de Hotel | http://localhost:8080/ativ2-soap-server/ReservaHotelResourcesService?wsdl |
| Empresas de Passagens | http://localhost:8080/ativ2-soap-server/EmpresaResourcesService?wsdl |
| Reseva de Passagem | http://localhost:8080/ativ2-soap-server/ReservaPassagemResourcesService?wsdl |
| Pacotes da Agência | http://localhost:8080/ativ2-soap-server/PacoteResourcesService?wsdl |



<hr>

### Sobre o projeto:

- Como repassado em sala de aula, o projeto tem como objetivo avaliar a aprendizagem sobre a tecnologia SOAP (Simple Object Access Protocol).

- Como forma de demosntração da uso de SOAP, criamos uma classe `Main` no módulo `ativ2-soap-cliente` que realiza a persistência de um cliente, hotel, reserva de hotel, empresa de passagem, passagem e pacote - usando o referido protocolo.

- O módulo cliente utiliza o plugin `org.jvnet.jax-ws-commons / jaxws-maven-plugin` para realizar a geração das classes locais com base nos arquivos WSDL disponibilizado pela aplicação SOAP provida pelo módulo `ativ2-soap-server`. Para mais detalhes, ver `pom.xml` de `ativ2-soap-cliente`, observando os goals ***wsimport*** nas execuções do plugin.
