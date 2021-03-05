#language: en
#autora:yop
@Cucumber
Feature: enter to phptravels Page
  As user web
  I want to login to phptravels Page
  to create a blog


  Scenario:aggregate blog
    Given que Moni desea loguear en la pagina php travels
    When ella se loguea, agrega una categoría y comprueba que lo agregó
    Then ella vuelve a ingresar al menú y crea un post en la categoria anteriormente creada