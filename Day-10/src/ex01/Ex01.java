package ex01;

public class Ex01 {
	public static void main(String[] args) {
	       //[1] 준비
        int A[][] = new int[6][6]; //1~5 사용
        int K=0; //출력할값을 담은 변수
        int N=5; //각 회전에서 수행할 수행횟수가 지정될 변수(5,4,3,2,1 로 변경됨)
        int SW=1; //(+1)행과 열의 증가 , (-1)행과 열의 감소
        int I=1,J=0;
       
        //[2] 처리
        do{        
            for(int P=1;P<=N;P++){ // 시작은 1~5            
                K=K+1;
                J=J+SW; //행고정 열변화
                A[I][J] = K;                               
            }          
            N=N-1;
           
            if(N>0){               
                for(int P=1;P<=N;P++){             
                    K=K+1;
                    I=I+SW; //열고정 행변화
                    A[I][J] = K;                               
                }              
                SW = SW*(-1); // 스위칭             
            }else{             
                break; //반복문 빠져나감.
            }          
        }while(true);
       
       
        //[3] 출력
        for(int i = 1; i<A.length;i++){        
            for(int j =1; j< A[i].length;j++){
                System.out.print(A[i][j]+"\t");                        
            }
            System.out.println();
        }      
    }//end main()
}//end
	

