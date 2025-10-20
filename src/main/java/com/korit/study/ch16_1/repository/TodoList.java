package com.korit.study.ch16_1.repository;


import com.korit.study.ch16_1.entity.Todo;

public class TodoList {
    private Todo[] todos;

    // ??
    public TodoList() {
        todos = new Todo[0];
    }

    public int generatedTodoId() {
        int newId = 1;
        if (todos.length == 0) {
            return 1;
        }
        // ?
        // newId = todos[todos.length -1].id;
        return todos.length == 0 ? 1 : todos[todos.length -1].getId() + 1;
        // id를 꺼내오는 과정
    }

    public Todo[] getTodos() {
        return todos;
    }


    // ?
    // Todo를 리스트에 추가하기
    public void add(Todo todo) {
        Todo[] temp = new Todo[todos.length + 1];
        for (int i = 0; i < todos.length; i++) {
            temp[i] = todos[i];
        }
        temp[temp.length -1] = todo;
        todos = temp;
    }

    // ?
    // 다건 조회하기
    public Todo[] findAllByUserId(int userId) {
        int foundTodoCounter = 0;
        for (Todo todo : todos) {
            if (todo.getUser().getId() == userId) {
                foundTodoCounter++;
            }
        }
        Todo[] foundTodos = new Todo[foundTodoCounter];
        for (int i = 0, j = 0; i < todos.length; i++) {
            if (todos[i].getUser().getId() == userId) {
                foundTodos[j] = todos[i];
                j++;
                }
            }
        return foundTodos;
    }
}


/*
*
*
* 좋아 👍 아주 좋은 질문이야.
이 코드를 이해하면 **"배열을 이용한 간단한 자료저장 구조"**(일종의 미니 DB)를 감 잡을 수 있어.
하나씩 풀어볼게 — 왜 이런 식으로 배열을 정의했는지, 그리고 왜 복사 과정을 거치는지.

---

## 🧩 1. 전체 코드의 목적

이 클래스(`TodoList`)는 말 그대로 **할 일(Todo)** 목록을 저장하고 관리하는 **작은 데이터 저장소 역할**을 해.
즉, 데이터베이스(DB) 없이 **배열만으로** 데이터를 저장·추가·조회하려는 거야.

> 쉽게 말해 → “배열을 이용한 임시 DB”를 직접 만든 거야.

---

## 🧠 2. 배열을 이렇게 정의하는 이유

```java
private Todo[] todos;
```

→ `Todo` 객체 여러 개를 담을 **배열 변수**야.
지금은 크기를 정하지 않았지?
그래서 생성자에서 이렇게 초기화해 👇

```java
public TodoList() {
    todos = new Todo[0]; // 처음에는 아무것도 없는 상태
}
```

✅ 즉,
**처음엔 빈 배열**로 시작하고,
새로운 Todo가 생길 때마다 하나씩 늘려나가는 구조야.

---

## 📈 3. 배열은 “길이 변경 불가능”하기 때문이야

배열의 핵심 제약:

> 한 번 크기가 정해지면 변경할 수 없어.

예를 들어,
`new Todo[3]` 이렇게 만들면
그 배열에는 **3개까지만** 담을 수 있고,
그 이상 추가하려면 **새 배열을 만들어서 옮겨야 해.**

그래서 아래 코드가 등장함 👇

```java
public void add(Todo todo) {
    Todo[] temp = new Todo[todos.length + 1];  // 새 배열 (기존보다 1칸 큰)
    for (int i = 0; i < todos.length; i++) {
        temp[i] = todos[i];  // 기존 데이터 복사
    }
    temp[temp.length -1] = todo; // 마지막 칸에 새 Todo 추가
    todos = temp; // temp를 현재 배열로 교체
}
```

> 즉, 배열은 한 번 만든 뒤에 크기를 바꿀 수 없으니까
> “조금 더 큰 배열을 새로 만들고 → 기존 것 복사 → 새 요소 추가”
> 이렇게 “확장하는 방식”으로 새 배열을 만든 거야.

---

## 💡 4. 이 방식을 이해하면, “ArrayList”가 왜 필요한지도 알게 돼

자바의 `ArrayList`는 사실 이런 과정을 내부에서 자동으로 해주는 클래스야.

* `ArrayList.add()` → 내부에서 배열 크기 확인
* 부족하면 새 배열 생성 후 복사
* 개발자는 몰라도 됨

즉, 위 코드는 `ArrayList`가 하는 일을 직접 구현한 “원시적인 버전”이야.
학습용으로 배열의 원리를 익히는 데 목적이 있어.

---

## 🔍 5. findAllByUserId 이해

이 함수는 특정 사용자의 할 일만 뽑아내는 기능이야.

```java
public Todo[] findAllByUserId(int userId) {
    int foundTodoCounter = 0;
    for (Todo todo : todos) {
        if (todo.getUser().getId() == userId) {
            foundTodoCounter++;
        }
    }
    Todo[] foundTodos = new Todo[foundTodoCounter];
    for (int i = 0, j = 0; i < todos.length; i++) {
        if (todos[i].getUser().getId() == userId) {
            foundTodos[j] = todos[i];
            j++;
        }
    }
    return foundTodos;
}
```

단계적으로 보면:

1. `for`문 1: 조건에 맞는 `Todo`가 몇 개인지 센다 → 배열 크기를 정하기 위해서
2. 그 크기만큼 새 배열을 만든다.
3. `for`문 2: 조건 맞는 애들만 새 배열에 복사한다.
4. 반환한다.

---

## 🧭 요약 정리

| 코드 부분                  | 의미                             |
| ---------------------- | ------------------------------ |
| `todos = new Todo[0];` | 처음엔 빈 배열로 시작                   |
| `add()`                | 배열 크기 늘리면서 새로운 Todo 추가         |
| `generatedTodoId()`    | 마지막 Todo의 ID에 +1               |
| `findAllByUserId()`    | 특정 userId의 Todo만 추출            |
| ❗ 왜 배열 쓰나              | DB나 ArrayList 없이 기본 구조를 배우기 위해 |
| ❗ 왜 복사하나               | 배열은 길이를 바꿀 수 없기 때문             |

---

## 🔧 비유로 설명하자면

> 📦 “박스(Todo[])에 물건(Todo)을 넣는 가게”를 만든다고 해보자.

* 처음엔 박스가 비어 있음 → `new Todo[0]`
* 물건이 들어오면 새 박스를 하나 더 큰 걸로 만듦 → `new Todo[length+1]`
* 기존 물건을 새 박스로 옮김
* 새 물건도 마지막 칸에 넣음
* 새 박스를 다시 가게의 메인 박스로 등록

이걸 자동으로 해주는 게 `ArrayList`야.

---


*
*
*
* */
