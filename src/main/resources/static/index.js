
async function listAnimals(){
    const response = await fetch("http://localhost:8080/animals");
    const animalList = (await response).json();
    console.log(animalList);
}
listAnimals();