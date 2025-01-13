const cardsContainer = document.querySelector(".container");

cardsContainer.addEventListener("click", (e) => {
  const target = e.target.closest(".card");

  if (!target) return;

  cardsContainer.querySelectorAll(".card").forEach((card) => {
    card.classList.remove("active");
  });

  target.classList.add("active");
});


let more = document.querySelector('.container');
let audioArr = document.getElementsByTagName("audio");

more.addEventListener('mouseenter', ()=>{
    audioArr[0].play();
})

more.addEventListener('mouseleave', ()=>{
    audioArr[0].pause();
})


function Cyruspage(){
   location.href = "FERNANDEZ/Cyrus_Portfolio.html";
}
function Laxamanapage(){
  location.href = "LAXAMANA/PROFILE.html";
}
function Alvinpage(){
  location.href = "LEONES/Portfolio/portfolio.html";
}
function Elsonpage(){
  location.href = "QUIAMBAO/index.html";
}