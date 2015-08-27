package list13_03;

@SuppressWarnings("serial")     /* SerialVersionUIDに関する警告を出さない */
public class NewAccount extends Account {
    @Override                   /* このメソッドは、オーバーライドを行う */
    public int transfer(Bank bank, Account dest, int amount) {
        /* : */
        return 0;
    }
    @Deprecated                 /* このメソッドは、非推奨 */
    public void transfer(Account dest, int amount) {
        /* : */
    }
}