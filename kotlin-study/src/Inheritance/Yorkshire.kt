package Inheritance

// : SuperclassName() 빈 괄호는 슈퍼클래스 기본 생성자 호출
class Yorkshire : Dog() {
    //메서드나 속성 재정의는 override
    override fun sayHello() {
        println("wif wif!")
    }
}