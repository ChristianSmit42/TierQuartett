const addButton = document.getElementById("addAnimal");
addButton.addEventListener("click",()=> addAnimal());


async function listAnimals(){
    const response = await fetch("animals");
    const animalList = await response.json();
    return animalList;
}
function renderAnimal(animal){
    const animalCard = document.createElement("div");
    animalCard.setAttribute("class", "card");
    animalCard.setAttribute("style", "width:15rem");
    animalCard.appendChild(renderCardBody(animal));
    return animalCard;
}

function renderCardBody(animal){
    const animalCardBody = document.createElement("div");
    animalCardBody.setAttribute("class", "card-body");

    const animalCardTitle = document.createElement("h5");
    animalCardTitle.setAttribute("class", "card-title");
    animalCardTitle.innerHTML = animal.name;

    animalCardBody.appendChild(animalCardTitle);

    const animalCardText = document.createElement("div");
    animalCardText.setAttribute("class", "card-text");

    const animalGender = document.createElement("li");
    animalGender.innerHTML = "gender: "+animal.gender;

    const animalAge = document.createElement("li");
    animalAge.innerHTML = "age: " + animal.age;

    const animalCute = document.createElement("li");
    animalCute.innerHTML = "cute: "+animal.cute;

    animalCardText.appendChild(animalCute);
    animalCardText.appendChild(animalAge);
    animalCardText.appendChild(animalGender);

    animalCardBody.appendChild(animalCardText);
    return animalCardBody;
}

async function createCardsAnimals(){
    const animals = await listAnimals();
    const element = document.getElementById("animals");
    element.innerHTML="";
    animals.forEach(animal => {
        const column = document.createElement("div");
        column.setAttribute("class", "col-12 col-sm-6 col-md-3 col-sm-2");
        const animalCard = renderAnimal(animal);
        column.appendChild(animalCard);
        element.appendChild(column);
    });
}
async function addAnimal(){
    const name =document.getElementById("name").value;
    const age = Number(document.getElementById("age").value);
    const gender = document.getElementById("gender").value;
    const cute = document.getElementById("cute").checked;
    const animal = {
        name,
        gender,
        age,
        cute
    }
    await sendAnimal(animal);
    createCardsAnimals().catch(console.error);
}

async function sendAnimal(animal){
    const response = await fetch("animals",
        {
            method: "PUT",
            headers: {
                "content-type": "application/json"
            },
            body: JSON.stringify(animal)
        });
}

createCardsAnimals().catch(console.error);
