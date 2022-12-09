

    public class Human {



            private final int yearOfBirth;
            private final String name;
            private final String town;
            private final String jobTitle;


        public Human(int yearOfBirth, String name, String town, String jobTitle) {
            String jobTitle1;
            String town1;
                String name1;
                this.yearOfBirth = yearOfBirth;
            if (name == null || name.isEmpty()) {
                    name = "Информация не указана";
                }
                name1 = name;

                this.name = name1;
                if (town == null || town.isEmpty()) {
                    town = "Информация не указана";
                }
                town1 = town;

                this.town = town1;

            if (jobTitle == null || jobTitle.isEmpty()) {
                    jobTitle = "Информация не указана";
                }
                jobTitle1 = jobTitle;
            this.jobTitle = jobTitle1;
        }



            @Override
            public String toString() {
                return "Привет! Меня зовут " + name + " . Я из города " + town + " . Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!" ;
            }
    }

