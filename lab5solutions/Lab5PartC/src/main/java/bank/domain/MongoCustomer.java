package bank.domain;

import javax.persistence.Id;

@Document
public class MongoCustomer {
    @Id
    private Long id;

    private String name;
}
