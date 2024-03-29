### Reflection
- 힙 영역에 로드돼 있는 클래스 타입의 객체를 통해 필드/메서드/생성자를 접근 제어자와 상관 없이 사용할 수 있도록 지원하는 API
- 컴파일 시점이 아닌 런타임 시점에 동적으로 특정 클래스의 정보를 추출할 수 있는 프로그래밍 기법
- 주로 프레임워크 또는 라이브러리 개발 시 사용됨

### Reflection 사용하는 프레임워크/라이브러리 소개
- Spring 프레임워크(DI)
- Test 프레임워크 (JUnit)
- JSON Serialization/Deserialization 라이브러리 (Jackson) 등

### 프런트 컨트롤러 패턴
- 모든 요청을 단일 handler(처리기)에서 처리하도록 하는 패턴
- 스프링 웹 MVC 프레임워크의 DispatcherServlet(프런트 컨트롤러 역할)이 프런트 컨트롤러 패턴으로 구현돼 있음

### Forward
- 서블릿에서 클라이언트(웹 브라우저)를 거치지 않고 바로 다른 서블릿(또는 JSP)에게 요청하는 방식
- Forward 방식은 서버 내부에서 일어나는 요청이기 때문에 HttpServletRequest, HttpServletResponse 객체가 새롭게 생성되지 않음(공유됨)
- RequestDispatcher dispatcher = request.getRequestDispatcher("포워드할 서블릿 또는 JSP")
- dispatcher.forward(request, response)
