import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

package midterm2018;

public class Main {

    public static void main(String[] args) {
        String question1and2 = "GET /add?a=3&b=4 HTTP/1.1\n"
            + "Host: localhost:1298\n"
            + "Connection: keep-alive\n"
            + "User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36\n"
            + "Accept: image/webp,image/apng,image/*,*/*;q=0.8\n"
            + "Referer: http://localhost:1298/\n"
            + "Accept-Encoding: gzip, deflate, br\n"
            + "Accept-Language: en-US,en;q=0.9,es;q=0.8\n";

        String question3 = "{\n"
            + "    “task” : “inc”,\n"
            + "    “num” : 3\n"
            + "}\n";

        String question4and5 = "To opt out, you’ll need to enter the Settings menu by clicking the three vertical dots, all the way in the upper right corner of the browser. From there, you’ll need to enter the Advanced settings at the very bottom and find the “Allow Chrome sign in” toggle, then turn it to off. Doing so lets you sign into Google services like Gmail and Maps without signing into the Chrome browser itself.";


        System.out.println(question1and2);
        System.out.println(question3);
        System.out.println(question4and5);


        /*private void run(){
            ObjectMapper mapper = new ObjectMapper();


            try{

                Students students = mapper.readValue(new File("D:\\Q3.json")), Students.class);
                System.out.println(students);


                String jsonInString1 = "{\"{\\n\"\n" + "+ \"“task” : “inc”,\\n\"\n" + "+ \" “num” : 3\\n\"\n" + "+ \"}\\n\";}";
                Students student1 = mapper.readValue(jsonInSring, Staff.class);
                System.out.println(student1);

                String goodStudents = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(stundet1);
                System.out.println(goodStudents);*/


                Exam exam (){
                    return localhost;

                }

                var j= {"a" : "b"};
                JSON.stringify(j);



        mapper.writeValue(new File("c:\\Q3.json"), obj);


        List<String> languages = new ArrayList<String>();
        Map<Object, Object> object = new HashMap<Object, Object>();






        private static String toJSON(Object object){
            if (object instanceof Map){

                Map map = (Map) object;

                StringBuilder builder = new StringBuilder("{");





            }

        }






                }
            }

        // Question 1
        // Return the Host

        // Question 2
        // return sum of a and b

        // Question 3
        // convert to java object, increment num, convert back to json and return

        // Question 4
        // return unique words

        // Question 5
        // return 2nd most common word
    }
}
