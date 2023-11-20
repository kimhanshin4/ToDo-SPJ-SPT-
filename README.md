﻿# ToDo-SPJ-SPT-
 
**API**
https://documenter.getpostman.com/view/30897197/2s9YXpUxyZ
**다이어그램**
https://app.diagrams.net/?src=about#G1zCtKmiV4wM6ipZUwvoyGFZMxMZfl9SyZ
**ERD**
https://www.erdcloud.com/d/L7wboQjrYSMeZ6JyA

1. 처음 설계한 API 명세서에 변경사항이 있었는지?
변경 되었다면 어떤 점 때문 일까요? 첫 설계의 중요성에 대해 작성해 주세요!
프로젝트 시작 초반부터 급한 일정과 미숙한 이해도에, API 설계를 제대로 작성하지 못했습니다.
이전 개인과제 해설 영상을 참고하였는데, 해당 영상을 참고하며 POSTMAN을 이용해 API를 다루는 방안에 관해 감을 조금씩 잡아보았습니다.
하지만 이를 미리 고민해서 제대로 작성해 놓을 수록,
'이후 코드를 짜갈 때 헷갈림 없이 필요한 부분에서 작업해갈 수 있는, 높은 효율과 실수를 줄일 수 있겠다'
라는 생각이 들었습니다.

2. ERD를 먼저 설계한 후 Entity를 개발했을 때 어떤 점이 도움이 되셨나요?
ERD를 생각나는데로 작성해 보긴 했지만, 제대로 된 활용을 위한 단계까지 나아가지 못했습니다.
다만 필요한 Table들과 그들간의 연관관계에 대해 고민해 볼 수 있었고, 이를 잘 활용한다면 앞서 API명세서 에서처럼 마찬가지로
Table간의 관계에 관한 코드를 작성해 나갈 때 효율적으로 작업할 수 있겠고, 무엇보다 FK를 이상한 곳에 꽂아버리는 실수를 덜 것 같다고 생각합니다.

4. JWT를 사용하여 인증/인가를 구현 했을 때의 장점은 무엇일까요?
'동시 접속자가 많을 시 서버 측의 부하를 낮춘다' 라고 어렴풋이 알고 있습니다.

5. 반대로 JWT를 사용한 인증/인가의 한계점은 무엇일까요?
구현하는데 복잡해지고, Secret Key 유출 시 JWT를 조작 가능합니다.

6. 만약 댓글이 여러개 달려있는 할일을 삭제하려고 한다면 무슨 문제가 발생할까요? Database 테이블 관점에서 해결방법이 무엇일까요?
영속성 전이를 이용! 할 수 있다고 기억합니다.

7. IoC / DI 에 대해 간략하게 설명해 주세요!
"제어의 역전, 의존성 주입. @Component가 달린 객체들을 Spring FrameWork가 처리하게 하고, 객체에 매개인자로 DI를 해 줍으로서 IoC 제어의 역전을 이룬다!" 라고 하지만, 어려워서 제대로 이해하지 못했습니다.


백엔드 쪽에 경력이 있었던 분으로 부터 인증/인가 회원가입 로그인 에 대한 험악한 난이도에 대해 여러번 들었는데, 역시나 험악함 그 자체였던 것 같습니다.
걱정이 되지만 계속 공부하고 나아가야겠습니다.
