# REST API

  > [!NOTE]
  > REST: Representational State Transfer, é um modelo utilizado para se projetar arquiteturas de software distruibuído, que tem como base comunicação via rede. 

  > [!NOTE]
  > API: Application Programming Interface, é um conjunto de regras que definem como aplicativos podem se conectar e comunicar.

  Foi adotado como o modelo a ser utilizado na evolução da arquitetura __HTTP__ (Hypertext Transfer Protocol). Pode ser utilizado para a implementação de Web Services, que é uma solução utilizada para integrar sistemas e aplicações diferentes.

### Recursos

  O centro da maioria das aplicações é o gerenciamento de informações, esses dados/objetos gerenciado são chamados de **recursos** quando se trata de REST.

  Um recurso é uma abstração sobre as informações da aplicação, cada um desse deve possuir identificação única, uma vez que essa é a maneira que se determina como os recursos serão manipulados a depender da situação.

  O recurso é identificado utilizando o conceito de __URI__ (Uniform Resource Identifier). 

### Utilizaçao de métodos HTTP

  Além de informar qual a URI deverá ser utilizada também é necessário enviar o tipo de manipulação que deseja realizar no recurso, isso é feito utilizando os métodos do protocólo __HTTP__, destacados a seguir:

  - GET: Obter os dados de um recurso.

  - POST: Criar um novo recurso.

  - PUT: Substituir os dados de um determinado recurso.

  - PATCH: Atualizar parcialmente um determinado recurso.

  - DELETE: Excluir um determinado recurso.

  - HEAD: Similar ao GET, mas utilizado apenas para se obter os cabeçalhos de resposta, sem os dados em si.

  - OPTIONS: Obter quais manipulações podem ser realizadas em um determinado recurso.

  Geralmente os métodos mais utilizados são GET, POST, PUT e DELETE.

### Representação dos recursos

  Os recursos estão armazenados na aplicação que os gerencia (geralmente o servidor) e quando são solicitados do lado cliente eles precisam ser transferido de alguma forma. Para isso há vários formatos:

  - XML, JSON, HTML, etc

### Utilização dos códigos HTTP

  Toda requisição feita ao servidor deve resultar em uma resposta, e nela há um código __HTTTP__, utilizado para informar o status da requisição. Os mais comuns e quando utilizá-los são:

  - 200 **OK**. Em requisições GET, PUT e DELETE executadas com sucesso.
  - 201 **Created**. Em requisições POST, quando um novo recurso é criado com sucesso.
  - 400 **Bad Request**. Em requisições cujas informações enviadas pelo cliente sejam invalidas.
  - 404 **Not Found**. Em requisições cuja URI de um determinado recurso seja inválida.
  - 500 **Internal Server Error**. Em requisições onde um erro tenha ocorrido no servidor. 

### Desacoplamento do cliente-servidor.

  No projeto da API  de REST, os aplicativos cliente e servidor devem ser independentes um do outro. A única informação que o aplicativo cliente deve receber é o URI do recurso solicitado. Um aplicativo do servidor não deve modificar o aplicativo cliente, exceto para transferi-los aos dados solicitados via HTTP.

### Armazenamento em cache

  Quando possível, os recursos devem ser armazenados em cache pelo cliente ou servidor. O objetivo é melhorar o desempenho do cliente, além de aumentar a escalabilidade do servidor.

Referências: 
> [https://www.ibm.com/br-pt/topics/rest-apis]
> [https://www.alura.com.br/artigos/rest-principios-e-boas-praticas?utm_term=&utm_campaign=%5BSearch%5D+%5BPerformance%5D+-+Dynamic+Search+Ads+-+Artigos+e+Conte%C3%BAdos&utm_source=adwords&utm_medium=ppc&hsa_acc=7964138385&hsa_cam=11384329873&hsa_grp=111087461203&hsa_ad=687448474447&hsa_src=g&hsa_tgt=aud-1637623685278:dsa-2276348409543&hsa_kw=&hsa_mt=&hsa_net=adwords&hsa_ver=3&gad_source=1&gclid=CjwKCAjwnv-vBhBdEiwABCYQA33IGHliB3uYA908M49USlgj8dwTGWUS-FfqarX6-v6F_lROiypbfhoCl9wQAvD_BwE]
> [https://www.redhat.com/pt-br/topics/api/what-is-a-rest-api]







