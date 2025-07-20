## 📱 Diagrama UML - Classe Smartphone com Interfaces

Uml do iphone.

```mermaid
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(musica String)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(numero String)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(url String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class Smartphone {
        +tocar()
        +pausar()
        +selecionarMusica(musica String)
        +ligar(numero String)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(url String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    ReprodutorMusical <|.. Smartphone
    AparelhoTelefonico <|.. Smartphone
    NavegadorInternet <|.. Smartphone
