# Condições, Loops e Exceções na Prática com Java

## Desafios

### 1 / 5 - Operações Bancárias Simples com Switch

#### Descrição
Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

#### Entrada
O programa exibirá um menu com as seguintes opções:
- Depositar
- Sacar
- Consultar Saldo
- Encerrar

O usuário escolherá uma dessas opções digitando o número correspondente.

#### Saída
Utilizando um switch, o programa realizará a operação escolhida pelo usuário.

Se o usuário escolher:
- **1**: O programa solicitará o valor a ser depositado e atualizará o saldo. Além disso, deve imprimir o saldo atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}".
- **2**: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente. Sendo assim, deve imprimir "Saldo atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."
- **3**: O programa apenas exibirá o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".
- **0**: O programa encerrará, imprimindo "Programa encerrado.".

#### Exemplos
| Entrada  | Saída  |
|----------|--------|
| 1<br>50<br>2<br>100<br>0 | Saldo atual: 50.0<br>Saldo insuficiente.<br>Programa encerrado. |
| 3<br>1<br>550<br>0 | Saldo atual: 0.0<br>Saldo atual: 550.0<br>Programa encerrado. |
| 1<br>1000<br>2<br>500<br>0 | Saldo atual: 1000.0<br>Saldo atual: 500.0<br>Programa encerrado. |

### 2 / 5 - Verificação de Número de Conta Bancária

#### Descrição
Você está desenvolvendo um programa simples em Java para verificar se um número de conta bancária é válido. O número da conta deve ter exatamente 8 dígitos.

#### Entrada
O programa solicitará ao usuário que digite o número da conta bancária.

#### Saída
O programa utilizará um bloco try-catch para verificar se o número da conta possui exatamente 8 dígitos.
Se o número da conta tiver 8 dígitos, o programa informará que é um número válido.
Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por exemplo, IllegalArgumentException) e informará que o número da conta é inválido.

#### Exemplos
| Entrada  | Saída  |
|----------|--------|
| 01020304 | Numero de conta valido. |
| 1234568 | Erro: Numero de conta invalido. Digite exatamente 8 digitos. |
| 3231 | Erro: Numero de conta invalido. Digite exatamente 8 digitos. |

### 3 / 5 - Verificador de Idade para Conta Bancária

#### Descrição
Você está desenvolvendo um programa simples em Java para verificar se um cliente é elegível para criar uma conta bancária. A condição é que o cliente deve ter pelo menos 18 anos de idade.

#### Entrada
O programa solicitará ao usuário que digite sua idade.

#### Saída
Utilizando apenas um bloco if e else, o programa verificará se a idade do cliente é igual ou superior a 18 anos.
Se a idade for maior ou igual a 18, o programa informará que o cliente é elegível para criar uma conta bancária.
Se a idade for menor que 18, o programa informará que o cliente não é elegível para criar uma conta bancária.

#### Exemplos
| Entrada  | Saída  |
|----------|--------|
| 17 | Voce nao esta elegivel para criar uma conta bancaria. |
| 26 | Voce esta elegivel para criar uma conta bancaria. |
| 18 | Voce esta elegivel para criar uma conta bancaria. |

### 4 / 5 - Verificação de Cheque Especial

#### Descrição
Você está desenvolvendo um programa simples em Java para verificar se uma conta bancária ultrapassou o limite do cheque especial. A aplicação solicitará ao cliente que informe o saldo atual da conta bancária. Em seguida, o programa pedirá o valor de um saque que o cliente deseja realizar.

O limite do cheque especial será definido como 500 unidades monetárias.

#### Entrada
O programa solicitará ao usuário que informe o saldo atual da conta bancária.
Em seguida, o programa solicitará o valor de um saque que o cliente deseja realizar.

#### Saída
O programa deverá verificar se o saque ultrapassará o saldo disponível na conta.
Se o saque não ultrapassar o saldo, o programa informará que a transação foi realizada com sucesso.
Se o saque ultrapassar o saldo, o programa verificará se o valor do saque ultrapassa o cheque especial (definido como 500 unidades monetárias).
Se ultrapassar, o programa informará que a transação não pode ser realizada devido ao limite excedido.
Caso contrário, o programa informará que a transação foi realizada com sucesso, utilizando o cheque especial.

#### Exemplos
| Entrada  | Saída  |
|----------|--------|
| 1000<br>100 | Transação realizada com sucesso. |
| 2500<br>2750 | Transação realizada com sucesso utilizando o cheque especial. |
| 300<br>1500 | Transação não realizada. Limite do cheque especial excedido. |

### 5 / 5 - Controle de Saques

#### Descrição
Você está desenvolvendo um programa simples em Java para auxiliar um cliente a realizar saques de uma conta bancária. O cliente pode fazer saques até atingir um limite diário predefinido.

#### Entrada
O programa solicitará ao usuário que informe o limite diário de saque.
Em seguida, o programa solicitará ao usuário que informe o valor do primeiro saque.

#### Saída
Utilizando um laço for, o programa iterará sobre os saques.
Para cada saque, o programa verificará se o valor ultrapassa o limite diário.
Se ultrapassar, o programa informará que o limite foi atingido e encerrará o loop.
Se não ultrapassar, o programa informará que o saque foi realizado com sucesso.

#### Exemplos
| Entrada  | Saída  |
|----------|--------|
| 1500<br>430<br>0 | Saque realizado. Limite restante: 1070.0<br>Transacoes encerradas. |
| 500<br>1500 | Limite diario de saque atingido. Transacoes encerradas. |
| 80<br>40<br>0 | Saque realizado. Limite restante: 40.0<br>Transacoes encerradas. |

</body>
</html>
