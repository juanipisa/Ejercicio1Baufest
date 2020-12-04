Feature: Inicio de sesion

    Scenario: El usuario ingresa al sistema con credenciales validas
        Given el usuario se encuentra en el inicio
        When ingresa al formulario de login
        And completa el formulario de login con datos validos
        Then el usuario se loguea correctamente
