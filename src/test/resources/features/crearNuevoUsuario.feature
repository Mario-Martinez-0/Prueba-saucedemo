#language: es

@Historia
Característica: Iniciar sesion en la pagina saucedemo
  realiza la compra de una articulo en la tienda

  Esquema del escenario: Iniciar sesion
    Dado que el usuario ya esta registrado
    Cuando ingresemos el usuario y la contrasena le damos click al boton Login, elegimos un producto prosedemos a realizar la compra del mismo
      | <usuario> | <contrasena> | <nombre> | <apellido> | <codigopostal> |
    Entonces El usuario debera ver en la pantallan THANK YOU FOR YOUR
      | <validarInicio> |
    Ejemplos:
      | usuario | contrasena | nombre | apellido | codigopostal | validarInicio |
      | standard_user | secret_sauce | jacobo | reyes| 050016 | THANK YOU FOR YOUR ORDER |
