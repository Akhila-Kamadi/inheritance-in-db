package akidev.me.inheritanceindb;

import akidev.me.inheritanceindb.joinedtable.JT_Mentor;
import akidev.me.inheritanceindb.joinedtable.JT_User;
import akidev.me.inheritanceindb.joinedtable.repository.JTMentorRepository;
import akidev.me.inheritanceindb.joinedtable.repository.JTUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InheritanceInDbApplicationTests {

    @Autowired
    private JTMentorRepository mentorRepository;
    @Autowired
    private JTUserRepository userRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testDifferentInheritances(){
        JT_User user = new JT_User();
        user.setEmail("akhila@gmail.com");
        user.setName("akhila");
        user.setPassword("password");
        userRepository.save(user);

        JT_Mentor mentor = new JT_Mentor();
        mentor.setEmail("kamadi@gmail.com");
        mentor.setName("kamadi");
        mentor.setPassword("pswrd");
        mentor.setNumberOfMentees(4);
        mentor.setNumberOfSessions(10);
        mentorRepository.save(mentor);
    }
}
