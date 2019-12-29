package sis.study.prejavatest;

import org.junit.jupiter.api.*;

import java.time.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @Test
    @DisplayName("스터디 만들기")
    void create() {
        // Exception 을 테스트할 수 있음
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> new Study(-10));
        String message = exception.getMessage();
        assertEquals(message, "limit 은 0보다 커야 합니다.");

        Study study = new Study(-10);
        assertNotNull(study);
        // 해당 테스트가 실패할 경우의 메세지를 출력할 수 있다.
        // 문자열 연산의 비용이 커진다면 람다식을 이용해 출력해야한다.
        assertEquals(StudyStatus.DRAFT, study.getStatus(), "스터디를 처음 만들면 DRAFT 상태여야 합니다.");
        assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0보다 커야 합니다.");

        // 테스트를 추가했을 때 앞서 존재하는 테스트가 깨질 경우 하위의 테스트는 실행되지 않고 종료된다.
        // 모든 연관된 assert 조건절을 묶어서 무슨 테스트가 깨졌는지 한번에 확인할 수 있는 방법이 assertAll 이다.
        assertAll(
                () -> assertNotNull(study),
                () -> assertEquals(StudyStatus.DRAFT, study.getStatus(),
                        () -> "스터디를 처음 만들면 " + StudyStatus.DRAFT + " 상태여야 합니다."),
                () -> assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0보다 커야 합니다.")
        );

        // 제한된 시간내에 끝나야하는 코드를 테스트해야 할 때
        // 단점은 해당 코드 블럭이 끝나는 시간까지 기다리므로 실제 많은 시간이 소요되는 코드가 존재될 경우 그만큼의 시간을 소비해야 한다.
        // 그게 싫다면 2로
        assertTimeout(Duration.ofMillis(100), () -> {
            new Study(10);
            Thread.sleep(300);
        });

        // 2
        // 즉시 종료하는 코드이다. 주의할 점은 별도의 Thread 에서 실행하므로 상당히 크리티컬하다. ThreadLocal 에 대해 알아볼 것
        // 예상치 못한 테스트 이슈가 발생할 수 있으므로 사용하는데 주의를 기울여야 한다.
        // TODO ThreadLocal
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            new Study(10);
            Thread.sleep(300);
        });

        System.out.println("create");
    }

    @Test
    @Disabled
    void create1() {
        System.out.println("create1");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }

}