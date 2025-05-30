# Core Humans - Sistema de Gestão de Recursos Humanos

<br />

<div align="center">
   <img src="[https://via.placeholder.com/300x300.png?text=Core+Humans+Logo](https://media.discordapp.net/attachments/1357233138757009438/1377991596167008328/NxZeaOxSQA6INansPej2aA.png?ex=683afa2e&is=6839a8ae&hm=9f8a57c514b5d59bfbdae4039faf6ae936f068a3e604302b8589b32824a49fad&=&format=webp&quality=lossless&width=1010&height=1010)" title="Core Humans Logo Placeholder" width="300" height="300" /> 
</div>


<br />

## 📌 Descrição

*O Core Humans é uma plataforma integrada de Recursos Humanos, projetada para centralizar e otimizar a gestão de colaboradores, departamentos e usuários no sistema da sua organização.*

------

## 🚀 Sobre este Sistema

O Sistema Core Humans oferece um conjunto robusto de ferramentas para gerenciar colaboradores, departamentos e usuários do sistema. Com endpoints claros e seguros, o Core Humans simplifica as operações de cadastro e consulta de dados essenciais de RH.

### Principais Funcionalidades

1.  **Gestão de Colaboradores:** Cadastro, Leitura, Atualização e Exclusão (CRUD ) de dados de colaboradores.
2.  **Gestão de Departamentos:** Cadastro, Leitura, Atualização e Exclusão (CRUD) de dados de departamentos.
3.  **Gestão de Usuários:** Cadastro, Leitura e Atualização (CRUD) de usuários do sistema (para acesso e permissões).
4.  Associação de Colaboradores a Departamentos.

------

## 🧩 Diagrama de Classes (Simplificado)

```mermaid
classDiagram
direction LR

    class ColaboradorController {
        +CRUD operations for Colaborador
    }

    class DepartamentoController {
        +CRUD operations for Departamento
    }

    class UsuarioController {
        +CRUD operations for Usuario
    }

    class Colaborador {
        -Long id
        -BigDecimal salario "@NotNull @Positive"
        -String cargo "@NotBlank @Size(5-100)"
        -String nomeColaborador "@NotBlank @Size(5-100)"
        -LocalDate dataNascimento "@Past @JsonFormat(yyyy-MM-dd)"
        -Departamento departamento "@ManyToOne @JsonIgnoreProperties"
    }

    class Departamento {
        -Long id
        -String nome "@NotBlank @Size(5-100)"
        -BigDecimal orcamento "@NotNull @Positive"
        +List<Colaborador> colaborador "@OneToMany @JsonIgnoreProperties"
    }

    class Usuario {
        -Long id
        -String nome "@NotBlank"
        -String usuario "@NotBlank @Email (Login)"
        -String senha "@NotBlank @Size(min=8)"
        -String foto "@Size(max=5000)"
    }

    ColaboradorController ..> Colaborador
    DepartamentoController ..> Departamento
    UsuarioController ..> Usuario

    Colaborador "*" -- "1" Departamento : departamento
    Departamento "1" -- "*" Colaborador : colaborador

```

------

## 🗃️ Diagrama Entidade-Relacionamento (DER)

<div align="center">
  <img src="https://media.discordapp.net/attachments/1356053908119879819/1378014150676189275/image.png?ex=683b0f2f&is=6839bdaf&hm=8dc8ba45e4e00eabccc21894024be79d85803cc81a03501921f924fa3382d659&=&format=webp&quality=lossless" alt="Logo" width="300" height="300" />
</div>

------

## 🛠️ Tecnologias utilizadas

| Item                          | Descrição           |
| ----------------------------- | ------------------- |
| **Servidor**                  | Tomcat              |
| **Linguagem de programação**  | Java                |
| **Framework**                 | Spring              |
| **ORM**                       | JPA + Hibernate     |
| **Banco de dados Relacional** | MySQL               |

------

## 🧪 Configuração e Execução

1. Clone o repositório do Projeto [Projeto_02_Backend](https://github.com/Cavaleiros-Templarios/Projeto_02_Backend) dentro da pasta do *Workspace* do Eclipse/STS

```bash
git clone https://github.com/Cavaleiros-Templarios/Projeto_02_Backend
```a

2. **Abra o Eclipse/STS** e selecione a pasta do *Workspace* onde você clonou o repositório do projeto
3. No menu superior do Eclipse/STS, clique na opção: **File 🡲 Import...**
4. Na janela **Import**, selecione a opção: **General 🡲 Existing Projects into Workspace** e clique no botão **Next**
5. Na janela **Import Projects**, no item **Select root directory**, clique no botão **Browse...** e selecione a pasta do Workspace onde você clonou o repositório do projeto
6. O Eclipse/STS reconhecerá automaticamente o projeto
7. Marque o Projeto_01_Backend no item **Projects** e clique no botão **Finish** para concluir a importação


```
## 📬 Contato

Desenvolvido por:

- [**Wesley Lima**](https://github.com/Wezzlim)  
- [**Alex Ikezili**](https://github.com/alexikezili)  
- [**Gustavo Brassaroto Lira**](https://github.com/Brassaroto)  
- [**Cristiano Forner**](https://github.com/cristianoforner)  
- [**Fabricio Vicente Soares**](https://github.com/Fabriciovics)  
- [**Marcos Meneses**](https://github.com/MarcosvMeneses)  
- [**Pedro Henrique**](https://github.com/phccoelho)  
- [**Thiago Tasseli**](https://github.com/tasselii)  

Fique à vontade para tirar dúvidas, dar sugestões ou contribuir! 😄
