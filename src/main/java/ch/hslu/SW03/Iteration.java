package ch.hslu.SW03;

public class Iteration {

    public void countToTen(){
        System.out.println("for loop");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        int i = 0;
        System.out.println("while loop");
        while (i <= 10){
            System.out.println(i);
            i++;
        }

        i = 0;
        System.out.println("do-while loop");
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }


    public void addToFloat(){
        System.out.println("while loop");
        float f = 0.9f;
        int counter = 0;
        while (f <= 1.0f){
            counter ++;
            System.out.println(counter);
            f += 0.000025f;
            System.out.println(f);
        }

        System.out.println("for loop");
        f = 0.9f;
        counter = 0;
        for (int i = 1; i <= 4000; i++) {
            counter ++;
            System.out.println(counter);
            f += 0.000025f;
            System.out.println(f);
        }
    }

    public void printBox(final int height, final int width){
        for (int h = 0; h < height; h++){
            if (h == 0 || h == height-1){
                for (int w = 0; w < width; w++){
                    System.out.print("#");
                }
            } else {
                for (int w = 0; w < width; w++){
                    if (w == 0 || w == width - 1){
                        System.out.print("#");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }

}
