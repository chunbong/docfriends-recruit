# Doctalk API
이 프로젝트의 목적은 Doctalk 앱의 데이터를 반환하는 RESTFul API를 만드는 것 입니다.

전달되는 앱의 형태를 확인하여 DB 구조를 직접 작성 후 하단의 기능을 작동하는 API를 만들어주시면 됩니다.

DB구조에 정확한 정답은 없으며, 해당 구조로 만든 이유를 설명할 수 있으면 됩니다.

프론트 페이지는 작성하실 필요 없으며, API 호출시 반환되는 json 데이터를 확인 할 수 있으면 됩니다.

# Guidelines
- Doctalk 앱을 확인해 보시면 더 정확한 DB 구조를 작성하는게 가능합니다.
- Starter Kit 등을 사용해서 프로젝트 시작하셔도 됩니다.
- 완벽하게 REST한 API를 만들지 않아도 됩니다. REST의 개념을 아는 수준이면 됩니다.
- readme에 해당 설정 방법을 적어주세요
- 작업을 commit 단위로 나눠주세요(필수)
- 테스트 코드가 포함되어있으면 높은 가산점을 드립니다.(옵션)

# APIs

- Login API Example(email login)

    <img src="doctalk_login.PNG" width="300" height="500">

    이메일, 비밀번호가 일치 할 경우 success를 반환 해주세요

- Main List API1 Response Example

    <img src="doctalk_main_list.PNG" width="300" height="400">

    위 이미지의 데이터 리스트를 반환 해주세요

- Consult Detail Response Example
    - Question

        <img src="doctalk_question.PNG" width="300" height="290">

    - Answer

        <img src="doctalk_answer.PNG" width="300" height="500">

    위 이미지의 데이터를 반환 해주세요

<br>

# Login API

### Request

**URL** : ```/login```

```json
{
  "email" : "user02@gmail.com",
  "password" : "2222"
}
```

### Response

이메일, 비밀번호가 일치하는 경우

```json
{
  "result_message": "success"
}
```

이메일, 비밀번호가 일치하지 않는 경우

```json
{
  "result_message": "fail"
}
```

<br>

# Main List API

### Request

**URL** : ```"/"```

### Response

```json
{
  "location": "수원",
  "age": 24,
  "gender": "남",
  "title": "여드름, 피부가 건조하면 등여드름이 잘 생겨요",
  "tag_list":[
  	"#한방피부과"
  ],
  "content": "제가 얼굴이며 몸이며, 피부가 정말 악건성인데...등여드름이 정말 자주 생겨요. 바디로션도 꾸준히 바르는데, 심하진 않아도 주기적으로 자잘하게 등여드름이 생기면 어떻게 해결해야 하는 ...",
  "answer_cnt": 0,
  "created_at": "2019-09-05"
},
{
  "location": "울산",
  "age": 23,
  "gender": "여",
  "title": "여드름, 사용하던 선크림이 단종돼서 다른걸",
  "tag_list":[
  	"#한방피부과"
  ],
  "content": "선크림 영향인지 모르겠지만 최근 어쩔 수 없이",
  "answer_cnt": 0,
  "created_at": "2019-09-03"
}
```

