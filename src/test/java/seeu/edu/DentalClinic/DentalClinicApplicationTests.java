package seeu.edu.DentalClinic;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import seeu.edu.DentalClinic.pojo.entity.Dentist;
import seeu.edu.DentalClinic.repository.DentistRepository;


@SpringBootTest
public class DentalClinicApplicationTests {

    @Autowired
    private DentistRepository dentistRepository;




    @Test
    @Order(1)
    public void testInsertDentist() {
        Dentist dentist = new Dentist(7, "Nuhi", 776634521);
        dentistRepository.save(dentist);
       assertNotNull(dentistRepository.findDentistByDentistId(7));
    }


    @Test
    @Order(2)
    public void testDentistAttribute() {
        Dentist dentist = dentistRepository.findDentistByDentistId(7);
        assertEquals("Nuhi", dentist.getDentist_name());
    }

    @Test
    @Order(3)
    public void testDentistUpdate() {
        Dentist dentist = dentistRepository.findDentistByDentistId(7);
        dentist.setDentist_name("Anisa");
        dentistRepository.save(dentist);
        assertNotEquals("Nuhi", dentistRepository.findDentistByDentistId(7).getDentist_name());
    }

    @Test
    @Order(4)
    public void testDeleteDentist() {
        Dentist dentist = dentistRepository.findDentistByDentistId(7);
        dentistRepository.delete(dentist);
        assertNull(dentistRepository.findDentistByDentistId(7));
    }



}
