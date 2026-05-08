package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    //Should Set Valid Time
    void TestPunchIn_shouldSetValidTime() {
        //Arrange
        Employee employee = new Employee();

        //Act
        int actualValue = employee.punchIn(2);

        //Assert
        Assertions.assertEquals(actualValue,employee.getTimeIn());
    }

    @Test
    //Should Not allow negative numbers less than 0
    void TestPunchIn_shouldRejectNegativeNumber() {
        //Arrange
        Employee employee = new Employee();

        //Act
        int actualValue = employee.punchIn(-22);

        //Assert
        Assertions.assertEquals(0,employee.getTimeIn());

    }

    @Test
    //Testing for input greater than 24 hour military time
    void TestPunchIn_shouldRejectIfGreaterThan24() {
        //Arrange
        Employee employee = new Employee();

        //Act
        int actualValue = employee.punchIn(26);

        //Assert
        Assertions.assertEquals(0,employee.getTimeIn());
    }

    @Test
    void TestPunchOut_shouldSetValidTime() {
        //Arrange
        Employee employee = new Employee();

        //Act
        int actualValue = employee.punchIn(2);

        //Assert
        Assertions.assertEquals(actualValue,employee.getTimeIn());
    }

    @Test
    void TestPunchOut_shouldRejectNegativeNumber() {
        //Arrange
        Employee employee = new Employee();

        //Act
        int actualValue = employee.punchIn(26);

        //Assert
        Assertions.assertEquals(0,employee.getTimeIn());
    }

    @Test
    void TestPunchOut_shouldRejectIfGreaterThan24() {
        //Arrange
        Employee employee = new Employee();

        //Act
        int actualValue = employee.punchIn(26);

        //Assert
        Assertions.assertEquals(0,employee.getTimeIn());
    }
}