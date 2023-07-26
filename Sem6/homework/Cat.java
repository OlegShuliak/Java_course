package Sem6.homework;

public class Cat {

    String name;
    String color;
    int age;
    int weight;

    public Cat(){

    }
    
    public Cat(String name, String color, int age, int weight){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", color=" + color + ", age=" + age + ", weight=" + weight + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + age;
        result = prime * result + weight;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cat other = (Cat) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (age != other.age)
            return false;
        if (weight != other.weight)
            return false;
        return true;
    }

}
