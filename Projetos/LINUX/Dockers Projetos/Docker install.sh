#! .bin/bash
echo "removendo itens anteriores ...."
sudo apt-get remove docker docker-engine docker.io
echo "Atualizar Sys ....."
sudo apt-get update
echo "Intalando DOCKER ....."
sudo apt install docker.io
sudo snap install docker
echo "Verificando versao do aplicativo ...."
docker --version
echo "Teste de versao do aplicativo ...."
sudo docker run hello-world
sudo docker images
sudo docker ps -a
sudo docker ps