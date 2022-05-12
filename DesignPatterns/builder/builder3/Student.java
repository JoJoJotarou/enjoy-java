package DesignPatterns.builder.builder3;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Builder builder() {
        return new Student.Builder();
    }
    
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public static class Builder {
        
        private String name;
        private int age;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(name, age);
        }
    }
}


class Test {

    public static void main(String[] args) {
        Student s = Student.builder().setName("张三").setAge(20).build();
        System.out.println(s.toString());
        Student s1 = Student.builder().setName("张三").build();
        System.out.println(s1.toString());
    }
}
