# Payment analytics API



> API REST de pagos hecha con Spring Boot  con funcionalidades de analisis y estadísticas de venta. El API Tiene persistencia en MongoDb


 


## Usage
El API contiene 2 CRUD completos tanto para tickets como para productos. Las devoluciones correctas se hacen en formato JSON.



## API/Component
Endpoint "/ticket" contiene el CRUD. Tambien dos metodos extras "/ticket/product"para añadir un producto al ticket y "/ticket/analytics" para recibir el analisis de los pagos totales.

Endpoint "/tickets" para recibir el total de tickets.

Endpoint "/product" contiene el CRUD de productos.

Endpoint "/products para obtener una lista de todos los productos"

Se ha implementado un modelo  MVC donde el controller recibe las peticiones https, la capa service aplica la logica de negoció y los DAO se encargan de la persistencia.
En la carpeta collection en contramos las colleciones de MongoDb y los enum.
En el caso de recibir una petición con un enum incorrecto, se devuelve una respuessta 400

## Installation

Para intalarla basta con hacer un clon de el repositorio:


```shell
    
    git  clone https://github.com/alopezviv/Jump2Digital.git
```



## License 

Copyright 2021 @alopezviv

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

