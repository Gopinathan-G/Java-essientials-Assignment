package com.Quiz;

public class Game {
    Question[] questions=new Question[5];
    Player player=new Player();
    String[]questionsdata={"who is the father of our nation?"," Which of the following is not a Java features? ","Which state has the largest area?","Which package contains the Random class?","Which is the largest coffee producing state of India?"};
    String[]Option1={"Subhash Chandra Bose","Use of pointers ","Madhya Pradesh","java.lang package","Tamil Nadu"};
    String[]Option2={"Jawaharlal Nehru","Architecture Neutral","Rajasthan","java.awt package","Karnataka"};
    String[]Option3={"Mahatma Gandhi","Dynamic","Maharashtra","java.io package","Kerala"};
    String[]Option4={"Sardar Vallabhbhai Patel","Object-oriented","Uttar Pradesh","java.util package","Gujarat"};
    int[] Answer={3,1,2,4,3};


    public void initGame()
    {
      for (int i=0;i<5;i++){
          questions[i]=new Question();
      }
      questions[0].Question=" who is the father of our nation? ";
      questions[0].Option1="Subhash Chandra Bose";
      questions[0].Option2="Jawaharlal Nehru";
      questions[0].Option3="Mahatma Gandhi";
      questions[0].Option4="Sardar Vallabhbhai Patel";
      questions[0].CorrectAnswer=3;


      questions[1].Question=" Which of the following is not a Java features? ";
      questions[1].Option1="Use of pointers ";
      questions[1].Option2="Architecture Neutral";
      questions[1].Option3="Dynamic";
      questions[1].Option4="Object-oriented";
      questions[1].CorrectAnswer=1;

      questions[2].Question="Which state has the largest area?";
      questions[2].Option1="Madhya Pradesh";
      questions[2].Option2="Rajasthan";
      questions[2].Option3="Maharashtra";
      questions[2].Option4="Uttar Pradesh";


        questions[3].Question="Which package contains the Random class?";
        questions[3].Option1="java.lang package";
        questions[3].Option2="java.awt package";
        questions[3].Option3="java.io package";
        questions[3].Option4="java.util package";
        questions[3].CorrectAnswer=4;

        questions[4].Question="Which is the largest coffee producing state of India?";
        questions[4].Option1="Tamil Nadu";
        questions[4].Option2="Karnataka";
        questions[4].Option3="Kerala";
        questions[4].Option4="Gujarat";
        questions[4].CorrectAnswer=2;


        for(int i=0;i<5;i++)
        {

            questions[i].Question=questionsdata[i];
            questions[i].Option1=Option1[i];
            questions[i].Option2=Option2[i];
            questions[i].Option3=Option3[i];
            questions[i].Option4=Option4[i];
            questions[i].CorrectAnswer=Answer[i];
        }


}
    public void play()
    {
        player.getDetails();
        for (int i=0;i<5;i++)
        {
            Boolean Status=questions[i].askQuestion();
            if (Status==true)
            {
                System.out.println("You done really well");
                player.Score=player.Score+5;
            }
            else {
                System.out.println("You need to study ");
                player.Score=player.Score-5;
                }
        }
        System.out.println(player.name+" Your Score is "+player.Score);

    }
}
