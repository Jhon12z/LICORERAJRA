# LICORERAJRA
# Introduccion


una aplicación que necesita un administrador de una licorera, el sistema de factura que lleve el nombre del local dirección nit  teléfono y razón social donde slogan red social se le debe especificar 
Aclaraciones:
• descripción producto precio cantidad y total para la realización de la factura


# Aproximación Plantilla Historia de Usuario:
![Historia Usuario](https://github.com/Jhon12z/LICORERAJRA/assets/133507283/d0935e93-8e87-4c20-bf0a-1ab0c22a8ecf)


# Aproximación Caso de Uso:
![Caso de uso](https://github.com/Jhon12z/LICORERAJRA/assets/133507283/d875138a-4077-4501-8082-8fde943364ac)
# Aproximación Diagrama de Flujo:


![Diagrama](https://github.com/Jhon12z/LICORERAJRA/assets/133507283/00ff249f-69da-4fd1-a367-68505db9e850)
#Aproximación Seudocódigo:



Algoritmo licorera
Definir precio,cantidad,total_compra,direccion,telefono Como Entero
Definir descripcion Como Caracter
Definir nombre Como Caracter
Escribir 'Ingrese el nombre del cliente:'
Leer nombre
Escribir 'Ingrese el telefono:'
Leer telefono
Escribir 'Ingrese la direccion):'
Leer direccion
Escribir 'Ingrese el articulo:'
Leer articulo
Escribir 'ingrese el precio:'
Leer precio
Escribir 'Ingrese la cantidad :'
Leer cantidad
total_compra <- precio*cantidad
Escribir 'Factura:'
Escribir 'Nombre del cliente: ',nombre
Escribir 'numero telefono: ',telefono
Escribir 'descripcion: ',articulo
Escribir 'Cantidad s: ',cantidad
Escribir 'Precio total de la compra: $',total_compra
FinAlgoritmo
