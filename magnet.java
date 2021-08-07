import java.io.*;
import java.math.*;
import java.util.*;

public class magnet {
 private static MyScanner in;
 private static PrintStream out;
 private static boolean LOCAL_TEST = false;

 private static void solve() throws IOException
 {
  int n = in.nextInt();
  int grp = 1;
  String prev = in.nextString();
  for (int i = 1; i < n; i++) {
   String s = in.nextString();
   if (!s.equals(prev))
    grp++;
   prev = s;
  }
  out.println(grp);
 }

 public static void main(String[] args) throws IOException {
  // helpers for input/output
  out = System.out;
  try {
   String cname = System.getenv("COMPUTERNAME");
   if (!cname.equals(""))
    LOCAL_TEST = true;
  } catch (Exception e) {
  }
  if (LOCAL_TEST) {
   in = new MyScanner("E:\\zin.txt");
  }
  else {
   boolean usingFileForIO = false;
   if (usingFileForIO) {
    // using input.txt and output.txt as I/O
    in = new MyScanner("input.txt");
    out = new PrintStream("output.txt");
   }
   else {
    in = new MyScanner();
    out = System.out;
   }
  }

  solve();
 }

 // =====================================
 static class MyScanner {
  BufferedReader bufReader;
  StringTokenizer strTok;

  public MyScanner() throws IOException
  {
   bufReader = new BufferedReader(new InputStreamReader(System.in));
   strTok = new StringTokenizer("");
  }

  public MyScanner(String inputFile) throws IOException {
   bufReader = new BufferedReader(new InputStreamReader(new FileInputStream(
     inputFile)));
   strTok = new StringTokenizer("");
  }

  String GetNextToken() throws IOException {
   if (!strTok.hasMoreTokens())
    strTok = new StringTokenizer(bufReader.readLine());
   return strTok.nextToken();
  }

  public int nextInt() throws IOException {
   return Integer.valueOf(GetNextToken());
  }

  public long nextLong() throws IOException {
   return Long.valueOf(GetNextToken());
  }

  public double nextDouble() throws IOException {
   return Double.valueOf(GetNextToken());
  }

  public String nextString() throws IOException {
   return GetNextToken();
  }

  public String nextLine() throws IOException {
   return bufReader.readLine();
  }

  public int countTokens() {
   return strTok.countTokens();
  }

  public boolean hasMoreTokens() {
   return strTok.hasMoreTokens();
  }
 }

}