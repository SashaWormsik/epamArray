1 часть
[Java_0_Task1(10)_Array2021 (2).pdf](https://github.com/SashaWormsik/epamArray/files/8149068/Java_0_Task1.10._Array2021.2.pdf)
2 часть 
[Java_0_Task1(10)_Array2022_ch2.pdf](https://github.com/SashaWormsik/epamArray/files/8190293/Java_0_Task1.10._Array2022_ch2.pdf)


First Task Array
Разработать приложение согласно требованиям, приведенным ниже. В 
приложении должна быть реализована функциональность, определенная 
заданием. 

Requirements
➢ Разработать entity-класс, например: «класс Массив»
➢ Entity-класс не следует наполнять методами, выполняющими функциональные действия 
(методами бизнес-логики, такими как вычисление, поиск и т.д.).
➢ Все классы приложения должны быть структурированы по пакетам (package).
➢ Оформление кода должно соответствовать Java Code Convention.
➢ Для записи логов использовать Log4J2
➢ Разработать тесты на TestNG.
➢ Решение задания хранить на Github.
➢ Методы класса Objects использовать запрещено.
➢ Изучить appendix 1

part 1
➢ Создать класс Массив.
➢ Разработать service-классы реализующие функциональности: 
• поиск min\max значения массива, 
• замену элементов массива по условию, 
• определение среднего значения элементов массива, 
• определение суммы элементов массива,
• определение числа положительных\отрицательных элементов массива.

part 2
➢ Сортировка массива тремя различными алгоритмами.
➢ Параметры, необходимые для создания массивов, получить чтением информации из файла 
(.txt). Часть данных должна быть некорректной. Файл данных должен находиться в 
отдельном каталоге.
➢ Для чтения из файла можно использовать методы, появившиеся в Java8.
➢ Использовать собственные классы исключительных ситуаций.
➢ Разработать validation-классы для валидации исходных данных при создании массивов.
Например: 
Корректная строка в файле для создания массива: «1, 2, 3» или «1 – 2 - 3» или « » или «3 4 7»;
Некорректные данные в строке файла для создания массива: «1z1 21 32» и т п. 
Возможный вид файла (могут присутствовать пустые строки):
1; 2; 3
1; 2; x3; 6
11; 2

part 3
Решить задачи, поставленные в part 1 и 2, с помощью StreamAPI (IntStream, DoubleStream etc.).

PART 2
  Класс, содержащий массив, должен обьявлять поле id или name.
➢ Все созданные объекты массивов сохранить в объекте-репозитории. Паттерн Repository.
➢ Разработать спецификации по поиску объектов и групп объектов в репозитории. По ID(по 
имени) по элементам, например: найти все массивы, сумма(среднее значение, max, min,
количество) элементов которых больше\меньше\равно заданного.
➢ Разработать методы по добавлению, удалению объектов репозитория.
➢ Разработать методы сортировки наборов объектов по ID, по имени, по первому элементу, 
по числу элементов и т д. Использовать интерфейс Comparator.
➢ Средние значения, sum, max и min значения должны храниться в объекте классаWarehouse. 
➢ Любое изменение любого элемента массива в репозитории должно вызывать пересчет 
соответствующих значений в классе Warehouse. 
➢ Для решения данной задачи использовать паттерны Observer и Singleton (для warehouse и 
repository; потокобезопасные варианты использовать запрещено).
