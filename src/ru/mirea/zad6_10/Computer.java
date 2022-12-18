package ru.mirea.zad6_10;

public class Computer {
    private String name;
    private Monitor monitor;
    private Memory memory;
    private Processor processor;

    public Computer(String namePC, String nameMem, String nameMonit, String nameProc) {
        this.name = namePC;
        memory = new Memory();
        memory.setName(nameMem);
        monitor = new Monitor();
        monitor.setName(nameMonit);
        processor = new Processor();
        processor.setName(nameProc);
    }

    void GetPcConfig() {
        System.out.println(name);
        System.out.println(memory.getName());
        System.out.println(monitor.getName());
        System.out.println(processor.getName());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", monitor=" + monitor +
                ", memory=" + memory +
                ", processor=" + processor +
                '}';
    }
}
