package chapter5

/**
 * Created by dschmitz on 30.12.14.
 */
object Ex5_2 extends App {

  class BankAccount(initial: Int) {

    private var myBalance = initial

    def deposit(value: Int) = myBalance += value

    def withdraw(value: Int) = {
      if (myBalance - value < 0)
        throw new IllegalArgumentException("Not sufficient funds")

      myBalance -= value
    }


    def balance = myBalance

    override def toString = "Account: " + balance
  }


  val ba = new BankAccount(1200)
  ba.deposit(100)
  ba.withdraw(100)

  //  ba.balance = 12

  println(ba.balance)
}
