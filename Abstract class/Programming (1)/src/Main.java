

interface AccountService {

  abstract Account findAccountByOwnerId(long id);

  abstract long countAccountsWithBalanceGreaterThan(long value);
}

class AccountServiceImpl implements AccountService{
  private Account[] accounts;

  public AccountServiceImpl(Account[] arr ){
    this.accounts = arr;
  }
  private User own;
  @Override
  public Account findAccountByOwnerId(long id){
    Account X = null;
    for (Account acc: accounts) {
      own = acc.getOwner();
      if (own.getId() == id) {
        X = acc;
        break;
      }
    }
    if (X != null) {
      return X;
    } else { return null; }
  }

  @Override
  public long countAccountsWithBalanceGreaterThan(long value){
    long sum = 0L;
    long count = 0L;
    for (Account acc: accounts ) {
      sum = acc.getBalance();
      if (sum > value) {
        count++;
      }
    }
    return count;
  }
}

class Account {

  private long id;
  private long balance;
  private User owner;

  public Account(long id, long balance, User owner) {
    this.id = id;
    this.balance = balance;
    this.owner = owner;
  }

  public long getId() { return id; }

  public long getBalance() { return balance; }

  public User getOwner() { return owner; }
}

class User {

  private long id;
  private String firstName;
  private String lastName;

  public User(long id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public long getId() { return id; }

  public String getFirstName() { return firstName; }

  public String getLastName() { return lastName; }
}