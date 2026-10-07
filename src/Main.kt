//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Для входа в приложение решите задачу - 2 + 2 = ?")
    val number = readln().toInt()
    if (number == 4) println("Доступ разрешён")
    else println("доступ запрещен")

}