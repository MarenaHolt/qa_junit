package guru.qa;

import org.junit.jupiter.api.*;

public class SimpleTest {

    @Test
    /*
    @Test Junit находит все классы, где встречается аннотация @Test,
    вызывает эти методы в своей методе main
     */
    void simpleTest() {
        Assertions.assertTrue(3 > 2);
    }

    @DisplayName("Email должен отправляться после регистрации пользователя")
    /*
    @DisplayName Позволяет дать лаконичное и понятное название для теста или класса.
    строка аннотации не печатается в консоли, а отображается в IDE и смежных инструментах,
    поддерживающих интеграцию
     */
    @Test
    void sendEmailTest(){
        System.out.println("мм");
    }

    //@Tag("smoke")
    @Tags({
            @Tag("smoke"),
            @Tag("web")
    })
    /*
    @Tag - позволяет запускать тесты по тегам , настраивается в build.gradle в
    useJUnitPlatform()
     */
    @Disabled // тест не будет запускаться
    @Test
    void ttTest(){

    }
}
