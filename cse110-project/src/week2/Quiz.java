package week2;

public class Quiz{   
    public static void main( String[] args )   {      
         String str="hello";      
         System.out.println("pizza".length( )); //________________      
         System.out.println("hamburger".substring( 0, 3 )); //______________      
         System.out.println(str.charAt(1)); //____________      
         System.out.println(str.equals("hello")); //______________   
    
         int x = 3;
         switch (x)
         {
              case 3 : x += 1;
              case 4 : x += 2;
                           break;
              case 5 : x += 3;
              case 6 : x += 1;
              case 7 : x += 2;
              case 8 : x = x - 1;
              case 9 : x += 1;
          }
         System.out.println(x);    
         
         int grade = 45;
         if( grade >= 70 )
             System.out.println( "passing" );
         if( grade < 70 )
              System.out.println( "dubious" );
         if( grade < 60 )
               System.out.println( "failing" );
    
         String option = "A";
         if( option.equals( "A" ) )     
            System.out.println( "addRecord" );
         if( option.compareTo( "A" ) == 0 )     
            System.out.println( "deleteRecord" );

         int j = 8;
         double xx = -1.5;
         if( xx < -1.0 )     
             System.out.println( "true" );
         else     
             System.out.println( "false" );     
         System.out.println( "after if...else" );
         
         double xxx = -1.5;
         if( xxx <= 0.0 ){  // True part is another if...else   
             if( xxx < 0.0 )      
                 System.out.println( "neg" );
             else      
                 System.out.println( "zero" ); 
         }
         else   
             System.out.println( "pos" );
    }
}