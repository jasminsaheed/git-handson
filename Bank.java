class Bank
{static int amount,wamount,bal;
public static int deposit( int a)
{
amount=a;
return amount;}
public static int withdraw(int b)
{
wamount=b;
return wamount;}
public static void account()
{
bal=amount-wamount;

System.out.println(bal);
}
public static void main(String args[])
{
int p=Bank.deposit(6000);
System.out.println("deposit amount is" +p);
int q=Bank.withdraw(1000);
System.out.println("withdraw amount is" +q);
Bank.account();}}
