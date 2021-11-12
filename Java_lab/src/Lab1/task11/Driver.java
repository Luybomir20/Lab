package Lab1.task11;

import java.util.Objects;

public class Driver {

      String name;
      long drivernumbers;
      boolean ready;

    public Driver(final String name, final long drivernumbers, final boolean ready) {
        this.name = name;
        this.drivernumbers = drivernumbers;
        this.ready = ready;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {

        this.name = name;
    }

    public long getDrivernumbers() {

        return drivernumbers;
    }

    public void setDrivernumbers(final long drivernumbers) {

        this.drivernumbers = drivernumbers;
    }

    public boolean isReady() {

        return ready;
    }

    public void setReady(final boolean ready) {

        this.ready = ready;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       final  Driver driver = (Driver) o;
        return drivernumbers == driver.drivernumbers && ready == driver.ready && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, drivernumbers, ready);
    }

}
