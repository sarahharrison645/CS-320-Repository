package Module_6_Project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    @Test
    public void testAdd() {
        ContactService cs = new ContactService();
        Contact contact = new Contact("12345", "Sar", "Harrison", "7607101402", "123 Fake St");
        assertTrue(cs.addContact(contact));

        contact = new Contact("12345", "Sar", "Harrison", "7607101402", "123 Fake St");
        assertTrue(cs.addContact(contact));

        assertFalse(cs.addContact(contact));
    }

    @Test
    public void testRemove() {
        ContactService cs = new ContactService();
        Contact contact = new Contact("12345", "Sar", "Harrison", "7607101402", "123 Fake St");
        cs.addContact(contact);

        assertTrue(cs.deleteContact("12345"));
        assertTrue(cs.addContact(contact));
    }

    @Test
    public void testUpdate() {
        ContactService cs = new ContactService();
        Contact contact = new Contact("12345", "Sar", "Harrison", "7607101402", "123 Fake St");
        cs.addContact(contact);

        assertTrue(cs.updateContact("12345"));
        assertFalse(cs.updateContact(String.valueOf(contact)));
    }}
