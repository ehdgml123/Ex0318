package movie;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Movie {
   
   private long id;  //영화 고유 번호
   private String title;  //영화 제목
   private String genre; //영화 장르
                             
                             // 파일통로
   private static final File file = 
         new File("src/movie/movie.txt");
   
   public Movie(String title, String genre ) {
      this.id = Instant.now().getEpochSecond();
      this.title = title;
      this.genre = genre;
   }
   
   public Movie(long id, String title, String genre ) {
	      this.id = id;
	      this.title = title;
	      this.genre = genre;
	   }
   
   public void save() throws IOException {
	   FileWriter fw = new FileWriter(file, true);  //-> append(추가)
	   
	   fw.write(this.toFileString() + "\n");
	   fw.close();
   }
   
   
   
   private String toFileString() {
	
	return String.format("%d,%s,%s", id,title,genre);
}

public static ArrayList<Movie> findAll() throws IOException {
      
      ArrayList<Movie> movies = new ArrayList<Movie>();
      BufferedReader br = null;
      String line = null;   // 
      
      /* TEMP[0] : 127175707
       * TEMP[1] : 어벤져스
       * TEMP[2] : 판타지
       * 
       * */
      
      try {
         
         br = new BufferedReader(new FileReader(file)); // 한문장 하나씩 읽어와 BufferedReader 저장 한다.
         
                          //
         while( (line = br.readLine()) != null) {
            String[] temp = line.split(",");  
   
            Movie movie =      // 
                  new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
            
            movies.add(movie);   
         }
      }catch(FileNotFoundException e) {
    	  
         e.printStackTrace();
         
      }catch(Exception e) {
    	  
         e.printStackTrace();
      }
      
      br.close();   // 경로 해제 
      return movies;
   }
   
   public String toString() {
      return String.format("[%d] : %s(%s)", id, title, genre);
   } 
}























