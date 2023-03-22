public class Day3assignment1{
     public static void main(String[] args) {
        int m1r, m1c, m2r, m2c,yes=1;    
        int a[][] = {       
                        {1, 2, 3},    
                        {8, 4, 6},    
                        {4, 5, 7}    
                    };     
        int b[][] = {       
                        {1, 2, 3},    
                        {8, 4, 6},    
                        {4, 5, 7},   
            };    
          m1r = a.length;    
        m1c = a[0].length;    
          m2r = b.length;    
        m2c = b[0].length;        
        if(m1r != m2r || m1c != m2c){    
            yes=0;
        }    
        else {    
            for(int i = 0; i < m1r; i++){    
                for(int j = 0; j < m1c; j++){    
                  if(a[i][j] != b[i][j]){    
                      yes=0;    
                      break;    
                  }    
                }    
            }    
             
        }    
        if(yes==1)    
                System.out.println("Matrices are equal");    
            else    
                System.out.println("Matrices are not equal");   
    }
}