@FillFormAndValidateMessage
Feature: fill the form and validate the message

  @FillForm
  Scenario: Filling the form using my info
    Given that the user access to the page demoqa
    When the user fills the form

  Example:
  | fullName     | email                   | currentAddress | permanentAddress |
  | Jose Barrios | josegbarrios2@gmail.com | Monteria       | Monteria         |

    Then validates the message

  Example:
  | message           |
  | Name:Jose Barrios |








