package ru.spb.herzen.ivt3;

import javax.swing.*;
import java.awt.*;

public class App {
    //Объявление всех компонентов калькулятора
    JPanel windowContent;
    JTextField displayField;
    JButton button[] = new JButton[10];
    JButton buttonPoint;
    JButton buttonEqual;
    JPanel p1, p2;
    JButton buttonAdd, buttonSub, buttonMult, buttonDiv;

    // В конструкторе создаются все компоненты
    // и добавляются на фрейм с помощью комбинации
    // Borderlayout и Gridlayout
    App() {
        //Создаём панель
        windowContent = new JPanel();
        // Задаём схему для этой панели
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);
        // Создаём и отображаем поле
        // Добавляем его в Северную область окна
        displayField = new JFormattedTextField();
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        windowContent.add("North", displayField);

        // Создаём панель с GridLayout
        // которая содержит 12 кнопок - 10 кнопок с числами
        // и кнопки с точкой и знаком равно
        p1 = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        p1.setLayout(gl);

        // Создаём кнопки, используя конструктор
        // класса JButton в цикле, который принимает текст
        // кнопки в качестве параметра и добавляет её на панель
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton("" + i);
            p1.add(button[i]);
        }
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        p1.add(buttonPoint);
        p1.add(buttonEqual);

        // Создаём вторую панель с GridLayout
        // которая содержит 4 кнопки с действиями
        // и добавляем их на неё
        p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 1));
        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonMult = new JButton("/");
        buttonDiv = new JButton("*");
        p2.add(buttonAdd);
        p2.add(buttonSub);
        p2.add(buttonMult);
        p2.add(buttonDiv);

        // Помещаем панель p1 в центральную область окна
        // А панель p2 в правую область окна
        windowContent.add("Center", p1);
        windowContent.add("West", p2);

        //Создаём фрейм и задаём его основную панель
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        // делаем размер окна достаточным для того, чтобы вместить все компоненты
        frame.pack();

        // Наконец, отображаем окно
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        App calc = new App();

    }
}