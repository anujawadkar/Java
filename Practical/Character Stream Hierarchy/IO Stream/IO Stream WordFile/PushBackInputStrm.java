package corejava;

import java.io.*;  
public class PushBackInputStrm {  
	
	public static void main(String[] args)throws Exception{  
		
          String srg = "Success !!!";  
          byte ary[] = srg.getBytes();  
          
          ByteArrayInputStream array = new ByteArrayInputStream(ary);  
          
          PushbackInputStream push = new PushbackInputStream(array); 
          
          int i;        
              while( (i = push.read())!= -1) {  
                  if(i == '#') {  
                      int j;  
                      if( (j = push.read()) == '#'){  
                           System.out.print("**");  
                      }
                      else {  
                          push.unread(j);  
                          System.out.print((char)i);  
                      }  
                  }
                  else {  
                              System.out.print((char)i);  
                  }  
             }        
		}   
	}  
