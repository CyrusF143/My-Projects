var questions = [
    "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"];

    var GetQuestion;

        // Function to select a random question from the array
        function getRandomQuestion() {
        var randomIndex = Math.floor(Math.random() * questions.length);
        return questions[randomIndex];
        }

        // Function to display the quiz
        function displayQuiz() {
        var numQuestionsDisplayed = 0;

        GetQuestion = getRandomQuestion();
        const changeText = document.querySelector("#quiz");
        changeText.textContent = ("Identify the Letter ' "+ GetQuestion + " '");


        // Loop until max number of questions are displayed
        /*while (numQuestionsDisplayed < 1) {
            var question = getRandomQuestion();
            console.log (question + "question");

            const changeText = document.querySelector("#quiz");
            changeText.textContent = question;

            numQuestionsDisplayed++;
            return question;
        }*/
        }

        function checking(val, btn){  
           /* var BtnLet = document.getElementById(btn);*/
           var BtnLet = document.getElementById(btn).innerHTML = val;
            var Let = GetQuestion
           if(BtnLet == GetQuestion){

            setTimeout(function(){ 
                var audio = new Audio('JavaScript/src/Congratulations, you are correct!.mp3');
                audio.play();
                
                }, 500) 

            console.log ("Correct");
            console.log (BtnLet + "btn");
            console.log (GetQuestion + "ques");
           }else{

            setTimeout(function(){ 
                var audio = new Audio('JavaScript/src/Sorry, you are wrong!.mp3');
                audio.play();
                }, 500) 

            console.log ("not equal");
            console.log (BtnLet + "btn");
            console.log (GetQuestion + "ques");
           }

           displayQuiz();

        }



