import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;

public class PracticeProblemTest {

   InputStream originalIn = System.in;
   PrintStream originalOut = System.out;
   ByteArrayOutputStream bos = new ByteArrayOutputStream();

      
   @BeforeEach
   public void setUp() {
      System.setOut(new PrintStream(bos));
   }

   @AfterEach
   public void tearDown() {
      System.setOut(originalOut);
      System.setIn(originalIn);
   }
   
   @Test
   public void q1_1()
   {
      InputStream originalIn = System.in;
      String data = "3.5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("Input a number: 3.5\n", bos.toString());
   }

   @Test
   public void q1_2()
   {
      InputStream originalIn = System.in;
      String data = "-5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q1();

      // assertion
      assertEquals("Input a number: 5.0\n", bos.toString());
   }

   @Test
   public void q2_1()
   {
      InputStream originalIn = System.in;
      String data = "8.0\n5\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a number: Input another number: 1.0\n2.0\n", bos.toString());
   }

   @Test
   public void q2_2()
   {
      InputStream originalIn = System.in;
      String data = "-7.5\n2\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q2();

      // assertion
      assertEquals("Input a number: Input another number: -4.0\n-3.0\n", bos.toString());
   }

   @Test
   public void q3_1()
   {
      InputStream originalIn = System.in;
      String data = "9\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a number: 3\n", bos.toString());
   }

   @Test
   public void q3_2()
   {
      InputStream originalIn = System.in;
      String data = "6\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a number: 2\n", bos.toString());
   }

   @Test
   public void q3_3()
   {
      InputStream originalIn = System.in;
      String data = "7\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q3();

      // assertion
      assertEquals("Input a number: 3\n", bos.toString());
   }

   @Test
   public void q4_1()
   {
      InputStream originalIn = System.in;
      String data = "5\n2\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: Input another number: 25.0\n", bos.toString());
   }

   @Test
   public void q4_2()
   {
      InputStream originalIn = System.in;
      String data = "-3\n3\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q4();

      // assertion
      assertEquals("Input a number: Input another number: -27.0\n", bos.toString());
   }

   @Test
   public void q5_1()
   {
      InputStream originalIn = System.in;
      String data = "4\n3\n2\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a number: Input another number: Input one more number: 4.0\n2.0\n", bos.toString());
   }

   @Test
   public void q5_2()
   {
      InputStream originalIn = System.in;
      String data = "4\n3\n2\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a number: Input another number: Input one more number: 4.0\n2.0\n", bos.toString());
   }

   @Test
   public void q5_3()
   {
      InputStream originalIn = System.in;
      String data = "-2\n3\n2\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a number: Input another number: Input one more number: 3.0\n-2.0\n", bos.toString());
   }

   @Test
   public void q5_4()
   {
      InputStream originalIn = System.in;
      String data = "4\n-3\n2\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a number: Input another number: Input one more number: 4.0\n-3.0\n", bos.toString());
   }

   @Test
   public void q5_5()
   {
      InputStream originalIn = System.in;
      String data = "0\n0\n2.0\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a number: Input another number: Input one more number: 2.0\n0.0\n", bos.toString());
   }

   @Test
   public void q5_6()
   {
      InputStream originalIn = System.in;
      String data = "1\n1\n1\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q5();

      // assertion
      assertEquals("Input a number: Input another number: Input one more number: 1.0\n1.0\n", bos.toString());
   }

   @Test
   public void q6_1()
   {
      InputStream originalIn = System.in;
      String data = "Hello there";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("Input a sentence: false\n", bos.toString());
   }

   @Test
   public void q6_2()
   {
      InputStream originalIn = System.in;
      String data = "Hello on there";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q6();

      // assertion
      assertEquals("Input a sentence: true\n", bos.toString());
   }

   @Test
   public void q7_1()
   {
      InputStream originalIn = System.in;
      String data = "Mango";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q7();

      // assertion
      assertEquals("Input the word mango: true\n", bos.toString());
   }

   @Test
   public void q7_2()
   {
      InputStream originalIn = System.in;
      String data = "\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q7();

      // assertion
      assertEquals("Input the word mango: false\n", bos.toString());
   }

   @Test
   public void q7_3()
   {
      InputStream originalIn = System.in;
      String data = " Mango";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q7();

      // assertion
      assertEquals("Input the word mango: false\n", bos.toString());
   }

   @Test
   public void q7_4()
   {
      InputStream originalIn = System.in;
      String data = "mango";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q7();

      // assertion
      assertEquals("Input the word mango: true\n", bos.toString());
   }

   @Test
   public void q7_5()
   {
      InputStream originalIn = System.in;
      String data = "MaNGo";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q7();

      // assertion
      assertEquals("Input the word mango: true\n", bos.toString());
   }

   @Test
   public void q8_1()
   {
      InputStream originalIn = System.in;
      String data = "Hello\nl";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q8();

      // assertion
      assertEquals("Input a word: Input a letter: 2\n3\n", bos.toString());
   }

   @Test
   public void q8_2()
   {
      InputStream originalIn = System.in;
      String data = "popular popular\np";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q8();

      // assertion
      assertEquals("Input a word: Input a letter: 0\n10\n", bos.toString());
   }

   @Test
   public void q8_3()
   {
      InputStream originalIn = System.in;
      String data = "help me \n ";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q8();

      // assertion
      assertEquals("Input a word: Input a letter: 4\n7\n", bos.toString());
   }

   @Test
   public void q9_1()
   {
      InputStream originalIn = System.in;
      String data = "Hello";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q9();

      // assertion
      assertEquals("Input a sentence: Your sentence is 5 characters long\n", bos.toString());
   }

   @Test
   public void q9_2()
   {
      InputStream originalIn = System.in;
      String data = "\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q9();

      // assertion
      assertEquals("Input a sentence: Your sentence is 0 characters long\n", bos.toString());
   }

   @Test
   public void q9_3()
   {
      InputStream originalIn = System.in;
      String data = "Hello there";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q9();

      // assertion
      assertEquals("Input a sentence: Your sentence is 11 characters long\n", bos.toString());
   }

   @Test
   public void q10_1()
   {
      InputStream originalIn = System.in;
      String data = "Hello\nl\no";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q10();

      // assertion
      assertEquals("Input a sentence: Input a word to replace: What word would you like to replace it with: Heooo\n", bos.toString());
   }

   @Test
   public void q10_2()
   {
      InputStream originalIn = System.in;
      String data = "Hello There\n \n\n";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q10();

      // assertion
      assertEquals("Input a sentence: Input a word to replace: What word would you like to replace it with: HelloThere\n", bos.toString());
   }

   @Test
   public void q11_1()
   {
      InputStream originalIn = System.in;
      String data = "Hello";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q11();

      // assertion
      assertEquals("Input a sentence: HELLO\nhello\n", bos.toString());
   }

   @Test
   public void q11_2()
   {
      InputStream originalIn = System.in;
      String data = "Hello There  ";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q11();

      // assertion
      assertEquals("Input a sentence: HELLO THERE\nhello there\n", bos.toString());
   }

   @Test
   public void q11_3()
   {
      InputStream originalIn = System.in;
      String data = "  ";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q11();

      // assertion
      assertEquals("Input a sentence: \n\n", bos.toString());
   }

   @Test
   public void q12_1()
   {
      InputStream originalIn = System.in;
      String data = "Help me";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q12();

      // assertion
      assertEquals("Input a word: Help\np me\n", bos.toString());
   }

   @Test
   public void q12_2()
   {
      InputStream originalIn = System.in;
      String data = "hand";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q12();

      // assertion
      assertEquals("Input a word: hand\nhand\n", bos.toString());
   }

   @Test
   public void q12_3()
   {
      InputStream originalIn = System.in;
      String data = "There is no spoon";
      System.setIn(new ByteArrayInputStream(data.getBytes()));

      // action
      PracticeProblem.q12();

      // assertion
      assertEquals("Input a word: Ther\npoon\n", bos.toString());
   }
}
