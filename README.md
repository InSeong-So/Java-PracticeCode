# Java Test

- JUnit5 단위테스트를 작성하는 자바개발자가 가장 많이 사용하는 프레임워크(93%)
  - Mokito 는 절반정도 사용중
  - 대체제는 TestNG, Spock, ... 등등이 존재
  - 2017년에 JUnit5 공개됨, 스프링부트 2버전이 되면서 JUnit5 를 지원함
  - 4는 하나의 jar dependency로 들어와 참조했지만 5는 모듈화되어 있음
    - JUnit Platform : 테스트를 실행해주는 런처 제공. TestEngine API 제공
    - 