import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        // pStudio.J001(); // 이 곳에서 문제 번호에 해당하는 method를 실행함
        // pStudio.J002();
        // pStudio.J003();
        // pStudio.J004();
        // pStudio.J011();
        // pStudio.J012();
        // pStudio.J013();
        // pStudio.J021();
        // pStudio.J022();
        pStudio.J023();
    }

    void J001() { // 이 곳에서 문제 번호에 해당하는 method를 실행함

        // 이곳에 코드 작성
        Scanner sc = new Scanner(System.in);

        int height, weight;
        double bmi;

        height = sc.nextInt();
        weight = sc.nextInt();

        bmi = weight / (height * 0.01 * height * 0.01);

        System.out.printf("%.1f", bmi);

    }

    void J002() { // 이 곳에서 문제 번호에 해당하는 method를 실행함

        // 이곳에 코드 작성
        Scanner sc = new Scanner(System.in);

        double c_dgree;
        double f_dgree;

        c_dgree = sc.nextDouble();

        f_dgree = c_dgree * 1.8 + 32;

        System.out.printf("%.1f", f_dgree);

    }

    void J003() { // 이 곳에서 문제 번호에 해당하는 method를 실행함

        // 이곳에 코드 작성
        Scanner sc = new Scanner(System.in);

        double m2_area;
        double pyung_area;

        m2_area = sc.nextDouble();

        pyung_area = m2_area / 3.305;

        System.out.printf("%.1f", pyung_area);

    }

    void J004() { // 이 곳에서 문제 번호에 해당하는 method를 실행함

        // 이곳에 코드 작성
        Scanner sc = new Scanner(System.in);

        double x1, y1;
        double x2, y2;
        double dis;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        dis = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.1f", dis);

    }

    void J005() { // 이 곳에서 문제 번호에 해당하는 method를 실행함

        // 이곳에 코드 작성
        Scanner sc = new Scanner(System.in);

        double x1, y1;
        double x2, y2;
        double dis;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        dis = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.1f", dis);

    }

    void J011() { // 이 곳에서 문제 번호에 해당하는 method를 실행함

        // 이곳에 코드 작성
        Scanner sc = new Scanner(System.in);

        int height, weight;
        double bmi;

        height = sc.nextInt();
        weight = sc.nextInt();

        bmi = weight / (height * 0.01 * height * 0.01);

        if (bmi >= 25.0) {
            System.out.printf("Yes");
        } else {
            System.out.printf("No");
        }

    }

    void J012() { // 이 곳에서 문제 번호에 해당하는 method를 실행함

        // 이곳에 코드 작성
        Scanner sc = new Scanner(System.in);

        double m2_area;
        double pyung_area;

        m2_area = sc.nextDouble();

        pyung_area = m2_area / 3.305;

        System.out.printf("%.1f\n", pyung_area);

        if (pyung_area >= 50) {
            System.out.printf("huge");
        } else if (pyung_area >= 30) {
            System.out.printf("large");
        } else if (pyung_area >= 15) {
            System.out.printf("normal");
        } else {
            System.out.printf("small");
        }

    }

    void J013() { // 이 곳에서 문제 번호에 해당하는 method를 실행함

        // 이곳에 코드 작성
        Scanner sc = new Scanner(System.in);

        int kor, eng, math;
        int total;
        double average;

        kor = sc.nextInt();
        eng = sc.nextInt();
        math = sc.nextInt();

        total = kor + eng + math;

        average = total / 3.0;

        System.out.printf("%d %.1f\n", total, average);

        if (kor >= 70) {
            System.out.printf("Korean - Pass\n");
        } else {
            System.out.printf("Korean - Fail\n");
        }
        if (eng >= 70) {
            System.out.printf("English - Pass\n");
        } else {
            System.out.printf("English - Fail\n");
        }
        if (math >= 70) {
            System.out.printf("Math - Pass\n");
        } else {
            System.out.printf("Math - Fail\n");
        }

    }

    void J021() { // 이 곳에서 문제 번호에 해당하는 method를 실행함

        // 이곳에 코드 작성
        Scanner sc = new Scanner(System.in);

        int height, weight;
        double bmi;
        int people;

        int count = 0;

        people = sc.nextInt();

        for (int i = 0; i < people; i++) {
            height = sc.nextInt();
            weight = sc.nextInt();
            bmi = weight / (height * 0.01 * height * 0.01);

            if (bmi >= 25.0) {
                count++;
            }
        }

        System.out.printf("%d", count);

    }

    void J022() { // 이 곳에서 문제 번호에 해당하는 method를 실행함

        // 이곳에 코드 작성
        Scanner sc = new Scanner(System.in);

        double m2_area;
        double pyung_area;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;


        for (int i = 0; i < 10; i++) {
            m2_area = sc.nextDouble();

            pyung_area = m2_area / 3.305;

            if (pyung_area >= 50) {
                count4++;
            } else if (pyung_area >= 30) {
                count3++;
            } else if (pyung_area >= 15) {
                count2++;
            } else {
                count1++;
            }
        }

        System.out.printf("small - %d\n",count1);
        System.out.printf("normal - %d\n",count2);
        System.out.printf("large - %d\n",count3);
        System.out.printf("huge - %d\n",count4);

    }

    void J023() { // 이 곳에서 문제 번호에 해당하는 method를 실행함

        // 이곳에 코드 작성
        Scanner sc = new Scanner(System.in);

        int count ;
        int[] number;
        int totalsum=0;
        double average;

        count = sc.nextInt();
        number = new int[count];
        for (int i=0;i<count;i++){
            number[i]=sc.nextInt();
            totalsum+=number[i];
        }

        average=totalsum/(double)count;

        System.out.printf("%d ",totalsum);
        System.out.printf("%.1f",average);

    }

    // 추가로 필요한 method를 제작함.
}