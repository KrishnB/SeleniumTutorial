  Feature:
  Student profile need to create after entering all details.

  Background:
    Given the front desk user in student registration page.

  Scenario:
    When user to register students
    And by giving "First_Name"
    And by giving "Last_Name"
    And by selecting "Gender"
    And by giving "Date_of_Birth"
    And by giving "Father_Name"
    And by giving "Mother_Name"
    And by selecting "School"
    And by selecting "Class"
    And by giving "Section"
    And by giving "Roll_No"
    And by giving "Student_Address"
    And by giving "Phone_Number"
    And by giving "Email"
    And by giving "Insurance_ID"
    And by selecting "Blood_Group"

    Then submit the registration

    Examples:
    |First_Name| |Last_Name| |Gender| |Date_of_Birth| |Father_Name| |Mother_Name| |School       | |Class| |Section| |Roll_No| |Student_Address| |Phone_Numebr| |Email              | |Insurance_Id| |Blood_Group|
    |Arun      | |Kumars   | |Male  | |05/07/2005   | |Sreedharan | |Manjula    | |little Hearts| |2    | |A      | |AS10056| |303,Kphb,Hyd   | |9515101914  | |1919arunk@gmail.com|