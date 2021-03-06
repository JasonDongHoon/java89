/* final 사용
 * - 클래스 앞에 붙으면 상속 불가!
 * - 메서드 앞에 붙으면 오버라이딩 불가!
 * - 변수 앞에 붙으면 값을 한 번만 할당!
 */
package step16.ex6;

public class MyClass4 {
  // 인스턴스 변수는 인스턴스 마다 존재한다.
  // 따라서 값을 바꿀 수 없는 인스턴스를 변수를 만들 이유는 없다.
  final int a = 10; // 부질없는 짓!
  
  // 상수 값으로 사용할 변수에 final을 붙인다.
  // 그 상수 값은 인스턴스와 상관없이 동일하기 때문에 보통 스태틱으로 선언한다.
  static final int b = 10; 
  
  // 그리고 그 상수 값은 굳이 접근을 제한할 필요가 없다.
  // 따라서 외부에서 마음껏 사용할 수 있도록 보통 public 으로 선언한다.
  public static final int c = 100;
  
}







