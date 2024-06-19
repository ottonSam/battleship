Para facilitar o gerenciamento de dependências no projeto com JavaFX escolhemos utilizar o Maven
como ferramenta para automatizar a instalação e gerenciamento de bibliotecas. Para que o Maven
funcione corretamente em sua máquina é necessário que ele esteja previamente instalado. Caso não
Esteja siga um dos seguintes tutoriais
Windows: Apenas baixe o instalador em (https://maven.apache.org/download.cgi).
Ubuntu: siga o passo a passo (https://www.digitalocean.com/community/tutorials/install-maven-linux-ubuntu).

Compilando e executando o projeto
Compilação: Em seu terminal no diretório raiz do projeto execute o seguinte comando (mvn install)
Execução: Em seu terminal no diretório raiz do projeto execute o seguinte comando (mvn javafx:run)

Os arquivos .class e .fxml serão gerados no diretório /target, caso o diretório não exista ele será criado.