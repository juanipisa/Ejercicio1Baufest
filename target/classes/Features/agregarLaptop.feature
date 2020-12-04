Feature: Agregar laptop al carrito

    Background: El usuario ingresa al sistema con credenciales validas
        Given el usuario se encuentra en el inicio
        When ingresa al formulario de login
        And completa el formulario de login con datos validos
        Then el usuario se loguea correctamente
    
    Scenario: El usuario agrega una laptop al carrito de compras
        Given el usuario se encuentra en el inicio logueado
        When selecciona un producto laptop del catalogo
        And el usuario visualiza la informacion del producto
        And selecciona el texto agregar al carro
        Then aparece alerta para informar que se agrego el producto

		Scenario: Comprobar laptop en carrito
        Given el usuario se encuentra en el inicio logueado
        When ingresa al carrito
        Then aparece el producto seleccionado en el carrito