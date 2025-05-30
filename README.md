# Core Humans - Sistema de Gestão de Recursos Humanos

<br />

<div align="center">
  <img src="https://ik.imagekit.io/gekut9ghjx/Logo.webp" alt="Logo" width="300" height="300" />
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
direction TB
    class ColaboradorRepository {
	    +findAllByNomeColaboradorContainingIgnoreCase(String nomeColaborador)
    }
    class DepartamentoRepository {
	    +findAllByNomeContainingIgnoreCase(String nome)
    }
    class UsuarioRepository {
	    +findAllByUsuarioContainingIgnoreCase(String usuario)
    }

    class Colaborador {
    -Long id  
    -BigDecimal salario  
    -String cargo  
    -String nomeColaborador  
    -LocalDate dataNascimento  
    -Departamento departamento  

    +getId() : Long  
    +setId(Long id) : void  

    +getSalario() : BigDecimal  
    +setSalario(BigDecimal salario) : void  

    +getCargo() : String  
    +setCargo(String cargo) : void  

    +getNomeColaborador() : String  
    +setNomeColaborador(String nomeColaborador) : void  

    +getDataNascimento() : LocalDate  
    +setDataNascimento(LocalDate dataNascimento) : void  

    +getDepartamento() : Departamento  
    +setDepartamento(Departamento departamento) : void  
    }

    class Departamento {
    -Long id
    -String nome
    -BigDecimal orcamento
    -List<Colaborador> colaborador

    +getId() : Long
    +setId(Long id) : void

    +getNome() : String
    +setNome(String nome) : void

    +getOrcamento() : BigDecimal
    +setOrcamento(BigDecimal orcamento) : void

    +getColaborador() : List<Colaborador>
    +setColaborador(List<Colaborador> colaborador) : void
    }

    class Usuario {
    -Long id
    -String nome
    -String usuario
    -String senha
    -String foto

    +getId() : Long
    +setId(Long id) : void

    +getNome() : String
    +setNome(String nome) : void

    +getUsuario() : String
    +setUsuario(String usuario) : void

    +getSenha() : String
    +setSenha(String senha) : void

    +getFoto() : String
    +setFoto(String foto) : void
    }

    class ColaboradorController {
    +getAll()
    +getById(Long id)
    +getAllByNome(String nome)
    +post(Colaborador colaborador)
    +put(Colaborador colaborador)
    +delete(Long id)
    }

    class DepartamentoController {
    +getAll()
    +getById(Long id)
    +getAllByNome(String nome)
    +post(Departamento departamento)
    +put(Departamento departamento)
    +delete(Long id)
    }

    class UsuarioController {
    +getAll()
    +getById(Long id)
    +getAllByUsuario(String usuario)
    +cadastrarUsuario(Usuario usuario)
    +atualizarUsuario(Usuario usuario)
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
