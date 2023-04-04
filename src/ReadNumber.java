import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Input number below 1000:");
        number = input.nextInt();
        if (number >= 1000){
            System.out.println("Out of ability");
        }
        int digit3 = number % 10;
        String a = "";
        number = number / 10;
        int digit2 = number % 10;
        String b = "";
        number = number / 10;
        int digit1 = number % 10;
        String c = "";
        number = number / 10;

        if (digit1 == 0 && digit2 == 0) {
            switch (digit3) {
                case 1:
                    a = "One";
                    break;
                case 2:
                    a = "Two";
                    break;
                case 3:
                    a = "Three";
                    break;
                case 4:
                    a = "Four";
                    break;
                case 5:
                    a = "Five";
                    break;
                case 6:
                    a = "Six";
                    break;
                case 7:
                    a = "Seven";
                    break;
                case 8:
                    a = "Eight";
                    break;
                case 9:
                    a = "Nine";
                    break;
                case 10:
                    a = "Ten";
                    break;
            }
            System.out.println(a);
        } else if (digit1 == 0) {
            if (digit2 == 1) {
                switch (digit3) {
                    case 1:
                        a = "Eleven";
                        break;
                    case 2:
                        a = "Twevle";
                        break;
                    case 3:
                        a = "Thirteen";
                        break;
                    case 4:
                        a = "Fourteen";
                        break;
                    case 5:
                        a = "Fifteen";
                        break;
                    case 6:
                        a = "Sixteen";
                        break;
                    case 7:
                        a = "Seventeen";
                        break;
                    case 8:
                        a = "Eighteen";
                        break;
                    case 9:
                        a = "Nineteen";
                        break;
                }
                System.out.println(a);
            } else if(digit3 == 0){
                switch (digit2){
                    case 2:
                        b = "Twenty";
                        break;
                    case 3:
                        b = "Thirty";
                        break;
                    case 4:
                        b = "Fourty";
                        break;
                    case 5:
                        b = "Fifty";
                        break;
                    case 6:
                        b = "Sixty";
                        break;
                    case 7:
                        b = "Seventy";
                        break;
                    case 8:
                        b = "Eighty";
                        break;
                    case 9:
                        b = "Ninety";
                        break;
                }
                System.out.println(b);
            } else{
                switch (digit2){
                    case 2:
                        b = "Twenty";
                        switch (digit3) {
                            case 1:
                                a = "One";
                                break;
                            case 2:
                                a = "Two";
                                break;
                            case 3:
                                a = "Three";
                                break;
                            case 4:
                                a = "Four";
                                break;
                            case 5:
                                a = "Five";
                                break;
                            case 6:
                                a = "Six";
                                break;
                            case 7:
                                a = "Seven";
                                break;
                            case 8:
                                a = "Eight";
                                break;
                            case 9:
                                a = "Nine";
                                break;
                        }
                        System.out.println(b + " " + a);
                        break;
                    case 3:
                        b = "Thirty";
                        switch (digit3) {
                            case 1:
                                a = "One";
                                break;
                            case 2:
                                a = "Two";
                                break;
                            case 3:
                                a = "Three";
                                break;
                            case 4:
                                a = "Four";
                                break;
                            case 5:
                                a = "Five";
                                break;
                            case 6:
                                a = "Six";
                                break;
                            case 7:
                                a = "Seven";
                                break;
                            case 8:
                                a = "Eight";
                                break;
                            case 9:
                                a = "Nine";
                                break;
                        }
                        System.out.println(b + " " + a);
                        break;
                    case 4:
                        b = "Fourty";
                        switch (digit3) {
                            case 1:
                                a = "One";
                                break;
                            case 2:
                                a = "Two";
                                break;
                            case 3:
                                a = "Three";
                                break;
                            case 4:
                                a = "Four";
                                break;
                            case 5:
                                a = "Five";
                                break;
                            case 6:
                                a = "Six";
                                break;
                            case 7:
                                a = "Seven";
                                break;
                            case 8:
                                a = "Eight";
                                break;
                            case 9:
                                a = "Nine";
                                break;
                        }
                        System.out.println(b + " " + a);
                        break;
                    case 5:
                        b = "Fifty";
                        switch (digit3) {
                            case 1:
                                a = "One";
                                break;
                            case 2:
                                a = "Two";
                                break;
                            case 3:
                                a = "Three";
                                break;
                            case 4:
                                a = "Four";
                                break;
                            case 5:
                                a = "Five";
                                break;
                            case 6:
                                a = "Six";
                                break;
                            case 7:
                                a = "Seven";
                                break;
                            case 8:
                                a = "Eight";
                                break;
                            case 9:
                                a = "Nine";
                                break;
                        }
                        System.out.println(b + " " + a);
                        break;
                    case 6:
                        b = "Sixty";
                        switch (digit3) {
                            case 1:
                                a = "One";
                                break;
                            case 2:
                                a = "Two";
                                break;
                            case 3:
                                a = "Three";
                                break;
                            case 4:
                                a = "Four";
                                break;
                            case 5:
                                a = "Five";
                                break;
                            case 6:
                                a = "Six";
                                break;
                            case 7:
                                a = "Seven";
                                break;
                            case 8:
                                a = "Eight";
                                break;
                            case 9:
                                a = "Nine";
                                break;
                        }
                        System.out.println(b + " " + a);
                        break;
                    case 7:
                        b = "Seventy";
                        switch (digit3) {
                            case 1:
                                a = "One";
                                break;
                            case 2:
                                a = "Two";
                                break;
                            case 3:
                                a = "Three";
                                break;
                            case 4:
                                a = "Four";
                                break;
                            case 5:
                                a = "Five";
                                break;
                            case 6:
                                a = "Six";
                                break;
                            case 7:
                                a = "Seven";
                                break;
                            case 8:
                                a = "Eight";
                                break;
                            case 9:
                                a = "Nine";
                                break;
                        }
                        System.out.println(b + " " + a);
                        break;
                    case 8:
                        b = "Eighty";
                        switch (digit3) {
                            case 1:
                                a = "One";
                                break;
                            case 2:
                                a = "Two";
                                break;
                            case 3:
                                a = "Three";
                                break;
                            case 4:
                                a = "Four";
                                break;
                            case 5:
                                a = "Five";
                                break;
                            case 6:
                                a = "Six";
                                break;
                            case 7:
                                a = "Seven";
                                break;
                            case 8:
                                a = "Eight";
                                break;
                            case 9:
                                a = "Nine";
                                break;
                        }
                        System.out.println(b + " " + a);
                        break;
                    case 9:
                        b = "Ninety";
                        switch (digit3) {
                            case 1:
                                a = "One";
                                break;
                            case 2:
                                a = "Two";
                                break;
                            case 3:
                                a = "Three";
                                break;
                            case 4:
                                a = "Four";
                                break;
                            case 5:
                                a = "Five";
                                break;
                            case 6:
                                a = "Six";
                                break;
                            case 7:
                                a = "Seven";
                                break;
                            case 8:
                                a = "Eight";
                                break;
                            case 9:
                                a = "Nine";
                                break;
                        }
                        System.out.println(b + " " + a);
                        break;
                }
            }
        } else if (digit1 != 0) {
          switch (digit1){
              case 1:
                  c = "One hundred";
                  break;
              case 2:
                  c = "Two hundred";
                  break;
              case 3:
                  c = "Three hundred";
                  break;
              case 4:
                  c = "Four hundred";
                  break;
              case 5:
                  c = "Five hundred";
                  break;
              case 6:
                  c = "Six hundred";
                  break;
              case 7:
                  c = "Seven hundred";
                  break;
              case 8:
                  c = "Eight hundred";
                  break;
              case 9:
                  c = "Nine hundred";
                  break;
          }
          if(digit2 == 0 && digit3 == 0) {
              System.out.println(c);
          } else if (digit3 == 0) {
              switch (digit2){
                  case 2:
                      b = "Twenty";
                      break;
                  case 3:
                      b = "Thirty";
                      break;
                  case 4:
                      b = "Fourty";
                      break;
                  case 5:
                      b = "Fifty";
                      break;
                  case 6:
                      b = "Sixty";
                      break;
                  case 7:
                      b = "Seventy";
                      break;
                  case 8:
                      b = "Eighty";
                      break;
                  case 9:
                      b = "Ninety";
                      break;
              }
              System.out.println(c + " and " + b);
          } else if(digit2 == 1){
              switch (digit3) {
                  case 1:
                      a = "Eleven";
                      break;
                  case 2:
                      a = "Twevle";
                      break;
                  case 3:
                      a = "Thirteen";
                      break;
                  case 4:
                      a = "Fourteen";
                      break;
                  case 5:
                      a = "Fifteen";
                      break;
                  case 6:
                      a = "Sixteen";
                      break;
                  case 7:
                      a = "Seventeen";
                      break;
                  case 8:
                      a = "Eighteen";
                      break;
                  case 9:
                      a = "Nineteen";
                      break;
              }
          } else{
              switch (digit2) {
                  case 2:
                      b = "Twenty";
                      switch (digit3) {
                          case 1:
                              a = "One";
                              break;
                          case 2:
                              a = "Two";
                              break;
                          case 3:
                              a = "Three";
                              break;
                          case 4:
                              a = "Four";
                              break;
                          case 5:
                              a = "Five";
                              break;
                          case 6:
                              a = "Six";
                              break;
                          case 7:
                              a = "Seven";
                              break;
                          case 8:
                              a = "Eight";
                              break;
                          case 9:
                              a = "Nine";
                              break;
                      }
                      break;
                  case 3:
                      b = "Thirty";
                      switch (digit3) {
                          case 1:
                              a = "One";
                              break;
                          case 2:
                              a = "Two";
                              break;
                          case 3:
                              a = "Three";
                              break;
                          case 4:
                              a = "Four";
                              break;
                          case 5:
                              a = "Five";
                              break;
                          case 6:
                              a = "Six";
                              break;
                          case 7:
                              a = "Seven";
                              break;
                          case 8:
                              a = "Eight";
                              break;
                          case 9:
                              a = "Nine";
                              break;
                      }
                      break;
                  case 4:
                      b = "Fourty";
                      switch (digit3) {
                          case 1:
                              a = "One";
                              break;
                          case 2:
                              a = "Two";
                              break;
                          case 3:
                              a = "Three";
                              break;
                          case 4:
                              a = "Four";
                              break;
                          case 5:
                              a = "Five";
                              break;
                          case 6:
                              a = "Six";
                              break;
                          case 7:
                              a = "Seven";
                              break;
                          case 8:
                              a = "Eight";
                              break;
                          case 9:
                              a = "Nine";
                              break;
                      }
                      break;
                  case 5:
                      b = "Fifty";
                      switch (digit3) {
                          case 1:
                              a = "One";
                              break;
                          case 2:
                              a = "Two";
                              break;
                          case 3:
                              a = "Three";
                              break;
                          case 4:
                              a = "Four";
                              break;
                          case 5:
                              a = "Five";
                              break;
                          case 6:
                              a = "Six";
                              break;
                          case 7:
                              a = "Seven";
                              break;
                          case 8:
                              a = "Eight";
                              break;
                          case 9:
                              a = "Nine";
                              break;
                      }
                      break;
                  case 6:
                      b = "Sixty";
                      switch (digit3) {
                          case 1:
                              a = "One";
                              break;
                          case 2:
                              a = "Two";
                              break;
                          case 3:
                              a = "Three";
                              break;
                          case 4:
                              a = "Four";
                              break;
                          case 5:
                              a = "Five";
                              break;
                          case 6:
                              a = "Six";
                              break;
                          case 7:
                              a = "Seven";
                              break;
                          case 8:
                              a = "Eight";
                              break;
                          case 9:
                              a = "Nine";
                              break;
                      }
                  case 7:
                      b = "Seventy";
                      switch (digit3) {
                          case 1:
                              a = "One";
                              break;
                          case 2:
                              a = "Two";
                              break;
                          case 3:
                              a = "Three";
                              break;
                          case 4:
                              a = "Four";
                              break;
                          case 5:
                              a = "Five";
                              break;
                          case 6:
                              a = "Six";
                              break;
                          case 7:
                              a = "Seven";
                              break;
                          case 8:
                              a = "Eight";
                              break;
                          case 9:
                              a = "Nine";
                              break;
                      }
                  case 8:
                      b = "Eighty";
                      switch (digit3) {
                          case 1:
                              a = "One";
                              break;
                          case 2:
                              a = "Two";
                              break;
                          case 3:
                              a = "Three";
                              break;
                          case 4:
                              a = "Four";
                              break;
                          case 5:
                              a = "Five";
                              break;
                          case 6:
                              a = "Six";
                              break;
                          case 7:
                              a = "Seven";
                              break;
                          case 8:
                              a = "Eight";
                              break;
                          case 9:
                              a = "Nine";
                              break;
                      }
                      System.out.println(b + " " + a);
                      break;
                  case 9:
                      b = "Ninety";
                      switch (digit3) {
                          case 1:
                              a = "One";
                              break;
                          case 2:
                              a = "Two";
                              break;
                          case 3:
                              a = "Three";
                              break;
                          case 4:
                              a = "Four";
                              break;
                          case 5:
                              a = "Five";
                              break;
                          case 6:
                              a = "Six";
                              break;
                          case 7:
                              a = "Seven";
                              break;
                          case 8:
                              a = "Eight";
                              break;
                          case 9:
                              a = "Nine";
                              break;
                      }
              }
              System.out.println(c + " and " + b + " " + a);
          }
        }

    }
}
