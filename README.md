# Java Test
## 1번 
- JUnit 5 : 단위테스트를 작성하는 자바개발자가 가장 많이 사용하는 프레임워크(93%)
  - Mokito 는 절반정도 사용중
  - 대체제는 TestNG, Spock, ... 등등이 존재
  - 2017년에 JUnit 5 공개, 스프링부트 2버전이 되면서 JUnit 5 를 지원함
  - JUnit 4는 하나의 jar dependency로 들어와 참조했지만 JUnit 5는 모듈화되어 있음
    - JUnit Platform : 테스트를 실행해주는 런처 제공. TestEngine API 제공
    - JUnit Jupiter : TestEngine API 구현체로 JUnit 5를 제공
    - Vintage : TestEngine API 구현체로 JUnit 4, 3을 제공

## 2번
- 2.2+ 버전의 스프링 부트 프로젝트를 만들면 JUnit 5 의존성이 자동 추가
  - JUnit 4부터 Reflection을 사용하므로 public 선언을 할 필요가 없음
  - 스프링부트를 사용하지 않을 시
      ```xml
        <dependency>
          <groupId>org.junit.jupiter</groupId>
          <artifactId>junit-jupiter-engine</artifactId>
          <version>5.5.2</version>
          <scope>test</scope>
        </dependency>
      ```
  - 기본 어노테이션
    - @Test
    - @BeforeAll / @AfterAll
    - @BeforeEach / @AfterEach
    - @Disabled
    
## 3번
- JUnit 5 테스트 이름 표기
  - @DisplayNameGeneration
    - 메소드와 클래스 래퍼런스를 사용하여 테스트 이름을 표기하는 방법
    - 기본 구현체로 ReplaceUnderscores 제공
  - @DisplayName
    - 어떤 테스트인지 테스트 이름을 보다 쉽게 표현할 수 있는 방법
    - @DisplayNameGeneration 보다 우선 순위가 높음
    
## 4번
- JUnit 5 : Assertion
    ```java
    import static org.junit.jupiter.api.Assertions.*;
    ```
    - assertEquals(expected, actual) : 실제 값이 기대한 값과 같은지 확인
    - assertNotNull(actual) : 값이 null 이 아닌지 확인
    - assertTrue(boolean) : 다음 조건이 참(true)인지 확인
    - assertAll(executables ...) : 모든 구문 확인
    - assertThrows(expectedType, executable) : 예외 발생 확인
    - assertTimeout(duration, executable) : 특정 시간 안에 실행이 완료되는지 확인
    
- 마지막 매개변수로 Supplier<String> 타입의 인스턴스를 람다 형태로 제공할 수 있다.
  - 복잡한 메시지를 생성해야 하는 경우 실패 시에만 해당 메시지를 만들게 할 수 있다.
  - AssertJ, Hemcrest, Truth 등의 라이브러리를 사용할 수도 있다.