function addDiv() {
    let newDiv = document.createElement("Div");
    console.log(newDiv);
    newDiv.innerHTML = "가"
    newDiv.innerHTML = "나"
    let card_list = document.querySelector(".card-list")
    card_list.append(newDiv);
}


