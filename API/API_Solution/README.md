# Entity Relationship

- **Doctor**  1 : N   **Answer**
- **Question**  1 : N  **Answer**
- **User**  1 : N  **Question**
- **Question**  1 : N  **QuestionTagGroup**
- **Tag**  1 : N  **QuestionTagGroup**

<br>

# Login API

### Request

**URL** ( 프론트 페이지가 없어서 GET Method로 구현했습니다🙃 )

http://ec2-52-78-86-4.ap-northeast-2.compute.amazonaws.com/login?email=user01@gmail.com&password=aaaa

**Parameter** : email, password

```json
{
  "email" : "user01@gmail.com",
  "password" : "aaaa"
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

### Data

현재 데이터베이스에 등록된 User 정보입니다

|      email       | password |
| :--------------: | :------: |
| user01@gmail.com |   aaaa   |
| user02@gmail.com |   bbbb   |
| user03@gmail.com |   cccc   |

<br>

# Main List API

### Request

**URL**

http://ec2-52-78-86-4.ap-northeast-2.compute.amazonaws.com

### Response

```json
[
  {
    "location": "수원",
    "age": 24,
    "gender": "남",
    "title": "여드름 피부가 건조하면 등여드름이 잘 생기나요?",
    "tag_list": [
    	"한방피부과"
    ],
    "content": "제가 얼굴이며 몸이며, 피부가 정말 악건성인데...등여드름이 정말 자주 생겨요. 바디로션도 꾸준히 바르는데, 심하진 않아도 주기적으로 자잘하게 등여드름이 생기면 어떻게 해결해야 하는 걸까요",
    "answer_cnt": 1,
    "created_at": "2019-09-04",
    "source": null
  },
  {
    "location": "울산",
    "age": 23,
    "gender": "여",
    "title": "사용하던 선크림이 단종돼서 다른걸 사용했는데 여드름이 생기는 것 같아요",
    "tag_list": [
    	"한방피부과"
    ],
    "content": "선크림 영향인지 모르겠지만 최근 어쩔 수 없이 선크림 사용하던걸 바꿨는데 이런걸로 여드름이 생길 수 있나요??? 안 바르고 다닐 수도 없고 ㅠㅠ 그렇다고 이것저것 다 써볼수도 없구요 <생략>",
    "answer_cnt": 1,
    "created_at": "2019-09-02",
    "source": null
  },
  {
    "location": "수지풍덕천",
    "age": 37,
    "gender": "남",
    "title": "교통사고 한의원치료, 계속 누워있는 ...",
    "tag_list": [
    	"한방재활의학과"
    ],
    "content": "교통사고로 팔 수술을 하였습니다. 현재 깁스 하면서 현재 정형외과 입원중인데 계속 누워있으니 온몸이 뻐근하고 목어깨 쪽에도 통증이 와서 퇴원 후 한의원을 다녀볼까 합니다. <생략>",
    "answer_cnt": 1,
    "created_at": "2019-09-01",
    "source": null
  }
]
```

<br>

# Consult Detail API

### Requset

**URL** 

 http://ec2-52-78-86-4.ap-northeast-2.compute.amazonaws.com/1

**Parameter** : question ID

### Response

```json
{
  "question": {
    "location": "수원",
    "age": 24,
    "gender": "남",
    "title": "여드름 피부가 건조하면 등여드름이 잘 생기나요?",
    "tag_list": [
    	"한방피부과"
    ],
    "content": "제가 얼굴이며 몸이며, 피부가 정말 악건성인데...등여드름이 정말 자주 생겨요. 바디로션도 꾸준히 바르는데, 심하진 않아도 주기적으로 자잘하게 등여드름이 생기면 어떻게 해결해야 하는 걸까요",
    "answer_cnt": 1,
    "created_at": "2019-09-04",
    "source": "http://miraesol.com"
  },
  "answer_list": [
    {
      "name": "정동원",
      "created_at": "2019-09-04",
      "content": "안녕하세요, 닥톡-네이버 지식iN 상담한의사 정동원입니다. 피부가 건조하면 모공의 입구가 잘 막히게 됩니다. 모공의 입구가 막혀버리면 자잘한 좁쌀여드름이 생기는 타입입니다. 바디로션이든 알로에젤이나 수딩젤 같은 보습제를 잘 발라주는 것은 좋습니다. 하지만 이미 생긴 등여드름은 절대 뜯지 마세요. 자국이나 흉이 생기기 때문입니다. <생략>"
    }
  ]
}
```

