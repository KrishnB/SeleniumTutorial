Feature: User Login
  Verifying if different users can login.

   Scenario Outline: A user with valid credentials should login successfully
    Given I am on Loginpage
    When  On Loginpage I enter login credentials as <user_type>
    Then  On Homepage I should receive a welcome message
    Examples:
    | user_type     |
    | student       |
    | frontdesk     |
    | admin         |
    | labstaff      |
    | schoolstaff   |

