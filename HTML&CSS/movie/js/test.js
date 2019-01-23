let people = {
    name:"wormhole",
    age:20,
    hobby:["농구","노래"]
}
console.log(people)

let people_json = '{"name":"wormhole","age":20,"hobby":["농구","노래"]}';
console.log(people_json);

//자바스크립트 오브젝트 -> JSON 문자열로 바꿔줌
let change_json = JSON.stringify(people);
console.log(change_json);

//JSON 문자열 -> 자바스크립트 오브젝트
let change_object = JSON.parse(change_json);
console.log(change_object);
console.log(change_object.name);

