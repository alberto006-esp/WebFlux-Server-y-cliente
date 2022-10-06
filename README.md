# WebFlux-Server
RAMA CON EL SERVIDOR.

Analisis de Ejecución:

En el sevicio del servidor crearemos las personas que mandaremos al cliente añadiendoles un delay(tiempo que tardara en emitir el flujo) de entre 1 y 4 segundos por lo que tardara 10 segundos en pasar al cliente los cuatro flujos.

![image](https://user-images.githubusercontent.com/64962627/194370438-0a67132e-d31f-47ab-86d8-a667e1b8bf4c.png)

En el controlador del servidor recogeremos los flujos para que puedan ser recogidos por el cliente.

![image](https://user-images.githubusercontent.com/64962627/194374832-4c58018a-b33e-4ae7-bd97-aa4d26e02a39.png)

En el servicio del cliente, a través de WebClient.create, recibiremos los flujos de las personas creadas en el servidor y las uniremos en un solo flujo, para mostrarlas en la plantilla(personlist.html).
También usaremos el .subscribe para mostrar por consola los flujos unidos filtrados para que muestre solo las personas cuyo nombre empiece por "A".

![image](https://user-images.githubusercontent.com/64962627/194375431-7acd7971-0522-4b09-a4a5-e156be5febfb.png)

En el controlador del cliente recogeremos el flujo de personas unido y lo añadiremos a un modelo para poder mostrarlo en la plantilla a traves de thymeleaf.

![image](https://user-images.githubusercontent.com/64962627/194374429-cff1a3e9-0bed-44c7-8533-d1ca488ccd45.png)

Con el servidor y el cliente arrancados, al hacer una petición al cliente (http://localhost:8081/person-list) comprobaremos que efectivamente tarda un poco más de 10 segundos en mostrar la plantilla con las cuatro personas cargadas en el servidor, como indicamos en los servicios del servidor con el delay, con una variación de entre 0,6 y 0,9.

![image](https://user-images.githubusercontent.com/64962627/194364453-24782809-80db-4d3a-a922-920edb0a64b3.png)
![image](https://user-images.githubusercontent.com/64962627/194369385-422bdebc-f74e-40ad-9cdb-4ef6ff37785f.png)
![image](https://user-images.githubusercontent.com/64962627/194369752-b54ce77c-93a1-4496-ad00-1035593a5c59.png)
A la vez que se muestra en el navegador la plantilla por consola se mostraran las personas cuyo nombre empieza por "A".
![image](https://user-images.githubusercontent.com/64962627/194373708-fe1e8f46-f060-4a1f-9e6d-e714fdb5ec1e.png)



