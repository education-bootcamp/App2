import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private long accountId;
    private String type;

    //==============
    @OneToOne
    @Column(name = "customer_id")
    private Customer customer;

    public Account() {
    }

    public Account(long accountId, String type) {
        this.setAccountId(accountId);
        this.setType(type);
    }


    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
