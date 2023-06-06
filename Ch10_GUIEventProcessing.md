# Chapter 10 GUI 이벤트 처리

## 10.1 이벤트 처리 개요

### 이벤트란?

- Event-driven programming(이벤트 구동 프로그래밍): 어떤 이벤트가 일어나는지를 감시하고 있다가 이벤트가 발생하면 적절한 처리를 해주는 프로그래밍 방식
- Event: 사용자가 버튼을 클릭하거나 마우스를 움직이거나 키를 누르면 발생한다.

|Term|Description|Example|
|---|---|---|
|이벤트 객체|발생한 이벤트에 대한 정보를 가지고 있는 객체|마우스 이벤트 객체라면 현재 위치, 버튼 눌림 상태 등을 가지고 있다.|
|이벤트 소스|이벤트를 생성하는 컴포넌트|버튼이 이벤트를 발생하였다면 그 버튼은 이벤트 소스다.|
|이벤트 리스너|발생된 이벤트 객체에 반응하여서 이벤트를 처리하는 객체. 이벤트를 처리하기 위하여 이벤트에 귀를 기울이고 있는 객체.|버튼에서 발생하는 이벤트를 처리하려면 이벤트 리스너를 버튼에 등록해야 한다.|

### 이벤트 처리 과정

1. 이벤트를 작성한다.
    - 리스너 인터페이스: 종류에 따른 이벤트를 처리하기 위한 규격
    - 클래스가 이벤트 리스너가 되려면 해당하는 리스너 인터페이스를 구현해야 한다.

2. 이벤트 리스너를 컴포넌트에 등록한다.
    - 각 컴포넌트가 제공하는 이벤트를 등록할 수 있는 메소드를 이용한다.

### 이벤트 객체

- 이벤트 객체는 발생된 이벤트에 대한 모든 정보를 리스너로 전달한다.
- 이벤트 객체는 getSource() 메소드를 가진다.
- getSource() 메소드: 이벤트가 발생한 이벤트 소스를 Object 타입으로 반환한다. 이것을 필요한 타입으로 형변환해서 사용해야 한다.

## 10.2 이벤트 처리 방법

## 10.3 스윙 컴포넌트의 이벤트

## 10.4 키 이벤트

## 10.5 Mouse와 Mousemotion 이벤트

## 10.6 이벤트 클래스