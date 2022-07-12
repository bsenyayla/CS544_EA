package accounts.repository;

import accounts.domain.Account;
import accounts.repositories.AccountRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountsRepositoryTests {
    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void whenFindByAccountHolder_thenReturnAccount() {
        Account nn=new Account("001", 11.22, "acc_holder");
        testEntityManager.persist(nn);
        testEntityManager.flush();

        Account found=accountRepository.findByAccountHolder("acc_holder");
        assertThat(found.getAccountHolder())
                .isEqualTo(nn.getAccountHolder());
    }


    //AccountRepository



}
