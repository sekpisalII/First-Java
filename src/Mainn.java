
import lombok.*;
import java.io.*;
import java.util.*;
@Data
// Step 1: Create the Course class
class Course {
    private int courseId;
    @Getter
    private String courseTitle;
    @Getter
    private String courseStartedDate;
    @Getter
    @Setter
    private String courseEndedDate;
    private boolean isAvailable;

    // Step 2: Create constructor with parameters
    public Course(int courseId, String courseTitle, String courseStartedDate, String courseEndedDate, boolean isAvailable) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseStartedDate = courseStartedDate;
        this.courseEndedDate = courseEndedDate;
        this.isAvailable = isAvailable;
    }

    // Step 2: Create constructor with no parameters
    public Course() {
    }

    // Step 2: Create getters and setters
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setCourseStartedDate(String courseStartedDate) {
        this.courseStartedDate = courseStartedDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

// Step 3: Create the CourseService interface
interface CourseService {
    void addNewCourse();
    void getAllCourses();
    void getCourseById(int courseId);
}

// Step 4: Create the CourseServiceImp class that implements CourseService interface
class CourseServiceImp implements CourseService {
    private final List<Course> courses;
    private static final String FILE_NAME = "course.csv";

    public CourseServiceImp() {
        courses = new ArrayList<>();
    }

    @Override
    public void addNewCourse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the course title: ");
        String courseTitle = scanner.nextLine();

        // Generate course ID
        int courseId = courses.size() + 1;

        // Generate course start and end dates
        String  courseStartedDate = "2024-01-01";
        String courseEndedDate = "2024-12-31";

        // Set isAvailable to true
        boolean isAvailable = true;

        // Create a new course object
        Course newCourse = new Course(courseId, courseTitle, courseStartedDate, courseEndedDate, isAvailable);

        // Add the new course to the list
        courses.add(newCourse);

        // Write the data to the file
        try (FileWriter writer = new FileWriter(FILE_NAME, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer);
             PrintWriter printWriter = new PrintWriter(bufferedWriter)) {

            printWriter.println(STR."\{courseId},\{courseTitle},\{courseStartedDate},\{courseEndedDate},\{isAvailable}");
            System.out.println("New course added successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    @Override
    public void getAllCourses() {
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
            System.out.println("All courses:");
            System.out.println("--------------------------------------");
            System.out.println("ID\tTitle\t\tStarted Date\tEnded Date\tAvailable");
            System.out.println("--------------------------------------");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");

                int courseId = Integer.parseInt(data[0]);
                String courseTitle = data[1];
                String courseStartedDate = data[2];
                String courseEndedDate = data[3];
                boolean isAvailable = Boolean.parseBoolean(data[4]);

                System.out.printf("%d\t%s\t%s\t%s\t%s\n", courseId, courseTitle, courseStartedDate, courseEndedDate, isAvailable);
            }

            System.out.println("--------------------------------------");

        } catch (FileNotFoundException e) {
            System.out.println("The file does not exist.");
        }
    }

    @Override
    public void getCourseById(int courseId) {
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
            boolean courseFound = false;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");

                int currentCourseId = Integer.parseInt(data[0]);
                String courseTitle = data[1];
                String courseStartedDate = data[2];
                String courseEndedDate = data[3];
                boolean isAvailable = Boolean.parseBoolean(data[4]);

                if (currentCourseId == courseId) {
                    System.out.println("Course found:");
                    System.out.println("--------------------------------------");
                    System.out.println("ID\tTitle\t\tStarted Date\tEnded Date\tAvailable");
                    System.out.println("--------------------------------------");
                    System.out.printf("%d\t%s\t%s\t%s\t%s\n", currentCourseId, courseTitle, courseStartedDate, courseEndedDate, isAvailable);
                    System.out.println("--------------------------------------");
                    courseFound = true;
                    break;
                }
            }

            if (!courseFound) {
                System.out.println("Course not found.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("The file does not exist.");
        }
    }
}

// Step 6: Create the View class
class View {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        CourseService courseService = new CourseServiceImp();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add new course");
            System.out.println("2. Get all courses");
            System.out.println("3. Search course by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    courseService.addNewCourse();
                    break;
                case 2:
                    courseService.getAllCourses();
                    break;
                case 3:
                    System.out.print("Enter the course ID: ");
                    int courseId = scanner.nextInt();
                    courseService.getCourseById(courseId);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

// Step 7: Inside the Main class
public class Mainn {
    public static void main(String[] args) {
        View.menu();
    }
}