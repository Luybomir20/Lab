package Lab3.task3;

public class Mark {

        private long id;
        private int typeMark;
        private final Subject subject;

        public Mark(final Integer id, final int typeMark, final Subject subject) {
            this.id = id;
            this.typeMark = typeMark;
            this.subject = subject;
        }

        public long getId() {
            return id;
        }

        public void setId(final Integer id) {
            this.id = id;
        }

        public int getTypeMark() {
            return typeMark;
        }

        public void setTyMark(final int typeMark) {
            this.typeMark = typeMark;
        }

        public String getSubjectName() {
            return subject.getNameSubject ();
        }

        @Override
        public String toString() {
            return
                    typeMark + " " + subject;
        }
    }

