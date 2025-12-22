class Logical{
    public static void main(String[] args){
        boolean a,b;
        System.out.println("# Truth Table of OR gate");
        System.out.println("p   q   Result");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                if(i == 1){
                    a = true;
                }
                else {
                    a = false;
                }
                
                if(j == 1){
                    b = true;
                }
                else {
                    b = false;
                }
                
                System.out.println(i + " | " + j + " |  " + (a || b));
            }
        }
        
        System.out.println("\n# Truth Table of AND gate");
        System.out.println("p   q   Result");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                if(i == 1){
                    a = true;
                }
                else {
                    a = false;
                }
                
                if(j == 1){
                    b = true;
                }
                else {
                    b = false;
                }
                
                System.out.println(i + " | " + j + " |  " + (a && b));
            }
        }
    }
}

// Output

/* 

# Truth Table of OR gate
p   q   Result
0 | 0 |  false
0 | 1 |  true
1 | 0 |  true
1 | 1 |  true

# Truth Table of AND gate
p   q   Result
0 | 0 |  false
0 | 1 |  false
1 | 0 |  false
1 | 1 |  true

*/
