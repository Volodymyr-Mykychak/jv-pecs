package core.mate.academy.model;

/**
 * Абстрактний клас `Machine` є базовим класом для машин. Він реалізує інтерфейс `Workable`,
 * який вимагає реалізації методу `doWork()`. Клас містить властивості `name` і `color` для
 * назви та кольору машини.
 */
public abstract class Machine implements Workable {

    private String name;
    private String color;

    /**
     * Отримує назву машини.
     *
     * @return назва машини
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює назву машини.
     *
     * @param name назва машини
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Отримує колір машини.
     *
     * @return колір машини
     */
    public String getColor() {
        return color;
    }

    /**
     * Встановлює колір машини.
     *
     * @param color колір машини
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Виконує робочу дію для машини.
     * Цей метод є реалізацією методу з інтерфейсу `Workable`.
     * Конкретні класи машин повинні надати власну реалізацію цього методу.
     */
    @Override
    public abstract void doWork();
}
