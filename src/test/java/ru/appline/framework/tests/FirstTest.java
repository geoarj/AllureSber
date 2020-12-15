package ru.appline.framework.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import ru.appline.framework.basetestsclass.BaseTests;
import ru.appline.framework.utils.MyAllureRunner;

@RunWith(MyAllureRunner.class)
public class FirstTest extends BaseTests {

    @Test
    public void startTest() {
        app.getStartPage()
                .selectBaseMenu("Ипотека")
                .selectSubMenu("Ипотека на готовое жильё")
                .checkOpenPage("Ипотека")
                .fillInFields("Стоимость недвижимости", 5180000)
                .fillInFields("Первоначальный взнос", 3058000)
                .fillInFields("Срок кредита", 30)
                .fillCheckBoxes("Скидка 0,3% при покупке квартиры на ДомКлик", "false")
                .fillCheckBoxes("Страхование жизни", "false")
                .fillCheckBoxes("Молодая семья", "true")
                .fillCheckBoxes("Электронная регистрация сделки", "false")
                .checkFields("Сумма кредита", "2 122 000")
                .checkFields("Ежемесячный платеж", "16 922")
                .checkFields("Необходимый доход", "21 784")
                .checkFields("Процентная ставка", "11%");
    }
}
