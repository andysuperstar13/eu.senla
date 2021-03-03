package eu.senla.task7;

import java.util.Objects;

public class Robot {
    private String name;
    private Head head;
    private Body body;

    Robot(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    void setName(String name) {
        this.name = name;
    }

    Head getHead() {
        return head;
    }

    Body getBody() {
        return body;
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, body);
    }

    @Override
    public String toString() {
        return "Robot: " +
                "name = " + name +
                ", head = " + head +
                ", body = " + body ;
    }
}
