Para que tu README sea profesional y tu profesor vea que entiendes todo lo que has hecho, te sugiero estructurarlo de la siguiente manera. Puedes copiar y pegar este contenido directamente en el editor de GitHub:

Proyecto de Automatización: SauceDemo 🧪
Este proyecto consiste en la automatización del proceso de Login de la página web SauceDemo utilizando herramientas profesionales de testing.

🚀 Herramientas Utilizadas
Lenguaje: Java

Framework de Testing: JUnit 5

Herramienta de Automatización: Selenium WebDriver

Gestor de Dependencias: Maven

🏗️ Arquitectura: Page Object Model (POM)
Para este proyecto he aplicado el patrón de diseño POM, dividiendo el código en dos partes:

LoginPage.java: Contiene los "locators" (IDs de los elementos) y las acciones que se pueden realizar en la página (escribir usuario, contraseña y clicar).

LoginTest.java: Contiene los casos de prueba y las validaciones (assertions).

🧪 Casos de Prueba Automatizados
El sistema cuenta con dos pruebas principales:

Login Correcto: Verifica que un usuario válido (standard_user) puede acceder y llegar a la página de inventario.

Login Incorrecto: Verifica que al introducir una contraseña errónea, el sistema muestra un mensaje de error visual.

🛠️ Cómo ejecutar los tests
Clonar el repositorio.

Abrir el proyecto en un IDE (como IntelliJ IDEA).

Recargar las dependencias de Maven para descargar Selenium y JUnit.

Ejecutar la clase LoginTest.java haciendo clic en el botón verde de "Run".

💡 Notas sobre la ejecución
Se han añadido pausas de 2 segundos (Thread.sleep(2000)) entre acciones para facilitar la observación de la ejecución automática.

El navegador se cierra automáticamente al finalizar cada test gracias a la anotación @AfterEach.
