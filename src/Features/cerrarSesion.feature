		Feature: Cerrar sesion
		Background: El usuario ingresa al sistema con credenciales validas
        Given el usuario se encuentra en el inicio
        When ingresa al formulario de login
        And completa el formulario de login con datos validos
        Then el usuario se loguea correctamente
    Scenario: El usuario cierra sesion 
        Given el usuario se encuentra en el inicio logueado
        When el usuario cierra sesion
        Then el usuario es redirigido al inicio sin estar logueado