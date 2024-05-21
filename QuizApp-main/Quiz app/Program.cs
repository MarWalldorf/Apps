﻿class QuizProgram
{

    static void Main()
    {

        string[] questions =
        {
        "What book holds the record for the fastest selling book in history?",
        "How old was Queen Elizabeth II when she was first crowned the Queen of England?",
        "Which blood type is a universal donor?"
        };

        string[] answers =
        {
            "A. The Hunger Games \nB. Harry Potter and the Dealthy Hallows \nC. To Kill A Mockingbird",
            "A. 27 \nB. 24 \nC. 31",
            "A. 0 negative \nB. B positive \nC. AB"
        };

        int[] correctAnswers = { 1, 1, 0 };
        int playerScore = 0;

        Console.WriteLine("Welcome to the best Quiz App ever :)");
        for (int i = 0; i < questions.Length; i++)
        {
            Console.WriteLine("Question" + (i + 1));
            Console.WriteLine(questions[i]);
            Console.WriteLine(answers[i]);
            Console.Write("Please enter your answer ('A','B' or 'C'): ");
            string playerAnswer = Console.ReadLine();


            if (string.Equals(playerAnswer, "A", StringComparison.OrdinalIgnoreCase) && correctAnswers[i] == 0)
            {
                playerScore++;
            }
            else if (string.Equals(playerAnswer, "B", StringComparison.OrdinalIgnoreCase) && correctAnswers[i] == 1)
            {
                playerScore++;
            }
            else if (string.Equals(playerAnswer, "C", StringComparison.OrdinalIgnoreCase) && correctAnswers[i] == 2)
            {
                playerScore++;
            }
        }

        Console.WriteLine("Quiz completed!");
        Console.WriteLine("Your score is: " + playerScore + "/" + questions.Length);
    }

}