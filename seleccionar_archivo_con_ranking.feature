@tag
Feature: seleccionar articulo con ranking
  como usuario web de la pagina de Falabella
  quiero seleccionar un producto con ranking
  para agregarlo a mis ordenes

  @tag1
  Scenario: articulo con ranking
    Given usuario ingreso a falabella
    When selecciona un articulo con rating
    Then verifica el articulo en mis ordenes