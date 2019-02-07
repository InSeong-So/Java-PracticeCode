# Getter와 Setter 메소드

## 개요
> 객체의 데이터를 외부에서 마음대로 수정하면 객체의 무결성이 깨어질 수 있다.
>> 따라서 객체의 데이터는 객체 외부에서 직접적으로 접근하는 것을 막는다.
>>> 이런 문제점을 해결하기 위해 OOP에서는 `메소드를 통해 데이터를 변경하는 방법`을 제공한다.

## 사용법

```java
public class ClassName {

	private 타입 fieldName;	// 필드 접근 제한자 : private
	
	/* Getter
	 * 접근제한자 : public
	 * 리턴 타입 : 필드 타입
	 * 메소드 이름 : get + 필드 이름(첫문자는 대문자)
	 * 리턴값 : 필드값
	 */
	public 리턴 타입 getFieldName(){
		return fieldName;
	}
	
	/* Setter
	 * 접근제한자 : public
	 * 리턴 타입 : void
	 * 메소드 이름 : set + 필드 이름(첫문자 대문자)
	 * 매개 변수 타입 : 필드 타입
	 */
	public void setFieldName(타입 fieldName){
		this.fieldName = fieldName;
	}
	
}
```

### 부가 설명
- 클래스를 선언할 때 가능하다면 필드를 private로 선언하여 외부로 보호하라.
  - 필드에 대한 Getter, Setter 메소드로 필드값을 안전하게 변경/사용하라.
- 필드 타입이 boolean 이라면 Getter는 get이 아닌 is로 시작하는 것이 관례이다.
- 외부에서 필드값을 읽기만 하고 변경이 불가능하게 하려면(읽기 전용) Getter메소드만 선언해도 좋다.
  - 혹은 Setter 메소드를 private 접근 제한을 갖도록 선언해도 좋다.
- 이클립스 IDE는 자동적으로 Getter, Setter를 생성시키는 기능이 있다.
  - 필드 선언 후 [Source -> Generate Getters and Setters]를 선택하면 생성된다.