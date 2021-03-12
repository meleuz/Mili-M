# Задача №1 - Мили (модернизация)

## Легенда

Поскольку вы уже научились создавать классы и методы, вам необходимо модернизировать приложение для рассчёта миль.

Что для этого нужно:

1.Создайте класс BonusMilesService

2.Определите в нём метод calculate, который:

i.Принимает на вход один параметр: cost типа int

ii.Возвращает рассчитанное количество миль (тип - int)

Разместите следующий код в классе Main:


public class Main {
public static void main(String[] args) {
BonusMilesService service = new BonusMilesService();
int price = 10_000;
int miles = service.calculate(price);
System.out.println(miles);
}
}

Убедитесь, что выводимое в консоль значение соответствует результатам предыдущей версии приложения.

Напоминаем условия рассчёта:

Авиаперевозчики предлагают различные бонусные программы, начисляющие бесплатные мили за перелёты.

Формула следующая: за каждые 20 рублей, потраченные на билет, начисляется 1 миля.

Что вам нужно: создать базовое приложение, рассчитывающее количество начисленных мили за купленный билет.

Итого: у вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код.