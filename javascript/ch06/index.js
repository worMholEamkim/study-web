//오브젝트 - 배열 비교
//number, str, array(object)
//boolean, object, null
let soccer = {
    name:"축구",
    count:11,
    need:"공"
}


let people = {
    name:"wormhole",
    phone:"01072222220",
    address:"busan",
    age:20,
    hobby:["농구",soccer,"음악"]
}
console.log(people);
console.log(people.hobby[1]);
console.log(people.hobby[1].count);

//오브젝트 = 사물
console.log(people);
console.log(typeof people);

console.log(people.name);
console.log(people.phone);
console.log(people.address);
console.log(people.age);


//배열과 오브젝트=딕션의 차이, 키값의 유무.
let num = [1, 2, 3, 4, 5];

let num2 = {
    one:1,
    two:2,
    three:3,
    four:4,
    five:5,
}
console.log(num2.one)

//1학년 7반이 있는데 각 반에 학생수
//30, 20, 20, 30, 20, 30, 20, 20
let c = [30, 20, 20, 30, 20, 30, 20, 20];