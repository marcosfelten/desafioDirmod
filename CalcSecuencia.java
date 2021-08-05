import java.util.Scanner;

public class CalcSecuencia {
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        String mensaje;
        System.out.print("Digite: ");
        mensaje = scan.nextLine();
        System.out.println(Digitos(mensaje));
    }
    public static String Digitos (String msj){
        String teclas;
        teclas = "";
        for (int i=0;i<msj.length();i++){
            if (msj.charAt(i)=='a' || msj.charAt(i)=='A'){
                 teclas = teclas+2;}
            if (msj.charAt(i)=='b' || msj.charAt(i)=='B'){
                 teclas = teclas+22;}
            if (msj.charAt(i)=='c' || msj.charAt(i)=='C'){
                 teclas = teclas+222;}
            if (msj.charAt(i)=='d' || msj.charAt(i)=='D'){
                 teclas = teclas+3;}
            if (msj.charAt(i)=='e' || msj.charAt(i)=='E'){
                 teclas = teclas+33;}
            if (msj.charAt(i)=='f' || msj.charAt(i)=='F'){
                 teclas = teclas+333;}
            if (msj.charAt(i)=='g' || msj.charAt(i)=='G'){
                 teclas = teclas+4;}
            if (msj.charAt(i)=='h' || msj.charAt(i)=='H'){
                 teclas = teclas+44;}
            if (msj.charAt(i)=='i' || msj.charAt(i)=='I'){
                 teclas = teclas+444;}
            if (msj.charAt(i)=='j' || msj.charAt(i)=='J'){
                 teclas = teclas+5;}
            if (msj.charAt(i)=='k' || msj.charAt(i)=='K'){
                 teclas = teclas+55;}
            if (msj.charAt(i)=='l' || msj.charAt(i)=='L'){
                 teclas = teclas+555;}
            if (msj.charAt(i)=='m' || msj.charAt(i)=='M'){
                 teclas = teclas+6;}
            if (msj.charAt(i)=='n' || msj.charAt(i)=='N'){
                 teclas = teclas+66;}
            if (msj.charAt(i)=='o' || msj.charAt(i)=='O'){
                 teclas = teclas+666;}
            if (msj.charAt(i)=='p' || msj.charAt(i)=='P'){
                 teclas = teclas+7;}
            if (msj.charAt(i)=='q' || msj.charAt(i)=='Q'){
                 teclas = teclas+77;}
            if (msj.charAt(i)=='r' || msj.charAt(i)=='R'){
                 teclas = teclas+777;}
            if (msj.charAt(i)=='s' || msj.charAt(i)=='S'){
                 teclas = teclas+7777;}
            if (msj.charAt(i)=='t' || msj.charAt(i)=='T'){
                 teclas = teclas+8;}
            if (msj.charAt(i)=='u' || msj.charAt(i)=='U'){
                 teclas = teclas+88;}
            if (msj.charAt(i)=='v' || msj.charAt(i)=='V'){
                 teclas = teclas+888;}
            if (msj.charAt(i)=='w' || msj.charAt(i)=='W'){
                 teclas = teclas+9;}
            if (msj.charAt(i)=='x' || msj.charAt(i)=='X'){
                 teclas = teclas+99;}
            if (msj.charAt(i)=='y' || msj.charAt(i)=='Y'){
                 teclas = teclas+999;}
            if (msj.charAt(i)=='z' || msj.charAt(i)=='Z'){
                 teclas = teclas+9999;}
            if (msj.charAt(i)==' ' || msj.charAt(i)=='Z'){
                 teclas = teclas+0;}
       }
       return teclas;
    }
    
}
