package Module_6_Project;
	
	
	import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ContactTest {

    @Test
    @DisplayName("The contact object shall have a required unique contact ID string that cannot be longer than 10 characters.")
    void TestGetContactID() {
        Contact contact = new Contact("12345", "Sar", "Harrison", "7607101402", "123 Fake St");
        assertEquals(contact.getContactID(),"12345");
    }
    @Test
    @DisplayName("The first name object shall have a required first name string that cannot be longer than 10 characters.")
    void TestGetFirstName() {
        Contact contact = new Contact("12345", "Sar", "Johan", "7607101402", "123 Fake St");
        contact.setFirstName("Sar");
        assertEquals(contact.getFirstName(),"Sar");
    }
    @Test
    @DisplayName("The last name object shall have a required last name string that cannot be longer than 10 characters.")
    void getLastName() {
        Contact contact = new Contact("12345", "Sar", "Harrison", "7607101402", "123 Fake St");
        contact.setLastName("Harrison");
        assertEquals(contact.getLastName(),"Harrison");
    }

    @Test
    @DisplayName("The phone number object shall have a required phone number string that cannot be longer than 10 characters.")
    void getPhoneNumber() {
        Contact contact = new Contact("12345", "Sar", "Harrison", "7607101402", "123 Fake St");
        contact.setPhoneNumber("7607101402");
        assertEquals(contact.getPhoneNumber(),"7607101402");
    }
    @Test
    @DisplayName("The address object shall have a required address string that cannot be longer than 30 characters.")
    void getAddress() {
        Contact contact = new Contact("12345", "Sar", "Harrison", "7607101402", "123 Fake St");
        contact.setAddress("123 Fake St");
        assertEquals(contact.getAddress(),"123 Fake St");
    }
}