/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a11thirunavukkarasu;

import java.util.Scanner;
/**
 *
 * @author Suvethan
 */
public class A11Thirunavukkarasu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        String name;            //string variable declared to store the user input in name.
        String decs1;            //string variable declared to store the user input in decs1.
        String decs2;            //string variable declared to store the user input in decs2.
        String decs3;            //string variable declared to store the user input in decs3.
        String decs4;            //string variable declared to store the user input in decs4.
        String decs5;            //string variable declared to store the user input in decs5.
        String decs6;            //string variable declared to store the user input in decs6.
        String decs7;            //string variable declared to store the user input in decs7.
        String decs8;            //string variable declared to store the user input in decs8.
        String decs9;            //string variable declared to store the user input in decs9.
        String decs10;            //string variable declared to store the user input in dec10s.
        String decs11;            //string variable declared to store the user input in decs11.
        String decs12;            //string variable declared to store the user input in decs12.
        
        System.out.println("Welcome to the 2019-2020 NBA Playoff Finals!!! What is your name?");            //Message outputted to prompt the user for their name.
        name = keyedInput.nextLine();           //user input stored in the variable name.
        
        System.out.println("Hello " + name + ", which team would you like to be a part of in the finals?\nA. Los Angeles Lakers\nB. Miami Heat");           //Outputting a message based on the user input and prompting the user for a choice.
        decs1 = keyedInput.nextLine();          //user input stored in the variable decs1.
        
        if (decs1.equals("A") || decs1.equals("a"))         //if statement used to determine the path taken based on the user's choice.
        {
            System.out.println("The Los Angeles Lakers are happy to have you on the team. Which starting position would you like to play?\nA. PG\nB. SG");           //Outputting a message based on the user input and prompting the user for a choice.
            decs2 = keyedInput.nextLine();          //user input stored in the variable decs2.
            if (decs2.equals("A") || decs2.equals("a"))         //if statement used to determine the path taken based on the user's choice.
            {
                System.out.println("Point Guard! That's great! You are now at the post-game press conference after Game 6 ended. The series is now tied 3-3. The first question asked by a reporter is \"What is your mindset on defence going into Game 7?\"\nA. Defence is important. \nB. Defence is not as important as our offense.");           //Outputting a message based on the user input and prompting the user for a choice.
                decs3 = keyedInput.nextLine();          //user input stored in the variable decs3.
                if (decs3.equals("A") || decs3.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                {
                    System.out.println("\"We just need to lockdown their major shooters and we can secure the dub.\"\nThe next reporter asks \"Do you think you can take on the Miami Heat in the final game?\" A. Answer the reporter's queston in a normal tone.\nB. Don't answer the reporter's question and end the conference.");           //Outputting a message based on the user input and prompting the user for a choice.
                    decs4 = keyedInput.nextLine();          //user input stored in the variable decs4.
                    if (decs4.equals("A") || decs4.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                    {
                        System.out.println("\"Yes, I do think we can take them on.\" That's all the time you have for the press conference. The story now jumps to the first quarter of game 7. You score 12 points but still down by 2. You get the ball.\nA. Shoot the three to get ahead.\nB. Pass it to LeBron James so he can tie it up.");           //Outputting a message based on the user input and prompting the user for a choice.
                        decs5 = keyedInput.nextLine();          //user input stored in the variable decs5.
                        if (decs5.equals("A") || decs5.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                        {
                            System.out.println("Congrats, You make the three! The first quarter ends and now you're in the second. You now have an open lane.\nA. Go for a flashy dunk.\nB. Go for the layup.");           //Outputting a message based on the user input and prompting the user for a choice.
                            decs6 = keyedInput.nextLine();          //user input stored in the variable decs6.
                            if (decs6.equals("A") || decs6.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                            {
                                System.out.println("YOU MISS THE DUNK! The other team grabs the ball and scores a three to tie up the game. The second quarter ends and your coach asks, \"What were you thinking?\"\nA. I thought it was the right moment.\nB. I wanted to give the crowd something to get hyped up for.");           //Outputting a message based on the user input and prompting the user for a choice.
                                decs7 = keyedInput.nextLine();          //user input stored in the variable decs7.
                                if (decs7.equals("A") || decs7.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                                {
                                    System.out.println("Coach replies with, \"Instead you made this game tied. One more play like that and you're benched.\" Three minutes left in the quarter and the ball is in your hands.\nA. Go left.\nB. Go right.");           //Outputting a message based on the user input and prompting the user for a choice.
                                    decs8 = keyedInput.nextLine();          //user input stored in the variable decs8.
                                    if (decs8.equals("A") || decs8.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                                    {
                                        System.out.println("You ankle break Jimmy Butler, drive in, go for the layup and get an and-one point conversion. You now go to the foul line.\nA. Bounce the ball twice.\nB. Bounce the ball three times.");           //Outputting a message based on the user input and prompting the user for a choice.
                                        decs9 = keyedInput.nextLine();          //user input stored in the variable decs9.
                                        if (decs9.equals("A") || decs9.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                                        {
                                            System.out.println("You make the shot. The game jumps to the final 24 seconds of the game. You're losing by one, 110-109! The ball once again, in your hands.\nA. Take the shot.\nB. Pass it to Anthony Davis.");           //Outputting a message based on the user input and prompting the user for a choice.
                                            decs10 = keyedInput.nextLine();          //user input stored in the variable decs10.
                                            if (decs10.equals("A") || decs10.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                                            {
                                                System.out.println("You take the shot. The ball begins to bounce. It bounces once again. For the third time, it bounces. IT GOES IN! CONGRADULATIONS! YOU HAVE WON THE CHAMPIONSHIP FOR THE LOS ANGELES LAKERS.\nTHE END");           //Outputting a message based on the user input.
                                            }
                                            else if (decs10.equals("B") || decs10.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                                            {
                                                System.out.println("You pass it to Anthony Davis. He's been in this situation before. He takes the shot. It bounces off of the rim, but it doesn't go in. The Miami Heat win the championship.\nTHE END");           //Outputting a message based on the user input.
                                            }
                                        }
                                        else if (decs9.equals("B") || decs9.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                                        {
                                            System.out.println("The extra bounce messes up your concentration and you miss the shot. You are now down 110-108 because of your failed attempt to get the foul shot in. The final 24 seconds of the game starts. You dribble the ball up the court.\nA. Pass the ball to LeBron James.\nB. Take the three point shot.");           //Outputting a message based on the user input and prompting the user for a choice.
                                            decs12 = keyedInput.nextLine();          //user input stored in the variable decs12.
                                            if (decs12.equals("A") || decs12.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                                            {
                                                System.out.println("You pass the ball to LeBron James. He takes the shot. The ball begins to bounce. It bounces once again. For the third time, it bounces. IT GOES IN! CONGRADULATIONS! LEBRON JAMES WINS THE CHAMPIONSHIP FOR THE LOS ANGELES LAKERS.\nTHE END");           //Outputting a message based on the user input.
                                            }
                                            else if (decs12.equals("B") || decs12.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                                            {
                                                System.out.println("You take the three point the shot. It bounces off of the rim, but it doesn't go in. The Miami Heat win the championship.\nTHE END");           //Outputting a message based on the user input.
                                            }
                                        }
                                    }
                                    else if (decs8.equals("B") || decs8.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                                    {
                                        System.out.println("You go right, do a spin move and the ball goes out of bounds. The coach takes you out for reckless behaviour after he strictly told you to stop with the antics. The Lakers go on to lose without you.\nTHE END");           //Outputting a message based on the user input.
                                    }
                                }
                                else if (decs7.equals("B") || decs7.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                                {
                                    System.out.println("Coach replies with, \" That was the most selfish play I have ever seen a player do in the NBA Finals. You're out. I don't care, you're out\" The Lakers go on to lose without you.\nTHE END");           //Outputting a message based on the user input.
                                }
                            }
                            else if (decs6.equals("B") || decs6.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                            {
                                System.out.println("CONGRATS, you make the layup. OH NO!!! After going up for the layup you don't land properly and roll your ankle.\nA. Choose to continue.\nB. Go out of the game.");           //Outputting a message based on the user input and prompting the user for a choice.
                                decs11 = keyedInput.nextLine();          //user input stored in the variable decs11.
                                if (decs11.equals("A") || decs11.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                                {
                                    System.out.println("You decide to come back but the pain is unbearable. You go up for a shot but it doesn't end well. You are taken out of the rest of the game. The Lakers go on to lose without you.\nTHE END");           //Outputting a message based on the user input.
                                }
                                else if (decs11.equals("B") || decs11.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                                {
                                    System.out.println("You decide to stay out of the game. The Lakers go on to lose without you.\nTHE END");           //Outputting a message based on the user input.
                                }
                            }
                        }
                        else if (decs5.equals("B") || decs5.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                        {
                            System.out.println("You pass it to LeBron and he ties up the game. Congrats. However, he injures himself after going up for the dunk. The Los Angeles Lakers go on to lose the game after losing their star player.\nTHE END");           //Outputting a message based on the user input.
                        }
                    }
                    else if (decs4.equals("B") || decs4.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                    {
                        System.out.println("\"Is that seriously a question? C'mon man, you can do better than that. Nah I'm out of here.\" The feedback from the general population has been bad after your response to the reporter. The Los Angeles Lakers have decided to take you out of the game. The Lakers go on to lose without you.\nTHE END");           //Outputting a message based on the user input.
                    }
                }
                else if (decs3.equals("B") || decs3.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                {
                    System.out.println("\"We don't need defence. All we need is to get buckets so we can secure the dub.\" You are now taken out of the game for neglecting the coach's plan. The Lakers go on to lose without you. \nTHE END");           //Outputting a message based on the user input.
                }
            }
            else if (decs2.equals("B") || decs2.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
            {
                System.out.println("Shooting Guard! That's great! However, you will need to be benched because we have already filled out the Shooting Guard position for both the starting and bench position. The Lakers go on to lose without you. The Lakers Management sends you a letter about their mistake of not playing you.\nTHE END");           //Outputting a message based on the user input.
            }
        }
        else if (decs1.equals("B") || decs1.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
        {
             System.out.println("The Miami Heat are happy to have you on the team. Which starting position would you like to play?\nA. PG\nB. SG");           //Outputting a message based on the user input and prompting the user for a choice.
            decs2 = keyedInput.nextLine();          //user input stored in the variable decs2.
            if (decs2.equals("A") || decs2.equals("a"))         //if statement used to determine the path taken based on the user's choice.
            {
                System.out.println("Point Guard! That's great! You are now at the post-game press conference after Game 6 ended. The series is now tied 3-3. The first question asked by a reporter is \"What is your mindset on defence going into Game 7?\"\nA. Defence is important. \nB. Defence is not as important as our offense.");           //Outputting a message based on the user input and prompting the user for a choice.
                decs3 = keyedInput.nextLine();          //user input stored in the variable decs3.
                if (decs3.equals("A") || decs3.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                {
                    System.out.println("\"We just need to lockdown their major shooters and we can secure the dub.\"\nThe next reporter asks \"Do you think you can take on the Los Angeles Lakers in the final game?\" A. Answer the reporter's queston in a normal tone.\nB. Don't answer the reporter's question and end the conference.");           //Outputting a message based on the user input and prompting the user for a choice.
                    decs4 = keyedInput.nextLine();          //user input stored in the variable decs4.
                    if (decs4.equals("A") || decs4.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                    {
                        System.out.println("\"Yes, I do think we can take them on.\" That's all the time you have for the press conference. The story now jumps to the first quarter of game 7. You score 12 points but still down by 2. You get the ball.\nA. Shoot the three to get ahead.\nB. Pass it to Bam Adebayo so he can tie it up.");           //Outputting a message based on the user input and prompting the user for a choice.
                        decs5 = keyedInput.nextLine();          //user input stored in the variable decs5.
                        if (decs5.equals("A") || decs5.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                        {
                            System.out.println("Congrats, You make the three! The first quarter ends and now you're in the second. You now have an open lane.\nA. Go for a flashy dunk.\nB. Go for the layup.");           //Outputting a message based on the user input and prompting the user for a choice.
                            decs6 = keyedInput.nextLine();          //user input stored in the variable decs6.
                            if (decs6.equals("A") || decs6.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                            {
                                System.out.println("YOU MISS THE DUNK! The other team grabs the ball and scores a three to tie up the game. The second quarter ends and your coach asks, \"What were you thinking?\"\nA. I thought it was the right moment.\nB. I wanted to give the crowd something to get hyped up for.");
                                decs7 = keyedInput.nextLine();          //user input stored in the variable decs7.
                                if (decs7.equals("A") || decs7.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                                {
                                    System.out.println("Coach replies with, \"Instead you made this game tied. One more play like that and you're benched.\" Three minutes left in the quarter and the ball is in your hands.\nA. Go left.\nB. Go right.");           //Outputting a message based on the user input and prompting the user for a choice.
                                    decs8 = keyedInput.nextLine();          //user input stored in the variable decs8.
                                    if (decs8.equals("A") || decs8.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                                    {
                                        System.out.println("You ankle break Rajon Rando, drive in, go for the layup and get an and-one point conversion. You now go to the foul line.\nA. Bounce the ball twice.\nB. Bounce the ball three times.");           //Outputting a message based on the user input and prompting the user for a choice.
                                        decs9 = keyedInput.nextLine();          //user input stored in the variable decs9.
                                        if (decs9.equals("A") || decs9.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                                        {
                                            System.out.println("You make the shot. The game jumps to the final 24 seconds of the game. You're losing by one, 110-109! The ball once again, in your hands.\nA. Take the shot.\nB. Pass it to Goran Dragic.");           //Outputting a message based on the user input and prompting the user for a choice.
                                            decs10 = keyedInput.nextLine();          //user input stored in the variable decs10.
                                            if (decs10.equals("A") || decs10.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                                            {
                                                System.out.println("You take the shot. The ball begins to bounce. It bounces once again. For the third time, it bounces. IT GOES IN! CONGRADULATIONS! YOU HAVE WON THE CHAMPIONSHIP FOR THE MIAMI HEAT.\nTHE END");           //Outputting a message based on the user input.
                                            }
                                            else if (decs10.equals("B") || decs10.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                                            {
                                                System.out.println("You pass it to Goran Dragic. He's been in this situation before. He takes the shot. It bounces off of the rim, but it doesn't go in. The Los Angeles Lakers win the championship.\nTHE END");           //Outputting a message based on the user input.
                                            }
                                        }
                                        else if (decs9.equals("B") || decs9.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                                        {
                                            System.out.println("The extra bounce messes up your concentration and you miss the shot. You are now down 110-108 because of your failed attempt to get the foul shot in. The final 24 seconds of the game starts. You dribble the ball up the court.\nA. Pass the ball to Tyler Herro.\nB. Take the three point shot.");           //Outputting a message based on the user input and prompting the user for a choice.
                                            decs12 = keyedInput.nextLine();          //user input stored in the variable decs12.
                                            if (decs12.equals("A") || decs12.equals("a"))         //if statement used to determine the path taken based on the user's choice.
                                            {
                                                System.out.println("You pass the ball to Tyler Herro. He takes the shot. The ball begins to bounce. It bounces once again. For the third time, it bounces. IT GOES IN! CONGRADULATIONS! TYLER HERRO WINS THE CHAMPIONSHIP FOR THE LOS ANGELES LAKERS.\nTHE END");           //Outputting a message based on the user input and prompting the user for a choice.
                                            }
                                            else if (decs12.equals("B") || decs12.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                                            {
                                                System.out.println("You take the three point the shot. It bounces off of the rim, but it doesn't go in. The Miami Heat win the championship.\nTHE END");           //Outputting a message based on the user input.
                                            }
                                        }
                                    }
                                    else if (decs8.equals("B") || decs8.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                                    {
                                        System.out.println("You go right, do a spin move and the ball goes out of bounds. The coach takes you out for reckless behaviour after he strictly told you to stop with the antics. The Heat go on to lose without you.\nTHE END");           //Outputting a message based on the user input.
                                    }
                                }
                                else if (decs7.equals("B") || decs7.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                                {
                                    System.out.println("Coach replies with, \" That was the most selfish play I have ever seen a player do in the NBA Finals. You're out. I don't care, you're out\" The Heat go on to lose without you.\nTHE END");           //Outputting a message based on the user input.
                                }
                            }
                            else if (decs6.equals("B") || decs6.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                            {
                                System.out.println("CONGRATS, you make the layup. OH NO!!! After going up for the layup you don't land properly and roll your ankle.\nA. Choose to continue.\nB. Go out of the game.");           //Outputting a message based on the user input and prompting the user for a choice.
                                decs11 = keyedInput.nextLine();          //user input stored in the variable decs11.
                                if (decs11.equals("A") || decs11.equals("a"))
                                {
                                    System.out.println("You decide to come back but the pain is unbearable. You go up for a shot but it doesn't end well. You are taken out of the rest of the game. The Heat go on to lose without you.\nTHE END");           //Outputting a message based on the user input.
                                }
                                else if (decs11.equals("B") || decs11.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                                {
                                    System.out.println("You decide to stay out of the game. The Heat go on to lose without you.\nTHE END");           //Outputting a message based on the user input.
                                }
                            }
                        }
                        else if (decs5.equals("B") || decs5.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                        {
                            System.out.println("You pass it to Bam Adebayo and he ties up the game. Congrats. However, he injures himself after going up for the dunk. The Heat go on to lose the game after losing their star player.\nTHE END");           //Outputting a message based on the user input.
                        }
                    }
                    else if (decs4.equals("B") || decs4.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                    {
                        System.out.println("\"Is that seriously a question? C'mon man, you can do better than that. Nah I'm out of here.\" The feedback from the general population has been bad after your response to the reporter. The Miami Heat have decided to take you out of the game. The Heat go on to lose without you.\nTHE END");           //Outputting a message based on the user input.
                    }
                }
                else if (decs3.equals("B") || decs3.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
                {
                    System.out.println("\"We don't need defence. All we need is to get buckets so we can secure the dub.\" You are now taken out of the game for neglecting the coach's plan. The Heat go on to lose without you. \nTHE END");           //Outputting a message based on the user input.
                }
            }
            else if (decs2.equals("B") || decs2.equals("b"))         //else if statement used to determine the path taken based on the user's choice.
            {
                System.out.println("Shooting Guard! That's great! However, you will need to be benched because we have already filled out the Shooting Guard position for both the starting and bench position. The Heat go on to lose without you. The Miami Heat Management sends you a letter about their mistake of not playing you.\nTHE END");           //Outputting a message based on the user input.
            }
        }
    }
}