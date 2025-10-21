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
4. 이 방식을 이해하면, “ArrayList”가 왜 필요한지도 알게 돼

자바의 `ArrayList`는 사실 이런 과정을 내부에서 자동으로 해주는 클래스야.

* `ArrayList.add()` → 내부에서 배열 크기 확인
* 부족하면 새 배열 생성 후 복사

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
