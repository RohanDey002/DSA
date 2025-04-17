
//Print patterns
//****
//****
//****
//****
//.............Code............

//class P1{
//    public static void main(String[] args) {
//        for(int i =0; i<4;i++){
//            for (int j=0 ; j<4; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//}


//2.
//*
//**
//***
//****
//................Code.............
//class P2{
//    public static void main(String[] args) {
//        int n;
//        System.out.println("Enter Value:");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (int i =0 ; i<n;i++){
//            for (int j = 0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
//}
//3.
//1
//12
//123
//1234
//..............Code.................
//class P3{
//    public static void main(String[] args) {
//        int n;
//        System.out.println("Enter value:");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (int i = 1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}
//4.
//1
//22
//333
//4444
//....................Code .......................
//class P4{
//    public static void main(String[] args) {
//        int n ;
//        System.out.println("Enter the value:");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j = 1;j<=i;j++){
//                System.out.print(i);
//            }
//            System.out.println("");
//        }
//    }
//}
//5.
//****
//***
//**
//*
//.............Code................
//class P5{
//    public static void main(String[] args) {
//        System.out.println("Enter value:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1 ;i<=n;i++){
//            for (int j =1;j<=n-i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
//
//6.
//12345
//1234
//123
//12
//1
//............Code..............
//class P6{
//    public static void main(String[] args) {
//        System.out.println("Enter value:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            for (int j=1;j<=n-i+1;j++){
//                System.out.print(j);
//            }
//            System.out.println("");
//        }
//    }
//}
//7.
//  *
// ***
//*****
//............Code..............
//class P7{
//    public static void main(String[] args) {
//        System.out.println("Enter value:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i=0;i<n;i++){
//            //printing spaces before stars
//            for (int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            //printing stars "*"
//            for (int k =0;k<2*i+1;k++){
//                System.out.print("*");
//            }
//            //printing spaces after stars
//            for (int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
//    }
//}
//8.
//*****
// ***
//  *
//................Code.................
//class P8{
//    public static void main(String[] args) {
//        System.out.println("Enter value:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            //printing spaces before stars
//            for (int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            // printing stars "*"
//            for (int k =0 ;k<2*n-(2*i+1);k++){
//                System.out.print("*");
//            }
//            //printing spaces after stars
//            for (int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//           System.out.println("");
//        }
//    }
//}
//9.
//  *
// ***
//*****
//*****
// ***
//  *
//..............Code..........
//class P9{
//    public static void main(String[] args) {
//        System.out.print("Enter value:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i=0;i<n;i++){
////            //printing spaces before stars
//            for (int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
////            //printing stars "*"
//            for (int k =0;k<2*i+1;k++){
//                System.out.print("*");
//            }
////            //printing spaces after stars
//            for (int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
//        for (int i = 0; i < n; i++) {
////            //printing spaces before stars
//            for (int j=0;j<i;j++){
//                System.out.print(" ");
//            }
////            // printing stars "*"
//            for (int k =0 ;k<2*n-(2*i+1);k++){
//                System.out.print("*");
//            }
////            //printing spaces after stars
//            for (int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//           System.out.println("");
//        }
//
//    }
//}
//10.
//*
//**
//***
//**
//*
//................Code...................

//class P10{
//    public static void main(String[] args) {
//        System.out.println("Enter value:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= 2*n-1; i++) {
//            int star = i;
//            if(i>n) star=2*n-i;
//            for (int j=1;j<=star;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
//}
//11.
//0
//10
//010
//1010
//..............Code...........
//class P11{
//    public static void main(String[] args) {
//        System.out.println("Enter value:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int start=1;
//        for (int i = 1; i <=n; i++) {
//            if (i%2==0) start=1;
//            else start=0;
//            for (int j=1;j<=i;j++){
//               System.out.print(start);
//               start=1-start;
//            }
//            System.out.println("");
//        }
//    }
//}
//12.
//1      1
//12    21
//123  321
//12344321
//.................code..............
//class P12{
//    public static void main(String[] args) {
//        System.out.print("Enter value:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int spaces=2*(n-1);
//        for (int i = 1; i <=n; i++) {
//            //Number before spaces
//            for (int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            //Spaces print
//            for (int k =1;k<=spaces;k++){
//                System.out.print(" ");
//            }
//            for (int j =i;j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println("");
//            spaces-=2;
//
//        }
//    }
//}