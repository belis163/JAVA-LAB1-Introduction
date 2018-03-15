package figury;
import java.util.Scanner;


public class Run
{
    public void run()
    {
        System.out.println("WItaj w programie, co chcesz zrobić: ");
        Scanner scanf = new Scanner(System.in);
        System.out.println("Podaj wybór:");

        int choice;
        do {
            System.out.printf("\n1. Pole i obwod trójkąta.\n");
            System.out.printf("2. Pole i obwód kwadratu\n");
            System.out.printf("3. Pole i obwód koła\n");
            System.out.printf("4. Wyjście.\n");
            choice = scanf.nextInt();
            switch (choice) {
                case (1): {
                    System.out.printf("\nPodaj wymiary trójkąta:\n");
                    double a=0, b=0, c=0, h=0;
                    Triangle trójkąt = new Triangle(a, b, c, h);
                    boolean checkCondition = true;
                    do
                    {
                        System.out.print("Bok a: ");
                        try
                        {   a = scanf.nextInt();
                            if(trójkąt.overZero(a)) {
                                trójkąt.setSide1(a);
                                checkCondition = false;
                            }
                            else throw new figureException("UJEMNA!!!");
                        }
                        catch (Exception ex)
                        {
                            System.out.println(ex.getMessage());
                            checkCondition = true;
                        }

                    } while (checkCondition);

                    checkCondition = true;
                    do
                    {
                        System.out.print("Bok b: ");
                        try
                        {   b = scanf.nextInt();
                            if(trójkąt.overZero(b)) {
                                trójkąt.setSide2(b);
                                checkCondition = false;
                            }
                            else throw new figureException("UJEMNA!!!");
                        }
                        catch (Exception ex)
                        {
                            System.out.println(ex.getMessage());
                            checkCondition = true;
                        }

                    } while (checkCondition);

                    checkCondition = true;
                    do
                    {
                        System.out.print("Bok c: ");
                        try
                        {   c = scanf.nextInt();
                            if(trójkąt.overZero(c)) {
                                trójkąt.setSide3(c);
                                checkCondition = false;
                            }
                            else throw new figureException("UJEMNA!!!");
                        }
                        catch (Exception ex)
                        {
                            System.out.println(ex.getMessage());
                            checkCondition = true;
                        }

                    } while (checkCondition);

                    checkCondition = true;
                    do
                    {
                        System.out.print("Wysokość: ");
                        try
                        {   h = scanf.nextInt();
                            if(trójkąt.overZero(h)) {
                                trójkąt.setHeight(h);
                                checkCondition = false;
                            }
                            else throw new figureException("UJEMNA!!!");
                        }
                        catch (Exception ex)
                        {
                            System.out.println(ex.getMessage());
                            checkCondition = true;
                        }

                    } while (checkCondition);


                    trójkąt.print();
                    break;
                }
                case (2):
                {
                    System.out.printf("\nPodaj wymiar kwadratu:\n");
                    boolean test = true;
                    int a=0;
                    Square kwadrat = new Square(a);

                   boolean checkCondition = true;
                    do
                    {
                        try
                        {
                            System.out.print("Bok a: ");
                            a = scanf.nextInt();
                            if(kwadrat.overZero(a)) {
                                kwadrat.setSide(a);
                                checkCondition = false;
                            }
                            else throw new figureException("UJEMNA!!!");
                        }
                        catch (Exception ex)
                        {
                            System.out.println(ex.getMessage());
                            checkCondition = true;
                        }

                    } while (checkCondition);

                    kwadrat.print();
                    break;
                }
                case (3):
                {
                    int a=0;
                    Circle koło = new Circle(a);

                    boolean checkCondition = true;
                    do
                    {
                        System.out.printf("Podaj promień koła:\n");
                        try
                        {
                            System.out.println("R: ");
                            a = scanf.nextInt();
                            if(koło.overZero(a)) {
                                koło.setR(a);
                                checkCondition = false;
                            }
                            else throw new figureException("UJEMNA!!!");
                        }
                        catch (figureException ex)
                        {
                            System.out.println(ex.getMessage());
                            checkCondition = true;
                        }

                    } while (checkCondition);


                    koło.print();
                    break;
                }
                case (4):
                {
                    System.out.println("\nKoniec programu.");
                    break;
                }
                default:
                {
                    System.out.println("Brak polecenia");
                    break;
                }
            }
        }while (choice != 4);
    }
}

class figureException extends Exception
{
    public figureException(String message) {
        super(message);
    }
}
