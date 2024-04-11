

import java.io.*;

public class even_odd_site {
    public static void main(String[] args) throws IOException {
        // create file writer to write to number.html
        BufferedWriter file = new BufferedWriter(new FileWriter("numbers.html"));
        // write html code to file 
        file.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n");
        file.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        
        // write number to file
        for (int i = 1; i <= 50; i++) {
            // print even numbers
            if (i % 2 == 0) {
                file.write("<tr><td>" + i + "</td><td></td></tr>\n");
            }
            // print even numbers
            else {
                file.write("<tr><td></td><td>" + i + "</td></tr>\n");
            }
        }
        file.write("</table>\n</body>\n</html>");
        //close file writer
        file.close();
        // make new reader to print out line in FileReader
        BufferedReader reader = new BufferedReader(new FileReader("numbers.html"));
        String line;
        //reader whole file numbers.html
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        //close reader
        reader.close();
    }
}
