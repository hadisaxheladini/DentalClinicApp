package seeu.edu.DentalClinic.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import seeu.edu.DentalClinic.service.DefaultDentistService;
import seeu.edu.DentalClinic.service.DefaultPatientService;
import seeu.edu.DentalClinic.service.DentistService;
import seeu.edu.DentalClinic.service.PatientService;

@Configuration
public class ServicesAutoConfiguration {

    @Bean
    public DentistService dentistService() {
        return new DefaultDentistService();
    }

    @Bean
    public PatientService patientService() {
        return new DefaultPatientService();
    }
}

