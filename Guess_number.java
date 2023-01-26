import java.util.Random;
import java.util.Scanner;

class Guess_num 
{
 void guess_no() 
  {
    Scanner sc = new Scanner(System.in);
    int score = 0;
    int guessnum, count = 1;

    Random rand = new Random();
    int rnum = rand.nextInt(100);

    System.out.println("enter the number to be guessed....");
    guessnum = sc.nextInt();
   if (rnum == guessnum)
   {
      System.out.println("the number guessed  is correct..!");
    }
	 else if (guessnum != rnum) 
	{
      while (guessnum != rnum)
	 {
        if (rnum > guessnum) 
	    {
          System.out.println("the number is greater than " + guessnum);
          System.out.println("enter the  number greater than  " + guessnum);
          System.out.println("try again :");
          guessnum = sc.nextInt();
          count++;
         } 
	else if (rnum < guessnum) 
	   {
          System.out.println("the number is less than" + guessnum);
          System.out.println("enter the  number less than " + guessnum);
          System.out.println("try again :");
          guessnum = sc.nextInt();
          count++;
        }
      }
      if (guessnum == rnum)
	  {
        System.out.println("Number Guessed correctly  in " + count + "attempts");
      }
    }
    switch (count) 
    {
      case 1:
        score = 50;
        System.out.println("Score :" + score);
        break;
      case 2:
        score = 40;
        System.out.println("Score:" + score);
        break;
      case 3:
        score = 30;
        System.out.println("Score:" + score);
        break;
      case 4:
        score = 20;
        System.out.println("Score:" + score);
        break;
      case 5:
        score = 10;
        System.out.println("Score:" + score);
        break;
      default:
        score = 0;
        System.out.println("Score:"+ 0 +"number not guessed in 5 attempts....\n");
        break;
    }
  }
}
class Guess_number
{
  public static void main(String[] args)
 {
    Guess_num gn= new Guess_num();
    gn.guess_no();
  }
}