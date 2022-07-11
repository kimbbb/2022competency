// var 중복 선언이 가능
// let - 할당 가능
// const - 할당 후 변경 불가능 (선언 동시에 값 초기화)

// const n1 = '홍길동';
// const n2 = "홍길동";
// const n3 = `이순신 ${n1} ${n2}`;

// console.log(n1);
// console.log(n2);
// console.log(n3);

// const person = {
//   name:'홍길동',
//   age:20,
// }
// console.log(person);

// func();

// function func() {
//   console.log(`call func()`);
// }

// const ary=[10, 20, 30];
// console.log(ary, ary.length);

// let a = "A";
// let b = 2;
// console.log(a*b);

// console.log(NaN == NaN); //false

// function func(a) {
//   console.log(a);
// }
// func();
// func(100);
// func(100, 200);

// f1();
// var f1 = function(){
//   console.log("Call f1");
// }

// function f1() {
//   console.log('Call f1');
// }

// function func(name='기본값', age=0) {
//   console.log(name, age);
// }

// func('홍길동');
// func();

// function func(n) {
//   if(n<=1) return n;
//   return n * arguments.callee(n-1);
// }

// func(10);

// function aaa() {
//   console.log(arguments.length);
//   for(let i=0; i<arguments.length; i++){
//     console.log(arguments[i]);
//   }
// }

// aaa(10,20,30);

// function print(name, age) {
//   console.log(`이름:${name}`);
//   console.log(`연령:${age}`);
// }

// print({name:'홍길동', age:20});

// let str = 'abc';
// str.substring();

// let ary=[1,2,3,4];
// ary.sort();

// let ary=[1,2,3,4];
// ary.map();

// function func (){
//   callback();
// }

// function a (){
//   console.log('a호출');
// }
// func(a);


// function func(...args) {
//   console.log(args.length);
//   for(let value of args){
//     console.log(value);
//   }
// }
// func(1,2,3);


// () => {
//   console.log('call func');
// }

// function (a) {
//   return a+10;
// }

// (a)=> a+10;

// a=>{ //인수 하나면 괄호 생략 가능, 인수 없거나 두개 이상이면 괄호 필요
//   return a+10;
// }

// function func(n) {
//   return n*100;
// }

// n=>n*100

// function Person(name, age){
//   this.name=name;
//   this.age=age;
// }

// const p1=new Person('길동이',20);
// const p2=new Person('둘리',5);
// // console.log(p1['age']);
// // console.log(p2.name);
// Person.prototype.show = function() {
//   console.log(`이름 : ${this.name}`);
// }
// p1.show();
// p2.show();

// let money = '100000';
// String.prototype.toLocaleString = function () {
//   let value = parseInt(this);
//   return value.toLocaleString()+'원';
// }
// console.log(money.toLocaleString());

// let person = {name:'홍길동', age:21};
// for(let key in person){
//   console.log(person[key]);
// }

// function makePerson(name,age){
//   return {name, age};
// }

// let person = makePerson('홍길동', 21);
// console.log(person);

// function Person(name, age) { //생성자 함수는 첫글자 대문자
//   this.name = name;
//   this.age = age;
//   // this.show = function () {
//   //   console.log(`${this.name}, ${this.age}`);
//   // }
// }

// Person.prototype.show = function () {
//   console.log(`${this.name}, ${this.age}`);
// }

// let person = new Person('도경수', 30);
// let person2 = new Person('디오', 93);
// console.log(person);
// console.log(person2);

// class Person{
//   constructor(name, age){
//     this.name=name;
//     this.age=age;
//   }

//   show(){
//     console.log(`이름 : ${this.name}`);
//     console.log(`연령 : ${this.age}`);
//   }
// }

// let p1 = new Person();
// console.log(p1);

// let p1 = new Person('홍', 20);
// console.log(p1 instanceof Person);
// console.log(p1 instanceof Number);
// console.log(p1 instanceof Object);
// console.log(typeof p1);
// console.log(typeof 'abc');

// let a ='A';
// let b = 20;
// let c = a*c;
// console.log(c===NaN);
// console.log(Number.isNaN(c));
// let str = '100';
// console.log(Number.parseInt(str,8));

// let str = '11A1';
// console.log(new Number(str));
// console.log(Number.perseInt(str));

// let str = 1000;
// console.log(str.toString(16));

// let num = Number.parseInt('FF', 16);
// console.log(num.toString(16));

// let ary = [1,2,3,4,5,6,7,8,9,10];
// ary.splice(5, 5, 10,20, 30, 40, 50);
// console.log(ary);

// let ary = [1,2,3,4,5,6,7,8,9,10];
// ary.forEach(v => {
//   console.log(v);
// });

// let ary=[1,2,3,4,5,6,7,8,9,10];
// ary.find();

// let ary = [1,2,3,4,5,6,7,8,9,10];
// let f = ary.find(function (item) {
  
// if(item === 5)
//   return true;
// return false;
// });
// console.log(f);

// let ary = [1,2,3,4,5,6,7,8,9,10];
// // let f = ary.filter(item=>item%2);
// // console.log(f)

// let f = ary.map(item=>{
//   if(item % 2 === 0)
//     return '짝수';
//   return '홀수';
// });
// console.log(f);

// let tel = ['017', '233', '8409'];
// console.log(tel.join('-'));

// let addr = "서울:::영등포구:::도산로";
// let ad = addr.split("");
// console.log(ad);

let jumsu = [89,78,87,97,80];
// jumsu.sort((current, next) => current-next);
// console.log(jumsu);
// jumsu.reduce(함수(이전값, 현재값){

// });
// 0번원소일때
// 함수(이전값, 89){
//   return 111;
// }
// 함수(111,78){
//   return 222;
// }
// 함수(222, 87){
//   return 333;
// }

let result = jumsu.reduce(function (prev) {
  
})