# Spring Boot CRUD 게시판

Spring Boot와 JPA를 활용하여 기본적인 웹 게시판(CRUD) 기능을 구현하며 웹 애플리케이션의 흐름을 이해하기 위한 학습용 프로젝트입니다.

## 프로젝트 개요
- **목적:** Spring Boot 기반 웹 애플리케이션의 기본 흐름 및 JPA의 이해
- **개발 기간:** 2026년 5월 27일 ~
- **주요 기능:** 게시글 작성, 읽기, 수정, 삭제(CRUD)

## 기술 스택
| 분류 | 기술 |
| --- | --- |
| **언어** | Java 17 |
| **프레임워크** | Spring Boot 3.x |
| **빌드 도구** | Maven |
| **데이터베이스** | MySQL |
| **ORM** | Spring Data JPA |
| **템플릿 엔진** | Thymeleaf |
| **라이브러리** | Lombok, Spring DevTools |

## 요구사항 정의
- **게시글 목록 조회:** 작성된 글 목록 확인 (향후 페이징 처리 추가)
- **게시글 상세 보기:** 제목 클릭 시 특정 게시글 내용 확인
- **게시글 작성/수정/삭제:** 제목, 내용, 작성자 입력 후 처리
- **시간 자동 기록:** JPA Auditing을 활용한 등록일, 수정일 자동 저장

## 데이터베이스 설계 (Board 테이블)

| 컬럼명 | 타입 | 설명 | 제약 조건 |
| --- | --- | --- | --- |
| id | Long/Integer | 고유 번호 | PK, Auto Increment |
| title | String | 게시글 제목 | Not Null, 100자 이내 |
| content | Text | 게시글 내용 | Not Null |
| writer | String | 작성자 이름 | Not Null |
| created_at | LocalDateTime | 생성 시간 | 기본값: 생성 시점 시간 |
| updated_at | LocalDateTime | 수정 시간 | 기본값: 수정 시점 시간 |

## API 명세

| 기능 | Method | URL | 설명 |
| --- | --- | --- | --- |
| **목록 조회** | GET | `/board/list` | 전체 게시글 목록 페이지 이동 |
| **상세 조회** | GET | `/board/view` | 특정 게시글 상세 보기 (파라미터: `id`) |
| **글쓰기 폼** | GET | `/board/write` | 게시글 작성 페이지 이동 |
| **글쓰기 처리**| POST | `/board/writepro` | 게시글 저장 후 목록으로 리다이렉트 |
| **수정 폼** | GET | `/board/modify/{id}`| 기존 글 수정 페이지 이동 (예정) |
| **수정 처리** | POST | `/board/update/{id}`| 게시글 수정 후 상세 페이지 이동 (예정) |
| **삭제 처리** | GET | `/board/delete` | 게시글 삭제 후 목록으로 리다이렉트 (예정) |

## 향후 확장 계획
- 게시판 페이징 및 정렬 처리
- 검색 기능 추가 (제목, 내용, 작성자 기준)
- 댓글 기능 구현
- 로그인 및 회원가입 연동
- 파일 첨부 기능 구현
