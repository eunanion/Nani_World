package overloading;

public class Parttimer {

	
	         // 파트타이머 정보
			// 오전여부 ,  시급 , 가게명 , 본인이름
			
			private boolean afternoon; // true면 오후 false 오전
			private int pay; //시급
			private String shopName; //가게명
			private String name;
			//생성자 오버로딩은, 생성자를 여러개 오버로딩 형식으로 만드는것
			//afternoon, pay ,  shopName,  name을 모두 받는 생성자를 만들어주세요.
			// 접근 제한자는 public 입니다.
			public Parttimer (boolean a, int p , String s , String n) {
				afternoon  = a;
				pay = p ;
				shopName = s;
				name = n;	
				
				if ( p  < 8720 ) {
					 p= 8720;
				} else {
					pay=p;
					
				}
					
				System.out.println("알바가 생성됨");
				System.out.println("오후알바 여부 : "+afternoon);
				System.out.println("시급 : " + pay);
				System.out.println("가게명 : "+ shopName);
				System.out.println("알바 성함 : "+  name);
				
			}
			// 오버로딩은 이름은 같은데 파라미터값의 종류나 개수가 다르면 중복 작성을 허용합니다
			// afternoon, shopName, name만 입력받는 생성자를 하나 더 중복작성 해주세요.
			// pay는 최저시급으로 넣어주세요.
			public Parttimer (boolean a , String s, String n) {
				afternoon = a;
				pay = 8720;
				shopName = s;
				name = n;
				System.out.println("알바가 생성됨");
				System.out.println("오후알바 여부 : "+afternoon);
				System.out.println("시급 : " + pay);
				System.out.println("가게명 : "+ shopName);
				System.out.println("알바 성함"+  name);
			}
				
			}
			

