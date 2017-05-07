# PARANDO CONTAINERS
docker-compose down

# REMOVENDO IMAGENS
docker rmi -f natarajan/soap-db
docker rmi -f natarajan/soap-server

# REMOVENDO VOLUMES
docker volume remove ativ2soapserver_postgres-volume-soap
