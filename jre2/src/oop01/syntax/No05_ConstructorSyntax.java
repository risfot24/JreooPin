package oop01.syntax;
/*
 Date : 
 Author :
 Desc :생성자 문법
 */
/*
 초기화
   - 어떤 작업(현실 : job, 프로그램 : process)를 시작하기 전에
   - 준비 (현실 : standby, ready)를 하게 되는데
   - 이것을 프로그램에서는 초기화(initializing) 라고 한다.
 
 * */
/*
  생성자
  - 1. 값을 변환하지 않는다.
         따라서 return 도 없고, void도 표시 하지 않는다.
  - 2. 생성자의 이름은 클래스의 이름과 동일하다.
  - 3. 생성자를 명기하지 않으면, 디폴트 생성자(파라미터가 없는) 가
       컴파일어에 의해 자동 생성된다.
  - 4. 생성자가 여러개 일때 , 다른 생성자를 호출 할 수 있다.
         이때 사용 되는 특별한 코드가  this()를 통하여
         클래스내부의 다른 생성자를 호출한다.
         단, 생상저 맨 첫줄에서 단 한번만 호출 가능 하다.
  - 5. 4번과 동일한 개념으로 super() 로 부모의 생성자를 호출한다.             
     
     생성자 : 메소드 로이다..
 * */



public class No05_ConstructorSyntax {

}
